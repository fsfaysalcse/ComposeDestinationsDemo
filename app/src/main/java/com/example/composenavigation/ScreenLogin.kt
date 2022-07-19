package com.example.composenavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenavigation.ui.theme.OpenSans
import com.example.composenavigation.ui.theme.Purple700
import com.example.composenavigation.ui.theme.Teal200
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun ScreenLogin(
    navigator: DestinationsNavigator? = null
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_baseline_beach_access_24),
            contentDescription = null,
            colorFilter = ColorFilter.tint(Teal200),
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.Start)
        )

        Text(
            text = "Login",
            color = Color.Black,
            fontWeight = FontWeight.Normal,
            fontSize = 40.sp,
            fontFamily = OpenSans,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 50.dp)
        )

        Text(
            text = "If you don't have an account register \nYou can register here ! ",
            color = Color.Black,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            fontFamily = OpenSans,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 40.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "Email", fontFamily = OpenSans, color = Color.Black)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_email_24) ,
                    contentDescription = null,
                    Modifier.size(25.dp),
                    tint = Purple700
                )
            }
        )

        OutlinedTextField(
            value = "Password",
            onValueChange = {},
            placeholder = {
                Text(text = "Email", fontFamily = OpenSans, color = Color.Black)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_lock_24) ,
                    contentDescription = null,
                    Modifier.size(25.dp),
                    tint = Purple700
                )
            }
        )

        Text(
            text = "Forget Password ?",
            color = Purple700,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            fontFamily = OpenSans,
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 10.dp)
        )

        Card(
            backgroundColor = Purple700,
            shape = RoundedCornerShape(46.dp),
            elevation = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(80.dp)
                .padding(top = 50.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    fontFamily = OpenSans,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(10.dp)
                )
            }
        }







    }
}


@Preview
@Composable
fun PreviewScreenLogin() {
    ScreenLogin()
}