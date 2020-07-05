package com.packag.celebrityapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bio.*

class BioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bio)


        var receiveData = intent.extras
        var actorName= receiveData?.getString(ACTOR_NAME)
        var actorDes= receiveData?.getString(ACTOR_DES)
        var actorImage= receiveData!!.getInt(ACTOR_IMAGE)

        bioActorImage.setImageResource(actorImage)
        lblActorBio.text = "$actorName - $actorDes"
    }

    companion object{
        val ACTOR_NAME = "name"
        val ACTOR_DES = "des"
        val ACTOR_IMAGE = "image"
    }




}