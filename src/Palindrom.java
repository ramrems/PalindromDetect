import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Palindrom {

    public Palindrom() {
    }
    public static void PalindromKontrol() throws IOException {

       //BufferedReader oku = new BufferedReader(new FileReader("C:\\Users\\irems\\Documents\\java\\veri_yapilari\\VeriOdev3\\src\\odev.txt"));
        BufferedReader oku = new BufferedReader(new FileReader("src/odev.txt"));
        while (true) {
            String str = oku.readLine();
            if (str == null) {
                break;
            }

            str = str.toLowerCase();
            str= str.replaceAll("ı","i");

            Stack stack = new Stack(20);
            StringBuilder newStr = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    newStr.append(str.charAt(i));
                }
            }
            System.out.println("#"+str);
            for (int i = 0; i < (newStr.length() / 2); i++) {
                char x = newStr.charAt(i);
                stack.push(x);
            }
            for (int j = (newStr.length() / 2); j < newStr.length(); j++) {
                char y = newStr.charAt(j);
                if (y == (char) stack.peak()) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                System.out.println("polindrom");
            } else {
                System.out.println("Not polindrom");
            }
        }
    }
}
