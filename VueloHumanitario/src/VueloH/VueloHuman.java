
package VueloH;

import java.util.Stack;
import javax.swing.JOptionPane;

public class VueloHuman extends javax.swing.JFrame {
    
    
    //Pila niños
    
     Stack<String> pila_niño = new Stack<String>();
     //PILA ADULTOS
     Stack<String> pila_adulto = new Stack<String>();
     //PILA ANCIANOS
     Stack<String> pila_anciano = new Stack<String>();

    public VueloHuman() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        Btn_borrarNiños = new javax.swing.JButton();
        btn_borrarAdultos = new javax.swing.JButton();
        btn_borrarAncianos = new javax.swing.JButton();
        btn_añadir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_mostarNiños = new javax.swing.JButton();
        btn_mostarAdultos = new javax.swing.JButton();
        btn_mostrarAncianos = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Vuelo humanitario");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 0, 330, 70);

        txt_nom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_nom.setText("Nombre: ");
        jPanel1.add(txt_nom);
        txt_nom.setBounds(10, 160, 110, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/globe.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 70, 70, 70);

        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre);
        txt_nombre.setBounds(120, 160, 250, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Edad: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 210, 80, 30);

        txt_edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_edad);
        txt_edad.setBounds(120, 210, 250, 30);

        Btn_borrarNiños.setBackground(new java.awt.Color(51, 51, 51));
        Btn_borrarNiños.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_borrarNiños.setForeground(new java.awt.Color(255, 255, 255));
        Btn_borrarNiños.setText("Niños");
        Btn_borrarNiños.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_borrarNiños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_borrarNiñosActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_borrarNiños);
        Btn_borrarNiños.setBounds(50, 510, 100, 40);

        btn_borrarAdultos.setBackground(new java.awt.Color(51, 51, 51));
        btn_borrarAdultos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_borrarAdultos.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrarAdultos.setText("Adultos");
        btn_borrarAdultos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_borrarAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarAdultosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_borrarAdultos);
        btn_borrarAdultos.setBounds(180, 510, 90, 40);

        btn_borrarAncianos.setBackground(new java.awt.Color(51, 51, 51));
        btn_borrarAncianos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_borrarAncianos.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrarAncianos.setText("Ancianos");
        btn_borrarAncianos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_borrarAncianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarAncianosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_borrarAncianos);
        btn_borrarAncianos.setBounds(300, 510, 90, 40);

        btn_añadir.setBackground(new java.awt.Color(51, 51, 51));
        btn_añadir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_añadir.setForeground(new java.awt.Color(255, 255, 255));
        btn_añadir.setText("Añadir");
        btn_añadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_añadir);
        btn_añadir.setBounds(110, 260, 90, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mostrar datos de: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 330, 220, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Borrar datos de : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 450, 210, 40);

        btn_mostarNiños.setBackground(new java.awt.Color(51, 51, 51));
        btn_mostarNiños.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_mostarNiños.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostarNiños.setText("Niños");
        btn_mostarNiños.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_mostarNiños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostarNiñosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mostarNiños);
        btn_mostarNiños.setBounds(50, 390, 100, 40);

        btn_mostarAdultos.setBackground(new java.awt.Color(51, 51, 51));
        btn_mostarAdultos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_mostarAdultos.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostarAdultos.setText("Adultos");
        btn_mostarAdultos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_mostarAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostarAdultosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mostarAdultos);
        btn_mostarAdultos.setBounds(180, 390, 90, 40);

        btn_mostrarAncianos.setBackground(new java.awt.Color(51, 51, 51));
        btn_mostrarAncianos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_mostrarAncianos.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrarAncianos.setText("Ancianos");
        btn_mostrarAncianos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_mostrarAncianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarAncianosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mostrarAncianos);
        btn_mostrarAncianos.setBounds(300, 390, 90, 40);

        btn_salir.setBackground(new java.awt.Color(51, 51, 51));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir);
        btn_salir.setBounds(240, 260, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed
    //Funcion añadir
    protected void fnt_añadir(String nombre, String edad) {
    if (txt_nombre.getText().equals("") || txt_edad.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Debe llenar los campos");
    } else {
        try {
            int edadInt = Integer.parseInt(txt_edad.getText());

            if (edadInt >= 2 && edadInt <= 12) {
                pila_niño.push(nombre + " - Edad: " + edad);
                JOptionPane.showMessageDialog(null, "La persona: " + nombre + " de " + edad + " años ha sido registrada como niño con éxito");
            } else if (edadInt >= 15 && edadInt <= 25) {
                pila_adulto.push(nombre + " - Edad: " + edad);
                JOptionPane.showMessageDialog(null, "La persona: " + nombre + " de " + edad + " años ha sido registrada como adulto con éxito");
            } else if (edadInt >= 60 && edadInt <= 80) {
                pila_anciano.push(nombre + " - Edad: " + edad);
                JOptionPane.showMessageDialog(null, "La persona: " + nombre + " de " + edad + " años ha sido registrada como anciano con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La edad no cumple con los requisitos para ningún grupo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una edad válida");
        }
    }
}
    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
       fnt_añadir(txt_nombre.getText(), txt_edad.getText());
    }//GEN-LAST:event_btn_añadirActionPerformed
   //Mostrar pila niños
   protected void mostrarRegistrosNiños() {
    JOptionPane.showMessageDialog(null, "Registros de Niños: " + pila_niño.toString());
}
    private void btn_mostarNiñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostarNiñosActionPerformed
        mostrarRegistrosNiños();
    }//GEN-LAST:event_btn_mostarNiñosActionPerformed
    //Mostrar pila adultos
    protected void mostrarRegistrosAdultos() {
    JOptionPane.showMessageDialog(null, "Registros de Adulto: " + pila_adulto.toString());
}
    private void btn_mostarAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostarAdultosActionPerformed
        mostrarRegistrosAdultos();
    }//GEN-LAST:event_btn_mostarAdultosActionPerformed
    //Mostrar pila ancianos
      protected void mostrarRegistrosAncianos() {
    JOptionPane.showMessageDialog(null, "Registros de Ancianos: " + pila_anciano.toString());
}
    private void btn_mostrarAncianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarAncianosActionPerformed
        mostrarRegistrosAncianos();
    }//GEN-LAST:event_btn_mostrarAncianosActionPerformed
 //Eliminar ultimo registro de la pila de niños
    protected void eliminarUltimoRegistroNiños() {
    if (!pila_niño.isEmpty()) {
        pila_niño.pop();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el último registro de Niños");
    } else {
        JOptionPane.showMessageDialog(null, "La pila de Niños está vacía");
    }
}
    private void Btn_borrarNiñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_borrarNiñosActionPerformed
        eliminarUltimoRegistroNiños();
    }//GEN-LAST:event_Btn_borrarNiñosActionPerformed
    //Eliminar ultimo registro de la pila de adultos
    protected void eliminarUltimoRegistroAdultos() {
    if (!pila_adulto.isEmpty()) {
        pila_adulto.pop();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el último registro de Adultos");
    } else {
        JOptionPane.showMessageDialog(null, "La pila de Adultos está vacía");
    }
}
    private void btn_borrarAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarAdultosActionPerformed
        eliminarUltimoRegistroAdultos();
    }//GEN-LAST:event_btn_borrarAdultosActionPerformed
    //Eliminar ultimo registro de la pila de ancianos
    protected void eliminarUltimoRegistroAnciano() {
    if (!pila_anciano.isEmpty()) {
        pila_anciano.pop();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el último registro de Ancianos");
    } else {
        JOptionPane.showMessageDialog(null, "La pila de Ancianos está vacía");
    }
}
    private void btn_borrarAncianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarAncianosActionPerformed
        eliminarUltimoRegistroAnciano();
    }//GEN-LAST:event_btn_borrarAncianosActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VueloHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueloHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueloHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueloHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueloHuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_borrarNiños;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_borrarAdultos;
    private javax.swing.JButton btn_borrarAncianos;
    private javax.swing.JButton btn_mostarAdultos;
    private javax.swing.JButton btn_mostarNiños;
    private javax.swing.JButton btn_mostrarAncianos;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JLabel txt_nom;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
