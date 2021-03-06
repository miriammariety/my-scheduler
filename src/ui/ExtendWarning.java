/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import base.UI;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import manager.GameElement;
import model.Note;

/**
 *
 * @author MarkLester
 */
public class ExtendWarning extends javax.swing.JFrame implements UI {
    private Note note;
    private JFrame ExtendWindow;
    
    /**
     * Creates new form ExtendWarning
     */
    public ExtendWarning(Note n) {
        initComponents();
        note = n;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NI2 = new javax.swing.JLabel();
        XPPoints = new javax.swing.JLabel();
        NI1 = new javax.swing.JLabel();
        OKButton = new javax.swing.JPanel();
        NI12 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JPanel();
        NI18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        NI2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NI2.setText("Extending Deadline requires 100 XP Points!");

        XPPoints.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        XPPoints.setText(String.valueOf(GameElement.getExperience()));

        NI1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star.png"))); // NOI18N
        NI1.setText(" Current XP Points: ");

        OKButton.setBackground(new java.awt.Color(0, 102, 51));
        OKButton.setForeground(new java.awt.Color(204, 255, 204));
        OKButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OKButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OKButtonMouseExited(evt);
            }
        });

        NI12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        NI12.setForeground(new java.awt.Color(255, 255, 255));
        NI12.setText("OK");
        NI12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NI12FocusGained(evt);
            }
        });

        javax.swing.GroupLayout OKButtonLayout = new javax.swing.GroupLayout(OKButton);
        OKButton.setLayout(OKButtonLayout);
        OKButtonLayout.setHorizontalGroup(
            OKButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OKButtonLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(NI12)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        OKButtonLayout.setVerticalGroup(
            OKButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NI12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        CancelButton.setBackground(new java.awt.Color(153, 153, 153));
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButtonMouseExited(evt);
            }
        });

        NI18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        NI18.setForeground(new java.awt.Color(255, 255, 255));
        NI18.setText("Cancel");
        NI18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NI18FocusGained(evt);
            }
        });

        javax.swing.GroupLayout CancelButtonLayout = new javax.swing.GroupLayout(CancelButton);
        CancelButton.setLayout(CancelButtonLayout);
        CancelButtonLayout.setHorizontalGroup(
            CancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(NI18)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        CancelButtonLayout.setVerticalGroup(
            CancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NI18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NI2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(NI1)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(XPPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NI2)
                .addGap(18, 18, 18)
                .addComponent(NI1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XPPoints)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NI12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NI12FocusGained

    }//GEN-LAST:event_NI12FocusGained

    private void OKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKButtonMouseClicked
        if(GameElement.getExperience()<100){
            XPPoints.setForeground(Color.RED);
            return;
        }
            
        
        ExtendWindow = new ExtendSched(note);
        ExtendWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OKButtonMouseClicked

    private void OKButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKButtonMouseEntered

    }//GEN-LAST:event_OKButtonMouseEntered

    private void OKButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKButtonMouseExited

    }//GEN-LAST:event_OKButtonMouseExited

    private void NI18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NI18FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_NI18FocusGained

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void CancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseEntered
        
    }//GEN-LAST:event_CancelButtonMouseEntered

    private void CancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CancelButton;
    private javax.swing.JLabel NI1;
    private javax.swing.JLabel NI12;
    private javax.swing.JLabel NI18;
    private javax.swing.JLabel NI2;
    private javax.swing.JPanel OKButton;
    private javax.swing.JLabel XPPoints;
    // End of variables declaration//GEN-END:variables

    private JFrame ExtendSched;

    @Override
    public Map getFields() {
        Map fields = new HashMap();
        fields.put(XPPoints.getName(), XPPoints);
        return fields;
    }
}
