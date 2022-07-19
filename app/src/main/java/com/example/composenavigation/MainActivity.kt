package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composenavigation.destinations.ScreenDashboardDestination
import com.example.composenavigation.destinations.ScreenLoginDestination
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.ramcosta.composedestinations.DestinationsNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {
                DestinationsNavHost(
                    navGraph = NavGraphs.root,
                    startRoute = ScreenLoginDestination
                )
            }
        }
    }
}
