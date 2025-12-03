package ch3_2_class;

public class ScopeExample {
    private int count;

    public int fun1(){
        int count = 0;
        for(int i = 0 ; i < 100; i++){
            count += i;
        }

        return count;
    }



    public static void main(String[] args){
        ScopeExample scopeExample = new ScopeExample();
        scopeExample.fun1();
        System.out.println(scopeExample.count);
    }
}
