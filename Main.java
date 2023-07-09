import java.util.Random ;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Soldier [][] SArray = new Soldier[3][5] ;
        Scanner input = new Scanner(System.in) ;



        for ( int i = 0 ; i < 3 ; i++) {
            String id , name ;
            int age , rank ;

            System.out.println("Please enter soldier's id:");
            id = input.nextLine() ;
            System.out.println("Please enter soldier's name:");
            name = input.nextLine() ;
            System.out.println("Please enter soldier's age:");
            age = input.nextInt() ;
            System.out.println("Please enter soldier's rank:");
            rank = input.nextInt() ;
            input.nextLine() ;
            SArray[i][5] = new Soldier(id, name, age, rank) ;
            System.out.println(SArray[i]) ;

            Random ran = new Random() ;
            int tmp = 0 ;

            for ( int j=0 ; j < 5 ; j++ ) {

                SArray[i][j] = ran.nextInt(101) ;
                tmp += SArray[i][j] ;

            }
            System.out.println("overall score: "+tmp);
            if ( tmp >= 300 && rank >= 0 && rank < 4 ) {
                SArray[i][5].setRank(SArray[i][5].getRank()+1) ;
            }
            else if ( tmp < 300 && rank > 0 && rank < 4 ) {
                SArray[i][5].setRank(SArray[i][5].getRank()-1) ;
            }
            System.out.println(SArray[i]) ;
        }

        /* SArray[0] = new Soldier("1123", 28, "YB", 1) ;
        SArray[1] = new Soldier("0712", 28, "IS" , 0) ;
        SArray[2] = new Soldier("0809", 27 , "JY", 3) ;
        SArray[3] = new Soldier("0724", 26, "DW", 3) ;
        SArray[4] = new Soldier("0807", 25, "RW", 1) ;
        SArray[5] = new Soldier("0704", 25, "ZH", 0) ;
        SArray[6] = new Soldier("0228", 24, "YTY", 0) ;
        SArray[7] = new Soldier("0511", 22, "HY", 1) ;
        SArray[8] = new Soldier("0117", 21, "CN", 1) ;
        SArray[9] = new Soldier("0112", 4, "FANTASY", 2) ;

        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println(SArray[i]) ;
        }

        Random ran = new Random() ;
        int[] shot = new int[10] ;

        for ( int i=0 ; i < 10 ; i++ ) {

            shot[i] = ran.nextInt(101) ;
        }

        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println(shot[i]) ;
        }

        for ( int i = 0 ; i < 10 ; i++ ) {
            if ( shot[i] < 60 && SArray[i].rank > 0 ) {
                SArray[i].rank -- ;
            }
            else if ( shot[i] >= 60 && SArray[i].rank < 4 ) {
                SArray[i].rank ++ ;
            }
        }

        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println(SArray[i]) ;
        } */

    }
}
