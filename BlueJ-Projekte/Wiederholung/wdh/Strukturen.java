public class Strukturen {
    
    /**
     * Aufrufe:
     * magic(4,4);
     * magic(4,3);
     * magic(3,4);
     */
    public static void magic(int a, int b) {
        if(a == b) {
            for(int i = 2; i < b; i = i +1) {
                System.out.println(i);
            }
        } else {
            for(int i = 10; i > b; i = i - 1) {
                System.out.println(i);
            }
            System.out.println("fertig!");
        }
        System.out.println();
    }
    
    /**
     * Aufrufe:
     * magicTwo(7)
     * magicTwo(10)
     */
    public static void magicTwo(int a) {
        if(a % 2 == 0) {
            System.out.println("teilbar!");
        } else {
            System.out.println("nicht teilbar!");
        }
        System.out.println();
    }
    
    /**
     * Aufrufe:
     * magicThree(1);
     * magicThree(7);
     * magicThree(8);
     */
    public static void magicThree(int a) {
        int summe = 0;
        // 1. Durchlauf: summe = 0 + 1 (i = 1)
        //2. Durchlauf: summe = 1 + 3 = 4 (i = 3)
        // 3. Durchlauf: summe = 4 + 5 (i = 5)
        // 4. Durchlauf: summe = 9 + 7 = 16 (i = 7)
    // 5. Durchlauf 9 <= 7
        for(int i = 1; i <= a; i = i + 2) {
            summe = summe + i;
        }
        System.out.println(summe);
        System.out.println();
    }
}