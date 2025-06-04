package com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain

class AddTodoUseCase(private val todoRepository: TodoRepository) {
    suspend operator fun invoke(todo:Todo) = todoRepository.addTodo(todo)
}