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
	@Column(name="fld_email",length=50)
	private String email;
	@Column(name="fld_description",length=4096)
	private String description;
	@Column(name="fld_comment",length=2048)
	private String comment;
	@Column(name="fld_note",length=2048)
	private String note;
	
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
	 * @param author
	 * @param date
	 * @param title
	 * @param email
	 * @param description
	 * @param comment
	 * @param note
	 */
	public Rapport(String author, Date date, String title, String email, String description, String comment,
			String note) {
		super();
		this.author = author;
		this.date = date;
		this.title = title;
		this.email = email;
		this.description = description;
		this.comment = comment;
		this.note = note;
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
    
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
 
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rapport other = (Rapport) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
