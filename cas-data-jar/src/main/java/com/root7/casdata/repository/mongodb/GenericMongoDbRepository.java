package com.root7.casdata.repository.mongodb;

import java.io.Serializable;
import java.util.List;
import java.lang.reflect.ParameterizedType;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.root7.casdata.repository.GenericDocumentRepository;

public abstract class GenericMongoDbRepository <T, ID extends Serializable> implements
		GenericDocumentRepository<T, ID> {
	
	
	private MongoTemplate mongoTemplate;
	private String collectionName;
	private Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public GenericMongoDbRepository()
	{
		this.entityClass = 
				(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];

	}
	
	
	
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}



	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}



	public String getCollectionName() {
		return collectionName;
	}



	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}



	public Class<T> getEntityClass()
	{
		return this.entityClass;
	}
	
	public T findById(ID id)
	{
		return this.mongoTemplate.findById(id, getEntityClass() , this.collectionName);
	}
	

	public T findById(ID id, String collectionName)
	{	
	
		 return this.mongoTemplate.findById(id, getEntityClass() , collectionName);
	}
	
	
	public List<T> findAll()
	{
		return this.mongoTemplate.findAll(getEntityClass(), this.collectionName);
	}

	public List<T> findAll(String collectionName)
	{
		return this.mongoTemplate.findAll(getEntityClass(), collectionName);
	}
	

	public T save(T entity, String collectionName)
	{
		this.mongoTemplate.save(entity, collectionName);
		return entity;
	}
	

	public void delete (T entity, String collectionName)
	{
		this.mongoTemplate.remove(entity, collectionName);
	}

}
