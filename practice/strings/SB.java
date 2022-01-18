public class SB {
    public static void main(String[] args) {
        StringBuffer strb=new StringBuffer();
        for (int i = 0; i < 26; i++) {
           strb.append((char)('a'+i));
        }
        System.out.println(strb);
    }
}
