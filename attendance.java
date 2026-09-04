import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Company Count: ");
        int c = sc.nextInt();

        System.out.print("Enter Branch Count: ");
        int b = sc.nextInt();

        System.out.print("Enter Team Count: ");
        int t = sc.nextInt();

        System.out.print("Enter Employee Count: ");
        int e = sc.nextInt();

        int arr[][][][] = new int[c][b][t][e];

        for (int i = 0; i < c; i++) {
            System.out.println("Company " + i);

            for (int j = 0; j < b; j++) {
                System.out.println(" Branch " + j);

                for (int k = 0; k < t; k++) {
                    System.out.println("  Team " + k);

                    for (int l = 0; l < e; l++) {
                        System.out.print("   Employee  Attendance : ");
                        arr[i][j][k][l] = sc.nextInt();
                    }
                }
            }
        }

        

        for (int i = 0; i < c; i++) {
            System.out.println("Company " + i);

            for (int j = 0; j < b; j++) {
                System.out.println(" Branch " + j);

                for (int k = 0; k < t; k++) {
                    System.out.println("  Team " + k + " : ");

                    for (int l = 0; l < e; l++) {
                        System.out.println(arr[i][j][k][l] + " ");
                    }

                    System.out.println();
                }
            }
        }
        

for (int i = 0; i < c; i++) {

    System.out.println("Company " + i);

    int compre = 0;
    int comemp = 0;

    for (int j = 0; j < b; j++) {

        System.out.println(" Branch " + j);

        int branpre = 0;
        int branemp = 0;

        for (int k = 0; k < t; k++) {

            int teampre = 0;
            int teamemp = 0;

            System.out.println("  Team " + k);

            for (int l = 0; l < e; l++) {

                System.out.println("   Employee " + l +
                        " = " + arr[i][j][k][l]);

                if (arr[i][j][k][l] == 1) {
                    teampre++;
                }teamemp++;
            }

            double teamper =
                    (teampre * 100.0) / teamemp;

            System.out.println("  Team Attendance = "
                    + teamper + "%");

            branpre += teampre;
            branemp += teamemp;
        }

        double branper =
                (branpre * 100.0) / branemp;

        System.out.println(" Branch Attendance = "
                + branper + "%");

        compre += branpre;
        comemp += branemp;
    }

    double comper =
            (compre * 100.0) / comemp;

    System.out.println("Company Attendance = "
            + comper+ "%");
}
    }
}