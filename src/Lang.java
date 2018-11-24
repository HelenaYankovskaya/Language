
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Lang {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String language = "", country = "";    //Задание 5 РТ-2 стр 19
        System.out.println("1 – Русский");
        System.out.println("2 – Белорусский");
        System.out.println("по умолчанию – Английский");

        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        switch (i) {
            case '1':
                language = "ru";
                country = "RU";
                break;
            case '2':
                language = "be";
                country = "BY";
        }

        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);

        try {
            String st = rb.getString("greetings");
            String s1 = new String(st.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(s1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        }

    }
}





