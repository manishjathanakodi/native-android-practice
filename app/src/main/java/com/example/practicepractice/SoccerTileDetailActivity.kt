package com.example.practicepractice

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SoccerTileDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soccer_tile_detail)

        val soccerTile = intent.getSerializableExtra("soccerTile") as? SoccerTile?: SoccerTile(
            title = "Whoops",
            description = "Something went wrong"
            )

        val headerIv: ImageView = findViewById(R.id.teamHeaderIv)
        val titleTv: TextView = findViewById(R.id.teamTitleTv)
        val descTv: TextView = findViewById(R.id.descTv)
        val longDiscTv: TextView = findViewById(R.id.descLongTv)

        headerIv.setImageResource(soccerTile.headerImageResId)
        titleTv.text = soccerTile.title
        descTv.text = soccerTile.description
        longDiscTv.text = soccerTile.descriptionLong

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else-> super.onOptionsItemSelected(item)

        }
    }
}