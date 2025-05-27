package com.sumi.androidprepareinterviewquestions.components.activity

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sumi.androidprepareinterviewquestions.R

/**
 * Activity lifecycle diagram
 *
 *  onCreate()
 *  onStart()
 *  onResume()  ---> Foreground (Screen ready for User Interactions)
 *  onPause()
 *  onStop()
 *  onRestart() if(returning) -> onStart()
 *  onDestroy() if(finishing)
 *
 * **/

class SecondActivity: AppCompatActivity() {

    /**
     * Activity Life Cycles Functions Start
     **/

    //Called when activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("Activity2State ","onCreate - initializing the components")
    }

    //When activity becomes visible
    override fun onStart() {
        super.onStart()
        Log.d("Activity2State ","onStart - Activity visible to user")
    }

    //When activity comes to foreground(user can interact now)
    override fun onResume() {
        super.onResume()
        Log.d("Activity2State ","onResume - User Interactions")
    }

    //When another activity comes in front. Current activity goes to background.
    override fun onPause() {
        super.onPause()
        Log.d("Activity2State ","onPause - Activity Goes Background")
    }

    //Activity is no longer visible
    override fun onStop() {
        super.onStop()
        Log.d("Activity2State ","onStop - No part of activity is visible")
    }

    //Activity is destroyed and removed from memory
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity2State ","onDestroy - Before removing completely from stack")
    }

    //Called when an activity restarts after being stopped.
    override fun onRestart() {
        super.onRestart()
        Log.d("Activity2State ","onRestart - Start Activity")
    }

    /**
     * Activity Life Cycles Functions End
     **/

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
    }

    override fun onPostResume() {
        super.onPostResume()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }

    override fun onCreateDialog(id: Int): Dialog {
        return super.onCreateDialog(id)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onTitleChanged(title: CharSequence?, color: Int) {
        super.onTitleChanged(title, color)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
    }
}