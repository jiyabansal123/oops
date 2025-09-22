import java.util.*;
public class tictaktoe {
    static String[] board;
    static String turn;

    static String checkWinner(){
        for(int b =0;b<8;b++){
            String line = null;
            switch(b){
                case 0 :
                line = board[0] + board[1] + board[2];
                break;
                case 1 :
                line = board[3] + board[4] + board[5];
                break;
                case 2 :
                line = board[6] + board[7] + board[8];
                break;
                case 3 :
                line = board[0] + board[3] + board[6];
                break;
                case 4 :
                line = board[1] + board[4] + board[7];
                break;
                case 5 :
                line = board[2] + board[5] + board[8];
                break;
                case 6 :
                line = board[0] + board[4] + board[8];
                break;
                case 7 :
                line = board[2] + board[4] + board[6];
                break;
                

            }
            if(line.equals("XXX")){
                return "X";
            }else if(line.equals("OOO")){
                return "O";
            }
            for(int b =0;b<9;b++){
                if(Arrays.asList(board).contains(String.valueOf(b+1))){
                    break;
                }else if(b==8){
                    return "draw";
                }
            }
            System.out.println();
        }
    }
    
}
