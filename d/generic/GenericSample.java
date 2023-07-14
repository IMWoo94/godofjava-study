package d.generic;


public class GenericSample{
	public static void main(String[] args){
		GenericSample n = new GenericSample();
		n.checkCastingDTO();
	}

	public void checkCastingDTO(){
		CastingDTO dto1 = new CastingDTO();
		dto1.setObject(new String());

		CastingDTO dto2 = new CastingDTO();
		dto2.setObject(new StringBuffer());

		CastingDTO dto3 = new CastingDTO();
		dto3.setObject(new StringBuilder());

		String str1 = (String)dto1.getObject();
		StringBuffer str2 = (StringBuffer)dto2.getObject();
		StringBuilder str3 = (StringBuilder)dto3.getObject();
	}

	public void checkGenericDTO(){
		CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
		dto1.setObject(new String());

		CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
		dto2.setObject(new StringBuffer());

		CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
		dto3.setObject(new StringBuilder());

		String str1 = dto1.getObject();
		StringBuffer str2 = dto2.getObject();
		StringBuilder str3 = dto3.getObject();
	}
}
