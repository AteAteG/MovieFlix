package model;

import java.util.Date;
import model.Genre;

public class Customer {
	
	private String customerName;
	private int  idCustomer;
	private Date birthDate;
	private String customerCity;
	private Genre subscriptionPackage;
	
	
	
	
	public Customer()
	{
		
	}
	
	public Customer(String customerName, int idCustomer, Date birthDate, String customerCity, Genre subscriptionPackage) {
		
		this.customerName = customerName;
		this.idCustomer = idCustomer;
		this.birthDate = birthDate;
		this.customerCity = customerCity;
		this.subscriptionPackage = subscriptionPackage;
	}
	
	
	
	//getters and setters
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}	



	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", idCustomer=" + idCustomer + ", birthDate=" + birthDate
				+ ", customerCity=" + customerCity + ", genre=" + subscriptionPackage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((customerCity == null) ? 0 : customerCity.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((subscriptionPackage == null) ? 0 : subscriptionPackage.hashCode());
		result = prime * result + idCustomer;
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
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (customerCity == null) {
			if (other.customerCity != null)
				return false;
		} else if (!customerCity.equals(other.customerCity))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (subscriptionPackage != other.subscriptionPackage)
			return false;
		if (idCustomer != other.idCustomer)
			return false;
		return true;
	}
	
	
	
	
			
	
	
}