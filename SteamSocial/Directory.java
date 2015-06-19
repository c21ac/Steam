public class Directory{
	public static void main(String[]args){
		Data Alec2 = new Data("Alec", "Chen", 12);
		System.out.println(Alec2.getFirstName() + " " + Alec2.getLastName() + " " + Alec2.getage());
		Data Alec = new Data();
		Alec.setFirstName("Alec" + " ");
		Alec.setLastName("Chen" + " ");
		Data [] Alec_relations = new Data[2];
		Data Deen = new Data();
		Deen.setFirstName("Deen" + " ");
		Deen.setLastName("Smith" + " ");
		Data [] Deen_relations = new Data[2];
		Data Tex = new Data ();
		Tex.setFirstName("John" + " ");
		Tex.setLastName("Detroyer" + " ");
		Data [] Tex_relations = new Data[2];
		Tex_relations[0] = Deen;
		Tex_relations[1] = Alec;
		Deen_relations[0] = Tex;
		Deen_relations[1] = Alec;
		Alec_relations[0] = Deen;
		Alec_relations[1] = Tex;
		System.out.println(Alec.getFirstName() + Alec.getLastName()); 
		System.out.println(Deen.getFirstName() + Deen.getLastName());
		System.out.println(Tex.getFirstName() + Tex.getLastName());
	}
}