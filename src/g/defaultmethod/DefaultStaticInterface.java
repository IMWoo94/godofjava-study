package g.defaultmethod;

public interface DefaultStaticInterface {

	static final String name ="godofjavabook";
	static final int since = 2013;
	String getName();
	int getSince();
	
	default String getEmail() {
		return name+"@godofjava.com";
	}
}
