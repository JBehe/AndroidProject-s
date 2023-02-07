package com.ebookfrenzy.carddemo

import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.ebookfrenzy.carddemo.data

import com.google.android.material.snackbar.Snackbar
import java.util.*
import java.util.Collections.list
import kotlin.random.Random.*



class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    /*private val titles = mutableListOf("Chapter One",
        "Chapter Two", "Chapter Three", "Chapter Four",
        "Chapter Five", "Chapter Six", "Chapter Seven",
        "Chapter Eight")*/

    private val test = data();
    private val randomTitles = mutableListOf(test.getTitles().random())


    private val randomDetails = mutableListOf(test.getdetails().random())

    private val randomImages = mutableListOf(test.getimage().random())


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)



    }

    override fun getItemCount(): Int {
        return randomDetails.size
        return randomTitles.size
        return randomImages.size


    }

    fun titlerandomize(list: MutableList<String>): MutableList<String> {
        while (list.size < test.getTitles().size){
            list.add(test.getTitles().random())
        }
        return list
    }
    fun detailrandomize(list: MutableList<String>): MutableList<String>{
        while (list.size < test.getdetails().size){
            list.add(test.getdetails().random())
        }
        return list
    }
    fun imagerandomize(list: MutableList<Int>): MutableList<Int>{
        while (list.size < test.getdetails().size){
            list.add(test.getimage().random())
        }
        return list
    }





    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        titlerandomize(randomTitles)
        detailrandomize(randomDetails)
        imagerandomize(randomImages)


        viewHolder.itemTitle.text = randomTitles[i]
        viewHolder.itemDetail.text = randomDetails[i]
        viewHolder.itemImage.setImageResource(randomImages[i])
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView



        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)
        }
    }

}