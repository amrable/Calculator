import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Desgin extends JFrame implements ActionListener {

	private JLabel l1 = new JLabel("0");
	private JLabel l2 = new JLabel("No History");
	private String x="",y="";
	private int flag=0,i=0,top=-1;
	private double answer=0 ;
	private String exp="z",operation="";
	private String[] history=new String[100];
	public static void main (String[]args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		

		new Desgin().setVisible(true);
	}
	private Desgin () throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{

		super("Amour");
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		setSize(700,600);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p=new JPanel();

        p.setLayout(null);
		add(p);
		l1.setFont(new Font("0", 5, 40));
		l1.setBounds(50,0,250,100);
		l1.setHorizontalAlignment(SwingConstants.RIGHT);
		l1.setVisible(true);
		p.add(l1);
		l2.setFont(new Font("0", 5, 40));
		l2.setBounds(300,110,250,100);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setVisible(true);
		p.add(l2);
		JLabel l3 = new JLabel("History");
		l3.setFont(new Font("0", 5, 20));
		l3.setBounds(300,0,250,100);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setVisible(true);
		p.add(l3);
		JButton bnext=new JButton("next");
		bnext.setBounds(10, 0, 100, 50);
		p.add(bnext);
		JButton bprev=new JButton("prev");
		bprev.setBounds(10, 50, 100, 50);
		p.add(bprev);
		JButton b1=new JButton("1");
		b1.setBackground(Color.BLACK);
		b1.setBounds(10, 180, 75, 75);
		p.add(b1);


		JButton b2=new JButton("2");
		b2.setBackground(Color.BLACK);
		b2.setBounds(90, 180, 75, 75);
		p.add(b2);

		JButton b3=new JButton("3");
		b3.setBackground(Color.BLACK);
		b3.setBounds(170, 180, 75, 75);
		p.add(b3);

		JButton b4=new JButton("4");
		b4.setBackground(Color.BLACK);
		b4.setBounds(10, 260, 75, 75);
		p.add(b4);

		JButton b5=new JButton("5");
		b5.setBackground(Color.BLACK);
		b5.setBounds(90, 260, 75, 75);
		p.add(b5);

		JButton b6=new JButton("6");		
		b6.setBackground(Color.BLACK);
		b6.setBounds(170, 260, 75, 75);
		p.add(b6);

		JButton b7=new JButton("7");
		b7.setBackground(Color.BLACK);
		b7.setBounds(10, 340, 75, 75);
		p.add(b7);

		JButton b8=new JButton("8");
		b8.setBackground(Color.BLACK);
		b8.setBounds(90, 340, 75, 75);
		p.add(b8);

		JButton b9=new JButton("9");		
		b9.setBackground(Color.BLACK);
		b9.setBounds(170, 340, 75, 75);
		p.add(b9);


		JButton b0=new JButton("0");
		b0.setBackground(Color.BLACK);
		b0.setBounds(90, 420, 75, 75);
		p.add(b0);

		JButton bplus=new JButton("+");
		bplus.setBounds(250, 180, 75, 75);
		p.add(bplus);
		JButton bminus=new JButton("-");
		bminus.setBounds(250, 260, 75, 75);
		p.add(bminus);
		JButton bmulti=new JButton("x");
		bmulti.setBounds(250, 340, 75, 75);
		p.add(bmulti);
		JButton bdiv=new JButton("÷");
		bdiv.setBounds(250, 100, 75, 75);
		p.add(bdiv);
		JButton bans=new JButton("=");
		bans.setBounds(250, 420, 75, 75);
		p.add(bans);
		JButton bdot=new JButton(".");
		bdot.setBounds(170, 420, 75, 75);
		p.add(bdot);
		JButton bclear=new JButton("<-");
		bclear.setBounds(170, 100, 75, 75);
		p.add(bclear);
		JButton bclearAll=new JButton("C");
		bclearAll.setBounds(90, 100, 75, 75);
		p.add(bclearAll);
		JButton bsign=new JButton("+/-");
		bsign.setBounds(10, 100, 75, 75);
		p.add(bsign);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bans.addActionListener(this);
		bplus.addActionListener(this);
		bminus.addActionListener(this);
		bmulti.addActionListener(this);
		bdiv.addActionListener(this);
		bclearAll.addActionListener(this);
		bnext.addActionListener(this);
		bprev.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {

		
		String test = arg0.getActionCommand();

		if(test=="0"||test=="1"||test=="2"||test=="3"||test=="4"||test=="5"||test=="6"||test=="7"||test=="8"||test=="9")
		{
			answer=Double.parseDouble(getValue(test));
			if(flag!=3)this.flag=1;
		}
		
		

		
		if(test=="x"&&flag!=0)
		{
			this.exp="x";
			this.flag=2;
		}
		if(test=="-"&&flag!=0)
		{
			this.exp="-";
			this.flag=2;
			
		}
		if(test=="÷"&&flag!=0)
		{		
			this.exp="÷";
			this.flag=2;
			
		}
		

		if(test=="+"&&flag!=0)
		{
			this.exp="+";
			this.flag=2;
		}
		
		if(test=="="&&flag==3) {
			
			
		
			
			if(exp=="+") {answer=Double.parseDouble(x)+Double.parseDouble(y); }
			else if(exp=="-") {answer=Double.parseDouble(x)-Double.parseDouble(y);}
			else if(exp=="x") {answer=Double.parseDouble(x)*Double.parseDouble(y);}
			else if(exp=="÷") {answer=Double.parseDouble(x)/Double.parseDouble(y);}
			
			this.operation=x+exp+y+"="+Double.toString(answer);
			history[++top]=operation;
			this.x="";
			this.y="";
			this.flag=0;
			this.exp="z";
			l2.setText(operation);
		
			this.i=top;
		}
		if(test=="C")
		{
			this.x="";
			this.y="";
			this.flag=0;
			answer=0;
			this.exp="z";
			
		}
		
		if(test==".")
		{			

			if(exp=="z")x=x+".";
			else y=y+".";
		}
		
		
		if(test=="next"&&i!=top+1) {
			if(i==-1)i=top;
			l2.setText(history[i++]);
		}
		
		if(test=="prev"&&i!=-1) {
			if(i==top+1)i=0;
			l2.setText(history[i--]);

		}
		System.out.print(flag+" ");


		l1.setText(Double.toString(answer));
		
}

		


	private String getValue(String test)
	{
		if(exp=="z") {
			this.operation="";
			x=x+test;
			answer=Double.parseDouble(x);
			
		return x;
		}
			else if (exp!="z"){
				y=y+test;
				answer=Double.parseDouble(y);
				this.flag=3;
			return y;
			}
			
		
		
		return test;
		
	}

}