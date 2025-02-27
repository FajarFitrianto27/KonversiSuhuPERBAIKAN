/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author User
 */
public class KonversiSuhuForm extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuForm
     */
    public KonversiSuhuForm() {
        initComponents();
        
    // Inisialisasi lainnya...

    // Tambahkan KeyListener untuk membatasi input hanya angka
    txtSuhu.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent evt) {
            // Memeriksa apakah karakter yang dimasukkan adalah angka atau titik
            if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
                evt.consume(); // Menolak input jika bukan angka atau titik
            }
        }
    });
    }
 public double konversiSuhu(double suhu, String dari, String ke) {
    // Implementasikan rumus konversi
    if (dari.equals("Celsius") && ke.equals("Fahrenheit")) {
        return (suhu * 9 / 5) + 32;
    } else if (dari.equals("Fahrenheit") && ke.equals("Celsius")) {
        return (suhu - 32) * 5 / 9;
    }
    // Tambahkan logika untuk konversi lainnya sesuai kebutuhan
    return suhu; // Jika tidak ada konversi yang cocok, kembalikan suhu asli
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
        txtSuhu = new javax.swing.JTextField();
        comboBoxSuhu = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        hasil = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Masukkan Suhu");

        comboBoxSuhu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Reamur", "Kelvin" }));
        comboBoxSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuhuActionPerformed(evt);
            }
        });

        jButton1.setText("Konversi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hasil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jRadioButton1.setText("Celsius ke Fahrenheit");

        jRadioButton2.setText("Fahrenheit ke Celsius");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1))
                    .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jRadioButton1)
                .addGap(17, 17, 17)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuhuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String suhuText = txtSuhu.getText(); // Ambil teks dari txtSuhu

    // Cek apakah input kosong
    if (suhuText.isEmpty()) {
        hasil.setText("Input tidak boleh kosong!"); // Tampilkan pesan kesalahan
        return; // Keluar dari metode jika input kosong
    }

    try {
        double suhu = Double.parseDouble(suhuText); // Konversi ke double
        String dari = comboBoxSuhu.getSelectedItem().toString();
        String ke = ""; // Anda perlu menentukan nilai ini berdasarkan pilihan konversi

        // Menentukan nilai 'ke' berdasarkan pilihan radio button
        if (jRadioButton1.isSelected()) {
            ke = "Fahrenheit"; // Jika radio button untuk Celsius ke Fahrenheit dipilih
        } else if (jRadioButton2.isSelected()) {
            ke = "Celsius"; // Jika radio button untuk Fahrenheit ke Celsius dipilih
        } else {
            hasil.setText("Pilih jenis konversi!"); // Jika tidak ada pilihan radio button
            return;
        }

        // Lakukan konversi suhu
        double hasilKonversi = konversiSuhu(suhu, dari, ke);
        
        // Tampilkan hasil konversi di JLabel
        hasil.setText("Hasil: " + hasilKonversi);
    } catch (NumberFormatException e) {
        hasil.setText("Input tidak valid!"); // Tampilkan pesan kesalahan jika input tidak valid
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxSuhu;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
