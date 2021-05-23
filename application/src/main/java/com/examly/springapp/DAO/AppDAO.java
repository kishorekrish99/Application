package com.examly.springapp.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.LogModel;

@Repository
public interface AppDAO extends JpaRepository<LogModel, String> {
	@Query(value = "SELECT * FROM Log_Model u WHERE name = ?1 AND log_type='IN'", nativeQuery = true)
	public List<LogModel> findByName(String name);

	@Query(value = "SELECT * FROM Log_Model u WHERE name = ?1 AND log_type='OUT'", nativeQuery = true)
	public List<LogModel> findByNameOUT(String name);

	@Query(value = "SELECT * FROM Log_Model u WHERE date = ?1 ", nativeQuery = true)
	public List<LogModel> findByDate(String date);

}
