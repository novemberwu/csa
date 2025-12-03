package ch2_2_loop;

public class MathProblem {
    public static void main(String[] args){


        int i = 0;
        int x = 1;
        while(i<= 2024){
            if(x % 2 == 0) {//even
                x /= 2;
            }else{
                x += 5;
            }
            i++;
            System.out.println("i:"+i +" x=" +x );
        }
    }
}
