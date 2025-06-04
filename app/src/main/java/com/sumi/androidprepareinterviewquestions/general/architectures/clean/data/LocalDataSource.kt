package com.sumi.androidprepareinterviewquestions.general.architectures.clean.data

import com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain.Todo

interface LocalDataSource {
    suspend fun getAll(): List<Todo>
    suspend fun addTodo(todo: Todo)
}