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
	//private DltLabour d;
	private Labours labour;
	private String dltID;

	/**
	 * Creates new form DeleteLabour
	 */
	public DeleteLabour() {
		initComponents();
		performFileRelatedTask();
	}

	private void performFileRelatedTask() {
		labour = new Labours();
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
		jLabel1 = new javax.swing.JLabel();
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

		jLabel1.setText("Which Labour ID  want to Delete");

		view.setText("View");
		view.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				viewActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(47, 47, 47)
										.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(28, 28, 28)
										.addComponent(dlttext, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(91, 91, 91))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(view).addGap(32, 32, 32).addComponent(dltButton)
										.addGap(18, 18, 18).addComponent(backButton).addGap(57, 57, 57))
						.addGroup(layout.createSequentialGroup().addGap(60, 60, 60)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(31, 31, 31)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(dlttext, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(34, 34, 34)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(view).addComponent(dltButton).addComponent(backButton))
						.addContainerGap(45, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void dltButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dltButtonActionPerformed
		dltID = dlttext.getText();
		
		labour.deleteLabour(dltID);
		dlttext.setText("");
		JOptionPane.showMessageDialog(this, "Labour has been Deleted");
		labour = new Labours();
		text.setText(labour.getFullNames().toString());
	}// GEN-LAST:event_dltButtonActionPerformed

	private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButtonActionPerformed
		// TODO add your handling code here:
		Management lm = new Management("Labour");
		lm.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_backButtonActionPerformed

	private void viewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_viewActionPerformed
		labour = new Labours();
		text.setText(labour.getFullNames().toString());

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
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea text;
	private javax.swing.JButton view;
	
	// End of variables declaration//GEN-END:variables
}


