package com.example.lorempicsum_presentation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.example.common_utils.Navigator
import com.example.lorempicsum_presentation.pages.AppTheme
import com.example.lorempicsum_presentation.pages.PicSumList
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
        setObservers()
    }

    private fun setObservers(){
        lifecycleScope.launchWhenStarted {
            picSumViewModel.picSumImage.collectLatest {
                if(it.isLoading){
                    setContent {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            CircularProgressIndicator()
                        }
                    }
                }
                if (it.error.isNotBlank()){
                    setContent {
                        Toast.makeText(this@PicSumActivity, it.error, Toast.LENGTH_SHORT).show()
                    }
                }
                it.data?.let {
                    setContent {
                        AppTheme {
                            PicSumList(imageModels = it)
                        }
                    }
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