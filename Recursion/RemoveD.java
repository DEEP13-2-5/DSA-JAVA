public class Removed {
    public static void Removeduplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) { 
            System.out.print(newStr);
            return;
        }
        char Currchar = str.charAt(idx);
        if (map[Currchar - 'a']) {
            Removeduplicate(str, idx + 1, newStr, map);
        } else {
            map[Currchar - 'a'] = true; 
            Removeduplicate(str, idx + 1, newStr.append(Currchar), map); 
        }
    }

    public static void main(String[] args) {
        String str = "apnnacollage";
        Removeduplicate(str, 0, new StringBuilder(""), new boolean[26]); 
    }
}
