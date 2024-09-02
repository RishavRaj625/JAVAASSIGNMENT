public class Quadrant {
    public static void main(String[]args){
        int p1=7;
        int p2=9;
        if (p1>0&&p2>0){
            System.out.println("the cooridinate point lies in 1st quadrant");
        } else if (p1>0&&p2<0) {
            System.out.println("the cooridinate point lies in 2nd quadrant");
        } else if (p1<0&&p2<0) {
            System.out.println("the cooridinate point lies in 3rd quadrant");
        } else if (p1<0&&p2>0) {
            System.out.println("the cooridinate point lies in 4th quadrant");
        }
    }
}
