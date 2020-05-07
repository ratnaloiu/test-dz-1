{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean dateiscorrect = false;
        while (!dateiscorrect) {
            System.out.print("year:");
            int year = sc.nextInt();
            System.out.print("month:");
            int mon = sc.nextInt();
            System.out.print("day:");
            int day = sc.nextInt();


            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
            int maxdays[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear) {
                maxdays[1] = 29;
            }
            boolean monn = ((mon > 0) & (mon < 13));
            if (monn) { dateiscorrect = (day <= maxdays[mon-1]);}
            if (!dateiscorrect) {
                System.out.println("!!!!!error!!!!!");
            } else {
                System.out.println("nice:" + dateout(day, mon, year));}
            day++; if (day>maxdays[mon-1]) { day = 1; mon++;
                if (mon>12) { day = 1; mon = 1; year++; System.out.println("next day:" + dateout(day, mon, year));

                }   else {System.out.println("next month:" + dateout(day, mon, year));}

            } else {System.out.println("next day:" + dateout(day, mon, year));}
        }


    }

    static String dateout(int d, int m, int y) {
        String output1 = d + "." + m + "." + y;
        return output1;
    }

}
