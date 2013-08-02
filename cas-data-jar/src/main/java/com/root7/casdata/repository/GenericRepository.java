package com.root7.casdata.repository;

import java.io.Serializable;
import java.util.List;

public interface GenericRepository <T, ID extends Serializable>
{
	T findById(ID id, boolean lock);
	
	List<T> findAll();
	
	T save(T entity);
	
	void delete (T entity);
	
	void flush();
	
	void clear();
	

}
