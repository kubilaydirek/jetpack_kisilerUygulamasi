package com.kolaysoft.kisiler_app_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kolaysoft.kisiler_app_jetpack.data.navgraph.NavGraph
import com.kolaysoft.kisiler_app_jetpack.ui.theme.Kisiler_App_JetpackTheme
import com.kolaysoft.kisiler_app_jetpack.view.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kisiler_App_JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    NavGraph()
                }
            }
        }
    }
}

