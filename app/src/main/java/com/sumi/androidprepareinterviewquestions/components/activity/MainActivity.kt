package com.sumi.androidprepareinterviewquestions.components.activity

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.sumi.androidprepareinterviewquestions.R
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

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

class MainActivity: AppCompatActivity() {

    /**
     * Activity Life Cycles Functions Start
     **/

    //Called when activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ActivityState ","onCreate - initializing the components")
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.myButton)
        button.setOnClickListener {
            //New activity to start
            val intent  = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    //When activity becomes visible
    override fun onStart() {
        super.onStart()
        Log.d("ActivityState ","onStart - Activity visible to user")
    }

    //When activity comes to foreground(user can interact now)
    override fun onResume() {
        super.onResume()
        Log.d("ActivityState ","onResume - User Interactions")
    }

    //When another activity comes in front. Current activity goes to background.
    override fun onPause() {
        super.onPause()
        Log.d("ActivityState ","onPause - Activity Goes Background")
    }

    //Activity is no longer visible
    override fun onStop() {
        super.onStop()
        Log.d("ActivityState ","onStop - No part of activity is visible")
    }

    //Activity is destroyed and removed from memory
    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityState ","onDestroy - Before removing completely from stack")
    }

    //Called when an activity restarts after being stopped.
    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityState ","onRestart - Start Activity")
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