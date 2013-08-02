package com.root7.casdata.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

public class Article implements Serializable {
	private static final long serialVersionUID = 6857059349932850118L;
	
	@Id
	private String id;
	
	private String articleId;
	
	private String author;
	
	private Integer feedId;
	
	private String guid;
	
	private String link;
	
	private Date publishDate;
	
	private List<String> tags;
	
	private String title;
	
	private ArticleStatistic titleStatistics;
	
	private ArticleStatistic bodyStatistics;
	
	private ArticleStatistic titleBodyStatistics;
	
	private Set<Integer> titleFullStops;
	
	private Set<Integer> bodyFullStops;
	
	private Set<Integer> titleBodyFullStops;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getFeedId() {
		return feedId;
	}

	public void setFeedId(Integer feedId) {
		this.feedId = feedId;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArticleStatistic getTitleStatistics() {
		return titleStatistics;
	}

	public void setTitleStatistics(ArticleStatistic titleStatistics) {
		this.titleStatistics = titleStatistics;
	}

	public ArticleStatistic getBodyStatistics() {
		return bodyStatistics;
	}

	public void setBodyStatistics(ArticleStatistic bodyStatistics) {
		this.bodyStatistics = bodyStatistics;
	}

	public ArticleStatistic getTitleBodyStatistics() {
		return titleBodyStatistics;
	}

	public void setTitleBodyStatistics(ArticleStatistic titleBodyStatistics) {
		this.titleBodyStatistics = titleBodyStatistics;
	}

	public Set<Integer> getTitleFullStops() {
		return titleFullStops;
	}

	public void setTitleFullStops(Set<Integer> titleFullStops) {
		this.titleFullStops = titleFullStops;
	}

	public Set<Integer> getBodyFullStops() {
		return bodyFullStops;
	}

	public void setBodyFullStops(Set<Integer> bodyFullStops) {
		this.bodyFullStops = bodyFullStops;
	}

	public Set<Integer> getTitleBodyFullStops() {
		return titleBodyFullStops;
	}

	public void setTitleBodyFullStops(Set<Integer> titleBodyFullStops) {
		this.titleBodyFullStops = titleBodyFullStops;
	}

}
