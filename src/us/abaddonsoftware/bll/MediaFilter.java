/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.io.File;

/**
 *
 * @author abaddon
 */
public class MediaFilter extends javax.swing.filechooser.FileFilter 
{
     @Override
   public boolean accept(File file) 
{    
 if (file.isDirectory())
   {
        return true;
   }

         if (file.getName().endsWith(".mp3") ||
                 file.getName().endsWith(".MP3") ||
                 file.getName().endsWith(".mP3") ||
                 file.getName().endsWith(".Mp3"))
          {
             return true;
          } 
            else 
            {
            return false;
            }
         

    }



 
     @Override
     public String getDescription() 
     {
     return "Mp3 Files (*.mp3)";
     }
}
