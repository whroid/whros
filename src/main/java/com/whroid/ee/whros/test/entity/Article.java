package com.whroid.ee.whros.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.whroid.ee.whros.base.entity.BaseEntity;


@Entity
@Table(name="t_article")
public class Article extends BaseEntity{


	/**
	 * 
	 */
	private static final long serialVersionUID = 3146132248579029750L;
	@Column
	private String title;
	@Column
	private String content;
	@Column
	private long createTime;
	@Column
	private long updateTime;
	@Column
	private int readnums;
	
}
