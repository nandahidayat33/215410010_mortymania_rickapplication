package com.utdi.nandahidayat

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
//pada bagian inilah tampilan terkait gambar dari karakter, nama, status dan spesies ditampilkan

// RickAdapter.kt
class RickAdapter(val dataRick: List<ResultsItem>): RecyclerView.Adapter<RickAdapter.MyViewHolder>() {
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgRick = view.findViewById<ImageView>(R.id.item_image_rick)
        val nameRick = view.findViewById<TextView>(R.id.item_name_rick)
        val statusRick = view.findViewById<TextView>(R.id.item_status_rick)
        val speciesRick = view.findViewById<TextView>(R.id.item_species_rick)
        val descriptionRick = view.findViewById<TextView>(R.id.description) // Tambahkan TextView untuk deskripsi
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        if(dataRick != null){
            return dataRick.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameRick.text = dataRick?.get(position)?.name
        holder.statusRick.text = dataRick?.get(position)?.status
        holder.speciesRick.text = dataRick?.get(position)?.species

        Glide.with(holder.imgRick)
            .load(dataRick?.get(position)?.image)
            .error(R.drawable.ic_launcher_background)
            .into(holder.imgRick)

        holder.itemView.setOnClickListener {
            Log.d("RickAdapter", "Item clicked at position $position")
            val clickedCharacter = dataRick?.get(position)
            val name = dataRick?.get(position)?.name
            Toast.makeText(holder.itemView.context, "${name}", Toast.LENGTH_SHORT).show()

            // Menetapkan teks untuk deskripsi dari string resource
            holder.descriptionRick?.let {
                it.text = holder.itemView.context.getString(R.string.description_placeholder)
            }
            // Tambahkan kode untuk memulai ActivityDetailRick di sini
            val intent = Intent(holder.itemView.context, DetailRickActivity::class.java)
            // Sertakan data yang mungkin dibutuhkan di intent (misalnya ID karakter)
            intent.putExtra("character_id", dataRick?.get(position)?.id)
            holder.itemView.context.startActivity(intent)
        }
    }
}
