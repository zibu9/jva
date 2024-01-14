

import javax.swing.JFrame;
 
public class main {
    public static void main(String[] args) {
       /**
 * main Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int i = sc.nextInt();
        System.out.println("Saisissez une chaîne : ");
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("FIN ! ");*/
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Ma première fenêtre Java");
        //Définit sa taille : 400 pixels de large et 100 pixels de haut
        fenetre.setSize(400, 100);
        //Nous demandons maintenant à notre objet de se positionner au  centre
        fenetre.setLocationRelativeTo(null);
        //Termine le processus lorsqu'on clique sur la croix rouge
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Et enfin, la rendre visible
        fenetre.setVisible(true);
    }
}