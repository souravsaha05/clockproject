package clock;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
public class mywindow extends JFrame
{
	private JLabel heading;
	private JLabel clockLabel;
	
	private Font ft=new Font("",Font.BOLD,35);
	
	mywindow()
	{
		super.setTitle("My clock");
		super.setSize(400, 400);
		super.setLocation(300,50);
		this.createGui();
		this.startclk();
		
		super.setVisible(true);
	}
	public void createGui()
	{
		heading=new JLabel("My clock");
		clockLabel=new JLabel("clock");
		
		heading.setFont(ft);
	   clockLabel.setFont(ft);
	   this.setLayout(new GridLayout(2,1));
	   this.add(heading);
	   this.add(clockLabel);
	   
		
	}
	public void startclk()
	{
		Timer ti=new Timer(1000,new ActionListener()
				{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dt=new Date().toString();
				clockLabel.setText(dt);
				
				
				
			}
			
				});
		ti.start();
}

}
