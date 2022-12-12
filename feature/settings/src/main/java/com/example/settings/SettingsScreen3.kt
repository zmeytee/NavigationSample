package com.example.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.core.ui.TestProfileNavArg
import com.example.core.ui.components.MyTopAppBar

@Composable
internal fun SettingsScreen3(
    id: Long,
    name: String,
    profile: TestProfileNavArg?,
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Settings #3", onClickBack = navigateBack)
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            text = "id: $id"
        )
        Text(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            text = "name: $name"
        )
        Text(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            text = "email: ${profile?.email}"
        )
        Text(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            text = "phone: ${profile?.phone}"
        )
    }
}