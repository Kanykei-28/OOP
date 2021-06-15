package Final;

public class PigLatinTranslator
{
    public static String translateMainMethod(String input)
    {
        String output = "";
        if (input.substring(0,1).matches("\\b[auioe]"))
        {
            output = input + "ay";
        }
        else
        {
            output = input.substring(1) + input.charAt(0) + "ay";

            // exceptions
            String exceptionTest = input.length() > 1 ?  input.substring(0,2) : ""; // to prevent string length problem
            if (exceptionTest.equals("ch") || exceptionTest.equals("qu") || exceptionTest.equals("th") || exceptionTest.equals("xr"))
            {
                output = input.substring(2) + exceptionTest + "ay";
            }
            if (exceptionTest.equals("yt") || exceptionTest.equals("xr"))
            {
                output = input + "ay";
            }
            exceptionTest = input.length() > 2 ?  input.substring(0,3) : ""; // to prevent string length problem
            if (exceptionTest.equals("sch") || exceptionTest.equals("thr") || exceptionTest.matches("\\b[^auioe]qu"))
            {
                output = input.substring(3) + exceptionTest + "ay";
            }
        }
        return output;
    }
    public static String translate(String input)
    {
        String result = "";
        for (String word : input.toLowerCase().split(" "))
        {
            result += translateMainMethod(word) + " ";
        }
        return result.trim();
    }
}
