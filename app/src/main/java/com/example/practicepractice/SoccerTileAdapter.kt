package com.example.practicepractice

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SoccerTileAdapter(
    private val data: ArrayList<SoccerTile> ,
    private val soccerTileInterface: SoccerTileInterface):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return SoccerTileViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as SoccerTileViewHolder).onBind(data[position], soccerTileInterface)
    }

    inner class SoccerTileViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.view_holder_soccer_tile, parent, false)
    ) {
        val headerImageView: ImageView = itemView.findViewById(R.id.teamHeaderIv)
        val titleTextView: TextView = itemView.findViewById(R.id.teamTitleTv)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descTv)
        val button: Button = itemView.findViewById(R.id.learnMoreBtn)

        fun onBind(soccerTile: SoccerTile, soccerTileInterface: SoccerTileInterface ) {

            headerImageView.setImageResource(soccerTile.headerImageResId)
            titleTextView.text = soccerTile.title
            descriptionTextView.text = soccerTile.description
            button.setOnClickListener{
                soccerTileInterface.onSoccerTileClick(adapterPosition)
            }
        }

    }
}