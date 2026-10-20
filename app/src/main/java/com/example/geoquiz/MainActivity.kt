package com.example.geoquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.geoquiz.ui.theme.GeoQuizTheme

data class Question(
    val text: String,
    val answer: Boolean
)
val questionBank = listOf(
    Question("Канберра — столица Австралии.", true),
    Question("Тихий океан больше Атлантического океана.", true),
    Question("Суэцкий канал соединяет Красное море и Индийский океан.", true),
    Question("Исток реки Нил находится в Египте.", false),
    Question("Амазонка — самая длинная река в Америке.", false),
    Question("Озеро Байкал — самое древнее и самое глубокое пресноводное озеро в мире.", true),
    Question("Земля — третья планета от Солнца.", true)
)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun DemoScreen(modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MaterialTheme {
        DemoScreen()
    }
}