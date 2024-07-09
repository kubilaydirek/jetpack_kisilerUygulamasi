package com.kolaysoft.kisiler_app_jetpack.view.widget

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(text: String) {
    TopAppBar(
        title = { Text(text = text) },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xfff4ddde))
    )
}

@Preview
@Composable
fun CustomTopAppBarPreview() {
    CustomTopAppBar("Kisiler App")
}