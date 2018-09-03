
public class MainClass {

	public static void main(String[] args) {
		
		WeChatServer server = new WeChatServer();
		User liming = new User("liming");
		User xiaohuang = new User("xiaohuang");
		User lucy = new User("lucy");
		server.addObserver(liming);
		server.addObserver(xiaohuang);
		server.addObserver(lucy);
		server.setInfomation("∆Ô ø∂·π⁄¡À");
		
	}

}
