package tugas_modul_6;
public class tumpukanApp {
    public static void main(String[] args){
        tumpukan tumpukan=new tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        long nilai2=tumpukan.pop();
        
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        long nilai3=tumpukan.peek();
        System.out.println("nilai top  = " +nilai3);
        
      
    }
}
