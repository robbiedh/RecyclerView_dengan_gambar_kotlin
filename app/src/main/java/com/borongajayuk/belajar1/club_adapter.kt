package com.borongajayuk.belajar1

import android.content.ClipData
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list.view.*
import java.security.AccessControlContext

class club_adapter(val item_club : ArrayList<String>,val item_gambar:ArrayList<Int>, val context: Context ) :
        RecyclerView.Adapter<ViewHolder>()  {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.club_list_temp?.text = item_club.get(position)
        holder?.club_gambar?.setImageResource(item_gambar.get(position))


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list, parent, false))
    }


    override fun getItemCount(): Int {
        return item_club.size
    }


}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val club_list_temp = view.name_list
    val club_gambar = view.gambar_club
}