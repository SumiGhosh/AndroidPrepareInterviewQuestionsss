package com.sumi.androidprepareinterviewquestions.general.architectures.clean.data

import com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain.Todo
import com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain.TodoRepository

class TodoRepositoryImpl(private val localDataSource: LocalDataSource): TodoRepository {

    override suspend fun getTodos(): List<Todo> {
        return localDataSource.getAll()
    }

    override suspend fun addTodo(todo: Todo) {
        localDataSource.addTodo(todo)
    }
}