import java.util.Scanner;
public class Main {
    static int ngecekhasil(int a,int b,char c){
        if(a == 'A' && b == 'A' && c == 'A'){
         System.out.println("DA kamu LULUS cumlaude!!!");
            return 2;
        }
        else if(a == 'A' || b == 'A' || c == 'A') {
            System.out.println("KAMU LULUS!!!");
            return 1;
        }
        else {
            System.out.println("D!!!!");
            return 0;
        }
    }
    static void jamkeberapa(int a){

        switch(a){
            case 1: case 3:
                System.out.println("A!!! KUNCI PINTUNYA!!!");
                break;
            case 4:
                System.out.println("AA!!! CEPET KELUAR!!!!");
                break;
            default:
                System.out.println("Wah! Jamkos!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[3];
        System.out.println("kocak jir");
        System.out.println("eh ini jam keberapa?");
        System.out.println("(Hint: 1. Inggris 2. Matematika 3. Inggris ke-2 4. Olahraga)");
        System.out.print("jam ke : ");
        int jam = input.nextInt();
        jamkeberapa(jam);

    }
}