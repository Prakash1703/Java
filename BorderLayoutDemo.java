import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout.*;
import java.awt.event.*;
import java.awt.Color.*;
import java.lang.Object.*;
import javax.swing.border.*;
public class BorderLayoutDemo implements ActionListener
{
		  JButton b1=new JButton("RED");
		  JButton b2=new JButton("GREEN");
		  JButton b3=new JButton("YELLOW");
		  JButton b4=new JButton("BLUE");
		  JButton b5=new JButton("BLACK");
		  JFrame jfLeft=new JFrame();
		  JFrame jfRight=new JFrame();
		  JFrame jfTop=new JFrame();
		  JFrame jfBottom=new JFrame();
		  JFrame jfCenter=new JFrame();
		
		  JPanel cnLeft=new JPanel();
		  JPanel cnRight=new JPanel();
		  JPanel cnCenter=new JPanel();
		  JPanel cnTop=new JPanel();
		  JPanel cnBottom=new JPanel();
			
			
		  Checkbox chbxright=new Checkbox("Right");
		  Checkbox chbxtop=new Checkbox("Top");
		  Checkbox chbxbottom=new Checkbox("Bottom");
		  Checkbox chbxCenter=new Checkbox("Center");
		  Checkbox chbxLeft=new Checkbox("Left");
	
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if(source == b1)
		{
			if(chbxCenter.getState())
			{
			cnCenter.setBackground(Color.RED);
			chbxCenter.setState(false);
			}
			if(chbxtop.getState())
			{
			cnTop.setBackground(Color.RED);
			chbxtop.setState(false);
			}
			if(chbxbottom.getState())
			{
			cnBottom.setBackground(Color.RED);
			chbxbottom.setState(false);
			}
			if(chbxright.getState())
			{
			cnRight.setBackground(Color.RED);
			chbxright.setState(false);
			}
			if(chbxLeft.getState())
			{
			cnLeft.setBackground(Color.RED);
			chbxLeft.setState(false);
			}
			
		}
		else if(source == b2)
		{
			if(chbxCenter.getState())
			{
			cnCenter.setBackground(Color.GREEN);
				chbxCenter.setState(false);
			}
			if(chbxtop.getState())
			{
			cnTop.setBackground(Color.GREEN);
				chbxtop.setState(false);
			}
			if(chbxbottom.getState())
			{
			cnBottom.setBackground(Color.GREEN);
				chbxbottom.setState(false);
			}
			if(chbxright.getState())
			{
			cnRight.setBackground(Color.GREEN);
			chbxright.setState(false);
			}
			if(chbxLeft.getState())
			{
			cnLeft.setBackground(Color.GREEN);
			chbxLeft.setState(false);
			}
		}
		else if(source == b3)
		{
			if(chbxCenter.getState())
			{
			cnCenter.setBackground(Color.YELLOW);
			chbxCenter.setState(false);
			}
			if(chbxtop.getState())
			{
			cnTop.setBackground(Color.YELLOW);
			chbxtop.setState(false);
			}
			if(chbxbottom.getState())
			{
			cnBottom.setBackground(Color.YELLOW);
			chbxbottom.setState(false);
			}
			if(chbxright.getState())
			{
			cnRight.setBackground(Color.YELLOW);
			chbxright.setState(false);
			}
			if(chbxLeft.getState())
			{
			cnLeft.setBackground(Color.YELLOW);
			chbxLeft.setState(false);
			}
		}
		else if(source == b4)
		{
			if(chbxCenter.getState())
			{
			cnCenter.setBackground(Color.BLUE);
			chbxCenter.setState(false);
			}
			if(chbxtop.getState())
			{
			cnTop.setBackground(Color.BLUE);
			chbxtop.setState(false);
			}
			if(chbxbottom.getState())
			{
			cnBottom.setBackground(Color.BLUE);
			chbxbottom.setState(false);
			}
			if(chbxright.getState())
			{
			cnRight.setBackground(Color.BLUE);
			chbxright.setState(false);
			}
			if(chbxLeft.getState())
			{
			cnLeft.setBackground(Color.BLUE);
			chbxLeft.setState(false);
			}
		}
		else if(source == b5)
		{
		if(chbxCenter.getState())
			{
			cnCenter.setBackground(Color.BLACK);
			chbxCenter.setState(false);
			}
			if(chbxtop.getState())
			{
			cnTop.setBackground(Color.BLACK);
			chbxtop.setState(false);
			}
			if(chbxbottom.getState())
			{
			cnBottom.setBackground(Color.BLACK);
			chbxbottom.setState(false);
			}
			if(chbxright.getState())
			{
			cnRight.setBackground(Color.BLACK);
			chbxright.setState(false);
			}
			if(chbxLeft.getState())
			{
			cnLeft.setBackground(Color.BLACK);
			chbxLeft.setState(false);
			}
		}
		
	}
	public void makeFrame()
	{
		 b1.setPreferredSize(new Dimension(10, 10));
		
	
		
		JFrame jf=new JFrame();
		int height=700,width=600;
		jf.setBounds(0,0,height,width);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setName("BorderLayout");
		jf.setTitle("BorderLayout");
		
		Container con=jf.getContentPane();
		BorderLayout bl=new BorderLayout();
		con.setLayout(bl);
		Dimension d=new Dimension(100,100);
		jf.setMinimumSize(d);
		BorderLayoutDemo obj=new BorderLayoutDemo();
		
		obj.addComponentLeft(con,jf);
		obj.addComponentRight(con,jf);
		obj.addComponentTop(con,jf);
		obj.addComponentBottom(con,jf);
		obj.addComponentCenter(con,jf);
		jf.setVisible(true);
	}
	
	public void addComponentLeft(Container con,JFrame jf)
	{
		//	Border blackline;
		//blackline = BorderFactory.createLineBorder(Color.black);
	/*cnLeft.setBorder(blackline);
	cnRight.setBorder(blackline);
	cnTop.setBorder(blackline);
	cnBottom.setBorder(blackline);*/
			b1.setName("YELLOW");
				b2.setName("YELLOW");
				b3.setName("YELLOW");
				b4.setName("BLUE");
				b5.setName("BLACK");
				b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
				b5.addActionListener(this);
				
		GridLayout gl=new GridLayout(6,2);
		cnLeft.setLayout(gl);
		cnLeft.add(b1);
		cnLeft.add(b2);
		cnLeft.add(b3);
		cnLeft.add(b4);
		cnLeft.add(b5);
		cnLeft.add(chbxLeft);
		 
		jfLeft.setBackground(Color.YELLOW);
		con.add(cnLeft,BorderLayout.LINE_START);
		b1.addActionListener(this);
		
	}
	public  void addComponentRight(Container con,JFrame jf)
	{
		cnRight.add(chbxright);
		con.add(cnRight,BorderLayout.LINE_END);
	}
	public void addComponentTop(Container con,JFrame jf)
	{
		cnTop.add(chbxtop);
		con.add(cnTop,BorderLayout.PAGE_START);
		
	}
	public void addComponentBottom(Container con,JFrame jf)
	{
		cnBottom.add(chbxbottom);
		con.add(cnBottom,BorderLayout.PAGE_END);
		
	}
	public void addComponentCenter(Container con,JFrame jf)
	{
		cnCenter.add(chbxCenter);
		con.add(cnCenter,BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
	BorderLayoutDemo obj=new BorderLayoutDemo();
		
		obj.makeFrame();
	}
}