package com.klaten.umbulklatenapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailUmbul : AppCompatActivity() {
    lateinit var mShare : Button

    companion object{
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_umbul)

        val namaUmbul : TextView = findViewById(R.id.tv_nama_detail)
        val desUmbul : TextView = findViewById(R.id.tv_des_detail)
        val imgUmbul : ImageView = findViewById(R.id.tv_image_detail)

        val umbul = if (Build.VERSION.SDK_INT >= 33){
            intent.getParcelableExtra<Umbul>(EXTRA_DATA, Umbul::class.java)
        }else{
            @Suppress("Deprecation")
            intent.getParcelableExtra<Umbul>(EXTRA_DATA)
        }

        if (umbul != null){
            namaUmbul.text = umbul.name
            desUmbul.text = umbul.description
            imgUmbul.setImageResource(umbul.photo)
        }

        mShare = findViewById(R.id.btn_share_detail )

        mShare.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_SEND)
            myIntent.type = "type/palin"
            val shareBody = "You are body "
            val shareSub = "You subject here"
            myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody)
            myIntent.putExtra(Intent.EXTRA_TEXT, shareSub)
            startActivity(Intent.createChooser(myIntent, "Share your informasion"))
        }
    }
}