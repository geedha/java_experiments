
public class Main {


	public static void main(String[] args) {
		Stringlist s = new Stringlist();
		s.append("India");
		s.append("Tamilnadu");
		s.append("Delhi");
		s.append("Punjab");
		s.display();
		s.Insertatpos(3,"Assam");
		s.display();
		s.Searchstring("Assam");
		s.Searchstring("Geedha");
		s.Findele('A');

		

	}

}
