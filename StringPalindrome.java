import java.util.Scanner;

public class StringPalindrome {

    int string_palin(String str1) {
        int stlen = str1.length();
        //System.out.println(stlen);
        char[] temp = str1.toCharArray();        
        
        int i=stlen-1, flag=1;
        for(char ch : temp){
            //System.out.println(ch);
            if(ch != temp[i])
                flag = 0;
            i--;
        }

        return flag;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        String str = sc.nextLine();

        StringPalindrome sp = new StringPalindrome();
        int flag = sp.string_palin(str);
        
        if(flag == 1)
            System.out.println("Great !! This String Is Palindrome.");
        else
            System.out.println("Sorry ! This isn't Palindrome.");
    }
}