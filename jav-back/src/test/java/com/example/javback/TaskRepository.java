package com.example.javback;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}