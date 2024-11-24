import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

public class FrameDiary extends javax.swing.JFrame {
    
    private DefaultListModel modelList = new DefaultListModel<>(); // Model untuk menyimpan daftar catatan    

    // Konstruktor
    public FrameDiary() {
        initComponents();
        btnCari = new javax.swing.JButton();
        btnCari.setText("Cari");

        
        btnSortir = new javax.swing.JButton();
        btnSortir.setText("Sortir");

        jlist.setModel(modelList); // Hubungkan JList dengan model
        
        // Tambahkan listener untuk mendeteksi klik item di JList
        jlist.addListSelectionListener(evt -> jlistSelectionChanged(evt));
    }

    // Metode untuk menangani perubahan seleksi pada JList
private void jlistSelectionChanged(javax.swing.event.ListSelectionEvent evt) {
    if (!evt.getValueIsAdjusting()) { // Pastikan event selesai
        int selectedIndex = jlist.getSelectedIndex();
        if (selectedIndex >= 0) {
            // Ambil data dari model
            Data selectedData = (Data) modelList.get(selectedIndex);
            // Tampilkan isi catatan di textarea
            textarea.setText("Judul : " + selectedData.getJudul() + "\n\nIsi :\n" + selectedData.getIsi());
        }
    }
}
    // Menambahkan catatan baru
    private void tambahCatatan(String judul, String isi) {
        Data catatanBaru = new Data(judul, isi);
        modelList.addElement(catatanBaru);
    }

    // Mengedit catatan yang dipilih
    private void editCatatan(int index, String isiBaru) {
        if (index >= 0) {
            Data catatan = (Data) modelList.get(index);
            catatan.setIsi(isiBaru);
        }
    }

    // Menghapus catatan yang dipilih
    private void hapusCatatan(int index) {
        if (index >= 0) {
            modelList.remove(index);
        }
    }

    // Menyimpan catatan ke dalam file
    private void simpanKeFile(File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < modelList.size(); i++) {
                Data catatan = (Data) modelList.get(i);
                writer.write(catatan.getJudul() + ";" + catatan.getIsi());
                writer.newLine();
            }
        }
    }


    /**
     * Creates new form FrameDiary
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        tmbh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlist = new javax.swing.JList<>();
        edit = new javax.swing.JButton();
        hps = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnkeluar = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnSortir = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        textarea.setEditable(false);
        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        tmbh.setText("Tambah");
        tmbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbhActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jlist);

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hps.setText("Hapus");
        hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpsActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Aplikasi Catatan Harianku");

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnSortir.setText("Sortir");
        btnSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnSortir, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbh, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCari)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tmbh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hps, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari)
                            .addComponent(btnSortir))
                        .addGap(108, 108, 108))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbhActionPerformed
        String judul = JOptionPane.showInputDialog(this, "Masukkan Judul :");
        String isi = JOptionPane.showInputDialog(this, "Masukkan Isi :");
        if (judul != null && isi != null) {
            tambahCatatan(judul, isi);
        }
    }//GEN-LAST:event_tmbhActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int index = jlist.getSelectedIndex();
        if (index >= 0) {
            String isiBaru = JOptionPane.showInputDialog(this, "Masukkan Isi Baru :");
            if (isiBaru != null) {
                editCatatan(index, isiBaru);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih catatan yang ingin diubah!");
        }
    }//GEN-LAST:event_editActionPerformed

    private void hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpsActionPerformed
        int index = jlist.getSelectedIndex();
        if (index >= 0) {
            hapusCatatan(index);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih catatan yang ingin dihapus!");
        }
    }//GEN-LAST:event_hpsActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            File file = new File("catatan_harian.txt");
            simpanKeFile(file);
            JOptionPane.showMessageDialog(this, "Catatan berhasil disimpan ke file!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan: " + ex.getMessage());
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
    String keyword = txtCari.getText().trim();
    if (!keyword.isEmpty()) {
        boolean found = false;
        for (int i = 0; i < modelList.size(); i++) {
            Data catatan = (Data) modelList.get(i);
            if (catatan.getJudul().equalsIgnoreCase(keyword)) {
                textarea.setText("Judul : " + catatan.getJudul() + "\n\nIsi :\n" + catatan.getIsi());
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Catatan tidak ditemukan!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Masukkan judul untuk mencari!");
    }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortirActionPerformed
    java.util.List<Data> list = new java.util.ArrayList<>();
    for (int i = 0; i < modelList.size(); i++) {
        list.add((Data) modelList.get(i));
    }
    list.sort((c1, c2) -> c1.getJudul().compareToIgnoreCase(c2.getJudul()));
    modelList.clear();
    for (Data catatan : list) {
        modelList.addElement(catatan);
    }
    JOptionPane.showMessageDialog(this, "Catatan telah diurutkan berdasarkan judul!");
    }//GEN-LAST:event_btnSortirActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDiary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnSortir;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton edit;
    private javax.swing.JButton hps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> jlist;
    private javax.swing.JButton simpan;
    private javax.swing.JTextArea textarea;
    private javax.swing.JButton tmbh;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

}