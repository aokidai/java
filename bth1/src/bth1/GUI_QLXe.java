package bth1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class GUI_QLXe extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenXe;
	private JTextField txtGiaban;
	private JTextField txtPhuhu;
	private JTextField txtNamSX;
	private JTextField txtMauxe;
	private JTextField txtPhu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_QLXe frame = new GUI_QLXe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param <E>
	 */
	public <E> GUI_QLXe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loai xe");
		lblNewLabel.setBounds(35, 33, 45, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox cbxLoai = new JComboBox();

		
		cbxLoai.setModel(new DefaultComboBoxModel(new String[] {"Xe may", "Tay ga", "Oto"}));
		cbxLoai.setBounds(117, 29, 161, 21);
		contentPane.add(cbxLoai);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Thong tin xe", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(35, 80, 749, 202);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Ten xe");
		lblNewLabel_1.setBounds(46, 47, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gia ban");
		lblNewLabel_2.setBounds(46, 100, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lbPhuhu = new JLabel("");
		lbPhuhu.setBounds(10, 152, 81, 13);
		panel.add(lbPhuhu);
		
		txtTenXe = new JTextField();
		txtTenXe.setColumns(10);
		txtTenXe.setBounds(122, 44, 161, 19);
		panel.add(txtTenXe);
		
		txtGiaban = new JTextField();
		txtGiaban.setColumns(10);
		txtGiaban.setBounds(122, 97, 161, 19);
		panel.add(txtGiaban);
		
		txtPhuhu = new JTextField();
		txtPhuhu.setColumns(10);
		txtPhuhu.setBounds(122, 149, 161, 19);
		panel.add(txtPhuhu);
		
		JLabel lblNewLabel_4 = new JLabel("Nam sx");
		lblNewLabel_4.setBounds(408, 47, 45, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mau xe");
		lblNewLabel_5.setBounds(408, 100, 45, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lbPhu = new JLabel("");
		lbPhu.setBounds(350, 152, 103, 13);
		panel.add(lbPhu);
		
		txtNamSX = new JTextField();
		txtNamSX.setBounds(498, 44, 161, 19);
		panel.add(txtNamSX);
		txtNamSX.setColumns(10);
		
		txtMauxe = new JTextField();
		txtMauxe.setBounds(498, 97, 161, 19);
		panel.add(txtMauxe);
		txtMauxe.setColumns(10);
		
		txtPhu = new JTextField();
		txtPhu.setBounds(498, 152, 161, 19);
		panel.add(txtPhu);
		txtPhu.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(35, 292, 379, 218);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Danh sach xe", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane.setViewportView(list);
		
		
		
		JButton btnThem = new JButton("Them");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TenXe = txtTenXe.getText();
				String Sotien = txtGiaban.getText();
				String Namsx = txtNamSX.getText();
				String Mau = txtMauxe.getText();				
				switch (cbxLoai.getSelectedIndex()){
				case 0:
						String Congxuat = txtPhuhu.getText();
						PTGT p = new PTGT(TenXe, Hangsx, NamSX, SoTien, Mau);
						listSach.add(s);//thêm vào danh sách hệ thống
						modelTL.addElement(s.toString());//Hiển thị lên ds người dùng nhìn thấy
						break;
				case 1:
					int soPH=Integer.parseInt(txtTTKhac1.getText());
					TapChi tc = new TapChi(maTL,tenTL,tenNXB,soBanPH, ttKhac2, soPH);
					listTapChi.add(tc);
					modelTL.addElement(tc.toString());
					break;
				case 2:
					Bao b = new Bao(maTL,tenTL,tenNXB,soBanPH, ttKhac2);
					listBao.add(b);
					modelTL.addElement(b.toString());
					break;
					
				}
			}
		});
		btnThem.setBounds(559, 309, 87, 21);
		contentPane.add(btnThem);
		
		JButton btnGhiFile = new JButton("Ghi file");
		btnGhiFile.setBounds(559, 422, 87, 21);
		contentPane.add(btnGhiFile);
		
		JButton btnThoat = new JButton("Thoat");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnThoat.setBounds(559, 479, 87, 21);
		contentPane.add(btnThoat);
		
		JButton btnTiepTuc = new JButton("Tiep tuc");
		btnTiepTuc.setBounds(559, 365, 87, 21);
		contentPane.add(btnTiepTuc);
		
		cbxLoai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		cbxLoai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(cbxLoai.getSelectedIndex()){
				case 0:
					lbPhuhu.setVisible(true);
					lbPhuhu.setText("Cong xuat");
					txtPhuhu.setVisible(true);
					lbPhu.setVisible(false);
					txtPhu.setVisible(false);
					break;
				case 1:
					lbPhuhu.setVisible(true);
					lbPhuhu.setText("Cong xuat");
					txtPhuhu.setVisible(true);
					lbPhu.setVisible(false);
					txtPhu.setVisible(false);
					break;
				case 2:
					lbPhuhu.setVisible(true);
					lbPhuhu.setText("So cho ngoi");
					txtPhuhu.setVisible(true);
					lbPhu.setVisible(true);
					lbPhu.setText("Kieu dong co");
					txtPhu.setVisible(true);
					break;
				}
			}
		});
	}
}
