package com.devlima.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlima.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
