package com.example.lorempicsuminfo_presentation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.common_utils.Navigator
import com.example.lorempicsuminfo_presentation.viewmodel.PicSumInfoViewModel
import dagger.hilt.android.AndroidEntryPoint

//import com.example.lorempicsuminfo_presentation.viewmodel.PicSumInfoViewModel

@AndroidEntryPoint
class PicSumInfoActivity : AppCompatActivity() {

    companion object {
        fun launchActivity(activity: Activity){
            val intent = Intent(activity, PicSumInfoActivity::class.java)
            activity.startActivity(intent)
        }
    }

    private val picSumInfoViewModel: PicSumInfoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic_sum_info)

//        intent.getStringExtra("id")?.let { picSumInfoViewModel.getImageInfo(it) }
        Log.d("TAG", "asdsad: ${intent.getStringExtra("id")}")
//        val id = intent.getStringExtra("id")
//        if (id != null){
//            picSumInfoViewModel.getImageInfo(id)
//        }

//        setObservers()
    }

    private fun setObservers(){
        lifecycleScope.launchWhenCreated {
            picSumInfoViewModel.picSumImageInfo.let {
                if(it.value.isLoading){
//                    setContent {
//                        Box(
//                            contentAlignment = Alignment.Center,
//                            modifier = Modifier.fillMaxSize()
//                        ) {
//                            CircularProgressIndicator()
//                        }
//                    }
                }
                if(it.value.error.isNotBlank()){
//                    setContent {
////                        val e = it.value.error
//                        Toast.makeText(this@PicSumInfoActivity, "Something went Wrong", Toast.LENGTH_SHORT).show()
//                    }
                }
                it.value.data?.let {
//                    setContent {
//                        AppTheme {
//                            PicSumInfo(imageInfo = it)
//                        }
//                    }
                }
            }
        }
    }
}

object GoToPicSumInfoActivity: Navigator {

    override fun navigate(activity: Activity) {
        PicSumInfoActivity.launchActivity(activity)
    }

}