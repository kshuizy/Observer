import java.util.Observable;
import java.util.Observer;


public class User implements Observer {
	
	String name;
	public User(String s){
		this.name = s;
	}
	public void update(Observable o, Object arg) {
		
		System.out.println(name + "获取信息："+arg);
	}

}
