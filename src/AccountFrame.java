import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AccountFrame extends JFrame
{
	public AccountFrame()
	{
		setTitle("Bank Account");
		setBounds(100, 100, 400, 400);
		setLayout(null);
		
		JLabel nameLbl = new JLabel("Name: ");
		nameLbl.setBounds(20, 20, 100, 30);
		add(nameLbl);
		JTextField nameTF = new JTextField();
		nameTF.setBounds(120, 20, 100, 30);
		add(nameTF);
		
		JLabel accTypeLbl = new JLabel("Account Type: ");
		accTypeLbl.setBounds(20, 50, 100, 30);
		add(accTypeLbl);
		JComboBox accType = new JComboBox();
		accType.setBounds(120, 50, 100, 30);
		accType.addItem("");
		accType.addItem("Checking");
		accType.addItem("Savings");
		add(accType);
		
		JLabel iniBalLbl = new JLabel("Initial Balance: ");
		iniBalLbl.setBounds(20, 200, 100, 30);
		add(iniBalLbl);
		JTextField iniBalTF = new JTextField();
		iniBalTF.setBounds(120, 200, 100, 30);
		add(iniBalTF);
		
		JButton createAccount = new JButton("Create Account");
		createAccount.setBounds(20, 300, 150, 30);
		add(createAccount);
		createAccount.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					BankAccount.add(nameTF, iniBalTF);
				}
			});
		JButton displayAllAccounts = new JButton("Display All Accounts");
		displayAllAccounts.setBounds(200, 300, 150, 30);
		add(displayAllAccounts);
		displayAllAccounts.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.out.println();
				}
			});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new AccountFrame();
	}
}
