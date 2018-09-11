package com.borongajayuk.belajar1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tombol_sapa.setOnClickListener(this)

    }


    override fun onClick(v: View?) {
        if (v != null) {
            if(v.id == R.id.tombol_sapa){
                var  nama = field_nama.text.toString()
                Toast.makeText(this, "Hello semuanya "+ nama, Toast.LENGTH_LONG)
                nama_saya.setText(nama)
            }
        }

    }



}
