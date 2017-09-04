import casting.objects.Rodent;

public class Mouse extends Rodent {
	protected int tailLength = 8;
	
	public void getMouseDetails(){
		System.out.println("[tail=" + tailLength + ", parenttail=" + super.tailLength + "]");
	}
	
	public static void main(String[] args){
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
	}

}
