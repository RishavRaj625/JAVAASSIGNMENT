public class Maximum {
    public static void main (String[]args){
        int num1=4;
        int num2=5;
        int num3=6;
        int max;
        if(num1>=num2&& num1 >=num3){
            max=num1;
        } else if (num2>=num1&&num2>=num3) {
            max=num2;
        }else {
            max=num3;
        }
        System.out.println("the max num of three num is:"+max);
    }
}
