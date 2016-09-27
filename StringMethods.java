public class StringMethods
{

    // returns occurences of substring sub in str
    public static int strCount(String str, String sub) {
        if (str.contains(sub))
        {
            return 1 + strCount(str.replaceFirst(sub, ""), sub);
        }
        else
        {
            return 0;
        }
    }
}
