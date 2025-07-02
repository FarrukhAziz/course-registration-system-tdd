package com.farrukh.courseregistration.view.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class CourseSwingView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtCourseCode;
	private JTextField txtCourseDescription;
	private JTextField txtCourseStartDate;
	private JTextField txtCourseEndDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseSwingView frame = new CourseSwingView();
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
	public CourseSwingView() {
		setTitle("Course");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblCourseName = new JLabel("Course Name");
		GridBagConstraints gbc_lblCourseName = new GridBagConstraints();
		gbc_lblCourseName.anchor = GridBagConstraints.EAST;
		gbc_lblCourseName.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourseName.gridx = 0;
		gbc_lblCourseName.gridy = 0;
		contentPane.add(lblCourseName, gbc_lblCourseName);

		txtName = new JTextField();
		txtName.setName("CourseNameTextBox");
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.insets = new Insets(0, 0, 5, 0);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 1;
		gbc_txtName.gridy = 0;
		contentPane.add(txtName, gbc_txtName);
		txtName.setColumns(10);

		JLabel lblCourseCode = new JLabel("Course Code");
		GridBagConstraints gbc_lblCourseCode = new GridBagConstraints();
		gbc_lblCourseCode.anchor = GridBagConstraints.EAST;
		gbc_lblCourseCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourseCode.gridx = 0;
		gbc_lblCourseCode.gridy = 1;
		contentPane.add(lblCourseCode, gbc_lblCourseCode);

		txtCourseCode = new JTextField();
		txtCourseCode.setName("CourseCodeTextBox");
		GridBagConstraints gbc_txtCourseCode = new GridBagConstraints();
		gbc_txtCourseCode.insets = new Insets(0, 0, 5, 0);
		gbc_txtCourseCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCourseCode.gridx = 1;
		gbc_txtCourseCode.gridy = 1;
		contentPane.add(txtCourseCode, gbc_txtCourseCode);
		txtCourseCode.setColumns(10);

		JLabel lblCourseDescription = new JLabel("Course Description");
		GridBagConstraints gbc_lblCourseDescription = new GridBagConstraints();
		gbc_lblCourseDescription.anchor = GridBagConstraints.EAST;
		gbc_lblCourseDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourseDescription.gridx = 0;
		gbc_lblCourseDescription.gridy = 2;
		contentPane.add(lblCourseDescription, gbc_lblCourseDescription);

		txtCourseDescription = new JTextField();
		txtCourseDescription.setName("CourseDescriptionTextBox");
		GridBagConstraints gbc_txtCourseDescription = new GridBagConstraints();
		gbc_txtCourseDescription.insets = new Insets(0, 0, 5, 0);
		gbc_txtCourseDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCourseDescription.gridx = 1;
		gbc_txtCourseDescription.gridy = 2;
		contentPane.add(txtCourseDescription, gbc_txtCourseDescription);
		txtCourseDescription.setColumns(10);

		JLabel lblCourseStartDate = new JLabel("Course Start Date");
		GridBagConstraints gbc_lblCourseStartDate = new GridBagConstraints();
		gbc_lblCourseStartDate.anchor = GridBagConstraints.EAST;
		gbc_lblCourseStartDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourseStartDate.gridx = 0;
		gbc_lblCourseStartDate.gridy = 3;
		contentPane.add(lblCourseStartDate, gbc_lblCourseStartDate);

		txtCourseStartDate = new JTextField();
		txtCourseStartDate.setName("CourseStartDateTextBox");
		GridBagConstraints gbc_txtCourseStartDate = new GridBagConstraints();
		gbc_txtCourseStartDate.insets = new Insets(0, 0, 5, 0);
		gbc_txtCourseStartDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCourseStartDate.gridx = 1;
		gbc_txtCourseStartDate.gridy = 3;
		contentPane.add(txtCourseStartDate, gbc_txtCourseStartDate);
		txtCourseStartDate.setColumns(10);

		JLabel lblCourseEndDate = new JLabel("Course End Date");
		GridBagConstraints gbc_lblCourseEndDate = new GridBagConstraints();
		gbc_lblCourseEndDate.anchor = GridBagConstraints.EAST;
		gbc_lblCourseEndDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourseEndDate.gridx = 0;
		gbc_lblCourseEndDate.gridy = 4;
		contentPane.add(lblCourseEndDate, gbc_lblCourseEndDate);

		txtCourseEndDate = new JTextField();
		txtCourseEndDate.setName("CourseStartDateTextBox");
		GridBagConstraints gbc_txtCourseEndDate = new GridBagConstraints();
		gbc_txtCourseEndDate.insets = new Insets(0, 0, 5, 0);
		gbc_txtCourseEndDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCourseEndDate.gridx = 1;
		gbc_txtCourseEndDate.gridy = 4;
		contentPane.add(txtCourseEndDate, gbc_txtCourseEndDate);
		txtCourseEndDate.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.gridwidth = 2;
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 5;
		contentPane.add(btnAdd, gbc_btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		GridBagConstraints gbc_btnUpdate = new GridBagConstraints();
		gbc_btnUpdate.insets = new Insets(0, 0, 5, 0);
		gbc_btnUpdate.gridwidth = 2;
		gbc_btnUpdate.gridx = 0;
		gbc_btnUpdate.gridy = 6;
		contentPane.add(btnUpdate, gbc_btnUpdate);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 7;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JList ListOfStudent = new JList();
		ListOfStudent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListOfStudent.setName("StudentList");
		scrollPane.setViewportView(ListOfStudent);

		
		JButton btnNew = new JButton("Delete Course");
		GridBagConstraints gbc_btnNew = new GridBagConstraints();
		gbc_btnNew.insets = new Insets(0, 0, 5, 0);
		gbc_btnNew.gridwidth = 2;
		gbc_btnNew.gridx = 0;
		gbc_btnNew.gridy = 8;
		contentPane.add(btnNew, gbc_btnNew);

		JLabel lblErrorMessage = new JLabel("");
		lblErrorMessage.setName("ErrorMessageLabel");
		GridBagConstraints gbc_lblErrorMessage = new GridBagConstraints();
		gbc_lblErrorMessage.insets = new Insets(0, 0, 0, 5);
		gbc_lblErrorMessage.gridx = 0;
		gbc_lblErrorMessage.gridy = 9;
		contentPane.add(lblErrorMessage, gbc_lblErrorMessage);

		JLabel lblErrorMessage2 = new JLabel("");
		lblErrorMessage2.setName("ErrorMessageLabel2");
		GridBagConstraints gbc_lblErrorMessage2 = new GridBagConstraints();
		gbc_lblErrorMessage2.gridx = 0;
		gbc_lblErrorMessage2.gridy = 10;
		contentPane.add(lblErrorMessage2, gbc_lblErrorMessage2);

	}

}
