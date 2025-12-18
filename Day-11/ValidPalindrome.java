public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.equals(" "))  return true;
        else{
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray())
            {
                if(Character.isLetterOrDigit(c))
                {
                    sb.append(Character.toLowerCase(c));
                }
            }
            String str=sb.toString();
            if(sb.reverse().toString().equals(str))
            {
                return true;
            }
        }
         return false;
    }
}
