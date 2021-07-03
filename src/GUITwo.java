import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class GUITwo {

	public static void main(String[] args) {
		//step-1	(create container)
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(500, 500);
	//step-2	(create components)
		Label l1=new Label("Name");
		Label l2=new Label("Age");
		TextField t1=new TextField(10);
		TextField t2=new TextField(10);
		Button b1=new Button("Save");
		Button b2=new Button("Exit");
	//step-3	(add the components on container)
		f.setLayout(null); 		//we are setting null layout (not using a layout manager)
		l1.setSize(60, 30);		//w,h
		l1.setLocation(50,100);	//x,y
		f.add(l1);
		t1.setSize(100,30);
		t1.setLocation(150,100);
		f.add(t1);
		l2.setSize(60,30);
		l2.setLocation(50,170);
		f.add(l2);
		t2.setSize(100,30);
		t2.setLocation(150,170);
		f.add(t2);
		b1.setBounds(50,230, 50, 30); //x,y,w,h
		f.add(b1);
		b2.setBounds(150,230,50,30);
		f.add(b2);
	}

}
