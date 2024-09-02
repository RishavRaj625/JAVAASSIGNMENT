public class StringPalindrome {
    public static void main(java.lang.String[]args){
        java.lang.String a="Annu";
        java.lang.String Revered ="";
       for (int i = a.length()-1; i >=0; i-- ){
            Revered += a.charAt(i);
        }
        System.out.println("Revered :" +Revered);
       if(a==Revered){
           System.out.println("palindrome");
       }else{
           System.out.println("not palindrome");
       }
    }
}
