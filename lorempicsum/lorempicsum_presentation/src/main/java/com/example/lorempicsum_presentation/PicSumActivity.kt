package com.example.lorempicsum_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.common_utils.Navigator
import com.example.lorempicsum_presentation.viewmodel.PicSumViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class PicSumActivity : AppCompatActivity() {

    companion object {
        fun launchActivity(activity: Activity){
            val intent = Intent(activity, PicSumActivity::class.java)
            activity.startActivity(intent)
        }
    }

    private val picSumViewModel : PicSumViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic_sum)

        setObservers()
    }

    private fun setObservers(){
        lifecycleScope.launchWhenStarted {
            picSumViewModel.picSumImage.collectLatest {
                if(it.isLoading){

                }
                if (it.error.isNotBlank()){
                    Toast.makeText(this@PicSumActivity, it.error, Toast.LENGTH_SHORT).show()
                }
                it.data?.let {
                    Log.d("TAG", "setObservers: ${it}")
                }
            }
        }
    }
}

object GoToPicSumActivity: Navigator {

    override fun navigate(activity: Activity) {
        PicSumActivity.launchActivity(activity)
    }

}