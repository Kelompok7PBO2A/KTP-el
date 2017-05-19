/*
 Bismillah semoga codingku lancar. Amin
 */
package projectkel7;
import java.util.ArrayList;
import javax.swing.RowFilter;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;


public class design extends javax.swing.JFrame {
    ArrayList<Data> KelART1 = new ArrayList<>();
    ArrayList<Data> KelART2 = new ArrayList<>();
    ArrayList<Data> KelART3 = new ArrayList<>();
    ArrayList<Data> KelART4 = new ArrayList<>();
    ArrayList<Data> KelBRT1 = new ArrayList<>();
    ArrayList<Data> KelBRT2 = new ArrayList<>();
    ArrayList<Data> KelBRT3 = new ArrayList<>();
    ArrayList<Data> KelBRT4 = new ArrayList<>();
DefaultTableModel dm;



    public design() {
        setTitle("Program e-KTP");
        initComponents();
        BuatKolom();
      
    }
    

    
     private void search (String query){
        TableRowSorter<DefaultTableModel> tabr=new TableRowSorter<DefaultTableModel>(dm);
        Tabel.setRowSorter(tabr);
          tabr.setRowFilter(RowFilter.regexFilter(query));
    }
     
    private void BuatKolom(){
      dm=(DefaultTableModel) Tabel.getModel();
      dm.addColumn("Nik");
      dm.addColumn("Nama");
      dm.addColumn("TTL");
      dm.addColumn("JenisKelamin");
      dm.addColumn("Golongan Darah");
      dm.addColumn("Alamat");
      dm.addColumn("KELURAHAN");
      dm.addColumn("RT");
      dm.addColumn("Agama");
      dm.addColumn("Status Perkawinan");
      dm.addColumn("Pekerjaan");
      dm.addColumn("Kewarganegaraan");
      dm.addColumn("Berlaku Hingga");
 
    }
    private void clear(){
        fnik.setText("");
        fnama.setText("");
        fttl.setText("");
        fjeniskelamin.setText("");
        fgoldarah.setText("");
        falamat.setText("");
        fagama.setText("");
        fstatusperkawinan.setText("");
        fpekerjaan.setText("");
        fkewarganegaraan.setText("");
        fberlakuhingga.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fnik = new javax.swing.JTextField();
        fnama = new javax.swing.JTextField();
        fttl = new javax.swing.JTextField();
        falamat = new javax.swing.JTextField();
        fpekerjaan = new javax.swing.JTextField();
        fkewarganegaraan = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fKelurahanB = new javax.swing.JRadioButton();
        fKelurahanA = new javax.swing.JRadioButton();
        rt1 = new javax.swing.JRadioButton();
        rt2 = new javax.swing.JRadioButton();
        rt3 = new javax.swing.JRadioButton();
        rt4 = new javax.swing.JRadioButton();
        fjeniskelamin = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fgoldarah = new javax.swing.JTextField();
        fagama = new javax.swing.JTextField();
        fstatusperkawinan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fberlakuhingga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NIK");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tempat/Tanggal Lahir");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("RT");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kelurahan");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Agama");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Status Perkawinan");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pekerjaan");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Kewarganegaraan");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Input Data KTP-el");

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(fKelurahanB);
        fKelurahanB.setText("KelurahanB");

        buttonGroup2.add(fKelurahanA);
        fKelurahanA.setText("KelurahanA");
        fKelurahanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fKelurahanAActionPerformed(evt);
            }
        });

        buttonGroup3.add(rt1);
        rt1.setText("Rt1");

        buttonGroup3.add(rt2);
        rt2.setText("Rt2");
        rt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(rt3);
        rt3.setText("Rt4");

        buttonGroup3.add(rt4);
        rt4.setText("Rt3");

        fjeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fjeniskelaminActionPerformed(evt);
            }
        });

        jLabel16.setText("Gol Darah");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Berlaku Hingga");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("*ketika disimpan , data akan tampil di tab output data*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(fKelurahanA)
                                .addGap(9, 9, 9)
                                .addComponent(fKelurahanB))
                            .addComponent(fnik)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel14))
                            .addComponent(fttl, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(falamat)
                            .addComponent(fpekerjaan)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(fjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(fgoldarah, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rt1)
                                .addGap(18, 18, 18)
                                .addComponent(rt2)
                                .addGap(18, 18, 18)
                                .addComponent(rt4)
                                .addGap(18, 18, 18)
                                .addComponent(rt3))
                            .addComponent(fagama)
                            .addComponent(fstatusperkawinan)
                            .addComponent(fkewarganegaraan)
                            .addComponent(fberlakuhingga)
                            .addComponent(fnama))))
                .addGap(343, 343, 343))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(fttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(fgoldarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(falamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fKelurahanB)
                            .addComponent(jLabel9)
                            .addComponent(fKelurahanA))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rt1)
                            .addComponent(rt2)
                            .addComponent(rt4)
                            .addComponent(rt3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(fagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fstatusperkawinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fkewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fberlakuhingga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input Data", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabel);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Output Data KTP-el");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("NIK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(search))
                        .addGap(116, 116, 116))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(4, 4, 4)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Output Data", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Data data = new Data();
      data.setNik(fnik.getText());
      data.setNama(fnama.getText());
      data.setTtl(fttl.getText());
      data.setJeniskelamin(fjeniskelamin.getText());
      data.setGoldarah(fgoldarah.getText());
      data.setAlamat(falamat.getText());
      data.setAgama(fagama.getText());
      data.setStatusperkawinan(fstatusperkawinan.getText());
      data.setPekerjaan(fpekerjaan.getText());
      data.setKewarganegaraan(fkewarganegaraan.getText());
      data.setBerlakuhingga(fberlakuhingga.getText());
      if(fKelurahanA.isSelected()){
          if(rt1.isSelected()){
              data.setKelurahan("A");
              data.setRt("1");
          KelART1.add(data);
          
          for (Data isi :KelART1){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan A", "RT1",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                int i=0;
                KelART1.remove(i);
                clear(); 
                
          }
          }
          if(rt2.isSelected()){
              data.setKelurahan("A");
              data.setRt("2");
          KelART2.add(data);
         
          for (Data isi :KelART2){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan A", "RT2",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                int i=0;
                KelART2.remove(i); 
                clear(); 
          }
          }
          if(rt3.isSelected()){
              data.setKelurahan("A");
              data.setRt("3");
          KelART3.add(data);
         
          for (Data isi :KelART3){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan A", "RT3",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                    int i=0;
                    KelART3.remove(i);  
                    clear(); 
          }
          }
          if(rt4.isSelected()){
              data.setKelurahan("A");
              data.setRt("4");
          KelART4.add(data);
          
          for (Data isi :KelART4){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan A", "RT4",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                    int i=0;
                    KelART4.remove(i);
                    clear(); 
          }
          }
      }
      if(fKelurahanB.isSelected()){
          if(rt1.isSelected()){
              data.setKelurahan("B");
              data.setRt("1");
          KelBRT1.add(data);
         
          for (Data isi :KelBRT1){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan B", "RT1",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                    int i=0;
                    KelBRT1.remove(i);
                    clear(); 
          }
          }
          if(rt2.isSelected()){
              data.setKelurahan("B");
              data.setRt("2");
          KelBRT2.add(data);
          
          for (Data isi :KelBRT2){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan B", "RT2",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                    int i=0;
                    KelBRT2.remove(i);
                    clear(); 
          }
          }
          if(rt3.isSelected()){
              data.setKelurahan("B");
              data.setRt("3");
          KelBRT3.add(data);
          
          for (Data isi :KelBRT3){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan B", "RT3",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                    int i=0;
                    KelBRT3.remove(i);
                    clear(); 
          }
          }
          if(rt4.isSelected()){
              data.setKelurahan("B");
              data.setRt("4");
          KelBRT4.add(data);
         
          for (Data isi :KelBRT4){
                    datakolom(isi.getNik(), isi.getNama(),isi.getTtl(), isi.getJeniskelamin(), isi.getGoldarah(), isi.getAlamat(), "Kelurahan B", "RT4",isi.getAgama(), isi.getStatusperkawinan(), isi.getPekerjaan(),isi.getKewarganegaraan(),isi.getBerlakuhingga());
                    int i=0;
                    KelBRT4.remove(i);
                    clear(); 
          }
          }
      }
          
                        
    }//GEN-LAST:event_jButton1ActionPerformed
  
    
    private void datakolom(String knik, String knama, String kttl, String kjeniskelamin, String kgoldarah
        , String kalamat,String kkelurahan, String krt, String kagama, String kstatusperkawinan, String kpekerjaan, String kkewarganegaraan, String kberlakuhingga){
        String[] rowData={knik, knama, kttl, kjeniskelamin, kgoldarah
        , kalamat,kkelurahan, krt, kagama, kstatusperkawinan, kpekerjaan, kkewarganegaraan, kberlakuhingga};
        dm.addRow(rowData);}
   
    /**/
    private void rt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rt2ActionPerformed

    private void fKelurahanAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fKelurahanAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fKelurahanAActionPerformed

    private void fjeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fjeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fjeniskelaminActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       String query=Search.getText().toLowerCase();
        search(query);
    }//GEN-LAST:event_searchActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed
           
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
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            @Override
            public void run() {
                new design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search;
    private javax.swing.JTable Tabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton fKelurahanA;
    private javax.swing.JRadioButton fKelurahanB;
    private javax.swing.JTextField fagama;
    private javax.swing.JTextField falamat;
    private javax.swing.JTextField fberlakuhingga;
    private javax.swing.JTextField fgoldarah;
    private javax.swing.JTextField fjeniskelamin;
    private javax.swing.JTextField fkewarganegaraan;
    private javax.swing.JTextField fnama;
    private javax.swing.JTextField fnik;
    private javax.swing.JTextField fpekerjaan;
    private javax.swing.JTextField fstatusperkawinan;
    private javax.swing.JTextField fttl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rt1;
    private javax.swing.JRadioButton rt2;
    private javax.swing.JRadioButton rt3;
    private javax.swing.JRadioButton rt4;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
