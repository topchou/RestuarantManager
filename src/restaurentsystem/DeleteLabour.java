/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package restaurentsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Shahin
 */
public class DeleteLabour extends javax.swing.JFrame {
	
	private Labours labours;
	private int dltID;

	/**
	 * Creates new form DeleteLabour
	 */
	public DeleteLabour() {
		initComponents();
		performFileRelatedTask();
	}

	private void performFileRelatedTask() {
		labours = new Labours();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		dltButton = new javax.swing.JButton();
		backButton = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		text = new javax.swing.JTextArea();
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
		dlttext = new javax.swing.JTextField();
		view = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(0, 102, 255));

		dltButton.setText("Delete");
		dltButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dltButtonActionPerformed(evt);
			}
		});

		backButton.setText("Back");
		backButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backButtonActionPerformed(evt);
			}
		});

		text.setEditable(false);
		text.setColumns(20);
		text.setRows(5);
		jScrollPane1.setViewportView(text);
		
		
		jLabel0.setText("Index");
		jLabel1.setText("ID");
		jLabel2.setText("Name");
		jLabel3.setText("Salary");

		jLabel4.setText("Which Labour ID  want to Delete");

		view.setText("View");
		view.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				viewActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);

		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jLabel0)
						.addGap(32, 32, 32).addComponent(jLabel1).addGap(18, 18, 18)
						.addComponent(jLabel2).addGap(18, 18, 18).addComponent(jLabel3))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259,javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169,
														javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
												.addComponent(dlttext, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(36, 36, 36).addComponent(view)
								.addGap(32, 32, 32).addComponent(dltButton).addGap(18, 18, 18).addComponent(backButton)))));
		
		
		
		
		
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel0).addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3)
						.addGap(10))
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jScrollPane1)
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4))
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(dlttext))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(view).addComponent(dltButton).addComponent(backButton))
						.addGap(0, 64, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(21, Short.MAX_VALUE).addComponent(jPanel1,
						javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(23, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void dltButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dltButtonActionPerformed
		dltID = Integer.parseInt(dlttext.getText());
		
		labours.delete(dltID);
		dlttext.setText("");
		JOptionPane.showMessageDialog(this, "Labour has been Deleted");
		labours = new Labours();
		text.setText(labours.getFullNames().toString());
	}// GEN-LAST:event_dltButtonActionPerformed

	private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButtonActionPerformed
		// TODO add your handling code here:
		Management lm = new Management("Labour");
		lm.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_backButtonActionPerformed

	private void viewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_viewActionPerformed
		labours = new Labours();
		text.setText(labours.getFullNames().toString());

	}// GEN-LAST:event_viewActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DeleteLabour.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DeleteLabour.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DeleteLabour.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DeleteLabour.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DeleteLabour().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton backButton;
	private javax.swing.JButton dltButton;
	private javax.swing.JTextField dlttext;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea text;
	private javax.swing.JButton view;
	
	// End of variables declaration//GEN-END:variables
}


