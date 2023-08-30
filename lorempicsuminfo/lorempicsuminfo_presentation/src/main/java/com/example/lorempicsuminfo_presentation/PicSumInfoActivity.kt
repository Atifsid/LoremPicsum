package com.example.lorempicsuminfo_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common_utils.Navigator

class PicSumInfoActivity : AppCompatActivity() {

    companion object {
        fun launchActivity(activity: Activity){
            val intent = Intent(activity, PicSumInfoActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic_sum_info)
    }
}

object GoToPicSumInfoActivity: Navigator {

    override fun navigate(activity: Activity) {
        PicSumInfoActivity.launchActivity(activity)
    }

}