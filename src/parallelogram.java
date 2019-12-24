package rownoleglobok;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rownoleglobok {

    public static void main(String[] args) {

        try {
            
            int count = 1;

            int width = 1, height = 1, kopniecie = 0;

            for (String arg : args) {

                if (count == 1) {
                    width = Integer.parseInt(arg);

                } else if (count == 2) {
                    height = Integer.parseInt(arg);

                } else if (count == 3) {
                    kopniecie = Integer.parseInt(arg);

                }
                count++;
            }

            if (count != 4) {
                System.exit(0);
            }

            int c, kop = 0;

            if (width <= 100 && height <= 100 && kopniecie <= 100) {

                if (kopniecie > 0) {
                    c = kopniecie;

                    for (int i = 0; i < height; i++) {

                        for (int k = 0; k < kop; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }

                        kop = kopniecie;
                        kopniecie = kopniecie + c;

                        System.out.println();
                    }
                }
                if (kopniecie < 0 && kopniecie >= -100) {
                    c = kopniecie * (-1);
                    kopniecie = ((kopniecie * height) * (-1));

                    for (int i = 0; i < height; i++) {

                        for (int k = kopniecie; k > c; k--) {
                            System.out.print(" ");
                        }

                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }

                        kopniecie = kopniecie - c;
                        System.out.println();
                    }
                }
            }
        }catch(Exception e){
        }
    }
}





