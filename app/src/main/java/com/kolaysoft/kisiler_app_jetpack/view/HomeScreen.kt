package com.kolaysoft.kisiler_app_jetpack.view

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kolaysoft.kisiler_app_jetpack.R
import com.kolaysoft.kisiler_app_jetpack.view.widget.CustomTopAppBar
import com.kolaysoft.kisiler_app_jetpack.viewmodel.PersonRegisterViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    val viewModel: PersonRegisterViewModel = viewModel()

    Scaffold(
        topBar = {
            CustomTopAppBar(text = "Kişiler Uygulaması")
        },
        content = {
            LazyColumn {
                items(
                    count = viewModel.personList.count(),
                    itemContent = {
                        val person = viewModel.personList[it];
                        CardDesign(person.name, person.phoneNumber)
                    }
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate("personRegisteredScreen")
            }) {
                Icon(painter = painterResource(id = R.drawable.add_icon), contentDescription = "")
            }
        }
    )

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}

@Composable
fun CardDesign(name: String, phoneNumber: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = name)
                Text(text = phoneNumber)
            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.delete),
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(30.dp)
            )
        }
    }
}
