public class StringSearch {
    public static void main(String [] args) {
        String str="Sumrit";
        char target='z';
        boolean res=Search(str,target);
        System.out.println(res);
    }

    static boolean Search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
}
