//Program for comparing static vs local variable

class P1{
    static int x=100;

    public static void main(String [] args){
        int x = 50;
        System.out.println(x);
        System.out.println(P1.x);
    }
}








