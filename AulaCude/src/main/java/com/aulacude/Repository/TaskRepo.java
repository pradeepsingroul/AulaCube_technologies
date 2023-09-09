package com.aulacude.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aulacude.Entities.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer>{

	@Query(value = "SELECT * FROM task t WHERE t.status = 'Pending'",nativeQuery=true)
	List<Task> getActiveTask();
}
