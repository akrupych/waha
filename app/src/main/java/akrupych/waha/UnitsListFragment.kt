package akrupych.waha

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.GenericTypeIndicator
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.unit_item.*
import kotlinx.android.synthetic.main.units_list_fragment.*

class UnitsListFragment : Fragment() {

    private var unitsList = listOf<Unit>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.units_list_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        unitsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = UnitsAdapter()
        }
        loadAllUnits()
    }

    private fun loadAllUnits() {
        val database = FirebaseDatabase.getInstance()
        val units = database.getReference("units")
        units.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(data: DataSnapshot) {
                val listType = object : GenericTypeIndicator<ArrayList<Unit>>() {}
                unitsList = data.getValue(listType) ?: emptyList()
                unitsRecyclerView.adapter?.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {
                error.toException().printStackTrace()
            }
        })
    }

    inner class UnitsAdapter : RecyclerView.Adapter<UnitViewHolder>() {

        override fun getItemCount() = unitsList.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            UnitViewHolder(LayoutInflater.from(context).inflate(R.layout.unit_item, parent, false))

        override fun onBindViewHolder(holder: UnitViewHolder, position: Int) = holder.bind(unitsList[position])

    }

    inner class UnitViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bind(unit: Unit) {
            nameTextView.text = unit.name
        }
    }
}