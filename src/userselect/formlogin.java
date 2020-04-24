
package userselect;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class formlogin extends javax.swing.JFrame {

String k;
String p;



    public formlogin() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pa = new javax.swing.JPasswordField();
        us = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        admin1 = new javax.swing.JLabel();
        admin2 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        user2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pa.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        pa.setForeground(new java.awt.Color(255, 255, 255));
        pa.setBorder(null);
        pa.setCaretColor(new java.awt.Color(255, 255, 255));
        pa.setOpaque(false);
        getContentPane().add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 364, 230, 30));

        us.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        us.setForeground(new java.awt.Color(255, 255, 255));
        us.setBorder(null);
        us.setCaretColor(new java.awt.Color(255, 255, 255));
        us.setOpaque(false);
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 299, 230, 30));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 9, 9));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 9, 9));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userselect/image/keep me sign in.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 98, 10));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 11, 30, 29));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 11, 28, 29));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userselect/image/SIGN IN.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 438, 265, 33));

        admin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        admin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                admin1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                admin1MouseReleased(evt);
            }
        });
        getContentPane().add(admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 232, 101, 24));

        admin2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        admin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin2MouseClicked(evt);
            }
        });
        getContentPane().add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 232, 101, 24));

        user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userselect/image/u.png"))); // NOI18N
        user1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                user1MouseReleased(evt);
            }
        });
        getContentPane().add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 232, 101, 24));

        user2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user2MouseClicked(evt);
            }
        });
        getContentPane().add(user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 232, 101, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userselect/image/vs.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 540));

        setSize(new java.awt.Dimension(350, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/x2.png"));
        jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/x.png"));
        jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/x3.png"));
        jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(formlogin.ICONIFIED);
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/_.png"));
        jLabel3.setIcon(A);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/_2.png"));
        jLabel3.setIcon(A);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/_.png"));
        jLabel3.setIcon(A);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/_3.png"));
        jLabel3.setIcon(A);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/_.png"));
        jLabel3.setIcon(A);
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/SIGN IN 1.png"));
        jLabel7.setIcon(A);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/SIGN IN.png"));
        jLabel7.setIcon(A);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/SIGN IN 2.png"));
        jLabel7.setIcon(A);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/SIGN IN.png"));
        jLabel7.setIcon(A);
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Connection kon = filekoneksi.koneksiDb();
        String sql = "SELECT * FROM user where username = '"+us.getText()+"' and password = '"+pa.getText()+"'";
        String sq = "SELECT * FROM admin where username = '"+us.getText()+"' and password = '"+pa.getText()+"'";
    if(null == k) {
        JOptionPane.showMessageDialog(null, "SELECT USER OR ADMIN FOR LOGIN");
    }else switch (k) {
        case "USER":
            try {
                Statement st = kon.createStatement();
                ResultSet rs = st.executeQuery(sql);
                
                if(rs.next()){
                    System.out.println("USER");
                    U g = new U();
                    g.setVisible(true);
                    us.setText("");
                    pa.setText("");
                    us.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "USER O PASSWORD INCORRECTOS INTENTE DE NUEVO");
                    us.setText("");
                    pa.setText("");
                    us.requestFocus();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
            break;
        case "ADMIN":
            try {
                Statement st = kon.createStatement();
                ResultSet rs = st.executeQuery(sq);
                
                if(rs.next()){
                    System.out.println("ADMIN");
                    A j = new A();
                    j.setVisible(true);
                    us.setText("");
                    pa.setText("");
                    us.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "ADMIN O PASSWORD INCORRECTOS INTENTE DE NUEVO");
                    us.setText("");
                    pa.setText("");
                    us.requestFocus();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
            break;
        default:
            break;
    }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void user1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseReleased
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MouseReleased

    private void user1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MousePressed
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u2.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MousePressed

    private void user1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseExited
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MouseExited

    private void user1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u1.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MouseEntered

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        ImageIcon AA = new ImageIcon(getClass().getResource("/userselect/image/u2.png"));
        user2.setIcon(AA);
        
        user1.setEnabled(false);
        user1.setVisible(false);
        user2.setEnabled(true);
        user2.setVisible(true);
        admin1.setEnabled(false);
        admin2.setEnabled(false);
        admin1.setVisible(false);
        admin2.setVisible(false);
        
        user1.setText("USER");
        k = user1.getText();
        System.out.println(k);
    }//GEN-LAST:event_user1MouseClicked

    private void admin1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseReleased
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MouseReleased

    private void admin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MousePressed
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a2.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MousePressed

    private void admin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseExited
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MouseExited

    private void admin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a1.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MouseEntered

    private void admin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseClicked
        ImageIcon AB = new ImageIcon(getClass().getResource("/userselect/image/a2.png"));
        admin2.setIcon(AB);
        
        admin1.setEnabled(false);
        admin1.setVisible(false);
        admin2.setEnabled(true);
        admin2.setVisible(true);
        user1.setEnabled(false);
        user1.setVisible(false);
        user2.setEnabled(false);
        user2.setVisible(false);
        
        admin1.setText("ADMIN");
        k = admin1.getText();
    }//GEN-LAST:event_admin1MouseClicked

    private void user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user2MouseClicked
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u.png"));
        user1.setIcon(A);
        
        user1.setEnabled(true);
        user1.setVisible(true);
        user2.setEnabled(false);
        user2.setVisible(false);
        admin1.setEnabled(true);
        admin2.setEnabled(true);
        admin1.setVisible(true);
        admin2.setVisible(true);
        
        user1.setText("");
        k = user1.getText();
        
    }//GEN-LAST:event_user2MouseClicked

    private void admin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin2MouseClicked
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a.png"));
        admin1.setIcon(A);
        
        admin2.setEnabled(false);
        admin2.setVisible(false);
        admin1.setEnabled(true);
        admin1.setVisible(true);
        user1.setEnabled(true);
        user1.setVisible(true);
        user2.setEnabled(true);
        user2.setVisible(true);
        
        admin1.setText("");
        k = admin1.getText();
    }//GEN-LAST:event_admin2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/keep me sign in.png"));
        jLabel4.setIcon(A);

        jLabel6.setEnabled(false);
        jLabel6.setVisible(false);
        jLabel5.setEnabled(true);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/keep me sign in copy.png"));
        jLabel4.setIcon(A);

        jLabel6.setEnabled(true);
        jLabel6.setVisible(true);
        jLabel5.setEnabled(false);
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

   
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
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin1;
    private javax.swing.JLabel admin2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pa;
    private javax.swing.JTextField us;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    // End of variables declaration//GEN-END:variables
}
