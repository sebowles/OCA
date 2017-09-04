
public class Mutable {
	private StringBuilder builder;
	public Mutable(StringBuilder b){
		builder = new StringBuilder(b);
	}
	
	public StringBuilder getBuilder(){
		return new StringBuilder(builder);
	}

}
