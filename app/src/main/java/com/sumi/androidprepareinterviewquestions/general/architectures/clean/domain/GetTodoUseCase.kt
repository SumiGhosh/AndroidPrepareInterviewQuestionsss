package com.sumi.androidprepareinterviewquestions.general.architectures.clean.domain

class GetTodoUseCase(private val todoRepository: TodoRepository) {
    suspend operator fun invoke():List<Todo> = todoRepository.getTodos()
}