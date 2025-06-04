package com.sumi.androidprepareinterviewquestions.general.architectures.clean.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain.AddTodoUseCase
import com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain.GetTodoUseCase
import com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain.Todo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TodoViewModel(
    private val getTodoUseCase: GetTodoUseCase,
    private val addTodoUseCase: AddTodoUseCase
): ViewModel() {
    private val _todo = MutableStateFlow<List<Todo>>(emptyList())
    val todo: StateFlow<List<Todo>> = _todo

    fun loadTodos() {
        viewModelScope.launch {
            _todo.value = getTodoUseCase()
        }
    }

    fun addTodos(todo: Todo) {
        viewModelScope.launch {
            addTodoUseCase(todo)
            loadTodos()
        }
    }
}