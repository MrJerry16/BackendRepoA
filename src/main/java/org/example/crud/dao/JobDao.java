package org.example.crud.dao;

import org.example.crud.entity.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDao extends CrudRepository<Job, Long> {
}
