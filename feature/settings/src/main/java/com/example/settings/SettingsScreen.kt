package com.example.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.TestProfileNavArg
import com.example.core.ui.components.MyButton
import com.example.core.ui.components.MyTopAppBar
import kotlin.random.Random

@Composable
internal fun SettingsScreen(
    navigateToSettings2: () -> Unit,
    navigateToSettings3: (id: Long, name: String, profile: TestProfileNavArg) -> Unit,
) {
    val onNavigateToSettings3Callback = remember {
        {
            navigateToSettings3(
                Random.nextLong(),
                "From setting",
                TestProfileNavArg(email = "test@mail.ru", phone = "111-11-11")
            )
        }
    }

    Column {
        MyTopAppBar(title = "Settings")

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(modifier = Modifier.verticalScroll(state = rememberScrollState())) {
                MyButton(
                    text = "To Settings #2",
                    onClick = navigateToSettings2,
                )

                MyButton(
                    text = "To Settings #3",
                    onClick = onNavigateToSettings3Callback,
                )
            }
        }
    }
}