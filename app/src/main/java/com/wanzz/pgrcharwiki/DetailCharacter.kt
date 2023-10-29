package com.wanzz.pgrcharwiki

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailCharacter : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_character)

        val data = intent.getParcelableExtra<CharModel>("EXTRA_DATA")

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvClass: TextView = findViewById(R.id.tv_class)
        val tvWeapon: TextView = findViewById(R.id.tv_weapon)
        val tvFaction: TextView = findViewById(R.id.tv_faction)
        val tvInfo: TextView = findViewById(R.id.tv_info)
        val tvElement: TextView = findViewById(R.id.tv_element)
        val ivBanner: ImageView = findViewById(R.id.iv_banner)
        val ivFaction: ImageView = findViewById(R.id.iv_faction)
        val ivRole: ImageView = findViewById(R.id.iv_class)
        val btnShare: Button = findViewById(R.id.btn_share)

        if (data != null) {
            tvName.text = data.name
            tvClass.text = data.role
            tvWeapon.text = data.weapon
            tvFaction.text = data.faction
            tvInfo.text = data.info
            tvElement.text = data.element
            ivBanner.setImageResource(data.banner)
            ivFaction.setImageResource(data.imgFaction)
            ivRole.setImageResource(data.imgRole)
        }


        btnShare.setOnClickListener(){
            val share = Intent()
            share.action = Intent.ACTION_SEND
            if (data != null) {
                share.putExtra(Intent.EXTRA_TEXT, "For more informaton about ${data.name} -> ${data.link}")
            }
            share.type = "text/plain"
            startActivity(Intent.createChooser(share, "Share To:"))
        }
    }
}