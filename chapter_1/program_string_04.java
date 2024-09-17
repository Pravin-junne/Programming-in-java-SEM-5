public class program_string_04 {
    public static void main(String args[]){
        String str1 = "i love coding";
        String str2 = "i love coding";
        String str3 = "i love cybersecurity";

        System.out.println("Str1-"+str1);
        System.out.println("Str2-"+str2);
        System.out.println("Str3-"+str3);

        boolean ans = str1.equals(str2);
        System.out.println("str1 is equal to str2: "+ans);

        boolean ans2 = str1.equals(str3);
        System.out.println("str1 is equal to str3: "+ans2);
    }
}
