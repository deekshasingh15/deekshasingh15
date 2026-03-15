public class MoveHashFront {
    public static String moveHash(String s) {
        StringBuilder hash = new StringBuilder();
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '#') hash.append(c);
            else str.append(c);
        }

        return hash.toString() + str.toString();
    }

    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";
        System.out.println(moveHash(s));
    }
}
