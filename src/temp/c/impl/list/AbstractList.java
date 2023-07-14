package c.impl.list;

public abstract class AbstractList implements List{

	public void add(){
		System.out.println("add");
	}

	public void update(int index, Object value){
		System.out.println("update");
	}

	public void remove(int index){
		System.out.println("remove");
	}

	public void toString(Object value){
		System.out.println("toString");
	}

	public void indexOf(Object value, String str){
		System.out.println("indexOf");
	}

	public abstract void clear();
}