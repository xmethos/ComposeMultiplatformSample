package net.ecorp.samples.multimodule

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import multimodulecmpapp.composeapp.generated.resources.Res
import multimodulecmpapp.composeapp.generated.resources.compose_multiplatform
import net.ecorp.samples.apis.herenvolk.resources.ic_album
import net.ecorp.samples.apis.talithacumi.resources.ic_x_logo
import net.ecorp.samples.apis.talithacumi.resources.lbl_albums
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.stringResource
import net.ecorp.samples.apis.herenvolk.resources.Res as HerenvolkRes
import net.ecorp.samples.apis.talithacumi.resources.Res as TalithaCumiRes
@Composable
@Preview
fun App() {
    val album = HerenvolkRes.drawable.ic_album
    val x = TalithaCumiRes.drawable.ic_x_logo
    val str = TalithaCumiRes.string.lbl_albums

    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me! : ${stringResource(str)}")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}