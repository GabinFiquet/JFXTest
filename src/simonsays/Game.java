/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simonsays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pavelek_Kiril
 */
public class Game {
    
    Random rand = new Random();
    private final String[] couleurs = {"bleu", "rouge", "vert", "jaune"};
    private String[] colorsTab;
    private int exe;
    
    public Game(){
        
    }
    
    public void start(int level){
       int exe = level;
       String[] tab1 = getColors(exe);
       for (int y = 0; y < exe; y++){
           System.out.println(tab1[y]);
       }
       System.out.println("Entrez : \n (r) pour rouge \n (j) pour jaune \n (v) pour vert \n (b) pour bleu");
       String[] tab2 = getScan(exe);
       for (int y = 0; y < exe; y++){
           System.out.println(tab2[y]);
       }
       String result = compareTab(tab1, tab2);
       if (result.equals("ok")){
            NextStage();
            start(level + 1);
       }
       else {
            GameOver();
            start(3);        
       }
    }
    
    public void NextStage(){
        System.out.println("#################################### \n ########## Niveau réussi ############");
        System.out.println("#################################### \n ## Niveau suivant (difficulté + 1) ##");
    }
    
    public void GameOver(){
        System.out.println("#################################### \n ########## Game Over ############");
        System.out.println("#################################### \n ####### Défi réinitislisé #######");
    }
    
    public String compareTab(String[] tab1 , String[] tab2){
    String Result = "";
    if (Arrays.equals(tab1, tab2)){
        Result = "ok";    
    }
    else {
        Result = "failure";
    }
    return Result;
    }
    
    public String getRandomColor(String[] couleur){
        couleur = this.couleurs;
        int r = rand.nextInt(4) + 0;
        return couleur[r];
    }
    
    public String[] getColors(int nombre){
       colorsTab = new String[nombre];
       for (int i = 0; i <= nombre - 1; i++){
           colorsTab[i] = getRandomColor(this.couleurs);
       }
       return colorsTab;
    }
    
    public String scan(String color){
        String match = null;
        switch(color){
            case "b" :
                match = "bleu";
            break;
            case "r" :
                match = "rouge";
            break;
            case "v" :
                match = "vert";
            break;
            case "j" :
                match = "jaune";
            break;
            default :
                match = "erreur";
        }
        
        return match;
    }
    
    public String[] getScan(int nombre){
        colorsTab = new String[nombre];
        for (int i = 0; i <= nombre - 1; i++){
            Scanner scan = new Scanner(System.in);
            String value = scan.nextLine();
            String input = scan(value);
            colorsTab[i] = input;
       }
       return colorsTab;
    }
    
}
