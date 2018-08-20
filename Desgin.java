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

public class GUI extends JFrame {

	public JLabel l1 = new JLabel("0");
	public JLabel l2 = new JLabel("No History");
	public JLabel loperation = new JLabel("");
	public String x="",y="",temp="";
	public int flag=0,i=0,top=-1;
	public double answer=0 ;
	public String exp="z",operation="";
	public String[] history=new String[100];
	public static void main (String[]args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		

		new GUI().setVisible(true);
	}
	public GUI () throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{

		super("Amour");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			setSize(710,600);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			JPanel p=new JPanel();

			p.setLayout(null);
			add(p);
			l1.setFont(new Font("0", 5, 40));
			l1.setBounds(50,50,350,60);
			l1.setHorizontalAlignment(SwingConstants.RIGHT);
			l1.setVisible(true);
			p.add(l1);
			l2.setFont(new Font("Monospaced Plain", 5, 40));
			l2.setBounds(300,110,400,100);
			l2.setHorizontalAlignment(SwingConstants.RIGHT);
			l2.setVisible(true);
			p.add(l2);
			JLabel l3 = new JLabel("History");
			l3.setFont(new Font("0", 5, 20));
			l3.setBounds(300,0,400,100);
			l3.setHorizontalAlignment(SwingConstants.CENTER);
			l3.setVisible(true);
			p.add(l3);
			loperation.setFont(new Font("Monospaced" , 5, 20));
			loperation.setBounds(50,0,350,60);
			loperation.setHorizontalAlignment(SwingConstants.RIGHT);
			loperation.setVisible(true);
			p.add(loperation);
			JButton bnext=new JButton("next");
			bnext.setBounds(10, 0, 100, 50);
			p.add(bnext);
			JButton bprev=new JButton("prev");
			bprev.setBounds(10, 50, 100, 50);
			p.add(bprev);
			JButton b1=new JButton("1");
			b1.setBounds(10, 180, 100, 75);
			p.add(b1);


			JButton b2=new JButton("2");
			b2.setBounds(110, 180, 100, 75);
			p.add(b2);

			JButton b3=new JButton("3");
			b3.setBounds(210, 180, 100, 75);
			p.add(b3);

			JButton b4=new JButton("4");
			b4.setBounds(10, 255, 100, 75);
			p.add(b4);

			JButton b5=new JButton("5");
			b5.setBounds(110, 255, 100, 75);
			p.add(b5);

			JButton b6=new JButton("6");		
			b6.setBounds(210, 255, 100, 75);
			p.add(b6);

			JButton b7=new JButton("7");
			b7.setBounds(10, 330, 100, 75);
			p.add(b7);

			JButton b8=new JButton("8");
			b8.setBounds(110, 330, 100, 75);
			p.add(b8);

			JButton b9=new JButton("9");		
			b9.setBounds(210, 330, 100, 75);
			p.add(b9);


			JButton b0=new JButton("0");
			b0.setBounds(110, 405, 100, 75);
			p.add(b0);
			JButton bre=new JButton("ANS");
			bre.setBounds(10, 405, 100, 75);
			p.add(bre);

			JButton bplus=new JButton("+");
			bplus.setBounds(310, 180, 100, 75);
			p.add(bplus);
			JButton bminus=new JButton("-");
			bminus.setBounds(310, 255, 100, 75);
			p.add(bminus);
			JButton bmulti=new JButton("x");
			bmulti.setBounds(310, 330, 100, 75);
			p.add(bmulti);
			JButton bdiv=new JButton("÷");
			bdiv.setBounds(310, 105, 100, 75);
			p.add(bdiv);
			JButton bans=new JButton("=");
			bans.setBounds(310, 405, 100, 75);
			p.add(bans);
			JButton bdot=new JButton(".");
			bdot.setBounds(210, 405, 100, 75);			
			p.add(bdot);
			JButton bclear=new JButton("<-");
			bclear.setBounds(210, 105, 100, 75);
			p.add(bclear);
			JButton bclearAll=new JButton("C");
			bclearAll.setBounds(110, 105, 100, 75);
			p.add(bclearAll);
			JButton bce=new JButton("CE");
			bce.setBounds(10, 105, 100, 75);
			p.add(bce);
			

			b1.addActionListener(new ButtonListener());
			b2.addActionListener(new ButtonListener());
			b3.addActionListener(new ButtonListener());
			b4.addActionListener(new ButtonListener());
			b5.addActionListener(new ButtonListener());
			b6.addActionListener(new ButtonListener());
			b7.addActionListener(new ButtonListener());
			b8.addActionListener(new ButtonListener());
			b9.addActionListener(new ButtonListener());
			b0.addActionListener(new ButtonListener());
			bans.addActionListener(new ButtonListener());
			bplus.addActionListener(new ButtonListener());
			bminus.addActionListener(new ButtonListener());
			bmulti.addActionListener(new ButtonListener());
			bdiv.addActionListener(new ButtonListener());
			bclearAll.addActionListener(new ButtonListener());
			bnext.addActionListener(new ButtonListener());
			bprev.addActionListener(new ButtonListener());
			bclear.addActionListener(new ButtonListener());
			bdot.addActionListener(new ButtonListener());
			bre.addActionListener(new ButtonListener());
			bce.addActionListener(new ButtonListener());
		}
			


private class ButtonListener implements ActionListener

 {
	private Logic logic= new Logic();
	

	




	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		
		String test = arg0.getActionCommand();
		

		if(test=="0"||test=="1"||test=="2"||test=="3"||test=="4"||test=="5"||test=="6"||test=="7"||test=="8"||test=="9")
		{if(flag==4)
		{
			loperation.setText("");
			operation="";
			flag=0;
			x="";
			y="";
			exp="z";
			
		}
			answer=Double.parseDouble(getValue(test));
			
		}
		
		

		
		else if(test=="x"&&flag!=0)
		{
			if(flag==1) {operation=operation + x + " ";}
			else if (flag==3) { operation=operation + y + " ";} 
			exp="x";
			flag=2;
			loperation.setText(operation+exp);
			y="";


		}
		else if(test=="-"&&flag!=0)
		{
			if(flag==1) {operation=operation + x + " ";}
			else if (flag==3) { operation=operation + y + " ";} 
			exp="-";
			flag=2;
			loperation.setText(operation+exp);
			y="";


		}
		else if(test=="÷"&&flag!=0)
		{		
			if(flag==1) {operation=operation + x + " ";}
			else if (flag==3) { operation=operation + y + " ";} 
			exp="÷";
			flag=2;
			loperation.setText(operation+exp);
			y="";


		}
		

		else if(test=="+"&&flag!=0)
		{
			if(flag==1) {operation=operation + x + " ";}
			else if (flag==3) { operation=operation + y + " ";} 
			exp="+";
			flag=2;
			loperation.setText(operation+exp);

			y="";

		}
		
		if(test=="=") {
			System.out.println(operation);

			if(flag==1)l2.setText(x+"="+x);
		else if(flag==3) {
			temp=y;

				
			operation=operation+y+" ";
			operation=operation.replaceAll("  ", " ");
			System.out.println(operation);

		    String[] result = operation.split("\\s");

		    String post=Logic.toPostfix(result);
		    answer=Double.parseDouble(logic.evaluate(post));
		    history[++top]=operation+"="+logic.printAnswer(answer);

		    y="";
			
			l2.setText(history[top]);			
			flag=4;

		
			i=top;}
			else if (flag==2)
			{
				temp=l1.getText();

				
				operation=operation +exp+" "+l1.getText()+" ";
				loperation.setText(operation);
				 String[] result = operation.split("\\s");

				    String post=logic.toPostfix(result);
				    answer=Double.parseDouble(logic.evaluate(post));
				    history[++top]=operation+"="+logic.printAnswer(answer);
				    y="";
					l2.setText(history[top]);
				
					i=top;			
					flag=4;

			}
			else if (flag==4 )
			{
				operation=temp+" "+exp+" "+logic.printAnswer(answer);
				loperation.setText(operation);

				 String[] result = operation.split("\\s");

				    String post=logic.toPostfix(result);
				    answer=Double.parseDouble(logic.evaluate(post));
				    history[++top]=operation+"="+logic.printAnswer(answer);
					y="";
					l2.setText(history[top]);
				
					i=top;			
				
				
				
			}
			
			
		}
		if(test=="C")
		{
			x="";
			y="";
			flag=0;
			answer=0;
			exp="z";
			
		}
		
		if(test==".")
		{			

			if(exp=="z") {x=x+"."; 		
			loperation.setText(x);}

			else {y=y+"."; 		
			loperation.setText(operation + y);}

		}
		
		
		if(test=="next"&&i!=top+1) {
			if(i==-1)i=1;
			l2.setText(history[i++]);
		}
		
		if(test=="prev"&&i!=-1) {
			if(i==top+1)i=top-1;
			l2.setText(history[i--]);

		}
		if(test=="<-")backSpace();
		System.out.print(i+" ");
		
		if(test=="ANS")
		{
			loperation.setText("");
			
			
			x=logic.printAnswer((answer));
			operation=x+" ";
			flag=3;
			
		}

		if(test==("CE"))
		{
			y="";
			flag=2;
		}
		l1.setText(logic.printAnswer(answer));
	
}

	
		}


	private String getValue(String test)
	{
		if(exp=="z") {
			this.operation="";
			x=x+test;
			answer=Double.parseDouble(x);
			flag=1;
			loperation.setText(x);

		return x;
		}
			else if (exp!="z"){
				y=y+test;
				answer=Double.parseDouble(y);
				if (flag!=3)operation =operation + exp + " ";
				this.flag=3;
				
				loperation.setText(operation + y);

			return y;
			}
			
		
		
		return test;
		
	}
	
	private void backSpace ()
	{
		String hoba="";
		
		if(exp=="z")
		{
			
			for(int i=0;i<x.length()-1;i++)
			{
				hoba=hoba+x.charAt(i);
			}
				x=hoba;
				if(x.isEmpty())x="0";
				answer=Double.parseDouble(x);
				loperation.setText(x);

		}else 
		{
			for(int i=0;i<y.length()-1;i++)
			{
				hoba=hoba+y.charAt(i);
			}
			y=hoba;
			if(y.isEmpty())y="0";
			answer=Double.parseDouble(y);
			loperation.setText(operation +y);


		}
	
		
		
	}

	

}