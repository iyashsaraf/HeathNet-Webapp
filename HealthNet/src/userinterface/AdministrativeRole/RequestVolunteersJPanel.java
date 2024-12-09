/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;
import java.util.Arrays;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ngoRequestIntakeOfficerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ngoVolunteerRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author saket
 */
public class RequestVolunteersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;

    /**
     * Creates new form RequestFundsJPanel
     */
    public RequestVolunteersJPanel(JPanel jPanel, Enterprise enterprise, UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateRequestTable();
    }

//    public void populateRequestTable() {
//        DefaultTableModel model = (DefaultTableModel) tblVolunteerRequest.getModel();
//        double totalFunds = 0;
//        model.setRowCount(0);
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequests()) {
//            Object[] row = new Object[4];
//            row[0] = String.valueOf(((ngoVolunteerRequest) request).getRegion());
//            row[1] = request.getReceiver();
//            row[2] = request.getStatus();
//            row[3] = String.valueOf(((ngoVolunteerRequest) request).getVolunteerRequested());
//            model.addRow(row);
//            if (request.getStatus().equalsIgnoreCase("Accepted")) {
//                totalFunds += ((ngoVolunteerRequest) request).getVolunteerRequested();
//            }
//        }
//
//        txtVolunteerReceived.setText(String.valueOf(totalFunds));
//        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
//        tblVolunteerRequest.setRowSorter(sorter);
//    }
    public void populateRequestTable() {
    DefaultTableModel model = (DefaultTableModel) tblVolunteerRequest.getModel();
    double totalVolunteers = 0;
    model.setRowCount(0);

    for (WorkRequest request : userAccount.getWorkQueue().getWorkRequests()) {
        // Ensure the request is of type ngoVolunteerRequest before casting
        if (request instanceof ngoVolunteerRequest) {
            ngoVolunteerRequest volunteerRequest = (ngoVolunteerRequest) request;
            Object[] row = new Object[4];
            row[0] = volunteerRequest.getRegion();
            row[1] = request.getReceiver() != null ? request.getReceiver() : "Unassigned";
            row[2] = request.getStatus() != null ? request.getStatus() : "Unknown";
            row[3] = volunteerRequest.getVolunteerRequested();

            model.addRow(row);

            // Check if status is "Accepted" (case-insensitive)
            if ("Accepted".equalsIgnoreCase(request.getStatus())) {
                totalVolunteers += volunteerRequest.getVolunteerRequested();
            }
        }
    }

    txtVolunteerReceived.setText(String.valueOf(totalVolunteers));
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    tblVolunteerRequest.setRowSorter(sorter);
}
    
//     private void populateRequestTable() {
//        DefaultTableModel model = (DefaultTableModel) tblVolunteerRequest.getModel();
//        double totalVolunteers = 0;
//        model.setRowCount(0);
//
//        System.out.println("Populating table..."); // Debugging
//
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequests()) {
//            System.out.println("Checking WorkRequest: " + request); // Debugging
//            if (request instanceof ngoVolunteerRequest) {
//                ngoVolunteerRequest volunteerRequest = (ngoVolunteerRequest) request;
//                Object[] row = new Object[4];
//                row[0] = volunteerRequest.getRegion();
//                row[1] = request.getReceiver() != null ? request.getReceiver() : "Unassigned";
//                row[2] = request.getStatus() != null ? request.getStatus() : "Unknown";
//                row[3] = volunteerRequest.getVolunteerRequested();
//
//                System.out.println("Row Data: " + Arrays.toString(row)); // Debugging
//                model.addRow(row);
//
//                if ("Accepted".equalsIgnoreCase(request.getStatus())) {
//                    totalVolunteers += volunteerRequest.getVolunteerRequested();
//                }
//            } else {
//                System.out.println("Skipping WorkRequest not of type ngoVolunteerRequest: " + request.getClass().getName());
//            }
//        }
//
//        txtVolunteerReceived.setText(String.valueOf(totalVolunteers));
//        tblVolunteerRequest.repaint(); // Ensure UI updates
//        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
//        tblVolunteerRequest.setRowSorter(sorter);
//        System.out.println("Table populated successfully! Total Volunteers: " + totalVolunteers); // Debugging
//    }
//

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRequestFunds = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        lblPopulation = new javax.swing.JLabel();
        txtPopulation = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtVolunteer = new javax.swing.JTextField();
        btnRequestFunds = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteerRequest = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVolunteerReceived = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(153, 255, 204));
        setLayout(null);

        lblRequestFunds.setBackground(new java.awt.Color(0, 0, 0));
        lblRequestFunds.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        lblRequestFunds.setForeground(new java.awt.Color(153, 255, 204));
        lblRequestFunds.setText("REQUEST VOLUNTEERS");
        add(lblRequestFunds);
        lblRequestFunds.setBounds(236, 11, 290, 50);

        lblLocation.setBackground(new java.awt.Color(0, 0, 0));
        lblLocation.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(153, 255, 204));
        lblLocation.setText("Location:");
        add(lblLocation);
        lblLocation.setBounds(150, 60, 63, 20);

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        add(txtLocation);
        txtLocation.setBounds(230, 60, 140, 23);

        lblPopulation.setBackground(new java.awt.Color(0, 0, 0));
        lblPopulation.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        lblPopulation.setForeground(new java.awt.Color(153, 255, 204));
        lblPopulation.setText("Population:");
        add(lblPopulation);
        lblPopulation.setBounds(137, 110, 80, 20);

        txtPopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPopulationActionPerformed(evt);
            }
        });
        txtPopulation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPopulationKeyTyped(evt);
            }
        });
        add(txtPopulation);
        txtPopulation.setBounds(230, 100, 143, 23);

        lblAmount.setBackground(new java.awt.Color(0, 0, 0));
        lblAmount.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(153, 255, 204));
        lblAmount.setText("Number of Volunteers:");
        add(lblAmount);
        lblAmount.setBounds(70, 150, 160, 20);

        txtVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerActionPerformed(evt);
            }
        });
        txtVolunteer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVolunteerKeyTyped(evt);
            }
        });
        add(txtVolunteer);
        txtVolunteer.setBounds(230, 140, 143, 23);

        btnRequestFunds.setBackground(new java.awt.Color(0, 0, 0));
        btnRequestFunds.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        btnRequestFunds.setForeground(new java.awt.Color(153, 255, 204));
        btnRequestFunds.setText("Request Volunteers");
        btnRequestFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFundsActionPerformed(evt);
            }
        });
        add(btnRequestFunds);
        btnRequestFunds.setBounds(260, 190, 170, 38);

        tblVolunteerRequest.setBackground(new java.awt.Color(242, 242, 242));
        tblVolunteerRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Location", "Receiver", "Status", "Volunteers"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVolunteerRequest);

        add(jScrollPane1);
        jScrollPane1.setBounds(70, 360, 592, 97);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 204));
        jLabel4.setText("All Volunteer Requests");
        add(jLabel4);
        jLabel4.setBounds(290, 310, 170, 20);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 204));
        jLabel5.setText("Total Volunteers Alloted :");
        add(jLabel5);
        jLabel5.setBounds(140, 260, 200, 15);

        txtVolunteerReceived.setEditable(false);
        add(txtVolunteerReceived);
        txtVolunteerReceived.setBounds(340, 260, 143, 23);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 255, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 11, 84, 26);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtPopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPopulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPopulationActionPerformed

    private void txtVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerActionPerformed

    private void btnRequestFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFundsActionPerformed
        String location = txtLocation.getText().trim();
        String population = txtPopulation.getText();
        String amount = txtVolunteer.getText();
        if (location.equals("") || population.equals("") || amount.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        } 
    
        
            ngoVolunteerRequest NgoVolunteerRequest = new ngoVolunteerRequest(location, Integer.parseInt(population), Double.parseDouble(amount));
            NgoVolunteerRequest.setSender(userAccount);
            NgoVolunteerRequest.setStatus("Sent");

            Organization org = null;

            List<Network> networks = ecoSystem.getNetworks();

            for (Network network : networks) {

                List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                for (Enterprise enterprise : enterprises) {
                    List<Organization> organizations = enterprise.getOrganizationDirectory().getOrganizations();
                    for (Organization organization : organizations) {
                        if (organization instanceof ngoRequestIntakeOfficerOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequests().add(NgoVolunteerRequest);
                userAccount.getWorkQueue().getWorkRequests().add(NgoVolunteerRequest);
            }
            populateRequestTable();
        
    }//GEN-LAST:event_btnRequestFundsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPopulationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPopulationKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtPopulationKeyTyped

    private void txtVolunteerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVolunteerKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtVolunteerKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestFunds;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPopulation;
    private javax.swing.JLabel lblRequestFunds;
    private javax.swing.JTable tblVolunteerRequest;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPopulation;
    private javax.swing.JTextField txtVolunteer;
    private javax.swing.JTextField txtVolunteerReceived;
    // End of variables declaration//GEN-END:variables
}
