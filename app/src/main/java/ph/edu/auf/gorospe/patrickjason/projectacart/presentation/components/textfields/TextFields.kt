package ph.edu.auf.gorospe.patrickjason.projectacart.presentation.components.textfields

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ph.edu.auf.gorospe.patrickjason.projectacart.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StyledTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    enabled: Boolean = true,
    trailingIcon: ImageVector? = null,
    trailingIconContentDescription: String? = null,
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label, color = AppTheme.colorScheme.onBackground) },
        enabled = enabled,
        shape = AppTheme.shapes.button,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = AppTheme.colorScheme.background,
            focusedTextColor = AppTheme.colorScheme.onBackground,
            focusedBorderColor = AppTheme.colorScheme.onBackground,
            unfocusedBorderColor = AppTheme.colorScheme.onBackground
        ),
        singleLine = true,
        trailingIcon = {
            if (trailingIcon != null) {
                Icon(
                    imageVector = trailingIcon,
                    contentDescription = trailingIconContentDescription,
                    tint = AppTheme.colorScheme.onBackground,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun StyledTextFieldPreview() {
    AppTheme {
        Column(
            modifier = Modifier
                .padding(AppTheme.sizes.medium),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(AppTheme.sizes.normal)
        ) {
            StyledTextField(
                value = "",
                onValueChange = {},
                label = "Action Input with Icon",
                trailingIcon = Icons.Default.Done,
                trailingIconContentDescription = "Done Icon"
            )
            StyledTextField(
                value = "",
                onValueChange = {},
                label = "Action Input without Icon"
            )
        }
    }
}
