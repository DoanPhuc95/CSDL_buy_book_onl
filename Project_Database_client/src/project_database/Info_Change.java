/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Info_Change extends javax.swing.JFrame {
    static private InterFace inter;
    static String strName,strSex,str_pWord,str_repWord,strDate,strMon,strYear,strE,strPhone,strA;
    static private Client client;
    static private Thanh_vien tv;
    SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat b_day = new SimpleDateFormat("yyyy-MM-dd");
    Date d = null;
    Date td= null;
    static private String maDG,ngaySinh;
    public Info_Change(String madg,String tendg , String diachi , String ngaysinh , String gioitinh , String email, String dienthoai,Client client,Thanh_vien tv,InterFace inter) {
        this.inter =inter;
        this.client = client;
        this.tv =tv ;
        this.strE = email;
        this.strName  = tendg;
        this.strA = diachi;
        this.ngaySinh = ngaysinh;
        this.strSex = gioitinh;
        this.strPhone = dienthoai;
        this.maDG = madg;
        initComponents();
        Name.setText(strName);
        Address.setText(strA);
        Email.setText(strE);
        PhoneNum.setText(strPhone);
        Year.setText(ngaysinh.substring(0,4));
        Month.setText(ngaysinh.substring(5, 7));
        Date.setText(ngaysinh.substring(8, 10));
        if(strSex.compareTo("Nam")==0)
            Sex.setSelectedIndex(1);
        else 
            Sex.setSelectedIndex(2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Sex = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        PhoneNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Month = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pWord = new javax.swing.JPasswordField();
        re_pWord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng ký");
        setResizable(false);

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel2.setText("Họ và tên (*)");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Mật khẩu(*)");

        jLabel5.setText("Nhập lại mật khẩu (*)");

        jLabel7.setText("Ngày sinh(*)");

        jLabel8.setText("Địa chỉ email (*)");

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        Sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Lựa chọn--", "Nam", "Nữ" }));

        jLabel9.setText("Số điện thoại(*)");

        PhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumActionPerformed(evt);
            }
        });

        jButton1.setText("Đăng ký");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hủy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Địa chỉ (*)");

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("-");

        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");

        pWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pWordActionPerformed(evt);
            }
        });

        re_pWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_pWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PhoneNum, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Year, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pWord, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(re_pWord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(Sex, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(re_pWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(PhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_AddressActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_NameActionPerformed

    private void PhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_PhoneNumActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_DateActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_YearActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_MonthActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        strName= Name.getText().trim();
        strSex= (String) Sex.getSelectedItem();
        str_pWord= pWord.getText().trim();
        str_repWord= re_pWord.getText().trim();
        strDate = Date.getText().trim();
        strMon = Month.getText().trim();
        strYear = Year.getText().trim();
        strE = Email.getText().trim();
        strPhone= PhoneNum.getText().trim();
        strA = Address.getText().trim();
        if(KT_date()==true)
        {
            if(KiemTra()==true)
            {
                System.out.println(today.format(d));
                String query1 = "update \"DocGia\" set \"HoTen\" = '"+strName+"', \"GioiTinh\" = '"+strSex
                        +"',\"NgaySinh\"='"+today.format(d)+"',\"DienThoai\"='"+strPhone+
                        "',\"Email\"='"+strE+"',\"DiaChi\"='"+strA+"' where \"MaDocGia\"='"+maDG+"'";
                String query2="update \"Account\" set \"Password\" = '"+str_pWord+"' where \"MaDocGia\" = '"+maDG+"'";
                
                client.status = false;
                client.SEND("ChangeINFO");
                client.SEND(query1);
                client.SEND(query2);
                while(client.status==false) System.out.println("waiting...");
                if(client.thongbao.compareTo("OK")==0)
                {
                    JOptionPane.showMessageDialog(null, "Bạn đã thay đổi thông tin thành công !!");
                    tv.nameView.setText(strName);
                    tv.sexView.setText(strSex);
                    tv.birthdayView.setText(today.format(d));
                    tv.addressView.setText(strA);
                    tv.emailView.setText(strE);
                    tv.phoneView.setText(strPhone);
                    client.DocGia[1]=strName;
                    client.DocGia[2]=strSex;
                    client.DocGia[3]=today.format(d);
                    client.DocGia[4]=strE;
                    client.DocGia[5]=strA;
                    client.DocGia[6]=strPhone;
                    inter.jLabel3.setText("Xin chào "+client.DocGia[1]);
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, client.thongbao);
            }
        }
        else JOptionPane.showMessageDialog(null,"Nhập thông tin sai hoặc thiếu !!!");            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pWordActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_pWordActionPerformed

    private void re_pWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_pWordActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_re_pWordActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_EmailActionPerformed

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
            java.util.logging.Logger.getLogger(Info_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info_Change(maDG ,strName , strA , ngaySinh , strSex , strE,strPhone,client,tv,inter).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PhoneNum;
    private javax.swing.JComboBox Sex;
    private javax.swing.JTextField Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pWord;
    private javax.swing.JPasswordField re_pWord;
    // End of variables declaration//GEN-END:variables
    private boolean KT_date()
    {
        try
        {
            Integer.parseInt(strDate);
            Integer.parseInt(strMon);
            Integer.parseInt(strYear);
            String ngaysinh = Integer.parseInt(strYear.trim())+"-"+Integer.parseInt(strMon.trim())
                    +"-" +Integer.parseInt(strDate.trim());
            try {
                d = b_day.parse(ngaysinh);
                td = today.parse(today.format(new Date()));
        } catch (ParseException ex) {
            return false;
        }
            return d.getTime()<td.getTime();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    private boolean KT_phone(String s)
    {
        String s1= s;
        if(s.charAt(0)=='+'||(s.charAt(0)>='0'||s.charAt(0)<='9')==true){
            try{
                Integer.parseInt(s1);
                return true;
            }catch(Exception e)
            {
                return false;
            }
        }
        else
            return false;
    }
    private boolean KT_null(String s)
    {
        return s.compareTo("")!=0;
    }
    private boolean KiemTra()
    {
        if(KT_null(strName)&&KT_null(str_pWord)&&KT_null(str_repWord)&&KT_null(strE)&&KT_null(strA)&&KT_null(strPhone)==true)
        {
            if(strSex.compareTo("--Lựa chọn--")==0)
            {
                JOptionPane.showMessageDialog(null,"Nhập thông tin sai hoặc thiếu !!!");
                return false;
            }
            if(str_pWord.compareTo(str_repWord)!=0)
            {
                JOptionPane.showMessageDialog(null,"Nhập mật khẩu không chính xác !!!");
                return false;
            }
            if(str_pWord.length()<6)
            {
                JOptionPane.showMessageDialog(null,"Mật khẩu cần tiếu thiểu 6 kí tự !!!");
                return false;
            }
            if(KT_phone(strPhone)==false)
            {
                JOptionPane.showMessageDialog(null, "Số điện thoại không đúng !!");
                return false;
            }
            return true;
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Nhập thông tin sai hoặc thiếu !!!");
            return false;
        }
    }
}
