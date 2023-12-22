package com.dan_human.weather_compose_potapov

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dan_human.weather_compose_potapov.UserInterface.MainCard
import com.dan_human.weather_compose_potapov.UserInterface.TabLayout
import com.dan_human.weather_compose_potapov.ui.theme.Weather_compose_PotapovTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Weather_compose_PotapovTheme {
                BackGround()

                Column {
                    MainCard()
                    TabLayout()
                }


            }
        }
    }
}

@Preview
@Composable
fun BackGround(){
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "background image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}

