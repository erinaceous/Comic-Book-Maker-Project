import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ActionPerformed: "+e.getActionCommand());
	}

}
