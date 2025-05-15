public class Users {
	
	String nickname;
	boolean state;
	
	public Users(String nickname, ChatApplication app) {
		this.nickname = nickname;
		this.state = true;
		app.setUsersOnline(this);
		}
	
	public boolean getUserState() {
		return this.state;
		
	}
}
