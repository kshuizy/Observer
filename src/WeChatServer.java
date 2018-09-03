import java.util.Observable;


	public class WeChatServer extends Observable {
		
		public void setInfomation(String s){
			System.out.println("公众号发表文章：" + s);
			setChanged();
			notifyObservers(s); //通知被观察者
		}
	}
