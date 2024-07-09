package com.kolaysoft.kisiler_app_jetpack.view

import android.annotation.SuppressLint
import android.util.Log
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kolaysoft.kisiler_app_jetpack.data.model.PersonModel
import com.kolaysoft.kisiler_app_jetpack.view.widget.CustomTopAppBar
import com.kolaysoft.kisiler_app_jetpack.viewmodel.PersonRegisterViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PersonRegistrationScreen(navController: NavController) {
    val personName = remember { mutableStateOf("") }
    val personPhone = remember { mutableStateOf("") }
    val viewModel: PersonRegisterViewModel = viewModel()

    Scaffold(
        topBar = {
            CustomTopAppBar(text = "Kişi Ekle")
        },
        content = { paddingValues ->
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
                Button(onClick = {
                    //  viewModel.kaydet(person = PersonModel(personName.value, personPhone.value))
                    viewModel.test(person = PersonModel(personName.value, personPhone.value))
                    Log.e("Lİstee", viewModel.personList.size.toString())
                }) {
                    Text(text = "Kaydet")
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PersonRegistrationScreenPreview() {
    val navController = rememberNavController()
    PersonRegistrationScreen(navController = navController)
}
