package com.example.mad_practical_8_21012021034

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReciever: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if (intent != null) {
            val data = intent.getStringExtra(ALARMKEY)
            if (data != null) {
                val intentService = Intent(context, AlarmService::class.java)
                if (data == ALARMSTART) {
                    // Start the alarm service
                    context.startService(intentService)
                }
                else{
                    // Stop the alarm service
                    context.stopService(intentService)
                }
            }
        }
    }

    companion object {
        val ALARMKEY = "KEY"
        val ALARMSTART = "START"
        val ALARMSTOP = "STOP"
    }
}