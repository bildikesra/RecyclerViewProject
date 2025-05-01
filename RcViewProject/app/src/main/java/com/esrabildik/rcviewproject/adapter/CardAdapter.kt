package com.esrabildik.rcviewproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.esrabildik.rcviewproject.R
import com.esrabildik.rcviewproject.model.Pomodoro

class CardAdapter(val pomodoroList : List<Pomodoro>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {


    inner class CardViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

        val imageView  = itemview.findViewById<ImageView>(R.id.imageView)
        val textView = itemview.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item,parent,false)
       return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pomodoroList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
      val pomodoroItem = pomodoroList[position]
        holder.imageView.setImageResource(pomodoroItem.imageViewID)
        holder.textView.text= pomodoroItem.textView
    }
}