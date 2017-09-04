
public class KoalaTester {
	
	public static void main(String[] args){
		Koala.main(new String[0]);
		
		Koala k = new Koala();
		System.out.println(k.count);
		k = null;
		System.out.println(k.count);
		
		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;
		System.out.println(Koala.count);
		
	}

}
