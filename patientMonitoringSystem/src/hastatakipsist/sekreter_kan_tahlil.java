/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastatakipsist;

import Helper.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Helper.db;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.table.TableModel;

/**
 *
 * @author acer
 */
public class sekreter_kan_tahlil extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int columnsNumber = 0;

    /**
     * Creates new form KanTahlil
     */
    public sekreter_kan_tahlil() {
        initComponents();
        retrievetableKAN2();
        setSize(1500,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    private void retrievetableKAN(String TC) {
        try {

            DefaultTableModel tbl = (DefaultTableModel) tbl_kan.getModel();
            while (tbl.getRowCount() > 0) {
                tbl.removeRow(0);
            }

            conn = db.connection_db();
            String sql = "SELECT * FROM KanTahlil WHERE TC='" + TC + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            columnsNumber = rsmd.getColumnCount();

            String[] data = new String[columnsNumber];
            while (rs.next()) {
                for (int i = 0; i < data.length; i++) {
                    data[i] = rs.getString(i + 1);
                }

                DefaultTableModel tblModel = (DefaultTableModel) tbl_kan.getModel();
                tblModel.addRow(data);
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);

        } finally {
            try {
                conn.close();
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex);

            }
        }

    }

    private void retrievetableKAN2() {
        try {
            DefaultTableModel table = (DefaultTableModel) tbl_kan.getModel();
            while (table.getRowCount() > 0) {
                table.removeRow(0);
            }
            conn = db.connection_db();
            String sql = "select * from KanTahlil";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            columnsNumber = rsmd.getColumnCount();

            String[] data = new String[columnsNumber];
            while (rs.next()) {
                for (int i = 0; i < data.length; i++) {
                    data[i] = rs.getString(i + 1);
                }

                DefaultTableModel tableModel = (DefaultTableModel) tbl_kan.getModel();
                tableModel.addRow(data);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_kan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_demir = new javax.swing.JTextField();
        txt_tarih = new javax.swing.JTextField();
        txt_lym = new javax.swing.JTextField();
        txt_gray = new javax.swing.JTextField();
        txt_gran = new javax.swing.JTextField();
        txt_wbc = new javax.swing.JTextField();
        txt_lymy = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_rbc = new javax.swing.JTextField();
        txt_hgb = new javax.swing.JTextField();
        btn_kayit = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_mıd = new javax.swing.JTextField();
        txt_crp = new javax.swing.JTextField();
        txt_hct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_plt = new javax.swing.JTextField();
        btn_resetle = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        hasta_tc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        tc_arama = new javax.swing.JTextField();
        btn_tcbul = new javax.swing.JButton();
        btn_onceki_sayfa = new javax.swing.JButton();
        btn_oturumu_kapat = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setOpaque(false);

        jScrollPane4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane4.setEnabled(false);

        tbl_kan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TC", "Tarih", "Demir", "CRP", "WBC", "GRAN", "GRA%", "LYM", "LYM %", "MID", "RBC", "HGB", "HCT", "PLT"
            }
        ));
        tbl_kan.setAutoscrolls(false);
        tbl_kan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_kan.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tbl_kan.setIntercellSpacing(new java.awt.Dimension(1, 4));
        tbl_kan.setOpaque(false);
        tbl_kan.setRequestFocusEnabled(false);
        tbl_kan.getTableHeader().setReorderingAllowed(false);
        tbl_kan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_kan);

        jPanel4.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel20.setText("LABORATUVAR KAN TAHLİL SONUCU EKLEME");

        jPanel5.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("GRAN:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Tarih:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("GRA%:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TC:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("WBC:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Demir:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("CRP:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("LYM:");

        txt_demir.setToolTipText("");

        txt_tarih.setToolTipText("");

        txt_lym.setToolTipText("");

        txt_gray.setToolTipText("");

        txt_gran.setToolTipText("");

        txt_wbc.setToolTipText("");

        txt_lymy.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("MID:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("HGB:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("LYM%:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("HCT:");

        txt_rbc.setToolTipText("");

        txt_hgb.setToolTipText("");

        btn_kayit.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_kayit.setText("KAYIT ");
        btn_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitActionPerformed(evt);
            }
        });

        btn_sil.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_sil.setText("SİL");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        jLabel1.setText("RBC:");

        txt_mıd.setToolTipText("");

        txt_crp.setToolTipText("");

        txt_hct.setToolTipText("");

        jLabel2.setText("PLT:");

        txt_plt.setToolTipText("");

        btn_resetle.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_resetle.setText("RESETLE");
        btn_resetle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetleActionPerformed(evt);
            }
        });

        btn_guncelle.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_guncelle.setText("GÜNCELLE");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        hasta_tc.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hasta_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_gran, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_rbc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_gray, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_hgb, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btn_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_demir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 22, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_lym, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_hct, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_lymy, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_crp, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_wbc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_mıd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txt_plt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_resetle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_sil)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txt_demir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_wbc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_crp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(hasta_tc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_gran, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_gray, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_lym, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_lymy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(txt_mıd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rbc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_hgb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel1)
                    .addComponent(txt_hct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_plt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resetle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(406, 406, 406))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanel3.setOpaque(false);

        jLabel28.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel28.setText("TC :");

        btn_tcbul.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_tcbul.setText("BUL");
        btn_tcbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tcbulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tc_arama, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_tcbul, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tc_arama)
                    .addComponent(btn_tcbul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btn_onceki_sayfa.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_onceki_sayfa.setText("Önceki sayfa");
        btn_onceki_sayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_onceki_sayfaActionPerformed(evt);
            }
        });

        btn_oturumu_kapat.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_oturumu_kapat.setText("OTURUMU KAPAT");
        btn_oturumu_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oturumu_kapatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_onceki_sayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_oturumu_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_onceki_sayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_oturumu_kapat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 30, 1155, 573);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ıcon/Medical+Banner.jpg"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 0, 1500, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitActionPerformed
        if (txt_tarih.getText().length() == 0
                || txt_demir.getText().length() == 0
                || txt_wbc.getText().length() == 0
                || txt_gran.getText().length() == 0
                || txt_gray.getText().length() == 0
                || txt_lym.getText().length() == 0
                || txt_lymy.getText().length() == 0
                || txt_mıd.getText().length() == 0
                || txt_crp.getText().length() == 0
                || txt_rbc.getText().length() == 0
                || txt_hgb.getText().length() == 0
                || txt_hct.getText().length() == 0
                || txt_plt.getText().length() == 0) {

            helper.bosluk();

        } else {
            try {
                conn = db.connection_db();
                String sql = "insert into KanTahlil "
                        + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, hasta_tc.getText());
                pst.setString(2, txt_tarih.getText());
                pst.setString(3, txt_demir.getText());
                pst.setString(4, txt_crp.getText());
                pst.setString(5, txt_wbc.getText());
                pst.setString(6, txt_gran.getText());
                pst.setString(7, txt_gray.getText());
                pst.setString(8, txt_lym.getText());
                pst.setString(9, txt_lymy.getText());
                pst.setString(10, txt_mıd.getText());
                pst.setString(11, txt_rbc.getText());
                pst.setString(12, txt_hgb.getText());
                pst.setString(13, txt_hct.getText());
                pst.setString(14, txt_plt.getText());
                pst.executeUpdate();
                retrievetableKAN2();
                JOptionPane.showMessageDialog(null, "KAYIT BAŞARILI.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    pst.close();
                    conn.close();
                    resetle();
                } catch (Exception e) {

                }
            }
        }
    }//GEN-LAST:event_btn_kayitActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        if (!(hasta_tc.getText()).equals("")) {
            try {
                conn = db.connection_db();
                String sql = "DELETE FROM KanTahlil WHERE TC=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, hasta_tc.getText());
                pst.execute();
                retrievetableKAN2();
                resetle();
                JOptionPane.showMessageDialog(null, "Kayıt Silinmiştir !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {

                    conn.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SİLMEK İSTEDİĞİNİZ KAYDI SEÇİNİZ !");
        }
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_tcbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tcbulActionPerformed
        String HastaTC = "";
        String data = "";
        try {
            conn = db.connection_db();
            String sql = "SELECT * FROM KanTahlil WHERE TC=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tc_arama.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                HastaTC = rs.getString("TC");
                JOptionPane.showMessageDialog(null, "TC BULUNDU.");

            } else {
                JOptionPane.showMessageDialog(null, "TC BULUNAMADI !");
            }
        } catch (Exception ex) {

        }
        try {
            conn.close();
            retrievetableKAN(HastaTC);
        } catch (Exception ex) {

        }

        try {
            conn = db.connection_db();
            String sql = "SELECT * FROM KanTahlil WHERE TC=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tc_arama.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                data = rs.getString("TC");
                hasta_tc.setText(data);
                data = rs.getString("Tarih");
                txt_tarih.setText(data);
                data = rs.getString("Demir");
                txt_demir.setText(data);
                data = rs.getString("CRP");
                txt_crp.setText(data);
                data = rs.getString("WBC");
                txt_wbc.setText(data);
                data = rs.getString("GRAN");
                txt_gran.setText(data);
                data = rs.getString("GRAy");
                txt_gray.setText(data);
                data = rs.getString("LYM");
                txt_lym.setText(data);
                data = rs.getString("LYMy");
                txt_lymy.setText(data);
                data = rs.getString("MID");
                txt_mıd.setText(data);
                data = rs.getString("RBC");
                txt_rbc.setText(data);
                data = rs.getString("HGB");
                txt_hgb.setText(data);
                data = rs.getString("HCT");
                txt_hct.setText(data);
                data = rs.getString("PLT");
                txt_plt.setText(data);

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btn_tcbulActionPerformed

    private void tbl_kanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kanMouseClicked
        int i = tbl_kan.getSelectedRow();
        TableModel model = tbl_kan.getModel();
        hasta_tc.setText(model.getValueAt(i, 0).toString());
        txt_tarih.setText(model.getValueAt(i, 1).toString());
        txt_demir.setText(model.getValueAt(i, 2).toString());
        txt_crp.setText(model.getValueAt(i, 3).toString());
        txt_wbc.setText(model.getValueAt(i, 4).toString());
        txt_gran.setText(model.getValueAt(i, 5).toString());
        txt_gray.setText(model.getValueAt(i, 6).toString());
        txt_lym.setText(model.getValueAt(i, 7).toString());
        txt_lymy.setText(model.getValueAt(i, 8).toString());
        txt_mıd.setText(model.getValueAt(i, 9).toString());
        txt_rbc.setText(model.getValueAt(i, 10).toString());
        txt_hgb.setText(model.getValueAt(i, 11).toString());
        txt_hct.setText(model.getValueAt(i, 12).toString());
        txt_plt.setText(model.getValueAt(i, 13).toString());
    }//GEN-LAST:event_tbl_kanMouseClicked


    private void btn_onceki_sayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_onceki_sayfaActionPerformed
        this.dispose();
        sekreter_islem_secme s = new sekreter_islem_secme();
        s.setVisible(true);
    }//GEN-LAST:event_btn_onceki_sayfaActionPerformed

    private void btn_oturumu_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oturumu_kapatActionPerformed
        this.dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_btn_oturumu_kapatActionPerformed

    private void resetle() {
        tc_arama.setText("");
        hasta_tc.setText("");
        txt_tarih.setText("");
        txt_demir.setText("");
        txt_crp.setText("");
        txt_wbc.setText("");
        txt_gran.setText("");
        txt_gray.setText("");
        txt_lym.setText("");
        txt_lymy.setText("");
        txt_mıd.setText("");
        txt_rbc.setText("");
        txt_hgb.setText("");
        txt_hct.setText("");
        txt_plt.setText("");
    }

    private void btn_resetleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetleActionPerformed

        resetle();
        retrievetableKAN2();

    }//GEN-LAST:event_btn_resetleActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        try {
            conn = db.connection_db();
            String TC = hasta_tc.getText();
            String tarih = txt_tarih.getText();
            String demir = txt_demir.getText();
            String crp = txt_crp.getText();
            String wbc = txt_wbc.getText();
            String gran = txt_gran.getText();
            String gray = txt_gray.getText();
            String lym = txt_lym.getText();
            String lymy = txt_lymy.getText();
            String mıd = txt_mıd.getText();
            String rbc = txt_rbc.getText();
            String hgb = txt_hgb.getText();
            String hct = txt_hct.getText();
            String plt = txt_plt.getText();

            String sql = "UPDATE KanTahlil SET  TC='" + TC + "',Tarih='" + tarih + "',Demir='" + demir + "',"
                    + "CRP='" + crp + "',WBC='" + wbc + "',GRAN='" + gran + "',"
                    + "GRAy='" + gray + "',LYM='" + lym + "',"
                    + "LYMy='" + lymy + "',MID='" + mıd + "',"
                    + "RBC='" + rbc + "',HGB='" + hgb + "',"
                    + "HCT='" + hct + "',PLT='" + plt + "' WHERE TC='" + TC + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            retrievetableKAN2();
            JOptionPane.showMessageDialog(null, "KAYIT GÜNCELLENMİŞTİR.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {

                conn.close();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }
        }


    }//GEN-LAST:event_btn_guncelleActionPerformed

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
            java.util.logging.Logger.getLogger(sekreter_kan_tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sekreter_kan_tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sekreter_kan_tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sekreter_kan_tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sekreter_kan_tahlil().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_kayit;
    private javax.swing.JButton btn_onceki_sayfa;
    private javax.swing.JButton btn_oturumu_kapat;
    private javax.swing.JButton btn_resetle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_tcbul;
    private javax.swing.JTextField hasta_tc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_kan;
    private javax.swing.JTextField tc_arama;
    private javax.swing.JTextField txt_crp;
    private javax.swing.JTextField txt_demir;
    private javax.swing.JTextField txt_gran;
    private javax.swing.JTextField txt_gray;
    private javax.swing.JTextField txt_hct;
    private javax.swing.JTextField txt_hgb;
    private javax.swing.JTextField txt_lym;
    private javax.swing.JTextField txt_lymy;
    private javax.swing.JTextField txt_mıd;
    private javax.swing.JTextField txt_plt;
    private javax.swing.JTextField txt_rbc;
    private javax.swing.JTextField txt_tarih;
    private javax.swing.JTextField txt_wbc;
    // End of variables declaration//GEN-END:variables
}
