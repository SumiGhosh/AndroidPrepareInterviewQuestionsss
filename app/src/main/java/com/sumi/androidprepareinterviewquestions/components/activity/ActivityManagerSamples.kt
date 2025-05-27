package com.sumi.androidprepareinterviewquestions.components.activity

import android.app.ActivityManager
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityManagerSamples: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        // So Activity Manager is an Android system service  which plays a crucial role in managing
        // the lifecycle and state of applications
        // activities, services and processes within system.

        // Functions of ActivityManager
        // - Tracking Activities:  It maintains a record of all currently running activities, their states(
        // eg: running, paused,stopped), and the task stack they belong to.
        // - It keeps track of services that are running, their states, whether they are bounded or started.
        // - Monitors all running processes and their memory usage.
        // - It offers methods to query the system, about the state of the components(
        // like which activity is in foreground, services are active, memory details of each process using.)
        // - When system is running low on memory, activity manager plays a key role on deciding which
        // processes to kill to free up the resources. (eg: foreground app is more important background app)
        // - isLowRamDevice() allow apps to know if device has memory limits.
        // - Android uses task stacks to manage the flow of activities, Activity manager maintains these stacks
        // and can provide information about the current tasks.
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val tasks = activityManager.getRunningTasks(5)
        for(task in tasks) {
            Log.d("ActivityManager","Task: ${task.topActivity?.className}")
        }
    }

    override fun onPause() {
        super.onPause()
    }
}