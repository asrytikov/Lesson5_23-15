package p1;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = x<y ? (x+y) : (x-y);
        System.out.println(z);

        for (int i =1; i<10; i = i + 2){
            System.out.println("Hello");
        }

        int i = 1;
        //for(;;){
        for(;i<10;){
            System.out.println(i + " " + (i * i));
            i++;
        }

        System.out.println("-----------------------");

        int n = 10;
        for(int j = 0, k = n-1; j<k; j++, k--){
            System.out.println(j*k);
        }

        System.out.println("------------------");

        int m = 10;
        while (m>0){
            System.out.println(m);
            m--;
        }

        int x1 = 0;
        while (true){
            System.out.println("Hello");
            x1++;
            if (x1==5) break;
        }

        int z1 = 7;
        do{
            System.out.println(z1);
            z1--;
        }while (z1>0);

        z1 = -1;
        do{
            System.out.println(z1);
            z1--;
        }while (z1>0);

        System.out.println("-----------------");

        for (int w = 0; w<10; w++){
            if (w == 5) continue;
            System.out.println(w);
        }





    }
}
