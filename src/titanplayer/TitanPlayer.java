/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanplayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Kendall
 */
public class TitanPlayer {

     public class TitanMenu extends JFrame implements ActionListener{
            
       public TitanMenu(){ 
        JFrame frame = new JFrame("Titan Player");
            frame.setTitle("TITAN PLAYER");
            frame.setSize(850,650);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            JMenuBar jmen = new JMenuBar();
            frame.setJMenuBar(jmen);
            JMenu fileMenu = new JMenu("File");
                    jmen.add(fileMenu);
                    JMenu fileAddSubMenu = new JMenu ("Add");
                    fileMenu.add(fileAddSubMenu);
                    JMenu songFileAddSubMenu = new JMenu ("Song");
                    JMenu playlistFileAddSubMenu = new JMenu ("Playlist");
                    fileAddSubMenu.add(new JMenuItem("Song"));
                    fileAddSubMenu.add(new JMenuItem("Playlist"));
                    
                    AddListenerClass addSong = new AddListenerClass();
                    songFileAddSubMenu.addActionListener(addSong);
                    
              } 

        
        }      
         public fileChooser
                   
               }
           }    
   
    public static void main(String[] args) {
       
        
        
    }   
    
}            
                
        
          
           
    

