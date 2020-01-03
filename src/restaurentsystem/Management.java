package restaurentsystem;

public class Management extends javax.swing.JFrame{
	/*
	 * Create new form for ItemManagement and LabourManagement
    }*/
	public Management(String Target) {
        initComponents(Target);
    }
	
	public void initComponents(String Target) {

		  
    	secondLayerPanel = new javax.swing.JPanel();
        backgroundPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();




        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        secondLayerPanel.setBackground(new java.awt.Color(204, 204, 255));

        backgroundPanel.setBackground(new java.awt.Color(102, 102, 255));
        backgroundPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backgroundPanel.setForeground(new java.awt.Color(0, 0, 255));

        addButton.setText("Add "+Target);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt,Target);
            }
        });

        viewButton.setText("View "+Target);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt,Target);
            }
        });

        deleteButton.setText("Delete "+Target);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt,Target);
            }
        });

        modifyButton.setText("Modify "+Target);
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt,Target);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(secondLayerPanel);
        secondLayerPanel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(71, 71, 71)))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(secondLayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(secondLayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	
	public void modifyButtonActionPerformed(java.awt.event.ActionEvent evt,String Target) {//GEN-FIRST:event_modifyButtonActionPerformed
        switch(Target) {
        	case "Item":
        		ModifyItem mi = new ModifyItem();
        		mi.setVisible(true);
        		this.dispose();
        		break;
        	case "Labour":
        		ModifyLabour ml = new ModifyLabour();
                ml.setVisible(true);
                this.dispose();
                break;
        		
        }
        
	}//GEN-LAST:event_modifyButtonActionPerformed
	private void addButtonActionPerformed(java.awt.event.ActionEvent evt,String Target) {//GEN-FIRST:event_addButtonActionPerformed
		switch(Target) {
    		case "Item":
    			InsertItem addi = new InsertItem();
    			addi.setVisible(true);
    			this.dispose();
    			break;
    		case "Labour":
    			InserLabour addl = new InserLabour();
                addl.setVisible(true);
                this.dispose();
                break;
		}
        
    }//GEN-LAST:event_addButtonActionPerformed
	
	private void viewButtonActionPerformed(java.awt.event.ActionEvent evt,String Target) {//GEN-FIRST:event_viewButtonActionPerformed
		switch(Target) {
    		case "Item":
    			ViewItem vm = new ViewItem();
    			vm.setVisible(true);
    			this.dispose();
    			break;
    		case "Labour":
    			ViewLabour vl = new ViewLabour();
    	        vl.setVisible(true);
    	        this.dispose();
    	        break;
		}
    }//GEN-LAST:event_viewButtonActionPerformed
	
	private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt,String Target) {//GEN-FIRST:event_deleteButtonActionPerformed
		switch(Target) {
    		case "Item":
    			DeleteItem d= new DeleteItem();
    			d.setVisible(true);
    			this.dispose();
    			break;
    		case "Labour":
    			DeleteLabour dl= new DeleteLabour();
    	        dl.setVisible(true);
    	        this.dispose();
    	        break;
		}
    }//GEN-LAST:event_deleteButtonActionPerformed
	
	private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        RestaurentManagement rm = new RestaurentManagement();
        rm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed
	
	
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel secondLayerPanel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton viewButton;
}