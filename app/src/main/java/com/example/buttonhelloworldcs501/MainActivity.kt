package com.example.buttonhelloworldcs501

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyButtonApp()
        }
    }
}

@Composable
fun MyButtonApp() {
    // state to hold text value
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        // text that changes based on button
        Text(text = text, fontSize = 24.sp)

        Spacer(modifier = Modifier.height(24.dp))

        // make a button and set it to change text value
        Button(onClick = {
            text = "Hello World!"
        }) {
            Text(text = "Click Me")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMyButtonApp() {
    MyButtonApp()
}