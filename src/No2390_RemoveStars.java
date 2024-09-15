
public class No2390_RemoveStars {
    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c != '*')
                builder.append(c);
            else{
                builder.setLength(builder.length()-1);
            }
        }
        return builder.toString();
    }
}
