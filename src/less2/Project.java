package less2;


//Задача 1
import java.util.Scanner;

public class Project {
    int n;
    char a;
    char b;

    public Project() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = in.next().charAt(0);
        b = in.next().charAt(0);
        in.close();
    }
    private boolean isValid() {
        return  n % 2 == 0;
    }

    public void getResult() {
        StringBuilder result = new StringBuilder();
        int count = 0;
        if (isValid()){
            while (count < n) {
                result.append(a).append(b);
                count = count + 2;
            }
            System.out.println(result);
        }
    }
}

