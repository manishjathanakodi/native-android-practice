package com.example.practicepractice

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), SoccerTileInterface {
    private var soccerTileList = getSoccerTileList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.rcview)
        val soccerTileAdapter = SoccerTileAdapter(soccerTileList, this)
        recyclerView.adapter = soccerTileAdapter
        soccerTileAdapter.notifyDataSetChanged()
    }
    private fun getSoccerTileList(): ArrayList<SoccerTile>{
        return ArrayList<SoccerTile>().apply {
            add(
                SoccerTile(
                    id = "manU",
                    title = "Manchester United",
                    description = "Description of the club",
                    descriptionLong = "Manchester United Football Club is a professional football club based in Old Trafford, Manchester, England.",
                    buttonText = "Learn more",
                    headerImageResId = R.drawable.manu,
                    headerImageUrl = "https://i.pinimg.com/originals/8f/85/15/8f85159ed8306846b050386384893c1e.jpg"
                ))
            add(
                SoccerTile(
                    id = "manC",
                    title = "Manchester City",
                    description = "Description of the club",
                    descriptionLong = "Manchester City Football Club is a professional football club based in Manchester, England.",
                    buttonText = "Learn more",
                    headerImageResId = R.drawable.manc,
                    headerImageUrl = "https://64.media.tumblr.com/88b6c20d80badbc908dbc80eb22add4b/tumblr_od5f4vofqs1ude0uno1_500h.jpg"

                )
            )
            add(
                SoccerTile(
                    id = "liverpool",
                    title = "Liverpool",
                    description = "Description of the club",
                    descriptionLong = "Liverpool Football Club is a professional football club based in Liverpool, England.",
                    buttonText = "Learn more",
                    headerImageResId = R.drawable.liverpool,
                    headerImageUrl = "https://pbs.twimg.com/media/CrVea3NVMAAEhKn?format=jpg&name=4096x4096"
                )
            )
            add(
                SoccerTile(
                    id = "chelsea",
                    title = "Chelsea",
                    description = "Description of the club",
                    descriptionLong = "Chelsea Football Club is a professional football club based in London, England.",
                    buttonText = "Learn more",
                    headerImageResId = R.drawable.chelsea,
                    headerImageUrl = "https://64.media.tumblr.com/4163bc45d59f167c164b84cc7cfd5f9c/tumblr_od5gi53Zgi1ude0uno1_500h.jpg"
                )
            )
            add(
                SoccerTile(
                    id = "arsenal",
                    title = "Arsenal",
                    description = "Description of the club",
                    descriptionLong = "Arsenal Football Club is a professional football club based in London, England.",
                    buttonText = "Learn more",
                    headerImageResId = R.drawable.arsenal,
                    headerImageUrl = "https://i.pinimg.com/originals/8f/85/15/8f85159ed8306846b050386384893c1e.jpg"
                )
            )
            add(
                SoccerTile(
                    id = "tottenham",
                    title = "Tottenham",
                    description = "Description of the club",
                    descriptionLong = "Tottenham Football Club is a professional football club based in London, England.",
                    buttonText = "Learn more",
                    headerImageResId = R.drawable.totnhm,
                    headerImageUrl = "https://i.pinimg.com/originals/a5/91/3b/a5913b877183e02ab86b2d59708c565a.jpg"
                )
            )
        }
    }

    override fun onSoccerTileClick(position: Int) {
        val soccerTile = soccerTileList[position]
        val intent = Intent(this, SoccerTileDetailActivity::class.java)
        intent.putExtra("soccerTile", soccerTile)
        startActivity(intent)
    }
}

//manU  https://i.pinimg.com/originals/8f/85/15/8f85159ed8306846b050386384893c1e.jpg
//manC  https://64.media.tumblr.com/88b6c20d80badbc908dbc80eb22add4b/tumblr_od5f4vofqs1ude0uno1_500h.jpg
//liverpool https://pbs.twimg.com/media/CrVea3NVMAAEhKn?format=jpg&name=4096x4096
//chelsea https://64.media.tumblr.com/4163bc45d59f167c164b84cc7cfd5f9c/tumblr_od5gi53Zgi1ude0uno1_500h.jpg
//arsenal https://i.pinimg.com/originals/00/b9/57/00b957e908fd86d72b3e014892d4b895.jpg
//tottenham https://i.pinimg.com/originals/a5/91/3b/a5913b877183e02ab86b2d59708c565a.jpg