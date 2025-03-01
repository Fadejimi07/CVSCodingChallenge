package com.example.cvscodingchallenge.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchScreen(searchQuery: String, onValueChange: (query: String) -> Unit) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = { query ->
            onValueChange(query)
        },
        label = {
            Text(text = "Search")
        },
        modifier = Modifier.padding(8.dp)
    )
}