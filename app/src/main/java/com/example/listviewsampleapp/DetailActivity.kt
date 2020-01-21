package com.example.listviewsampleapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var cityName= intent.getStringExtra("City")

        txtSehirAdi.text=cityName




        when(cityName)
        {
            "Adana"->Glide.with(this).load("https://g.hizliresim.com/audi-r8-f197").into(imageView)
            "İstanbul"->Glide.with(this).load("https://g.hizliresim.com/park-edilmis-ferrari-f196").into(imageView)
            "Eskişehir"->Glide.with(this).load("https://g.hizliresim.com/jeep-grand-cherokee-srt8-f199").into(imageView)
            "Yozgat"->Glide.with(this).load("https://g.hizliresim.com/beyaz-lamborghini-f15").into(imageView)
        }
    }
}
