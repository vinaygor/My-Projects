/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminRole.CommercialEnterprise;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystems;
import business.Role.CustomerRole;
import business.enterprise.Enterprise;
import business.consumer.WaterOutlet;
import business.consumer.WaterOutlets;
import business.organization.CommercialRainWaterHarvestingUnitOrganization;
import business.organization.Customer.Customer;
import business.organization.Organization;
import business.userAccount.UserAccount;
import business.workqueue.RainWaterHarvesting.RainWaterHarvestingRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinay
 */
public class CommercialCreateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomerJPanel
     */
    private JPanel userProcessContainer;
    private WaterOutlets tempWaterOutlets;
    private Enterprise enterprise;
    private EcoSystems system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public CommercialCreateCustomerJPanel(JPanel userProcessContainer,Enterprise enterprise,EcoSystems system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.tempWaterOutlets = new WaterOutlets();
        this.enterprise=enterprise;
        this.system=system;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        waterOutletTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addressComboBox = new javax.swing.JComboBox<>();
        addOutletBtn = new javax.swing.JButton();
        customerNameTxtField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        capacityTxtField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        waterOutletNameTxtField = new javax.swing.JTextField();
        pumpConfigurationComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        waterOutletComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        removeOutletBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dimensionsTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        createCustomerBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        totalNumberStorageTank = new javax.swing.JTextField();

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel12.setText("Password");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel6.setText("User Name");

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel10.setText("Gallons");

        waterOutletTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Water Outlet Name", "Water Outlet Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(waterOutletTable);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 20)); // NOI18N
        jLabel1.setText("Create New Commercial Customer");

        addressComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prudential", "DownTown", "Boylston", "Tremont" }));

        addOutletBtn.setText("Add Outlet");
        addOutletBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOutletBtnActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel16.setText("Pump Configuration Address: ");

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel14.setText("Address:");

        pumpConfigurationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fenway", "Longwood", "Roxbury" }));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel2.setText("Name:");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel15.setText("Enter Existing Pump Configuration Details ");

        waterOutletComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basin Tap", "Shower", "Bath Tap", "Washing Machine", "Flush", "Others" }));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel4.setText("Add Water Outlets");

        removeOutletBtn.setText("Remove Outlet");
        removeOutletBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOutletBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setText("Water Outlets List:");

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel13.setText("Please set your User name and Password");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel5.setText("Water Outlet Name");

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel11.setText("Capacity");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel8.setText("Dimensions");

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel9.setText("L*B*H");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel7.setText("Enter Existing Storage Tank Details");

        createCustomerBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createCustomerBtn.setText("Create Customer");
        createCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerBtnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel17.setText("Total Number of Storage Tanks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(customerNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(waterOutletComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel5)
                                                .addGap(31, 31, 31)
                                                .addComponent(waterOutletNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addOutletBtn))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel14)
                                                .addGap(18, 18, 18)
                                                .addComponent(addressComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(removeOutletBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pumpConfigurationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(createCustomerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(backBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(dimensionsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(capacityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalNumberStorageTank, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(100, 100, 100)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(addressComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(waterOutletNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(waterOutletComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addOutletBtn)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(removeOutletBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dimensionsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(capacityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(totalNumberStorageTank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pumpConfigurationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerBtnActionPerformed
        // TODO add your handling code here:
        if(customerNameTxtField.getText().equals("")||dimensionsTxtField.getText().equals("")||capacityTxtField.getText().equals("")
                ||nameJTextField.getText().equals("")||passwordJTextField.getText().equals("")||totalNumberStorageTank.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Values cannot be empty","Missing Data", 0);
        }
        else
        {   
            try{
                
                
        int size =Integer.parseInt(totalNumberStorageTank.getText());

        double capacity = Double.parseDouble(capacityTxtField.getText());
        
        Customer customer = new Customer();
        customer.setCustomerName(customerNameTxtField.getText());
        customer.getConsumer().setAddress(addressComboBox.getSelectedItem().toString());
        for(WaterOutlet waterOutlet:tempWaterOutlets.getWaterOutlets())
        {
            customer.getConsumer().getWaterOutlets().add(waterOutlet);

        }
        customer.setCustomerType("Commercial");
        
        
        String dimension=dimensionsTxtField.getText();
        customer.getConsumer().initStorageTanks(capacity, dimension, size);
        //Rain water tank will be installed once the employee of that organization will approve the request
        //
        //customer.getRainWaterTank().setCapacity(capacityTxtField.getText());
        //customer.getRainWaterTank().setDimensions(dimensionsTxtField.getText());

        customer.getConsumer().getPumpConfiguration().setOldPumpConfigurationAddress(pumpConfigurationComboBox.getSelectedItem().toString());
        customer.getConsumer().getPumpConfiguration().setPumpEfficiency(customer.getConsumer().getPumpConfiguration().getOldPumpConfigurationAddress());

        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();

        enterprise.getCustomerDirectory().createCustomer(customer);
        UserAccount userAccount= enterprise.getUserAccountDirectory().createCustomerUserAccount(userName, password, customer, new CustomerRole());

        RainWaterHarvestingRequest rainWaterHarvestingRequest = new RainWaterHarvestingRequest();
        rainWaterHarvestingRequest.setCustomer(customer);
        rainWaterHarvestingRequest.setCustomerRequest("Install Rain Water Storage Tank");
        rainWaterHarvestingRequest.setMessage("Install Rain Water Storage Tank");
        rainWaterHarvestingRequest.setStatus("Sent");
        rainWaterHarvestingRequest.setPriority(2);
        rainWaterHarvestingRequest.setSender(userAccount);
        rainWaterHarvestingRequest.setRequestDate(new Date());

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationsList().getOrganizationList()){
            if (organization instanceof CommercialRainWaterHarvestingUnitOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(rainWaterHarvestingRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(rainWaterHarvestingRequest);
        }

        //        System.out.println("Displaying all customers created for Enterprise "+enterprise.getName());
        //        for(Customer customer1: enterprise.getCustomerDirectory().getCustomerList()){
            //            System.out.println("Customer "+customer1);
            //        }
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Customer details has been successfully recorded.","Confirmation Message",1);
        waterOutletTable.removeAll();
        customerNameTxtField.setText("");
        waterOutletNameTxtField.setText("");
        waterOutletTable.removeAll();
        dimensionsTxtField.setText("");
        capacityTxtField.setText("");
        nameJTextField.setText("");
        passwordJTextField.setText("");
        }
        catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Capacity and TotalStorage Tank can accept only integers","Information", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_createCustomerBtnActionPerformed
    }
    private void removeOutletBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOutletBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) waterOutletTable.getModel();
        int select = waterOutletTable.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an outlet to remove","Information",1);
            return;
        }
        else{

            WaterOutlet waterOutlet = (WaterOutlet) waterOutletTable.getValueAt(select, 0);
            tempWaterOutlets.remove(waterOutlet);
            populateWaterOutletTable();
        }
    }//GEN-LAST:event_removeOutletBtnActionPerformed

    private void addOutletBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOutletBtnActionPerformed
        // TODO add your handling code here:
        WaterOutlet tempWaterOutlet = new WaterOutlet();
        if(!waterOutletNameTxtField.getText().equals("")){
            tempWaterOutlet.setWaterOutletName(waterOutletNameTxtField.getText());
            tempWaterOutlet.setWaterOutletType(waterOutletComboBox.getSelectedItem().toString());
            tempWaterOutlets.add(tempWaterOutlet);
            populateWaterOutletTable();
        }
        else
        JOptionPane.showMessageDialog(null,"Name cannot be null","Warning",1);
    }//GEN-LAST:event_addOutletBtnActionPerformed

    public void populateWaterOutletTable()
    {
        DefaultTableModel model = (DefaultTableModel) waterOutletTable.getModel();
        
        model.setRowCount(0);
        
        for (WaterOutlet waterOutlet: tempWaterOutlets.getWaterOutlets()){
            Object[] row = new Object[2];
            row[0] = waterOutlet;
            row[1] = waterOutlet.getWaterOutletType();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOutletBtn;
    private javax.swing.JComboBox<String> addressComboBox;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField capacityTxtField;
    private javax.swing.JButton createCustomerBtn;
    private javax.swing.JTextField customerNameTxtField;
    private javax.swing.JTextField dimensionsTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox<String> pumpConfigurationComboBox;
    private javax.swing.JButton removeOutletBtn;
    private javax.swing.JTextField totalNumberStorageTank;
    private javax.swing.JComboBox<String> waterOutletComboBox;
    private javax.swing.JTextField waterOutletNameTxtField;
    private javax.swing.JTable waterOutletTable;
    // End of variables declaration//GEN-END:variables
}
