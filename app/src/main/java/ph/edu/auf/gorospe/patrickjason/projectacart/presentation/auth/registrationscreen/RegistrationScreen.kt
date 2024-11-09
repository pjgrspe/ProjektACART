package ph.edu.auf.gorospe.patrickjason.projectacart.presentation.auth.registrationscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RegistrationScreen() {
    var currentStep by remember { mutableStateOf(1) }
    val totalSteps = 2  // Adjust if you add more steps

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Progress Indicator at the top
        ProgressIndicator(currentStep, totalSteps)
        // Alternatively, use HorizontalProgressIndicator
        // HorizontalProgressIndicator(currentStep, totalSteps)

        Spacer(modifier = Modifier.height(16.dp))

        // Display different steps
        when (currentStep) {
            1 -> AccountDetailsStep(
                onNext = { currentStep++ }
            )
            2 -> ProfilePictureStep(
                onPrevious = { currentStep-- },
                onNext = { currentStep++ }
            )
        }
    }
}
