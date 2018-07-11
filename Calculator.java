public class Calculator {
    public static int sum(int x,int y){
        return(x+y);
    }
    public static int sub(int x,int y){
        return(x-y);
    }
    public static int mul(int x,int y){
        return(x*y);
    }
    public static int div(int x,int y){
        return(x/y);
    }
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
        char c=(args[2].charAt(0));
        if(a<0 || b<0){
            System.out.println("enter proper number");
        }
        else{
        switch(c){
        
        case '+' : System.out.println("a + b = "+sum(a,b));
                    break;
        case '-' : System.out.println("a - b = "+sub(a,b));
                    break;
        case '*' : System.out.println("a * b = "+mul(a,b));
                    break;
        case '/' : System.out.println("a / b = "+div(a,b));
                    break;
        default  : System.out.println("Enter proper symbol");
                  }
        }
    }
}
