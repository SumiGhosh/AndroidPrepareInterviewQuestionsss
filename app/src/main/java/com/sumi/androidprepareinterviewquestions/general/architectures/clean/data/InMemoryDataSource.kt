package com.sumi.androidprepareinterviewquestions.general.architectures.clean.data

import com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain.Todo

class InMemoryDataSource: LocalDataSource {
    private val todos = mutableListOf<Todo>()
    override suspend fun getAll(): List<Todo> {
        return todos
    }

    override suspend fun addTodo(todo: Todo) {
        todos.add(todo)
    }
}