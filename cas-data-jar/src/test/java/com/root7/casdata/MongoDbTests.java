package com.root7.casdata;

import static org.junit.Assert.*;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;



import org.springframework.util.Assert;

import com.root7.casdata.repository.mongodb.ArticleRepositoryMongoDb;
import com.root7.casdata.domain.Article;


import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
public class MongoDbTests {
	
	@Autowired
	ArticleRepositoryMongoDb repo;

	@Test	
	public void InsertArticles() throws UnknownHostException 
	{		

		
		
		for(int i = 0; i < 1000; i++)
		{
			Article article = new Article();
			
			article.setAuthor("Grant Alexander");
			article.setArticleId("akjflksajfkajslfjasldfjsa;");
			article.setPublishDate(new Date());
			repo.save(article, "articles");
		}
		
		
		
		
	}
	
	@Test
	public void FindAllArticles()
	{
		List<Article> articles = repo.findAll();
		
 		Assert.isTrue(articles.size() > 0);
	}
	

}
