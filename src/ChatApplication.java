import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class ChatApplication extends JFrame {
	
	private List<Users> usersOnline;
	
	public ChatApplication() {
		super("Chat Application");
		usersOnline = new ArrayList();
		ImageIcon img = new ImageIcon("img\\download.jpg");
		setIconImage(img.getImage());
		setSize(1200, 900);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(3, 30, 41));
		setVisible(true);
		
	}
	
	// 	SETTAGGIO DEGLI USER NELLA ARREYLIST
	public void setUsersOnline(Users user) {
		this.usersOnline.add(user);
	}
}
