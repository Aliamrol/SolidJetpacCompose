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
Liskov Substitution -> آبجکت‌های هر کلاس فرزند که از یک کلاس والد ارث‌بری کرده باشد، باید با آبجکت‌های کلاس والد قابل جایگزین باشد. یعنی بتوان آن را به جای کلاس والد استفاده کرد بدون اینکه خطا یا تغییری در عملکرد برنامه ایجاد شود
 */
// کلاس های فرزند نباید رفتار و ویژگی های کلاس پدر رو تغییر بدن