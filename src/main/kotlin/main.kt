import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun main() = Window {
    var text by remember { mutableStateOf("") }

    MaterialTheme {
        Column(Modifier.padding(16.dp)) {
            TextField(
                value = text,
                modifier = Modifier.padding(vertical = 8.dp),
                onValueChange = {
                    text = it
                })

            Text("You entered: $text", modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}