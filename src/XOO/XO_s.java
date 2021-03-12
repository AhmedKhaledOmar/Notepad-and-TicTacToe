/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XOO;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;



public class XO_s extends javax.swing.JFrame {
 
    private String StartGame="X";
    private int Xcount=0;
    private int Ocount=0;
    
    
    public XO_s() {
      
        initComponents();
      setSize(1200,600) ;
        setLocationRelativeTo(null) ;
        setVisible(true);
        
    }
    private void GameScore()
    {
        jplplayerx.setText(String.valueOf(Xcount)) ;
        jplplayero.setText(String.valueOf(Ocount)) ;
    }
                
             private void choose_a_player ()
             {
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                     StartGame="O" ;
                 }
                 else
                 {
                     StartGame="X" ;
                 }

                 
             }
                
                private void winnigGame ()
                {
                    boolean x=false;
                    String b1=jButton1.getText() ;
                    String b2=jButton2.getText() ;
                    String b12=jButton12.getText() ;
                        
                    String b6=jButton6.getText() ;
                    String b5=jButton5.getText() ;
                    String b13=jButton13.getText() ;
                              
                    String b9=jButton9.getText() ;
                    String b8=jButton8.getText() ;
                    String b7=jButton7.getText() ;
           
          
                          
                           
                 
                 if (b1==("X")&&b2==("X")&&b12==("X")) 
                 {
                       x=true;
                     JOptionPane.showMessageDialog(this,"player X Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Xcount++ ;
                     GameScore() ;
                    jButton1.setBackground(Color.yellow);
                     jButton2.setBackground(Color.yellow);
                     jButton12.setBackground(Color.yellow);
                    
                     jptnReset();
            
                 
                }
                 else if (b1==("O")&&b2==("O")&&b12==("O"))
                      {
                            x=true;
                     JOptionPane.showMessageDialog(this,"player O Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Ocount++ ;
                     GameScore() ;
                  
                     jptnReset();
           
                } 
                 if (b6==("X")&&b5==("X")&&b13==("X")) 
                 {
                       x=true;
                     JOptionPane.showMessageDialog(this,"player X Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Xcount++ ;
                     GameScore() ;
                
              
                     jptnReset();
                
                }
                 else if (b6==("O")&&b5==("O")&&b13==("O")) 
                 {
                     x=true;
                     JOptionPane.showMessageDialog(this,"player O Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Ocount++ ;
                     GameScore() ;
                   
              
                     jptnReset();
             
                }
                 if (b9==("X")&&b8==("X")&&b7==("X")) 
                 {
                      x=true;
                     JOptionPane.showMessageDialog(this,"player X Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Xcount++ ;
                     GameScore() ;
                   
                
                     jptnReset();
    
                }
                 else if (b9==("O")&&b8==("O")&&b7==("O")) 
                      {
                           x=true;
                     JOptionPane.showMessageDialog(this,"player O Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Ocount++ ;
                     GameScore() ;
                
                     jptnReset();
          
                }
                  if (b1==("X")&&b6==("X")&&b9==("X")) 
                 {
                       x=true;
                     JOptionPane.showMessageDialog(this,"player X Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Xcount++ ;
                     GameScore() ;
               
               
                     jptnReset();
           
                }
                  if  (b1==("O")&&b6==("O")&&b9==("O")) 
                 {
                       x=true;
                     JOptionPane.showMessageDialog(this,"player O Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Ocount++ ;
                     GameScore() ;
               
              
                     jptnReset();
             
                }
                    if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
                       x=true;
                        JOptionPane.showMessageDialog(this, "player X Wins", "XO", JOptionPane.INFORMATION_MESSAGE);
                        Xcount++;
                        GameScore();
                   
             
                        jptnReset();
               
                    }
                     if (b2 == ("O") && b5 == ("O") && b8 == ("O"))
                    {
                         x=true;
                        JOptionPane.showMessageDialog(this, "player O Wins", "XO", JOptionPane.INFORMATION_MESSAGE);
                        Ocount++;
                        GameScore();
                      
                        jptnReset();
                         
             
                    }
                    
                     if (b12==("X")&&b13==("X")&&b7==("X")) 
                 {
                      x=true;
                     JOptionPane.showMessageDialog(this,"player X Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Xcount++ ;
                     GameScore() ;
            
               
                     jptnReset();
         
                }
                      if (b12==("O")&&b13==("O")&&b7==("O")) 
                 {
                      x=true;
                     JOptionPane.showMessageDialog(this,"player O Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Ocount++ ;
                     GameScore() ;
              
               
                     jptnReset();
                
                }
                      if (b1==("X")&&b5==("X")&&b7==("X")) 
                 {
                     x=true;
                     JOptionPane.showMessageDialog(this,"player X Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Xcount++ ;
                     GameScore() ;
                
                     jptnReset();
                 
                }
                     if (b1==("O")&&b5==("O")&&b7==("O")) 
                 { x=true;
                     JOptionPane.showMessageDialog(this,"player O Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Ocount++ ;
                     GameScore() ;
                
                
                     jptnReset();
           
                }
                      if (b12==("X")&&b5==("X")&&b9==("X")) 
                 {
                       x=true;
                     JOptionPane.showMessageDialog(this,"player X Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Xcount++ ;
                     GameScore() ;
                
             
                     jptnReset();
           
                }
                    if (b12==("O")&&b5==("O")&&b9==("O")) 
                 {
                     x=true;
                     JOptionPane.showMessageDialog(this,"player O Wins","XO",  JOptionPane.INFORMATION_MESSAGE);
                     Ocount++ ;
                     GameScore() ;
               
                     
                     jptnReset();
                   
                     
                    
                    
                 
               
                }
            if (b1 !=("") && b2 !=("") && b12 !=("") &&b6 !=("") &&b5 !=("") &&b13!=("") &&b9 !=("") &&b8 !=("") &&b7 !=("")&&x == false)
                 {
                    JOptionPane.showMessageDialog(this,"NO ONE WINS","XO",  JOptionPane.INFORMATION_MESSAGE);
                     jptnReset();
                     
                 }  
                
                     
        
                }
                
                
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jplplayerx = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jplplayero = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jptnReset = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jptnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XO");
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XO");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jplplayerx.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jplplayerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jplplayerx.setText("0");
        jPanel17.add(jplplayerx, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel7.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jplplayero.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jplplayero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jplplayero.setText("0");
        jPanel11.add(jplplayero, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jptnReset.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jptnReset.setText("Reset");
        jptnReset.setName("reeset"); // NOI18N
        jptnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jptnResetActionPerformed(evt);
            }
        });
        jPanel15.add(jptnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jptnExit.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jptnExit.setText("Back");
        jptnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jptnExitActionPerformed(evt);
            }
        });
        jPanel16.add(jptnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//<editor-fold defaultstate="collapsed" desc="comment">
private JFrame frame ;
//</editor-fold>
    private void jptnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jptnExitActionPerformed
    
   setVisible(false);
   XO_sImpll s=new XO_sImpll();
   
    }//GEN-LAST:event_jptnExitActionPerformed

         
     
    private void jptnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jptnResetActionPerformed
      jptnReset();
                     
                     
    }//GEN-LAST:event_jptnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
            jButton1.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton1.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton1.setForeground(Color.RED);
                 }
             
       choose_a_player () ;   
      jButton1.setEnabled(false);
       winnigGame () ;
      
       
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton2.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton2.setForeground(Color.RED);
                 }
             
       choose_a_player () ;     
     jButton2.setEnabled(false);
       winnigGame () ;
       
          
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         jButton12.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton12.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton12.setForeground(Color.RED);
                 }
             
       choose_a_player () ;    
       jButton12.setEnabled(false);
       winnigGame () ;
        
          
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton6.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton6.setForeground(Color.RED);
                 }
             
       choose_a_player () ;     
      jButton6.setEnabled(false);
       winnigGame () ;
       
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         jButton5.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton5.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton5.setForeground(Color.RED);
                 }
             
       choose_a_player () ;    
      jButton5.setEnabled(false);
    winnigGame () ;
     
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton13.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton13.setForeground(Color.RED);
                 }
             
       choose_a_player () ;  
       jButton13.setEnabled(false);
    winnigGame () ;
    
    
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         jButton9.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton9.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton9.setForeground(Color.RED);
                 }
             
       choose_a_player () ;
      jButton9.setEnabled(false);
       winnigGame () ;
       
            
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton8.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton8.setForeground(Color.RED);
                 }
             
       choose_a_player () ;
        jButton8.setEnabled(false);
       winnigGame () ;
      
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
        jButton7.setText(StartGame);
                 if(StartGame.equalsIgnoreCase("X"))
                 {
                  jButton7.setForeground(Color.BLUE);
                 }
                 else
                 {
                     jButton7.setForeground(Color.RED);
                 }
             
       choose_a_player () ;
      jButton7.setEnabled(false);
       winnigGame () ;
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(XO_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XO_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XO_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XO_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           

                   XO_sImpll x =new XO_sImpll();
                
                
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jplplayero;
    private javax.swing.JLabel jplplayerx;
    private javax.swing.JButton jptnExit;
    private javax.swing.JButton jptnReset;
    // End of variables declaration//GEN-END:variables

    private void jptnReset() {
      
        jButton1.setText("");
       jButton12.setText("");
       
       jButton13.setText("");
       
       jButton2.setText("");
       jButton5.setText("");
       jButton6.setText("");
       
       jButton7.setText("");
       
       jButton8.setText("");
       jButton9.setText("");
       
       jButton1.setBackground(Color.lightGray);
       jButton2.setBackground(Color.lightGray);
       jButton5.setBackground(Color.lightGray);
       jButton6.setBackground(Color.lightGray);
       jButton7.setBackground(Color.lightGray);
       jButton8.setBackground(Color.lightGray);
       jButton9.setBackground(Color.lightGray);
       jButton12.setBackground(Color.lightGray);
       jButton13.setBackground(Color.lightGray);
         jButton1.setEnabled(true);
                     jButton2.setEnabled(true);
                     jButton12.setEnabled(true);
                     jButton6.setEnabled(true);
                     jButton5.setEnabled(true);
                     jButton13.setEnabled(true);
                     jButton9.setEnabled(true);
                     jButton8.setEnabled(true);
                     jButton7.setEnabled(true);
 
    }
}
