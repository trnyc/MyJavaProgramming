package abc_Practice_B28;


    // Java program to illustrate
// the usage of this keyword

    class RR {
        int first = 22;
        int second = 33;

        void garcia(int a, int b)
        {
            a = this.first;
            b = this.second;
            System.out.println(first);
            System.out.println(second);
            System.out.println(a);
            System.out.println(b);
        }

        void louis(int m, int n)
        {
            this.first = m;
            this.second = n;
            System.out.println(first);
            System.out.println(second);
            System.out.println(m);
            System.out.println(n);
        }

        public static void main(String[] args)
        {
            new RR().garcia(100, 200);
            new RR().louis(1, 2);
        }
    }

//  22
//  33
//  22
//  33
//   1
//   2
//   1
//   2