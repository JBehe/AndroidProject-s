package com.ebookfrenzy.carddemo




public class data{

    private var titles = mutableListOf("Chapter One",
        "Chapter Two", "Chapter Three", "Chapter Four",
        "Chapter Five", "Chapter Six", "Chapter Seven",
        "Chapter Eight")

    private var details = mutableListOf("Item one details", "Item two details",
        "Item three details", "Item four details",
        "Item five details", "Item six details",
        "Item seven details", "Item eight details")

    private var images = mutableListOf(R.drawable.android_image_1,
        R.drawable.android_image_2, R.drawable.android_image_3,
        R.drawable.android_image_4, R.drawable.android_image_5,
        R.drawable.android_image_6, R.drawable.android_image_7,
        R.drawable.android_image_8)

   fun getTitles(): MutableList<String> {
       return titles
   }
   fun setTitles(){
       this.titles = titles
   }
    fun getdetails(): MutableList<String> {
        return details
    }
    fun setdetails(){
        this.details = details
    }
    fun getimage(): MutableList<Int> {
        return images
    }
    fun setsetimage(){
        this.images = images
    }


}