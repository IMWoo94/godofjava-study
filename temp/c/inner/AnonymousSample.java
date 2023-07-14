package c.inner;

public class AnonymousSample{
	public static void main(String[] args){
		AnonymousSample as = new AnonymousSample();
		//as.setButtonListener();
		as.setButtonListenerAnonymousObject();
	}

	public void setButtonListener(){
		MagicButton mg = new MagicButton();

		mg.setListener(new EventListener(){ 
							public void onClick(){
								System.out.println("�͸�ü");	
							};
		
		});
		mg.onClickProcess();

		MagicButton mg2 = new MagicButton();
		MagicButtonListener mbl = new MagicButtonListener();
		mg2.setListener(mbl);
		mg2.onClickProcess();
	}

	public void setButtonListenerAnonymousObject(){
		MagicButton mg = new MagicButton();
		EventListener anonymousListener = new EventListener(){
			public void onClick(){
				System.out.println("�͸�ü�� �ν��Ͻ� ���� �����ϱ��������̤�");	
			}
		};

		mg.setListener(anonymousListener);
		mg.onClickProcess();
	}
}