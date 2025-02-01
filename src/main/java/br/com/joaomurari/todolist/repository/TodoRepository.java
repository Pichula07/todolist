package br.com.joaomurari.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaomurari.todolist.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
