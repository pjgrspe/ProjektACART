package ph.edu.auf.gorospe.patrickjason.projectacart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import ph.edu.auf.gorospe.patrickjason.projectacart.presentation.BottomNavigationBar
import ph.edu.auf.gorospe.patrickjason.projectacart.presentation.auth.registrationscreen.RegistrationScreen
import ph.edu.auf.gorospe.patrickjason.projectacart.presentation.auth.welcomescreen.WelcomeScreen
import ph.edu.auf.gorospe.patrickjason.projectacart.presentation.components.topappbar.MyTopAppBar
import ph.edu.auf.gorospe.patrickjason.projectacart.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                SetBarColor(color = AppTheme.colorScheme.background)
                Scaffold(
//                    topBar = { MyTopAppBar(title = "Project A Cart", showActionButton = false) }, TEST ONLY
//                    bottomBar = { BottomNavigationBar() }, TEST ONLY
                    modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    WelcomeScreen() //TEST ONLY
//                    RegistrationScreen() //TEST ONLY
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
    @Composable
    //SET ANDROID STATUS BAR COLOR
    private fun SetBarColor(color: Color){
        val systemUIController = rememberSystemUiController()
        SideEffect {
            systemUIController.setSystemBarsColor(color = color)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}