/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_grafica;

import PayYa.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Fernando
 */
public class SesionIniciada extends javax.swing.JFrame {
     private VentanaPrincipal principal;
     private IniciarSesion sesion;
     private CuentaPY cuenta;
     private String[] aux;
     private final Color rojo= new java.awt.Color(255, 0, 51);
     private final Color negro= new java.awt.Color(0,0,0);   
     private Gestor_CuentasPY Cuentas=new Gestor_CuentasPY();
      JSpinner SpinnerFecha = new JSpinner(new SpinnerDateModel());
    /**
     * Creates new form SesionIniciada
     * @param ventana
     */
     public SesionIniciada(IniciarSesion ventana, VentanaPrincipal principal, String nif,Gestor_CuentasPY Cuentas){
         sesion=ventana;
         this.principal=principal;
         sesion.setVisible(false);
          this.setVisible(true);
          this.Cuentas=Cuentas;
          initComponents();
          cuenta=Cuentas.ObtenerCuenta(nif);
          Nombre.setText("Nombre de usuario: "+cuenta.getEmail());
          Saldo.setText("Saldo: "+cuenta.getCuenta());
          aux=cuenta.ImprTranCuantia();
     }
     
     
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        opciones = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JSpinner();
        Transferencia = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Ordenacion = new javax.swing.JComboBox<>();
        Ordenar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Nombre.setText("Nombre Persona");

        Saldo.setText("Saldo");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Del banco", "Al banco", "A persona" }));

        cantidad.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

        Transferencia.setText("Hacer transferencia");
        Transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(opciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Transferencia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Transferencia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transferencias", jPanel1);

        Ordenacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por fecha", "Por cuantia","Fecha seleccionada"}));
        Ordenacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenacionActionPerformed(evt);
            }
        });

        Ordenar.setText("Ordenar");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ordenar)
                    .addComponent(Ordenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ordenacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ordenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ordenar facturas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Salir)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Saldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        
        principal.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_SalirActionPerformed

    private void TransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciaActionPerformed
        float cant=(float) cantidad.getValue();
        if(Cuentas.RangoTrans(cant))
        switch((String) opciones.getSelectedItem()){
             case "Del banco":
                 cuenta.transBanco(cant);
                 JOptionPane.showMessageDialog(this,"Transaccion realizada");
                 break;
             case "Al banco":
                 cuenta.retirarDinero(cant);
                 JOptionPane.showMessageDialog(this,"Transaccion realizada");
                 break;
             case "A persona":   
                 String respuesta = JOptionPane.showInputDialog(this, "Escribe el correo al que entregar el dinero");
                 if(Cuentas.CorreoExistente(respuesta)){
                     if(!cuenta.getEmail().equals(respuesta)){
                        Cuentas.TraspasoPerPer(cant, cuenta.getEmail(), respuesta);
                        JOptionPane.showMessageDialog(this,"Transaccion realizada a "+ respuesta);
                    }
                     else
                          JOptionPane.showMessageDialog(this, "No se pueden hacer transacciones a uno mismo", "Mensaje", JOptionPane.ERROR_MESSAGE);
                 }
                 else
                     JOptionPane.showMessageDialog(this, "El usuario no existe", "Mensaje", JOptionPane.ERROR_MESSAGE);
                 break;
         }
         else
            JOptionPane.showMessageDialog(this, "No se puede traspasar esta cantidad","Error",JOptionPane.ERROR_MESSAGE);
         if(cuenta.getCuenta()<0)
             Saldo.setForeground(rojo);
         else
             Saldo.setForeground(negro);
         Saldo.setText("Saldo: "+cuenta.getCuenta());
    }//GEN-LAST:event_TransferenciaActionPerformed

    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        // TODO add your handling code here:
        
         switch((String) Ordenacion.getSelectedItem()){
            case "Por fecha":
                 Ordenacion Fecha=new Ordenacion(this,principal,cuenta.ImprimirTranFecha());
                 break;
           case "Por cuantia":
                 Ordenacion Orden=new Ordenacion(this,principal,cuenta.ImprTranCuantia());
                 break;
           case "Fecha seleccionada":
                SimpleDateFormat model = new SimpleDateFormat("MM/yyyy");
                SpinnerFecha.setEditor(new JSpinner.DateEditor(SpinnerFecha, model.toPattern()));
                JOptionPane.showMessageDialog(null,SpinnerFecha);
                Calendar fecha = new GregorianCalendar();
                fecha.setTime((Date)SpinnerFecha.getValue());
           
                
                Ordenacion OrdenFecha=new Ordenacion(this,principal,cuenta.ImprimirFecha(fecha.get(Calendar.YEAR),fecha.get(Calendar.MONTH)+1)); //Le sumo 1 porque el mes 0 es enero
               
         }
    }//GEN-LAST:event_OrdenarActionPerformed

    private void OrdenacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrdenacionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JComboBox<String> Ordenacion;
    private javax.swing.JButton Ordenar;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Transferencia;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> opciones;
    // End of variables declaration//GEN-END:variables
}
