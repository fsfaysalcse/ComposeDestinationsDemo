package com.example.composenavigation

import androidx.compose.animation.Animatable
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenavigation.destinations.ScreenProfileDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@RootNavGraph(start = true)
@Destination
@Composable
fun ScreenDashboard(
    navigator: DestinationsNavigator? = null
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        /*--- This code for change color-----*/

        var isAnimated by remember { mutableStateOf(false) }

        val color = remember { Animatable(Color.Blue) }

        // animate to green/red based on `button click`
        LaunchedEffect(isAnimated) {
            color.animateTo(
                if (isAnimated) Color.Yellow else Color.Red,
                animationSpec = tween(5000)
            )
        }


        /*--- This code for change size-----*/

        val isNeedExpansion = rememberSaveable { mutableStateOf(false) }

        val animatedSizeDp: Dp by animateDpAsState(
            targetValue = if (isNeedExpansion.value == true) 400.dp else 200.dp
        )


        /*------Rotate animation-----*/

        var isRotated by rememberSaveable { mutableStateOf(false) }

        val rotationAngle by animateFloatAsState(
            targetValue = if (isRotated == true) 360F else 0f,
            animationSpec = tween(durationMillis = 2500)
        )

        Box(
            modifier = Modifier
                .size(animatedSizeDp)
                .background(color.value, RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Color.Red)
            )

            Image(
                painter = painterResource(id = R.drawable.image_fan_2),
                contentDescription = null,
                modifier = Modifier
                    .size(animatedSizeDp / 2 )
                    .clip(CircleShape)
                    .rotate(rotationAngle)

            )
        }

        Button(onClick = {
            //  navigator?.navigate(ScreenProfileDestination)
            isAnimated = !isAnimated
            isNeedExpansion.value = !isNeedExpansion.value
            isRotated = !isRotated


        }) {
            Text(text = "Profile")
        }
    }
}

@Preview
@Composable
fun PreviewScreenDashboard() {
    ScreenDashboard()
}