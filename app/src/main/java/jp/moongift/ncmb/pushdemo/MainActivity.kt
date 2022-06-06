package jp.moongift.ncmb.pushdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import jp.moongift.ncmb.pushdemo.ui.theme.PushDemoTheme
import com.nifcloud.mbaas.core.NCMB
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NCMB.initialize(this, "425e7448a1a92960631490f70cefcd3ca13a05b92d9a6a608044e3442bb26034", "7d6b81affe64be441ba8d7c158ac8fc4886f09974bcd2cfe072c32ccc2602f7c")
        NCMB.initializePush(this.applicationContext)
        setContent {
            PushDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PushDemoTheme {
        Greeting("Android")
    }
}