package com.whroid.ee.whros.base.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseEntity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4581983788942660021L;
	
	@Id
    @Column(name ="ID", nullable = false, unique = true)
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
	private String id;
    
    public BaseEntity(){
    }
    
    public BaseEntity(String id){
    	this.id = id;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

