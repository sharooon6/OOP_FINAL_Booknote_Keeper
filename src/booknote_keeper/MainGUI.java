package booknote_keeper;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btn_Browse;
	private JButton btn_Add;
	private JButton btn_AllNotes;
	
	private CardLayout cardLayout;
	private JPanel card_panel;
	private JPanel add_panel;
	private JPanel browse_panel;
	private JPanel notes_panel;
	

	public MainGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainGUI.class.getResource("/icons/open-book.png")));
		setBackground(new Color(255, 255, 255));
		setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		setTitle("Booknote Keeper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 167, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btn_Browse = new JButton("All Books");
		btn_Browse.setForeground(Color.WHITE);
		btn_Browse.setBackground(Color.BLACK);
		btn_Browse.setFont(new Font("Cascadia Code", Font.PLAIN, 14));
		btn_Browse.setBounds(0, 0, 167, 62);
		btn_Browse.setBorderPainted(false);		
		btn_Browse.addActionListener(e ->{
			open_browse_gui();
		});
		panel.add(btn_Browse);
		
		btn_Add = new JButton("Add a Book");
		btn_Add.setForeground(Color.WHITE);
		btn_Add.setBackground(Color.BLACK);
		btn_Add.setFont(new Font("Cascadia Code", Font.PLAIN, 14));
		btn_Add.setBounds(0, 68, 167, 62);
		btn_Add.setBorderPainted(false);
		btn_Add.addActionListener(e ->{
			open_add_gui();
		});
		panel.add(btn_Add);
		
		btn_AllNotes = new JButton("All Notes");
		btn_AllNotes.setForeground(Color.WHITE);
		btn_AllNotes.setBackground(Color.BLACK);
		btn_AllNotes.setFont(new Font("Cascadia Code", Font.PLAIN, 14));
		btn_AllNotes.setBounds(0, 136, 167, 62);
		btn_AllNotes.setBorderPainted(false);
		btn_AllNotes.addActionListener(e ->{
			open_notes_gui();
		});
		panel.add(btn_AllNotes);
		
		cardLayout = new CardLayout();
		card_panel = new JPanel(cardLayout);
		card_panel.setBounds(167, 0, 537, 441);
		contentPane.add(card_panel);
		
		add_panel = new BrowseGUI();
		card_panel.add(add_panel, "Add");
		
		browse_panel = new AddGUI();
		card_panel.add(browse_panel, "Browse");
		
		notes_panel = new NotesGUI();
		card_panel.add(notes_panel, "Notes");
	}
	
	public void open_browse_gui() {
		System.out.println("show all books");
		cardLayout.show(card_panel, "Browse");
	}
	
	public void open_add_gui() {
		System.out.println("add a new book");
		cardLayout.show(card_panel, "Add");
	}
	
	public void open_notes_gui() {
		System.out.println("show all notes");
		cardLayout.show(card_panel, "Notes");
	}
	
	public JPanel getButtonPanel() {
		return panel;
	}
}
