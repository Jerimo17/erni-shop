package sk.erni.shop.antal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;

@Entity
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Generated ID - primary key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	/**
	 * Customer full name
	 */
	@Column
	@NotNull
	private String name;
	
	/**
	 * Customer email
	 */
	@Column
	@NotNull
	private String email;

	/**
	 * Customer phone number
	 */
	@Column
	private String phone;
	
	/**
	 * Customer full address
	 */
	@Column
	private String address;
	
	/**
	 * Customer date of creation
	 */
	@Column
	private Date createdAt;
	
	@PrePersist
	void createdAt() {
	   this.createdAt = new Date();
	}

	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phone;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phone = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
}
