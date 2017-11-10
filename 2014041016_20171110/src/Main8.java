import java.awt.*;

class FlickeringLabel extends Label implements Runnable{
	public FlickeringLabel(String text)
	{
		super(text);
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n = 0;
		while(true) {
			if(n==0)
			{
				setBackground(Color.YELLOW);
				n=1;
			}
			else
			{	
				setBackground(Color.green);
				n=0;
			}
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
class FlickeringLabelEx extends Frame{
	
	public FlickeringLabelEx() {
		
		setTitle("FlickeringLabelEx ¿¹Á¦");
		
		FlickeringLabel fLabel = new FlickeringLabel("±ô¹Ú");
		
		Label label = new Label("¾È±ô¹Ú");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("¿©±âµµ ±ô¹Ú");
		
		Panel p = new Panel();
		p.add(fLabel);
		p.add(label);
		p.add(fLabel2);
		add(p);
		
		setSize(300,150);
		setVisible(true);
	}
}
public class Main8 {

	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
