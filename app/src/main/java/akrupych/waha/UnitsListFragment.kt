package akrupych.waha

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.GenericTypeIndicator

class UnitsListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.units_list_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val database = FirebaseDatabase.getInstance()
        val units = database.getReference("units")
        units.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(data: DataSnapshot) {
                val listType = object : GenericTypeIndicator<ArrayList<Unit>>() { }
                val unitsList = data.getValue(listType)
                Log.d("qwerty", unitsList.toString())
            }
            override fun onCancelled(error: DatabaseError) {
                error.toException().printStackTrace()
            }
        })
    }
}