import javax.swing.*;
import java.util.Optional;

public class NullIssues {

    public static void alwaysNull(){
        String text = null;
        if(text == null){
            JOptionPane.showMessageDialog(null,"Esse 'IF' levanta um bug no SonarQube");
        }
    }

    public static Boolean ReturnNull(){
        return null;
    }

    public int avoidNullPointerException(String str) {
        int len = 2;
        try {
            len += str.length();
        }
        catch (NullPointerException e) {
            System.out.println("argument was null");
        }
        return len;
    }

    public int nullShouldNotBeUsedWithOptional () {
        Optional<String> optional = getOptional();
        if (optional != null) {
            JOptionPane.showMessageDialog(null,"Please do not use null with Optional");
            return 1;
        }
        return 0;
    }

    private Optional<String> getOptional() {
        //Optional should never return null
        return null;
    }

}
