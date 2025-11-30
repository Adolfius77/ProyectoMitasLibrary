/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentacion;



/**
 *
 * @author riosr
 */
public class GUILibroHarryPotter extends javax.swing.JPanel {

    /**
     * Creates new form GUILibroHarryPotter
     */
    

    public GUILibroHarryPotter() {
        initComponents();
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHarryPotterNombre = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lblHarryPotterImg = new javax.swing.JLabel();
        LblNombreLibro = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        LblPrecio = new javax.swing.JLabel();
        LblDisponibildiad = new javax.swing.JLabel();
        btnHarryPotterAgregar = new javax.swing.JButton();

        lblHarryPotterNombre.setBackground(new java.awt.Color(217, 202, 218));
        lblHarryPotterNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 196, 208), 2));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        lblHarryPotterImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/harryPotter.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(lblHarryPotterImg, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHarryPotterImg, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        LblNombreLibro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblNombreLibro.setText("Harry Potter y la piedra filosofal");

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        LblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblPrecio.setText("$389");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(LblPrecio)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LblPrecio)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        LblDisponibildiad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblDisponibildiad.setText("47 disponibles");

        btnHarryPotterAgregar.setBackground(new java.awt.Color(101, 85, 143));
        btnHarryPotterAgregar.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btnHarryPotterAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnHarryPotterAgregar.setText("AGREGAR AL CARRITO");
        btnHarryPotterAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHarryPotterAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblHarryPotterNombreLayout = new javax.swing.GroupLayout(lblHarryPotterNombre);
        lblHarryPotterNombre.setLayout(lblHarryPotterNombreLayout);
        lblHarryPotterNombreLayout.setHorizontalGroup(
            lblHarryPotterNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblHarryPotterNombreLayout.createSequentialGroup()
                .addGroup(lblHarryPotterNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblHarryPotterNombreLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(lblHarryPotterNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDisponibildiad, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lblHarryPotterNombreLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnHarryPotterAgregar))
                    .addGroup(lblHarryPotterNombreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        lblHarryPotterNombreLayout.setVerticalGroup(
            lblHarryPotterNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblHarryPotterNombreLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblDisponibildiad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHarryPotterAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblHarryPotterNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblHarryPotterNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHarryPotterAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHarryPotterAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHarryPotterAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDisponibildiad;
    private javax.swing.JLabel LblNombreLibro;
    private javax.swing.JLabel LblPrecio;
    private javax.swing.JButton btnHarryPotterAgregar;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JLabel lblHarryPotterImg;
    private javax.swing.JPanel lblHarryPotterNombre;
    // End of variables declaration//GEN-END:variables
}
