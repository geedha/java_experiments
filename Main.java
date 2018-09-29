
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	Panel p;
	Label l;
	Label output;
	TextField tf;
	TextField t2;



	Button b;
	Button b1;

	public MyFrame() {
		p = new Panel();
		l = new Label("Number 1");
		tf = new TextField(10);
		t2 = new TextField(10);


		b = new Button("+");
		b1 = new Button("-");

		output = new Label("out");
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String data = tf.getText();
				String data2 = t2.getText();

				int idata = Integer.parseInt(data);
				int idata2 = Integer.parseInt(data2);

				int outdata = idata + idata2;
				output.setText(String.valueOf(outdata));
			}
		});
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String data = tf.getText();
				String data2 = t2.getText();

				int idata = Integer.parseInt(data);
				int idata2 = Integer.parseInt(data2);

				int outdata = idata - idata2;
				output.setText(String.valueOf(outdata));
			}
		});
		p.add(l);
		p.add(tf);
		p.add(t2);

		p.add(b);
		p.add(b1);

		p.add(output);
		add(p);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		}
		);
		setSize(300, 300);
		setTitle("Hello AWT");
		setVisible(true);
	}	
}

public class Main {

	public static void main(String[] args) {
		new MyFrame();
	}

}