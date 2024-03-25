package com.nit.datajapa.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.datajapa.entity.Task;

public interface TaskRepositary extends JpaRepository<Task, Integer> {

	List<Task> findAllByUserId(int userid);

	
}
