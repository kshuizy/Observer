import java.util.Observable;


	public class WeChatServer extends Observable {
		
		public void setInfomation(String s){
			System.out.println("���ںŷ������£�" + s);
			setChanged();
			notifyObservers(s); //֪ͨ���۲���
		}
	}
