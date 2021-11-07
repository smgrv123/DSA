public class StringSearch {
    public static void main(String [] args) {
        String str="Sumrit";
        char target='z';
        boolean res=Search(str,target);
        System.out.println(res);
        System.out.println(SearchForEach(str, target));
    }

    static boolean SearchForEach(String str,char target){
        if(str.length()==0){
            return false;
        }
        // toCharArray convert string to character array
        for (char ch : str.toCharArray()) {
            if(ch==target){
                return true;
            }            
        }
        return false;
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
