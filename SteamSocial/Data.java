public class data{
	String firstName;
	String lastName;
	String number;
	String address;
	int age;
	data [] relations;
	public data(){
		relations = new data[10];
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String first_name){
		firstName = first_name;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String last_name){
		lastName = last_name;
	}
	public String getNumber(){
		return number;
	}
	public void setNumber(String num_ber){
		number = num_ber;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String adrs){
		address = adrs;
	}
	public int getage(){
		return age;
	}
	public void setage(int a_ge){
		age = a_ge;
	}
	public data [] getRelations(){
		return relations;
	}
	public void setRelations(data interacting){
		relations = interacting;
	}
}