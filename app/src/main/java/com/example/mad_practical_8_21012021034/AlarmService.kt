package com.example.mad_practical_8_21012021034

import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.app.Service

class AlarmService: Service(){
    lateinit var player : MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("Practical-8")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent != null) {
            player = MediaPlayer.create(this,R.raw.alarm)
            player.start()
        }

        return START_STICKY
    }

    override fun onDestroy() {
        player.stop()
        super.onDestroy()
    }
}