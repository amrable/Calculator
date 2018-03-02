import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Desgin {
	

	 
			private static JLabel l1 = new JLabel("0");

			
			
			
			public static void main(String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
			{
			show();
				
			}
		public static void show() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JFrame frame=new JFrame("Amour");
			frame.setVisible(true);
			frame.setSize(500,600);
			frame.setResizable(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel p=new JPanel();
	        p.setLayout(null);
			frame.add(p);
			l1.setFont(new Font("0", 5, 40));
			l1.setBounds(5,0,300,100);
			l1.setHorizontalAlignment(SwingConstants.RIGHT);
			l1.setVisible(true);
				
			p.add(l1);
			
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
			
			
			
			
			
			
		

		


		}


}
