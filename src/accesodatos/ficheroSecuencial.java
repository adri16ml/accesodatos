/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;
import java.io.*;
import java.util.Scanner;

public class ficheroSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{

        }
    public static String leerDatos(String archivo) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(archivo);
        BufferedReader entrada = new BufferedReader(fr);
         String texto= new String(); 
        String s;
         while((s = entrada.readLine() )!=null) 
             texto += s + "\n";
         return texto;
           
    }
    
    public static void grabarDatos(String archivo, String datos){        
        
        try{ 
        FileWriter fw = new FileWriter(archivo,false); 
        BufferedWriter bw = new BufferedWriter(fw); 
        bw.write(datos + "\n");          
        bw.newLine();
        bw.close(); 
        }
         catch(java.io.IOException ioex){} 
    }
    public static void grabarAlFinal(String archivo, String datos){
        String textoNuevo="";
        
    }
            
}
    

