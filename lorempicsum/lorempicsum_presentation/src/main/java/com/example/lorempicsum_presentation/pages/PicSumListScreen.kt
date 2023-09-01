package com.example.lorempicsum_presentation.pages

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.lorempicsum_domain.model.Image
import com.example.lorempicsuminfo_presentation.PicSumInfoActivity


// TODO: MOVE TO A COMMON PACKAGE SUCH AS COMMON_UTILS
@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (!useDarkTheme) {
        lightColorScheme()
    } else {
        darkColorScheme()
    }

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
@Composable
fun PicSumItem(image: Image) {
    val context = LocalContext.current
    Card(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)
            .clickable {

//                IMPORTANT !!
//                THIS IS NOT THE RIGHT METHOD TO NAVIGATE TO ANOTHER MODULE,
//                DO TRY TO USE NAVHOST FROM COMPOSE.

                val intent = Intent(context, PicSumInfoActivity::class.java)
                intent.putExtra("id", image.id)
                context.startActivity(intent)
            }) {
            AsyncImage(
                model = image.download_url,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text("Author : ${image.author}", style = MaterialTheme.typography.titleMedium)
                Text("id : ${image.id}", style = MaterialTheme.typography.titleMedium)
                Text("Width : ${image.width}",style = MaterialTheme.typography.bodySmall)
                Text("Height : ${image.height}",style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Composable
fun PicSumList(imageModels: List<Image>) {
    LazyColumn {
        itemsIndexed(items = imageModels) {index, item ->
            PicSumItem(item)
        }
    }
}