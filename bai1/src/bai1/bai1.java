package bai1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtten;
	private JTextField txtgia;
	private JTextField txt1;
	private JTextField txtnam;
	private JTextField txtmau;
	private JTextField txt2;
	private ArrayList<PTGT> listptgt=new ArrayList<PTGT>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1 frame = new bai1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bai1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbloai = new JComboBox();
		
		
		
	
		cbloai.setModel(new DefaultComboBoxModel(new String[] {"Xe may", "Xe tay ga", "Ô tô"}));
		cbloai.setBounds(77, 11, 153, 20);
		contentPane.add(cbloai);
		
		JLabel lblNewLabel = new JLabel("Loai xe");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Th\u00F4ng tin xe", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("Th\u00F4ng tin xe");
		panel.setBounds(20, 42, 640, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn xe");
		lblNewLabel_1.setBounds(10, 24, 46, 14);
		panel.add(lblNewLabel_1);
		
		txtten = new JTextField();
		txtten.setBounds(78, 21, 86, 20);
		panel.add(txtten);
		txtten.setColumns(10);
		
		txtgia = new JTextField();
		txtgia.setColumns(10);
		txtgia.setBounds(78, 58, 86, 20);
		panel.add(txtgia);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gi\u00E1 b\u00E1n");
		lblNewLabel_1_1.setBounds(10, 61, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(78, 94, 86, 20);
		panel.add(txt1);
		
		JLabel lb1 = new JLabel("");
		lb1.setBounds(10, 97, 58, 14);
		panel.add(lb1);
		
		txtnam = new JTextField();
		txtnam.setColumns(10);
		txtnam.setBounds(392, 24, 86, 20);
		panel.add(txtnam);
		
		JLabel lblNewLabel_1_3 = new JLabel("N\u0103m s\u1EA3n xu\u1EA5t");
		lblNewLabel_1_3.setBounds(304, 27, 78, 14);
		panel.add(lblNewLabel_1_3);
		
		txtmau = new JTextField();
		txtmau.setColumns(10);
		txtmau.setBounds(392, 58, 86, 20);
		panel.add(txtmau);
		
		JLabel lblNewLabel_1_4 = new JLabel("M\u00E0u xe");
		lblNewLabel_1_4.setBounds(304, 61, 46, 14);
		panel.add(lblNewLabel_1_4);
		
		JLabel lb2 = new JLabel("");
		lb2.setBounds(303, 97, 58, 14);
		panel.add(lb2);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(392, 94, 86, 20);
		panel.add(txt2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(30, 181, 398, 253);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Tenxe=txtten.getText();
				
			}
		});
		btnNewButton.setBounds(445, 203, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnTipTc = new JButton("Ti\u1EBFp t\u1EE5c");
		btnTipTc.setBounds(445, 255, 89, 23);
		contentPane.add(btnTipTc);
		
		JButton btnGhiFile = new JButton("Ghi file");
		btnGhiFile.setBounds(445, 317, 89, 23);
		contentPane.add(btnGhiFile);
		
		JButton btnThot = new JButton("Tho\u00E1t");
		btnThot.setBounds(445, 377, 89, 23);
		contentPane.add(btnThot);
		
		cbloai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		cbloai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(cbloai.getSelectedIndex())
				{
				case 0:
					{
					lb1.setVisible(true);
					lb1.setText("Công xuất");
					txt1.setVisible(true);
					lb2.setVisible(false);
					txt2.setVisible(false);
					break;
					}
				case 1:
					{
					lb1.setVisible(true);
					lb1.setText("Công xuất");
					txt1.setVisible(true);
					lb2.setVisible(false);
					txt2.setVisible(false);
					break;
					}
				case 2:
					{
					lb1.setVisible(true);
					lb1.setText("Số chỗ ngồi");
					txt1.setVisible(true);
					lb2.setVisible(true);
					lb2.setText("kiểu động cơ");
					txt2.setVisible(true);
					break;
					}
				}
			}
		});
	}
}
