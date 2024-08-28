public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = -x;
        int z = -y;
        System.out.println(z);


        int a = 25;
        a = a + 1;//same as a++;
        System.out.println(a);
        a += 1;//same as a++;
        System.out.println(a);

        System.out.println("Watching increment");
        int p = 5;
        System.out.println(p++);//post
        System.out.println(p);

        System.out.println(++p);//pre
        System.out.println(p);

        System.out.println("Watching decrement");
        int q = 10;
        System.out.println(--q);//pre
        System.out.println(q);

        System.out.println(q--);//post
        System.out.println(q);
    }
}