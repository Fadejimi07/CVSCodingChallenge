package com.example.cvscodingchallenge.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.cvscodingchallenge.model.PhotoItem

@Composable
fun PhotoDetailScreen(photoItem: PhotoItem?) {
    photoItem?.let {
        Card(
            elevation = CardDefaults.cardElevation(6.dp),
            border = BorderStroke(2.dp, color = Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                AsyncImage(
                    model = photoItem.link,
                    contentDescription = photoItem.description,
                    modifier = Modifier.padding(10.dp)
                )
                Column {
                    Text(
                        text = photoItem.title,
                        style = MaterialTheme.typography.titleLarge
                    )

                    Text(
                        text = photoItem.description,
                        style = MaterialTheme.typography.bodyMedium
                    )

                    Text(
                        text = photoItem.author,
                        style = MaterialTheme.typography.labelLarge
                    )

                    Text(
                        text = photoItem.dateTaken,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}