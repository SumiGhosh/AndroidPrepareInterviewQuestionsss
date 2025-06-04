package com.sumi.androidprepareinterviewquestions.general.architectures.clean.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.sumi.androidprepareinterviewquestions.general.architectures.clean.presentation.TodoViewModel

@Composable
fun TodoScreen(viewModel: TodoViewModel) {
    val todoData = viewModel.todo.collectAsState()
}