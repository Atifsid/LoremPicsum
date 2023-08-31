package com.example.lorempicsum_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
//        setContentView(R.layout.activity_pic_sum)

        setContent { ColumnDemo() }


//        setObservers()
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

@Composable
fun ColumnDemo() {

    Column {
        for (i in 1..100) {
            Text(
                "User Name $i",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(10.dp)
            )

            Divider(color = Color.Black, thickness = 5.dp)

        }
    }
}

object GoToPicSumActivity: Navigator {

    override fun navigate(activity: Activity) {
        PicSumActivity.launchActivity(activity)
    }

}