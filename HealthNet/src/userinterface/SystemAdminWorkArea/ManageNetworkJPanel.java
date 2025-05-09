/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * @author revan
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        model.setRowCount(0);
        for (Network network : ecosystem.getNetworks()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        networkJTable.setRowSorter(sorter);
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
        networkJTable = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblManageNetworks = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(153, 255, 204));

        networkJTable.setBackground(new java.awt.Color(204, 204, 255));
        networkJTable.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 255, 204));
        lblName.setText("Name :");

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(153, 255, 204));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 255, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblManageNetworks.setBackground(new java.awt.Color(0, 0, 0));
        lblManageNetworks.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        lblManageNetworks.setForeground(new java.awt.Color(153, 255, 204));
        lblManageNetworks.setText("MANAGE NETWORKS");

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 255, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack)
                        .addGap(197, 197, 197)
                        .addComponent(lblManageNetworks))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addComponent(lblName)
                .addGap(75, 75, 75)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnSubmit)
                .addGap(31, 31, 31)
                .addComponent(btnDelete)
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageNetworks)
                    .addComponent(btnBack))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnSubmit)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addContainerGap(463, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String name = txtName.getText();
        ArrayList<Network> networkList = ecosystem.getNetworks();
        ArrayList<String> networkNames = new ArrayList<>();
        for (Network network : networkList) {
            networkNames.add(network.getName());
        }
        if (networkNames.contains(name)) {
            JOptionPane.showMessageDialog(null, "Network already exists!!");
            txtName.setText("");
            return;
        } else {
            if (name == null || name.equals("")) {
                JOptionPane.showMessageDialog(null, "Network Name cannot be Empty!!", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                Network network = ecosystem.createAndAddNetwork();
                network.setName(name);
                JOptionPane.showMessageDialog(null, "New Network is added");
                txtName.setText("");
                populateNetworkTable();
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = networkJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to delete Network", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Network network = (Network) networkJTable.getValueAt(selectedRow, 0);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                ecosystem.getNetworks().remove(network);
                populateNetworkTable();

                JOptionPane.showMessageDialog(null, "Network is deleted");
            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageNetworks;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
