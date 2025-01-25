package com.example.nikhilbharatV3.model;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "typAnyThing")
public class TypAnyThing {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "name")
	private String name;
		
	@Lob
    @Column(name = "Image", length = Integer.MAX_VALUE)
//    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
    private byte[] image;
	@Column(name = "typ")
	private String typ;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private Date createDate;


	public TypAnyThing() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	public String getTyp() {
		return typ;
	}


	public void setTyp(String typ) {
		this.typ = typ;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return "TypAnyThing [id=" + id + ", name=" + name + ", image=" + Arrays.toString(image) + ", typ=" + typ
				+ ", createDate=" + createDate + "]";
	}

	





	
   
}


