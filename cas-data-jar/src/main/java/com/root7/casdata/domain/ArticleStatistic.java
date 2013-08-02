package com.root7.casdata.domain;

import java.io.Serializable;

public class ArticleStatistic implements Serializable
{

	private static final long serialVersionUID = -713675724951131123L;
	
	private Integer terms;
	private Integer uniqueTerms;
	private Integer sentences;
	public Integer getTerms() {
		return terms;
	}
	public void setTerms(Integer terms) {
		this.terms = terms;
	}
	public Integer getUniqueTerms() {
		return uniqueTerms;
	}
	public void setUniqueTerms(Integer uniqueTerms) {
		this.uniqueTerms = uniqueTerms;
	}
	public Integer getSentences() {
		return sentences;
	}
	public void setSentences(Integer sentences) {
		this.sentences = sentences;
	}

}
