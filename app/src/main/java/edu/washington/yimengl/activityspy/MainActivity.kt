package edu.washington.yimengl.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(javaClass.name,  "onCreate event fired")
        if (savedInstanceState != null) {
            Log.i(javaClass.name, savedInstanceState.toString())
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e(javaClass.name, "We’re going down, Captain!")
    }
}
