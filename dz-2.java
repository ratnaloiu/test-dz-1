{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("-> /a:");
        int a = sc.nextInt();
        System.out.println("--> /b:");
        int b = sc.nextInt();
        System.out.println("---> /c:");
        int c = sc.nextInt();
        System.out.println(" " + a + "x2+" + b + "x+" + c + "=0");
        long dis = discriminant(a, b, c);
        if (!isPositive(dis)) {
            System.out.println("dis <0, no kor");
        } else {
            double kor1 = (b * (-1) + Math.sqrt(dis)) / (2 * a);
            double kor2 = (b * (-1) - Math.sqrt(dis)) / (2 * a);
            System.out.println("/kor/1/= " + kor1);
            System.out.println("/kor/2/= " + kor2);
        }
        if (isZero(dis)) {
            double kor1 = (b * (-1) + Math.sqrt(dis)) / (2 * a);
            System.out.println("kor/1/=" + kor1);
        }


    }

    static boolean isPositive(long v) {
        return (v > 0);
    }

    static boolean isZero(long o) {
        return (o == 0);
    }

    static long discriminant(int a, int b, int c) {
        return (b * b - 4 * a * c);
    }

}
