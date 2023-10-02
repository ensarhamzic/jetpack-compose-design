package com.example.ensar_pma_dizajn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ensar_pma_dizajn.composables.TemperatureArc
import com.example.ensar_pma_dizajn.composables.TemperatureCircle
import com.example.ensar_pma_dizajn.ui.theme.EnsarpmadizajnTheme
import com.example.ensar_pma_dizajn.ui.theme.OnestFamily
import sv.lib.squircleshape.CornerSmoothing
import sv.lib.squircleshape.SquircleShape

class AirConditionerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnsarpmadizajnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.ac_background),
                contentScale = ContentScale.FillBounds,
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
                        Text(
                            "Xiaomi AC",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            fontSize = 30.sp,
                            letterSpacing = 5.sp,
                            fontFamily = OnestFamily
                        )
                        Text(
                            "Air purifier",
                            modifier = Modifier.padding(16.dp),
                            color = Color(255, 255, 255, 0xBB),
                            fontSize = 30.sp,
                            letterSpacing = 5.sp,
                            fontFamily = OnestFamily
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {




                Box(
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top,
                    ) {
                        TemperatureArc(
                            modifier = Modifier
                                .padding(bottom = 20.dp)
                                .size(400.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 60.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Column(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(
                                    brush = Brush.verticalGradient(
                                        listOf(Color(0xFF2A313A), Color(0xFF1E202C)),
                                    ),
                                )
                                .padding(15.dp)
                                .border(
                                    2.dp,
                                    brush = Brush.verticalGradient(
                                        listOf(Color(0xFF5B6067), Color(0xFF1F212D)),
                                    ),
                                    CircleShape
                                )
                                .size(250.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {

                                Image(
                                    painterResource(id = R.drawable.humidity_low),
                                    contentDescription = null,
                                    modifier = Modifier.height(15.dp),
                                    colorFilter = ColorFilter.tint(Color.White),
                                )
                                Text(
                                    "55%",
                                    color = Color.White
                                )
                            }

                            Row(
                                verticalAlignment = Alignment.Top,
                            ) {
                                Text(
                                    "19",
                                    fontWeight = FontWeight.Light,
                                    fontFamily = OnestFamily,
                                    fontSize = 90.sp,
                                    color = Color.White,
                                )

                                Text(
                                    "°",
                                    fontWeight = FontWeight.Light,
                                    fontFamily = OnestFamily,
                                    fontSize = 40.sp,
                                    color = Color.White,
                                    modifier = Modifier
                                        .padding(top = 15.dp)
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(370.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.Bottom,
                    ) {
                        Image(
                            painterResource(id = R.drawable.power),
                            colorFilter = ColorFilter.tint(Color.White),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(SquircleShape())
                                .background(color = Color(0xFF2C303E))
                                .padding(20.dp)
                                .size(30.dp)
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier

                            .clip(
                                RoundedCornerShape(30.dp)
                            )
                            .background(color = Color(0xFFE8FCBF))
                            .fillMaxWidth(0.31f)
                            .height(200.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .padding(vertical = 20.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        ) {
                            Image(
                                painterResource(id = R.drawable.airwave),
                                colorFilter = ColorFilter.tint(Color.White),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(65.dp)
                                    .clip(SquircleShape())
                                    .background(Color(0xFF141825))
                                    .padding(15.dp)
                            )

                            Text(
                                "Dry",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )


                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.width(40.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .height(5.dp)
                                        .width(15.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(Color(0xFFBECF9F))
                                )
                                Box(
                                    modifier = Modifier
                                        .size(20.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF141825))
                                )
                            }
                        }
                    }



                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .clip(
                                RoundedCornerShape(30.dp)
                            )
                            .background(color = Color(0xFFC2E5FF))
                            .fillMaxWidth(0.5f)
                            .height(200.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .padding(vertical = 20.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        ) {
                            Image(
                                painterResource(id = R.drawable.snowflake),
                                colorFilter = ColorFilter.tint(Color.White),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(65.dp)
                                    .clip(SquircleShape())
                                    .background(Color(0xFF141825))
                                    .padding(15.dp)
                            )

                            Text(
                                "Cool",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )


                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.width(40.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .height(5.dp)
                                        .width(15.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(Color(0xFFBECF9F))
                                )
                                Box(
                                    modifier = Modifier
                                        .size(20.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF141825))
                                )
                            }
                        }
                    }




                    Box(
                        modifier = Modifier
                            .clip(
                                RoundedCornerShape(30.dp)
                            )
                            .background(color = Color(0xFF1F212D))
                            .fillMaxWidth()
                            .height(200.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .padding(vertical = 20.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        ) {
                            Image(
                                painterResource(id = R.drawable.sun),
                                colorFilter = ColorFilter.tint(Color(0xFF090B13)),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(65.dp)
                                    .clip(SquircleShape())
                                    .background(Color(0xFF2C303E))
                                    .padding(15.dp)
                            )

                            Text(
                                "Heat",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF62646D)
                            )


                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.width(40.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(15.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF2C303E))
                                )
                                Box(
                                    modifier = Modifier
                                        .height(5.dp)
                                        .width(20.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(Color(0xFF0C0E16))
                                )

                            }
                        }
                    }
                }


                Row(
                    modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 20.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top,
                ) {
                    Box(
                        modifier = Modifier

                            .clip(
                                RoundedCornerShape(30.dp)
                            )
                            .background(color = Color(0xFF1F212D))
                            .fillMaxWidth(0.31f)
                            .height(200.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .padding(vertical = 20.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        ) {
                            Image(
                                painterResource(id = R.drawable.leaf),
                                colorFilter = ColorFilter.tint(Color(0xFF090B13)),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(65.dp)
                                    .clip(SquircleShape())
                                    .background(Color(0xFF2C303E))
                                    .padding(15.dp)
                            )

                            Text(
                                "Eco",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF62646D)
                            )


                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.width(40.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(15.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF2C303E))
                                )
                                Box(
                                    modifier = Modifier
                                        .height(5.dp)
                                        .width(20.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(Color(0xFF0C0E16))
                                )

                            }
                        }
                    }



                    Box(
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .clip(
                                RoundedCornerShape(30.dp)
                            )
                            .fillMaxWidth()
                            .height(100.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Box(
                                modifier = Modifier
                                    .background(Color(0xFFF9CC89))
                                    .fillMaxWidth(0.2f)
                                    .fillMaxHeight()
                            ) {}

                            Box(
                                modifier = Modifier
                                    .background(Color(0xFFF9CC89))
                                    .fillMaxWidth(0.25f)
                                    .fillMaxHeight()
                            ) {}

                            Box(
                                modifier = Modifier
                                    .background(Color(0xFFF9CC89))
                                    .fillMaxWidth(0.33f)
                                    .fillMaxHeight()
                            ) {}

                            Box(
                                modifier = Modifier
                                    .background(Color(0xFF1F212D))
                                    .fillMaxWidth(0.5f)
                                    .fillMaxHeight()
                            ) {}

                            Box(
                                modifier = Modifier
                                    .background(Color(0xFF1F212D))
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                            ) {}
                        }


                        Row(
                            modifier
                                .padding(horizontal = 15.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Image(
                                painterResource(id = R.drawable.air),
                                colorFilter = ColorFilter.tint(Color.White),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(65.dp)
                                    .clip(SquircleShape())
                                    .background(Color(0xFF141825))
                                    .padding(15.dp)
                            )

                            Text(
                                "Fan",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 15.dp)
                            )
                        }
                    }
                }
            }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    EnsarpmadizajnTheme {
        Greeting2("Android")
    }
}