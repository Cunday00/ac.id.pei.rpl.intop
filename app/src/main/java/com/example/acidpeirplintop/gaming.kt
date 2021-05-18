package com.example.acidpeirplintop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class gaming : AppCompatActivity() {

    lateinit var fire: DatabaseReference
    private lateinit var layoutku: RecyclerView
    private var ambilDatabase: ArrayList<FirebaseDataClassView> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaming)
        layoutku = findViewById(R.id.rv_data)
        fire = FirebaseDatabase.getInstance().getReference("Gaming")
    }

    override fun onStart(){
        super.onStart()
        loadMeFirst()
    }

    private fun loadMeNow(){
        layoutku.layoutManager = LinearLayoutManager(this)
        val myA = FirebaseAdapter(ambilDatabase)
        layoutku.adapter = myA
    }

    private fun loadMeFirst(){
        fire.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot!!.exists()){
                    ambilDatabase.clear()
                    for (x in snapshot.children){
                        val mymy = x.getValue(FirebaseDataClassView::class.java)
                        ambilDatabase.add(mymy!!)
                    }
                }
                loadMeNow()
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}