package com.example.ensar_pma_dizajn.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TemperatureArc(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
    ) {
        val sizeArc = size / 1.3f
        drawArc(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFFB8EFCC),
                    Color(0xFFB8EFCC),
                    Color(0xFFC4F5F7),
                    Color(0xFFBBD7F5),
                    Color(0xFF95AEEA),
                    Color(0xFF90A9E7),
                )
            ),
            startAngle = 150f,
            sweepAngle = 120f,
            topLeft = Offset((size.width - sizeArc.width)/2f,(size.height - sizeArc.height)/2f),
            useCenter = false,
            style = Stroke(width = 80f, cap = StrokeCap.Round),
            size = sizeArc,
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
            sweepAngle = 120f,
            topLeft = Offset((size.width - sizeArc.width)/2f,(size.height - sizeArc.height)/2f),
            useCenter = false,
            style = Stroke(width = 80f, cap = StrokeCap.Round),
            size = sizeArc,
        )
    }
}


@Preview
@Composable
fun TemperatureArcPreview() {
    TemperatureArc(
        modifier = Modifier.size(300.dp)
    )
}