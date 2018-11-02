package com.contacts;

public class contacts {

	   private int id;
	   private String firstName; 
	   private String lastName;   
	   private String email_id;  

	
	   public Contact(String fname, String lname, String email_id) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.email_id= email_id;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getFirstName() {
	      return firstName;
	   }
	   
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   
	   public String getEmail_id() {
	      return email_id;
	   }
	   
	   public void setSalary( String email_id ) {
	      this.email_id = email_id;
	   }
}
