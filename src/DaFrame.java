/**
 * 
 * @author Daniel Han
 *
 */
import java.awt.CardLayout;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
public class DaFrame extends JFrame
{
	public DaFrame()
	{
		JPanel overall = new JPanel();
		CardLayout cl = new CardLayout();
		overall.setLayout(cl);
		
		
		JPanel ellis = new JPanel();
		ellis.add(new JLabel("This is Jawn One"));
		JButton button1 =  new JButton("Button1");
		ellis.add(button1);
		
		JPanel card2 = new JPanel();
		card2.add(new JLabel("Card Two"));
		JButton button2 = new JButton("Button2");
		card2.add(button2);
		
		
		JPanel cardiBSucks = new JPanel();
		card2.add(new JLabel("Panel 3"));
		JButton button3 = new JButton("Button3");
		cardiBSucks.add(button3);
		
		overall.add(ellis, "panel1");
		overall.add(card2, "panel2");
		overall.add(cardiBSucks, "panel3");
		
		//next: say which panel you want to be showing up in the beginning
		
		cl.show(overall, "panel1");
		
		add(overall);
		setBounds(100,100,600,500);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		button1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				cl.show(overall, "panel2");
			}
			
		});
		
		button2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				cl.show(overall, "panel3");
			}
			
		});
		
		}
		public static void main(String[] args)
		{
			new DaFrame();
		}
}