package com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain

interface TodoRepository {
    suspend fun getTodos(): List<Todo>
    suspend fun addTodo(todo: Todo)
}