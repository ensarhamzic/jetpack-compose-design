package com.example.ensar_pma_dizajn

import android.graphics.ColorSpace.Rgb
import android.os.Bundle
import android.widget.ScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ensar_pma_dizajn.ui.theme.EnsarpmadizajnTheme
import com.example.ensar_pma_dizajn.ui.theme.OnestFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnsarpmadizajnTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(Color(0xFF0C0E16))
            .background(
                brush = Brush.verticalGradient(
                    listOf(Color(0xFF232A42), Color(0xFF0C0E16), Color(0xFF0C0E16)),
                ),
            )
            .fillMaxSize()
    ) {
        Column {
            // Navigation

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 40.dp, start = 30.dp),
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .width(25.dp)
                            .height(10.dp)
                            .border(2.dp, Color.White, RoundedCornerShape(4.dp))
                    ) {}
                    Box(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .width(25.dp)
                            .height(10.dp)
                            .border(2.dp, Color.White, RoundedCornerShape(4.dp))
                    ) {}
                }
                Row(
                    modifier = Modifier.horizontalScroll(rememberScrollState()),
                ) {
                    Text("Living room", modifier = Modifier.padding(16.dp), color = Color.White, fontSize = 30.sp, letterSpacing = 5.sp, fontFamily = OnestFamily)
                    Text("Bedroom", modifier = Modifier.padding(16.dp), color = Color(255, 255, 255, 0xBB), fontSize = 30.sp, letterSpacing = 5.sp, fontFamily = OnestFamily)
                }

            }


            // Main control
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .paint(
                        painterResource(id = R.drawable.linije),
                        contentScale = ContentScale.FillBounds,
                    )
                    .fillMaxWidth()
                    .height(250.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Top row (AC)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, start = 16.dp, end = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text("AC", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.width(40.dp)
                    ) {
                        Box(modifier = Modifier
                            .height(5.dp)
                            .width(15.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xFFEB7853))
                        )
                        Box(modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF141825))
                        )
                    }
                }



                // Middle row (Humidity, Temperature and controls)
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painterResource(id = R.drawable.humidity_low),
                            contentDescription = null,
                            modifier = Modifier.height(15.dp)
                        )
                        Text(
                            "55%"
                        )
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Filled.KeyboardArrowDown,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(16.dp)
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFF5CE94))
                                .padding(5.dp)
                        )

                        Text(
                            "25°",
                            fontWeight = FontWeight.Light,
                            fontFamily = OnestFamily,
                            fontSize = 50.sp,
                        )

                        Icon(
                            Icons.Filled.KeyboardArrowUp,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(16.dp)
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFF5CE94))
                                .padding(5.dp)
                        )
                    }
                }


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(id = R.drawable.airwave),
                        colorFilter = ColorFilter.tint(Color.White),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(20.dp)
                            .size(55.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xFF141825))
                            .padding(10.dp)
                    )
                    Image(
                        painterResource(id = R.drawable.snowflake),
                        colorFilter = ColorFilter.tint(Color(0xFFD89153)),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(20.dp)
                            .size(55.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xFFF5CE94))
                            .padding(10.dp)
                    )
                    Image(
                        painterResource(id = R.drawable.sun),
                        colorFilter = ColorFilter.tint(Color(0xFFD89153)),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(20.dp)
                            .size(55.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xFFF5CE94))
                            .padding(10.dp)
                    )
                }
            }

            // Bottom row (Devices)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                // Left column
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .verticalScroll(rememberScrollState()),
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .background(color = Color(0xFFA1C6FF))
                            .fillMaxWidth()
                            .height(160.dp),
                    ) {
                        Column(
                           horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painterResource(id = R.drawable.pause),
                                    colorFilter = ColorFilter.tint(Color(0xFF090913)),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(top = 16.dp, end = 16.dp)
                                        .size(20.dp)
                                )
                            }


                            Image(
                                painterResource(id = R.drawable.robot),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(70.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text("Mi robot vacuum", color = Color(0xFF090913), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
                    }

                    Box(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .clip(RoundedCornerShape(40.dp))
                            .background(color = Color(0xFFF29DA1))
                            .fillMaxWidth()
                            .height(170.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .padding(top = 16.dp, end = 20.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(15.dp)
                                            .clip(RoundedCornerShape(5.dp))
                                            .height(5.dp)
                                            .background(Color(0xFFC68289))
                                    ) {}

                                    Box(
                                        modifier = Modifier
                                            .padding(top = 2.dp)
                                            .width(15.dp)
                                            .clip(RoundedCornerShape(5.dp))
                                            .height(5.dp)
                                            .background(Color(0xFF151925))
                                    ) {}

                                    Box(
                                        modifier = Modifier
                                            .padding(top = 2.dp)
                                            .width(15.dp)
                                            .clip(RoundedCornerShape(5.dp))
                                            .height(5.dp)
                                            .background(Color(0xFF151925))
                                    ) {}

                                }
                            }


                            Image(
                                painterResource(id = R.drawable.night_light),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(70.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text("Lighting Bright", color = Color(0xFF090913), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            Text("Light", color = Color(0xFF090913), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
                    }

                    Box(
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .clip(RoundedCornerShape(40.dp))
                            .background(color = Color(0xFF373C53))
                            .fillMaxWidth()
                            .height(160.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painterResource(id = R.drawable.pause),
                                    colorFilter = ColorFilter.tint(Color.White),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(top = 16.dp, end = 16.dp)
                                        .size(20.dp)
                                )
                            }


                            Image(
                                painterResource(id = R.drawable.robot),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(70.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text("Mi robot vacuum", color = Color(0xFF090913), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }

                // Right column
                Column {

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EnsarpmadizajnTheme {
        Greeting("Android")
    }
}