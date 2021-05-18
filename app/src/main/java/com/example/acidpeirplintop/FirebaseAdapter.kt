package com.example.acidpeirplintop

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.ArrayList

class FirebaseAdapter (private val listDataku: ArrayList<FirebaseDataClassView>):
    RecyclerView.Adapter<FirebaseAdapter.FirebaseViewHolder>() {
    inner class FirebaseViewHolder(myView: View): RecyclerView.ViewHolder(myView) {
        var tvHarga: TextView = myView.findViewById(R.id.tv_harga)
        var tvMerk: TextView = myView.findViewById(R.id.tv_merk)
        var tvTipe: TextView = myView.findViewById(R.id.tv_tipe)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseViewHolder {
        val viewku: View = LayoutInflater.from(parent.context).inflate(R.layout.data_item, parent, false)
        return FirebaseViewHolder(viewku)
    }

    override fun onBindViewHolder(holder: FirebaseViewHolder, position: Int) {
        val dataku = listDataku[position]
        holder.tvHarga.text = dataku.harga.toInt().toString()
        holder.tvMerk.text = dataku.merk
        holder.tvTipe.text = dataku.tipe
    }

    override fun getItemCount(): Int {
        return listDataku.size
    }
}