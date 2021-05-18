package com.example.ajustestatusbarcolor

import android.R.color
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP_MR1 ||
            Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP) {

            // clear FLAG_TRANSLUCENT_STATUS flag:
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

            // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

            // finally change the color
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.color_110))

//            val w: Window = window
//            w.setFlags(
//                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
//                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//            )
//            //status bar height
//            val actionBarHeight: Int = getActionBarHeight()
//            val statusBarHeight: Int = getStatusBarHeight()
//            //action bar height
//            statusBar.getLayoutParams().height = actionBarHeight + statusBarHeight
//            statusBar.setBackgroundColor(color)
        }



    }
}