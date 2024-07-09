package com.kolaysoft.kisiler_app_jetpack.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kolaysoft.kisiler_app_jetpack.view.widget.CustomTopAppBar

@Composable
fun PersonDetailScreen() {
    val personName = remember { mutableStateOf("") }
    val personPhone = remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            CustomTopAppBar(text = "Kişi Ekle")
        },
        content = { paddingValues ->/**/
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = personName.value,
                    onValueChange = { personName.value = it },
                    label = { Text(text = "İsim") }
                )
                TextField(
                    value = personPhone.value,
                    onValueChange = { personPhone.value = it },
                    label = { Text(text = "Telefon") }
                )
                Button(onClick = { }) {
                    Text(text = "Güncelle")
                }
            }
        }
    )
}