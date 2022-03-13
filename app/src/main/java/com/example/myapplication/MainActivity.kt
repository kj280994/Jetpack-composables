package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myapplication.data.MockData
import com.example.myapplication.ui.composables.Conversation
import com.example.myapplication.ui.composables.MessageCard
import com.example.myapplication.ui.model.Message
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Conversation(messages = MockData.conversationSample)
            }
        }
    }
}
