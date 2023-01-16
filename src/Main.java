public class Main {
    public static void main (String[]args){
        Fighter f1= new Fighter("Muhammed",10,100,120,35);
        Fighter f2 =new Fighter("Berk",9,99,100,80);

        Match match=new Match(f1,f2,130,90);
        match.run();
    }
}
