/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XOO;




/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;*/
import java.awt.Font;
/*import static java.awt.Font.BOLD;
import java.awt.Graphics; 
import java.awt.Scrollbar;*/
import java.awt.event.*; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import static java.nio.file.Files.size;
//import java.util.Formatter;
import java.util.Scanner;
/*import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Orientation;
import javax.swing.BorderFactory;
import javax.swing.JButton;*/
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

 

public class NewClass implements ActionListener{  
JFrame frame;  
JMenuBar menubar;  
JMenu file,edit;  
JMenuItem  cut , copy , paste , save , new_item , size  , save_as  , back;  
JTextArea textarea;
JTextField textfield;
JToolBar toolbar ;
JToggleButton bold , italic ;
int words_size ;

String x;


NewClass(){  
   
frame =new JFrame("Notepad");  
  
cut=new JMenuItem("Cut");  
copy=new JMenuItem("Copy");  
paste=new JMenuItem("Paste");  
save=new JMenuItem("Save");
new_item = new JMenuItem("New");
size = new JMenuItem("Size");
save_as = new JMenuItem("Save_as");
back = new JMenuItem("Back");

cut.addActionListener(this);  
copy.addActionListener(this);  
paste.addActionListener(this);  
save.addActionListener(this);
new_item.addActionListener(this);
size.addActionListener(this);
save_as.addActionListener(this);
back.addActionListener(this);


menubar=new JMenuBar();  
menubar.setBounds(5,5,1500,20);   

 frame.setSize(900,500) ;
frame.setLocationRelativeTo(null) ;
file=new JMenu("File");  
edit=new JMenu("Edit");  
 
  
edit.add(cut);
edit.add(copy);
edit.add(paste);
edit.add(size);


file.add(new_item);
file.add(save);

file.add(save_as);
file.add(back);


menubar.add(file);
menubar.add(edit);
  

textarea=new JTextArea();


textarea.setBounds(5,50,1365,890);

bold = new JToggleButton(" B ");
bold.addActionListener(this);

italic = new JToggleButton(" I ");
italic.addActionListener(this);
        
toolbar = new JToolBar();
toolbar.setBounds(10, 30, 1500, 20);
toolbar.add(bold);
toolbar.addSeparator();
toolbar.add(italic);
toolbar.setFloatable(false);//tbd2 mn al awel 5als

frame.add(menubar);
frame.add(textarea);  
frame.add(toolbar);
frame.setLayout(null);  
frame.setSize(800,500);  
frame.setVisible(true);  
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

}  
  public void write_in_file() 
{
    try{
    PrintWriter write = new PrintWriter("NotePad.txt");
         write.println(textarea.getText());
         write.close();
     }
    catch(FileNotFoundException e)
    {
        System.out.println("EROR");
    }
}


public void actionPerformed(ActionEvent e)
{  
 
if(e.getSource()==cut)  
textarea.cut();  

if(e.getSource()==paste)  
textarea.paste();  

if(e.getSource()==copy)  
textarea.copy();  

if(e.getSource() == bold)
textarea.setFont(new Font ("" , Font.BOLD ,20 ));

if(e.getSource() == italic)
textarea.setFont(new Font("" , Font.ITALIC , 20));

if(e.getSource() == size)
{
    x = JOptionPane.showInputDialog( this , "input the Size");
    words_size = Integer.parseInt(x);
    textarea.setFont(new Font("" , Font.PLAIN , words_size));
}   

if(e.getSource() == save) 
{
    write_in_file();
    JOptionPane.showMessageDialog(save, "OK");
}

if(e.getSource() == new_item)
    textarea.setText(" ");



 if (e.getSource() == save_as)
 {
     	JFileChooser save = new JFileChooser(); 
	int option = save.showSaveDialog(save_as); 			
	if (option == JFileChooser.APPROVE_OPTION) {
               try {
BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
           out.write(this.textarea.getText()); 
	out.close(); 
	} catch (Exception ex) { 
	System.out.println(ex.getMessage());
				}
			}
 }
 

 
 
 if (e.getSource() == back )
 {
   
      frame.setVisible(false);
   XO_sImpll s=new XO_sImpll();
 }
}



public static void main(String[] args) {  
     XO_sImpll x =new XO_sImpll();
}
}