package g.defaultmethod;

public class DefaultImplementedChild implements DefaultStaticInterface {
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public int getSince() {
		// TODO Auto-generated method stub
		return since;
	}

	public static void main(String[] args) {
		DefaultImplementedChild sample = new DefaultImplementedChild();
		System.out.println(sample.getEmail());
		System.out.println(sample.getName());
		System.out.println(sample.getSince());
	
	}
}
