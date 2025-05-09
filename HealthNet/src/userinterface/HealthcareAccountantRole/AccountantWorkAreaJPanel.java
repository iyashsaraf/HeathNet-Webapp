/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthCenterEnterprise;
import Business.Organization.AccountantOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author saket
 */
public class AccountantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private AccountantOrganization accountantOrganization;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;

    /**
     * Creates new form AccountantWorkAreaJPanel
     */
    public AccountantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AccountantOrganization accountantOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountantOrganization = accountantOrganization;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.ecoSystem = ecosystem;

        populateAllPatientsTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateAppointment = new javax.swing.JButton();
        btnProcessMedicalBills = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllPatients = new javax.swing.JTable();
        btnSendReport = new javax.swing.JButton();
        lblReceptionistWorkArea = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(153, 255, 204));

        btnCreateAppointment.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateAppointment.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnCreateAppointment.setForeground(new java.awt.Color(153, 255, 204));
        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        btnProcessMedicalBills.setBackground(new java.awt.Color(0, 0, 0));
        btnProcessMedicalBills.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnProcessMedicalBills.setForeground(new java.awt.Color(153, 255, 204));
        btnProcessMedicalBills.setText("Process Medical Billings");
        btnProcessMedicalBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessMedicalBillsActionPerformed(evt);
            }
        });

        tblAllPatients.setBackground(new java.awt.Color(242, 242, 242));
        tblAllPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Patient Name", "Phone Number", "Address", "Treatment Status", "Appointment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllPatients);

        btnSendReport.setBackground(new java.awt.Color(0, 0, 0));
        btnSendReport.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSendReport.setForeground(new java.awt.Color(153, 255, 204));
        btnSendReport.setText("Show Patient Report");
        btnSendReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReportActionPerformed(evt);
            }
        });

        lblReceptionistWorkArea.setBackground(new java.awt.Color(0, 0, 0));
        lblReceptionistWorkArea.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lblReceptionistWorkArea.setForeground(new java.awt.Color(153, 255, 204));
        lblReceptionistWorkArea.setText("RECEIPTIONIST WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(lblReceptionistWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(btnSendReport)
                                .addGap(142, 142, 142)
                                .addComponent(btnProcessMedicalBills))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblReceptionistWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcessMedicalBills, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed

        String patientId = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CreateAppointmentJPanel", new CreateAppointmentJPanel(userProcessContainer, userAccount, enterprise, ecoSystem, patientId));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void btnProcessMedicalBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessMedicalBillsActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ProcessMedicalBillingsJPanel", new ProcessMedicalBillingsJPanel(userProcessContainer, userAccount, enterprise, accountantOrganization, ecoSystem));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessMedicalBillsActionPerformed

    private void btnSendReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReportActionPerformed
        List<Patient> underTreatmentPatients = new ArrayList<>();
        List<Patient> treatedPatients = new ArrayList<>();
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        List<Patient> patients = ((HealthCenterEnterprise) enterprise).getPatientDirectory().getPatientList();
        for (Patient patient : patients) {
            if (patient.isIsTreatmentComplete()) {
                treatedPatients.add(patient);
            } else {
                underTreatmentPatients.add(patient);
            }
        }
        defaultPieDataset.setValue("Patient still under treatment", underTreatmentPatients.size());
        defaultPieDataset.setValue("Patient Treated Successfully", treatedPatients.size());
        JFreeChart chart = ChartFactory.createPieChart("Patient Status Pie Chart", defaultPieDataset, true, true, true);
        PiePlot piePlot =(PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Patient Status Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_btnSendReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnProcessMedicalBills;
    private javax.swing.JButton btnSendReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReceptionistWorkArea;
    private javax.swing.JTable tblAllPatients;
    // End of variables declaration//GEN-END:variables

    public void populateAllPatientsTable() {
        List<Patient> patients = ((HealthCenterEnterprise) enterprise).getPatientDirectory().getPatientList();
        DefaultTableModel dtm = (DefaultTableModel) tblAllPatients.getModel();
        dtm.setRowCount(0);
        for (Patient patient : patients) {
            Object[] row = new Object[6];

            row[0] = patient;
            row[1] = patient.getFirstName() + " " + patient.getLastName();
            row[2] = patient.getContactNumber();
            row[3] = patient.getAddress();
            row[4] = patient.isIsTreatmentComplete() ? "Treatment Complete" : "Treatment In Progress";
            row[5] = patient.getAppointmentDate();

            dtm.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        tblAllPatients.setRowSorter(sorter);
    }
}
