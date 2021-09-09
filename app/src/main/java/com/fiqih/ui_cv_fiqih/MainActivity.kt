package com.fiqih.ui_cv_fiqih

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btnContact: Button
    private lateinit var btnDetail: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnUrl = findViewById<Button>(R.id.FollowMe)

        btnContact = findViewById(R.id.BtnContact)
        btnDetail = findViewById(R.id.infoDetail)


        btnDetail.setOnClickListener {
            val Intent = Intent (this@MainActivity, Contact::class.java)
            startActivity(Intent)
        }


        btnUrl.setOnClickListener {
            openUrl("https://www.instagram.com/fiqih.png")
        }

        btnContact.setOnClickListener {
            openContact("https://api.whatsapp.com/send?phone=6281321184032")
        }
    }

    fun openUrl(url: String) {
        val intent = Intent()
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.action = Intent.ACTION_VIEW
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    fun openContact(url: String) {
        val intent = Intent()
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.action = Intent.ACTION_VIEW
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}