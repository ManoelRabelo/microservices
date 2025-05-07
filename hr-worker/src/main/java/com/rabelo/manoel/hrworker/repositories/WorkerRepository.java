package com.rabelo.manoel.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabelo.manoel.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
