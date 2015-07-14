/**
 * 
 */
package org.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author akouam
 *
 */
@Entity
@Table(name="tbl_rapport")
public class Rapport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer id ;
	
	@Column(name="fld_author",length=25)
	private String author;
	@Column(name="fld_date",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	@Column(name="fld_title",length=50)
	private String title;
	@Column(name="fld_description",length=4096)
	private String description;
	@Column(name="fld_comment",length=2048)
	private String comment;
	
	/**
	 * 
	 */
	public Rapport() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param author
	 * @param date
	 * @param title
	 * @param description
	 * @param comment
	 */
	public Rapport(String author, Date date, String title, String description, String comment) {
		super();
		this.author = author;
		this.date = date;
		this.title = title;
		this.description = description;
		this.comment = comment;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
