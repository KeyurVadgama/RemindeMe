package com.example.remindeme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class myAdapter(dataholder: ArrayList<Model>) :
    RecyclerView.Adapter<myAdapter.myviewholder>() {
    var dataholder = ArrayList<Model>() //array list to hold the reminders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.single_reminder_file,
            parent,
            false
        ) //inflates the xml file in recyclerview
        return myviewholder(view)
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        holder.mTitle.setText(dataholder[position].title.toString()) //Binds the single reminder objects to recycler view
        holder.mDate.setText(dataholder[position].date)
        holder.mTime.setText(dataholder[position].time)
    }

    override fun getItemCount(): Int {
        return dataholder.size
    }

    inner class myviewholder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var mTitle: TextView
        var mDate: TextView
        var mTime: TextView

        init {
            mTitle =
                itemView.findViewById(R.id.txtTitle)  //holds the reference of the materials to show data in recyclerview
            mDate = itemView.findViewById(R.id.txtDate)
            mTime = itemView.findViewById(R.id.txtTime)
        }
    }

    init {
        this.dataholder = dataholder
    }
}
