/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminRole.ResidentialEnterprise;


import business.organization.Organization;
import business.organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinay
 */
public class ResidentialManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ResidentialManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        for (Organization.ResidentialType type : Organization.ResidentialType.values()){
                  organizationJComboBox.addItem(type);
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
     if(organization.getName().startsWith("Residential")){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationId();
            row[1] = organization.getName();
            
            model.addRow(row);
     }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel1.setText("Organization Type ");

        backJButton.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel4.setText("Manage Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(124, 124, 124)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addJButton))
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        boolean flag=true;
        
        Organization.ResidentialType type = (Organization.ResidentialType) organizationJComboBox.getSelectedItem();
        for(Organization o:directory.getOrganizationList())
            {
                if(o.getName().contains(type.toString())){
                    flag=false;
                    break;}
            }    
                 if(flag){ 
                    directory.createResidentialOrganization(type);
                    JOptionPane.showMessageDialog(null,"Organization has been created successfully","Infomration",JOptionPane.INFORMATION_MESSAGE);
                 }
                 else
            JOptionPane.showMessageDialog(null,"Organization can be created only once","Infomration",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
