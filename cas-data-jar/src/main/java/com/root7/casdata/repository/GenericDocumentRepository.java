package com.root7.casdata.repository;

import java.io.Serializable;
import java.util.List;

public interface GenericDocumentRepository <T, ID extends Serializable>
{
	
	T findById(ID id);
	
	T findById(ID id, String collectionName);
	
	List<T> findAll();
	
	List<T> findAll(String collectionName);
	
	T save(T entity, String collectionName);
	
	void delete (T entity, String collectionName);
	
	
}
