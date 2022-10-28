// Given two strings containing backspaces (identified by the character ‘#’), check if the two strings are equal.

class StringsWithBackspace {
    
    static boolean isMatch(String str1, String str2) {

        int ptr1 = str1.length() - 1, ptr2 = str2.length() - 1;

        do {
            int bk1 = 0;
            do {
                if(str1.charAt(ptr1) == '#')
                    bk1++;
                else if(bk1 > 0)
                    bk1--;
                ptr1--;
            } while(bk1 > 0 && ptr1 >= 0);

            int bk2 = 0;
            do {
                if(str2.charAt(ptr2) == '#')
                    bk2++;
                else if(bk1 > 0)
                    bk2--;
                ptr2--;
            } while(bk2 > 0 && ptr2 >= 0);

            if(ptr1 >= 0)
                System.out.println(str1.charAt(ptr1));
            if(ptr2 >= 0)
                System.out.println(str2.charAt(ptr2));

        } while(ptr1 >= 0 && ptr2 >= 0 && str1.charAt(ptr1--) == str2.charAt(ptr2--));

        if(ptr1 < 0 && ptr2 < 0)
            return true;
        else 
            return false;
    }

    public static void main(String[] args) {
        String str1 = args[0], str2 = args[1];
        System.out.println(str1 + ", " + str2);

        System.out.println(isMatch(str1, str2));
    }
}

/*
    str1 = "abcc###"
    str2 = "ab#c#"
*/
