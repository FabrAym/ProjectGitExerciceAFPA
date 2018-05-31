package main.java.ProjectGit;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProjectGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Bonjour Bordeaux!!" );
		

        for(int i=0;i<20;i++){
			for(int j=0;j<20;j++) {
				JFrame fenetre = new JFrame();
				
			    fenetre.setSize(200, 200);
			    fenetre.setTitle("MOUAHAHAHAHAHAAHAH");
			    fenetre.setLocation((int)(Math.random() * 10), (int)(Math.random() *  10)); 
			    
			    JPanel pan = new JPanel();
			    int vert  = (int)(Math.random()*2);
			    int bleu  = (int)(Math.random()*5);
			    int rouge = (int)(Math.random()*5.99);
			    pan.setBackground(new Color(rouge,vert,bleu));        
			    fenetre.setContentPane(pan);               
			    fenetre.setVisible(true);
			}
		}
	}

}
