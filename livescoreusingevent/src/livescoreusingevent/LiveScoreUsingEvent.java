/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingevent;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LiveScoreUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();
        Subscriber obj1 = new Subscriber();
        Subscriber obj2 = new Subscriber();
        scoreSource.addSubscriber(obj1);
        scoreSource.addSubscriber(obj2);
        Scanner inp = new Scanner(System.in);
        String scoreLine;
        System.out.print("Enter Score ");
        scoreLine = inp.nextLine();
        while(!scoreLine.equals("")){
            scoreSource.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = inp.nextLine();
        }
    }
    
}
