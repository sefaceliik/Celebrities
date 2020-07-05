package com.packag.celebrityapp

class CelebrityDatabase {

    var celebritiesList: ArrayList<Celebrity>? = null

    constructor(){

        celebritiesList = ArrayList()
            celebritiesList?.add(Celebrity("Angelina Jolie", "Angelina Jolie is an American actress",R.mipmap.angelina_jolie,true))
            celebritiesList?.add(Celebrity("Audrey Hepburn","Audrey Hepburn was a British actress",R.mipmap.audrey_hepburn,false))
            celebritiesList?.add(Celebrity("Brad Pitt","Brad Pitt is an American actor",R.mipmap.brad_pitt,true))
            celebritiesList?.add(Celebrity("Elizabeth Taylor","Elizabeth Taylor was a British-American actress",R.mipmap.elizabeth_taylor,false))
            celebritiesList?.add(Celebrity("Ingrid Bergman","Ingrid Bergman is a Swedish actress",R.mipmap.ingrid_bergman,false))
            celebritiesList?.add(Celebrity("James Stewart","James Stewart is an American actor",R.mipmap.james_stewart,false))
            celebritiesList?.add(Celebrity("Marilyn Monroe","Marilyn Monroe is an American actress",R.mipmap.marilyn_monroe,false))


    }
}