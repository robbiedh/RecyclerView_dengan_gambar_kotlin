package com.borongajayuk.belajar1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {
    val array_club: ArrayList<String> = ArrayList()
    val array_gambar: ArrayList<Int> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_club()
        club_list.layoutManager= LinearLayoutManager(this)

        club_list.adapter= club_adapter(array_club,array_gambar,this)
        }



    fun add_club(){
        array_club.add("PSSI")
        array_club.add("yyyy")
        array_club.add("dawed")



        array_gambar.add(R.drawable.img_acm)
        array_gambar.add(R.drawable.img_arsenal)
        array_gambar.add(R.drawable.img_barca)


    }



}
