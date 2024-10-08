package com.example.composenavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.gson.Gson

@Composable
fun HomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "My home screen")
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {
            LoginRepository(FakeAuth(), NewErrorHandler(), navController).loginUser(
                userName = "Ali Amrol",
                password = "Aliamrol81"
            )
        }) {
            Text("Go To Second Screen")
        }
    }
}


/*
interface Segregation -> کلاس های نباید فانکشنی داشته باشند که بهش نیازی ندارند
 */
