package com.example.composenavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composenavigation.destinations.ScreenDashboardDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun ScreenPayment(
    navigator: DestinationsNavigator? = null
) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "ScreenPayment".uppercase(),
            color = Color.White,
            fontSize = 30.sp
        )

        Button(onClick = {
            navigator?.navigate(ScreenDashboardDestination)
        }) {
            Text(text = "Dashboard")
        }
    }
}

@Preview
@Composable
fun PreviewScreenPayment() {
    ScreenPayment()
}