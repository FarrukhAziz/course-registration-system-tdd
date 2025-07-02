package com.farrukh.courseregistration.view.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class StudentSwingView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblID = new JLabel("ID");
	private JTextField txtID;
	private JLabel lblLastName;
	private JLabel lblEmail;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JLabel lblCourse;
	private JComboBox comboboxCourse;
	private JButton btnAdd;
	private JButton btnUpdate;  // ✅ FIXED: This is the correct variable to use
	private JList list;
	private JButton btnDeleteCourse;
	private JLabel lblErrorMessage;
	private JLabel lblErrorMessage2;
	private JScrollPane scrollPane;
	private JList ListOfCourse;
	// private JButton btnNewButton;  // ❌ REMOVED: This was never used correctly

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSwingView frame = new StudentSwingView();
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
	public StudentSwingView() {
		setTitle("Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		GridBagConstraints gbc_lblID = new GridBagConstraints();
		gbc_lblID.insets = new Insets(0, 0, 5, 5);
		gbc_lblID.anchor = GridBagConstraints.EAST;
		gbc_lblID.gridx = 0;
		gbc_lblID.gridy = 0;
		contentPane.add(lblID, gbc_lblID);

		txtID = new JTextField();
		txtID.setName("IDTextBox");
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.insets = new Insets(0, 0, 5, 0);
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.gridx = 1;
		gbc_txtID.gridy = 0;
		contentPane.add(txtID, gbc_txtID);
		txtID.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.EAST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 0;
		gbc_lblFirstName.gridy = 1;
		contentPane.add(lblFirstName, gbc_lblFirstName);

		txtFirstName = new JTextField();
		txtFirstName.setName("FirstNameTextBox");
		GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
		gbc_txtFirstName.insets = new Insets(0, 0, 5, 0);
		gbc_txtFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFirstName.gridx = 1;
		gbc_txtFirstName.gridy = 1;
		contentPane.add(txtFirstName, gbc_txtFirstName);
		txtFirstName.setColumns(10);

		lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.EAST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 2;
		contentPane.add(lblLastName, gbc_lblLastName);

		txtLastName = new JTextField();
		txtLastName.setName("LastNameTextBox");
		GridBagConstraints gbc_txtLastName = new GridBagConstraints();
		gbc_txtLastName.insets = new Insets(0, 0, 5, 0);
		gbc_txtLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLastName.gridx = 1;
		gbc_txtLastName.gridy = 2;
		contentPane.add(txtLastName, gbc_txtLastName);
		txtLastName.setColumns(10);

		lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 3;
		contentPane.add(lblEmail, gbc_lblEmail);

		txtEmail = new JTextField();
		txtEmail.setName("EmailTextBox");
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 3;
		contentPane.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);

		lblCourse = new JLabel("Course");
		lblCourse.setName("");
		GridBagConstraints gbc_lblCourse = new GridBagConstraints();
		gbc_lblCourse.anchor = GridBagConstraints.EAST;
		gbc_lblCourse.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourse.gridx = 0;
		gbc_lblCourse.gridy = 4;
		contentPane.add(lblCourse, gbc_lblCourse);

		comboboxCourse = new JComboBox();
		comboboxCourse.setName("CourseComboBox");
		GridBagConstraints gbc_comboboxCourse = new GridBagConstraints();
		gbc_comboboxCourse.insets = new Insets(0, 0, 5, 0);
		gbc_comboboxCourse.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxCourse.gridx = 1;
		gbc_comboboxCourse.gridy = 4;
		contentPane.add(comboboxCourse, gbc_comboboxCourse);

		btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.gridwidth = 2;
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 5;
		contentPane.add(btnAdd, gbc_btnAdd);

		btnUpdate = new JButton("Update");  // ✅ FIXED
		GridBagConstraints gbc_btnUpdate = new GridBagConstraints();
		gbc_btnUpdate.gridwidth = 2;
		gbc_btnUpdate.insets = new Insets(0, 0, 5, 0);
		gbc_btnUpdate.gridx = 0;
		gbc_btnUpdate.gridy = 6;
		contentPane.add(btnUpdate, gbc_btnUpdate);

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 7;
		contentPane.add(scrollPane, gbc_scrollPane);

		ListOfCourse = new JList();
		ListOfCourse.setName("CourseList");
		ListOfCourse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(ListOfCourse);

		btnDeleteCourse = new JButton("Delete Course");
		GridBagConstraints gbc_btnDeleteCourse = new GridBagConstraints();
		gbc_btnDeleteCourse.insets = new Insets(0, 0, 5, 0);
		gbc_btnDeleteCourse.gridwidth = 2;
		gbc_btnDeleteCourse.gridx = 0;
		gbc_btnDeleteCourse.gridy = 8;
		contentPane.add(btnDeleteCourse, gbc_btnDeleteCourse);

		lblErrorMessage = new JLabel("");
		lblErrorMessage.setName("ErrorMessageLabel");
		GridBagConstraints gbc_lblErrorMessage = new GridBagConstraints();
		gbc_lblErrorMessage.insets = new Insets(0, 0, 5, 0);
		gbc_lblErrorMessage.gridwidth = 2;
		gbc_lblErrorMessage.gridx = 0;
		gbc_lblErrorMessage.gridy = 9;
		contentPane.add(lblErrorMessage, gbc_lblErrorMessage);

		lblErrorMessage2 = new JLabel("");
		lblErrorMessage2.setName("ErrorMessageLabel2");
		GridBagConstraints gbc_lblErrorMessage2 = new GridBagConstraints();
		gbc_lblErrorMessage2.gridwidth = 2;
		gbc_lblErrorMessage2.gridx = 0;
		gbc_lblErrorMessage2.gridy = 10;
		contentPane.add(lblErrorMessage2, gbc_lblErrorMessage2);
	}
}
