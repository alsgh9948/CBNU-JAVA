import java.awt.*;

class ModelessDialog extends Frame
{
	static final long seriaVersionUID = 1;
	public ModelessDialog()
	{
		super("���̾�α� �׽�Ʈ");
		Dialog d = new Dialog(this, "������� ���̾� �α�");
		setBounds(0,0,400,400);
		setVisible(true);
		d.setSize(200,200);
		d.setVisible(true);
	}
}
public class Main3 {

	public static void main(String[] args) {
		new ModelessDialog();
	}

}
