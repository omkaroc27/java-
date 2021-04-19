
package com.beans;

public class person  implements Comparable<person>  {
	
	int  id;
	String  name;
	String  email;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public int compareTo(person o) {
		if(this.id>o.id) {
			return +1;
		}
		else{if
			
		(this.id<o.id){
			return -1;
		}
		
		else  {
		return 0;
			   }//here is the compare to -,+ positive negative value 
	}
		
}
}	
	


