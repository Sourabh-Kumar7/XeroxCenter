/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.MarketManager;

import DataManagement.DataManager;
import TheBusiness.MarketModel.Channel;
import TheBusiness.Personnel.MarketManager;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sourabhkumar
 */
public class ManageChannelJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageChannelJFrame
     */
    javax.swing.JFrame parentFrame;
    MarketManager marketManager;
    public ManageChannelJFrame(JFrame parentFrame, MarketManager marketManager) {
        this.marketManager = marketManager;
        this.parentFrame = parentFrame;
        initComponents();
        loadData();
        Color lightBlue = new Color(173, 216, 230);
        getContentPane().setBackground(lightBlue);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Set close operation
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                loadParentFrame();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarket = new javax.swing.JTable();
        btnAddChannel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewChannel = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Channel");

        tblMarket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Channel ID", "Channel Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMarket);

        btnAddChannel.setText("Add Channel");
        btnAddChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChannelActionPerformed(evt);
            }
        });

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewChannel.setText("View Channel");
        btnViewChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewChannelActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(134, 134, 134)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnViewChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRefresh)
                        .addComponent(btnAddChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddChannel, btnRefresh});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(btnAddChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddChannel, btnRefresh});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChannelActionPerformed
        // TODO add your handling code here:
        Point parentFramePosition = this.getLocation();
        this.setVisible(false);
        AddChannelJFrame addChannel = new AddChannelJFrame(this, marketManager);
        addChannel.setLocation(parentFramePosition);
        addChannel.setVisible(true);
    }//GEN-LAST:event_btnAddChannelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        loadParentFrame();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewChannelActionPerformed
        int selectedRow = tblMarket.getSelectedRow();
        if (selectedRow >= 0) {
            Integer channelId = (Integer) tblMarket.getValueAt(selectedRow, 0);
            Channel channel = DataManager.channelDirectory.get(channelId);

            if (channel != null) {
                Point parentFramePosition = this.getLocation();
                this.setVisible(false);
                ViewChannelJFrame viewChannel = new ViewChannelJFrame(this, channel);
                viewChannel.setLocation(parentFramePosition);
                viewChannel.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a channel to view", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewChannelActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void loadParentFrame() {
        Point myPosition = getLocation();
        this.parentFrame.setLocation(myPosition);
        this.parentFrame.setVisible(true);
        this.dispose();
    }
    
    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) tblMarket.getModel();
        model.setRowCount(0); // Clear existing data

        for (Channel channel : DataManager.channelDirectory.values()) {
            model.addRow(new Object[]{channel.getChannelId(), channel.getName()});
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddChannel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewChannel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMarket;
    // End of variables declaration//GEN-END:variables
}
