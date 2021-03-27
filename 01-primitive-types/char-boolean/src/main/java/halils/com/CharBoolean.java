package halils.com;

public class CharBoolean {
    public static void main(String[] args) {
        /*
        - char variables can take store only one character
        - has to be in single quotes ("A" double quotes will be compile time error)
        - '\b' for backspace
        - '\t' for tab
        - '\n' for new line
        - '\r' for carriage return
         */
        char withCharacter = 'A';
        char withASCIICode = '\101';
        char withUnicode = '\u0041';

        System.out.println("char initialized with Character = " + withCharacter);
        System.out.println("char initialized with ASCII code = " + withASCIICode);
        System.out.println("char initialized with Unicode = " + withUnicode);

        /*
        - YES/NO ON/OFF TRUE/FALSE
        - boolean variables can take true or false values
         */
        boolean isJavaFun = true;
        boolean isGreenLanternGood = false;

        System.out.println("Is Java Fun? = " + isJavaFun);
        System.out.println("Is Green Lantern Good? = " + isGreenLanternGood);

        int a = 1, b = 2;
        boolean isTrue = a > b;
        /*
         could be initialized with logical operations like
         a == b
         a <= b
         */
        System.out.println(isTrue + " = Initialized with logical operation");


    }
}
