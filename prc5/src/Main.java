public class Main {

    // Задание 1
    static void func1(int n)
    {
        int k = 0;

        for (int i = 0; i < n; i++)
        {
            if (i != n - 1) System.out.print((k + 1) + ", ");
            else System.out.println(k + 1);

            if (i == k * (k + 1))
                k++;
        }
    }

    // Задание 2
    static void func2(int n)
    {
        func3(1, n);
    }

    // Задание 3
    static void func3(int t0, int t1)
    {
        if (t0 > t1) return;

        for (int i = 0; i < t0; i++)
        {
            if (i != t0 - 1) System.out.print(t0 + ", ");
            else System.out.println(t0);
        }

        func3(t0 + 1, t1);
    }

    public static void main(String[] args) {
        func1(3);
        System.out.println();
        func2(3);
        System.out.println();
        func3(3, 9);
    }
}
