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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
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

        val text = buildAnnotatedString {
            append(
                AnnotatedString(
                    text = "If you don't have an account register \n" +
                            "You can ",
                    spanStyle = SpanStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontFamily = OpenSans,
                        fontWeight = FontWeight.Normal
                    )
                )
            )

            append(
                AnnotatedString(
                    text = "register here !",
                    spanStyle = SpanStyle(
                        color = Purple700,
                        fontSize = 16.sp,
                        fontFamily = OpenSans,
                        fontWeight = FontWeight.Bold
                    )
                )
            )

        }

        Text(
            text = text, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
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
                    painter = painterResource(id = R.drawable.ic_baseline_email_24),
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
                    painter = painterResource(id = R.drawable.ic_baseline_lock_24),
                    contentDescription = null,
                    Modifier.size(25.dp),
                    tint = Purple700
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_remove_red_eye_24),
                    contentDescription = null,
                    Modifier.size(25.dp),
                    tint = Purple700
                )
            }

        )



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Checkbox(
                    checked = true,
                    onCheckedChange = {

                    }
                )

                Text(
                    text = "Remember me",
                    color = Purple700,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    fontFamily = OpenSans,
                    modifier = Modifier
                )
            }

            Text(
                text = "Forget Password ?",
                color = Purple700,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                fontFamily = OpenSans,
                modifier = Modifier
            )
        }

        Card(
            backgroundColor = Purple700,
            shape = RoundedCornerShape(10.dp),
            elevation = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(65.dp)
                .padding(top = 50.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().heightIn(65.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    fontFamily = OpenSans,
                    modifier = Modifier
                        .align(Alignment.Center)
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