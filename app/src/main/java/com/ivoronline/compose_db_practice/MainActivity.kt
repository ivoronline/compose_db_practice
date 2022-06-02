package com.ivoronline.compose_db_practice

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

var viewModel: MyViewModel? = null

//===============================================================================
// MAIN ACTIVITY
//===============================================================================
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewModel = MyViewModel(applicationContext as Application)
    setContent {
      ScreenSetup()
    }
  }
}

//===============================================================================
// SCREEN SETUP
//===============================================================================
@Composable
fun ScreenSetup() {
  Button({viewModel?.insertPerson(Person("Bill", 20))}) {Text("Insert Person")}
}
