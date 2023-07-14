package c.inner.practice;

public class MyPage{
	InputBox input = null;

	public static void main(String[] args){
		MyPage mp = new MyPage();
		mp.setUI();
		mp.pressKey();

	}
	

	public void setUI(){
		input = new InputBox();
		KeyEventListener anonymousKey = new KeyEventListener() {
			public void onKeyDown(){
				System.out.println("onKeyDown");
			}

			public void onKeyUp(){
				System.out.println("onKeyUp");
			}
		};

		input.setKeyListener(anonymousKey);
		
	}

	public void pressKey(){
		input.listenerCalled(2);
		input.listenerCalled(4);
	}
}