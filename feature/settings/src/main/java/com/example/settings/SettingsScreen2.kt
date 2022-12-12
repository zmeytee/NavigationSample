package com.example.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.TestProfileNavArg
import com.example.core.ui.components.MyButton
import com.example.core.ui.components.MyTopAppBar
import kotlin.random.Random

@Composable
internal fun SettingsScreen2(
    navigateToSettings3: (id: Long, name: String, profile: TestProfileNavArg) -> Unit,
    navigateBack: () -> Unit,
) {
    val onNavigateToSettings3Callback = remember {
        {
            navigateToSettings3(
                Random.nextLong(),
                "From setting 2",
                TestProfileNavArg(email = "test2@mail.ru", phone = "222-22-22")
            )
        }
    }

    Column {
        MyTopAppBar(title = "Settings #2", onClickBack = navigateBack)

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            MyButton(
                text = "To Settings #3",
                onClick = onNavigateToSettings3Callback,
            )
        }
    }
}