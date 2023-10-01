package com.example.ensar_pma_dizajn.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TemperatureCircle(
    modifier: Modifier = Modifier
) {
        Canvas(
            modifier = modifier
        ) {
            drawArc(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFB8EFCC),
                        Color(0xFFC4F5F7),
                        Color(0xFFBBD7F5),
                        Color(0xFF95AEEA),
                        Color(0xFF90A9E7),
                    )
                ),
                startAngle = 180f,
                sweepAngle = 91f,
                useCenter = true
            )

            drawRect(
                color = Color(0xFFBBD7F5),
                topLeft = Offset(0f, size.height / 2 - 1f),
                size = size.copy(height = size.height * 0.1f, width = size.width / 2),
            )


            drawArc(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFB8EFCC),
                        Color(0xFFD8EFB8),
                        Color(0xFFEEE5A8),
                        Color(0xFFFAC892),
                        Color(0xFFFEA37B),
                    )
                ),
                startAngle = -90f,
                sweepAngle = 90f,
                useCenter = true
            )

            drawRect(
                color = Color(0xFFEEE5A8),
                topLeft = Offset(size.width / 2, size.height / 2 - 1f),
                size = size.copy(height = size.height * 0.1f, width = size.width / 2),
            )
        }
}

@Preview
@Composable
fun TemperatureCirclePreview() {
    TemperatureCircle(
        modifier = Modifier
            .size(320.dp)
    )
}