/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasy.futebol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author victor pc
 */
public class FantasyFutebol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         
        
       int optionNum= mainMenu(); 
       if (optionNum == 1){
        dataInput();   
       }
        
        
        
        
       
        
        
        
    }
    public static void welcomeMessage(){
         System.out.println(" Welcome to the Fantasy Football Programe ");
    }
    public static int mainMenu(){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1: Initialise the programme");
        System.out.println("2: Enter in a team" );
       String option= sc.nextLine();
//       int optionNum= Integer.parseInt(option);
           
return Integer.parseInt(option);
           
           }
     public static void dataInput() throws FileNotFoundException, IOException{
    BufferedReader br= new BufferedReader (new FileReader ("FantasyFootballData2.csv")); // read from the file Fantasy futebool
       String line; 
    
        while (( line = br.readLine())!=null){
        String[] playerData = line.split(",");
         System.out.println(playerData[0]);
         if (playerData[4].equals("Forward")){
         Forward player = new Forward (0, playerData[0], playerData[1], playerData[2], Integer.parseInt(playerData[3]), playerData[4]);
             System.out.println(player);
         }
        }
    
    }
    
}
