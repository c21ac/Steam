public class Data{
	String firstName;
	String lastName;
	String number;
	String address;
	int age;
	Data [] relations;
	public Data(String first_name, String last_name, int a_ge){
		firstName = first_name;
		lastName = last_name;
		age = a_ge;
	}
	public Data(){
		relations = new Data[10];
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
	public Data [] getRelations(){
		return relations;
	}
	public void setRelations(Data[] interacting){
		relations = interacting;
	}
}