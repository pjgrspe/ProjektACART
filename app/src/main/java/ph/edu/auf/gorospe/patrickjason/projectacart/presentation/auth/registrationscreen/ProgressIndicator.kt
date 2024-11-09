package ph.edu.auf.gorospe.patrickjason.projectacart.presentation.auth.registrationscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProgressIndicator(currentStep: Int, totalSteps: Int) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        repeat(totalSteps) { index ->
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .padding(horizontal = 4.dp)
                    .background(
                        color = if (index < currentStep) Color.Black else Color.Gray,
                        shape = CircleShape
                    )
            )
        }
    }
}