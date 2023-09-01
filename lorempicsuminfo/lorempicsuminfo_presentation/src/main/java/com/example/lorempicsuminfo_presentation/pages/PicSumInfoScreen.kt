//package com.example.lorempicsuminfo_presentation.pages
//
//import androidx.compose.foundation.isSystemInDarkTheme
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Card
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.material3.darkColorScheme
//import androidx.compose.material3.lightColorScheme
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.unit.dp
//import coil.compose.AsyncImage
//
//
//// TODO: MOVE TO A COMMON PACKAGE SUCH AS COMMON_UTILS
//@Composable
//fun AppTheme(
//    useDarkTheme: Boolean = isSystemInDarkTheme(),
//    content: @Composable () -> Unit
//) {
//    val colors = if (!useDarkTheme) {
//        lightColorScheme()
//    } else {
//        darkColorScheme()
//    }
//
//    MaterialTheme(
//        colorScheme = colors,
//        content = content
//    )
//}
//@Composable
//fun PicSumInfo(imageInfo: ImageInfo){
//    Card(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
//        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)) {
//            AsyncImage(
//                model = imageInfo.download_url,
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(100.dp)
//                    .clip(RoundedCornerShape(16.dp))
//            )
//            Column(modifier = Modifier.padding(start = 16.dp)) {
//                Text("Author : ${imageInfo.author}", style = MaterialTheme.typography.titleMedium)
//                Text("id : ${imageInfo.id}", style = MaterialTheme.typography.titleMedium)
//                Text("Width : ${imageInfo.width}",style = MaterialTheme.typography.bodySmall)
//                Text("Height : ${imageInfo.height}",style = MaterialTheme.typography.bodySmall)
//            }
//        }
//    }
//}