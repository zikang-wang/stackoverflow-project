package merge_array;

public class MergeSortedArray15 {
    /**
     *
     * @author Shivasai
     */
    public static class Merge {
        int i;
        int j;
        int k;
        int n;
        int m;
        int p;
        private long[] a;
        private long[] b;
        private long[] c;

        public Merge() {
            a = new long[10];
            b = new long[10];
            c = new long[100];
            n = 0;
            m = 0;
            p = 0;
        }

        void inserta(long key) {
            for (i = 0; i < n; i++) {
                if (a[i] > key)
                    break;
            }
            for (j = n; j > i; j--) {
                a[j] = a[j - 1];

            }
            a[j] = key;
            n++;

        }

        void insertb(long value) {
            for (i = 0; i < m; i++) {
                if (b[i] > value)
                    break;
            }
            for (j = m; j > i; j--) {
                b[j] = b[j - 1];

            }
            b[j] = value;
            m++;

        }

        void insert() {
            i = 0;
            j = 0;

            while (i > n || j < m) {
                if (a[j] < b[i]) {
                    c[p] = a[j];
                    j++;
                    p++;
                } else {
                    c[p] = b[i];
                    i++;
                    p++;
                }


            }


        }

        void displaya() {
            for (k = 0; k < 10; k++) {
                System.out.print("," + a[k]);
            }
            System.out.println();

        }

        void displayb() {
            for (k = 0; k < 10; k++) {
                System.out.print("," + b[k]);
            }
            System.out.println();

        }

        void displayc() {
            for (k = 0; k < 20; k++) {
                System.out.print("," + c[k]);
            }
        }
    }

    public static void main(String[] args)
    {
        Merge obj = new Merge();
        obj.inserta(25);
        obj.inserta(12);
        obj.inserta(1800);
        obj.inserta(9);
        obj.inserta(10);
        obj.inserta(15);
        obj.inserta(18);
        obj.inserta(19);
        obj.inserta(0);
        obj.inserta(1500);
        obj.insertb(36);
        obj.displaya();
        obj.insertb(2);
        obj.insertb(3);
        obj.insertb(2000);
        obj.insertb(5);
        obj.insertb(6);
        obj.insertb(7);
        obj.insertb(8);
        obj.insertb(21);
        obj.insertb(85);
        obj.displayb();
        obj.insert();
        obj.displayc();
    }
}
