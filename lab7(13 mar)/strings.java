import java.util.*;
class strings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: \n");
        System.out.println("1.Change of Case\n2.Reverse String\n3.Comparing strings\n4.Insertion\n5.Upper Case to Lower\n6.Presence of character in string\n7.Palindrome or not\n8.Check number of word,vowel,consonant\n");
        System.out.println("Enter your Choice:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter String:");
            String s1=sc.next();
            System.out.println("After Change:"+s1.toUpperCase());
            break;
            case 2:
            System.out.println("Enter String:");
            String s2=sc.next();
            String rev="";
            for(int i=s2.length()-1;i>=0;i--)
                rev=rev+s2.charAt(i);
            System.out.println("Reversed String:"+rev);
            break;
            case 3:
            System.out.println("Enter 2 Strings:");
            String s3=sc.next();
            String s4=sc.next();
            System.out.println(s3.compareTo(s4));
            break;
            case 4:
            System.out.println("Enter a String:");
            String s5=sc.next();
            System.out.println("Enter a String to be entered after first:");
            String s6=sc.next();
            System.out.println(s5.concat(s6));
            break;
            case 5:
            System.out.println("Enter a String:");
            String s7=sc.nextLine();
            System.out.println("Upper Case:"+s7.toUpperCase());
            System.out.println("Lower Case:"+s7.toLowerCase());
            break;
            case 6:
            System.out.println("Enter a String:");
            String s8=sc.next();
            System.out.println("Enter a character:");
            char c=sc.next().charAt(0);
            for(int i=0;i<s8.length();i++)
            {
                if(c==s8.charAt(i))
                System.out.println("Character found at index: "+i);
            }
             break;
            case 7:
            System.out.println("Enter a String:");
            String s9=sc.next();
            String temp="";
            for(int i=s9.length()-1;i>=0;i--)
                temp=temp+s9.charAt(i);
            if(s9.equalsIgnoreCase(temp))
            System.out.println("Palindrome String");
            else
            System.out.println("Not palindrome string");
            break;
            case 8:
            System.out.println("Enter a String:");
            String s10=sc.next();
            int x=0,y=0,z=0;
            for(int i=0;i<s10.length();i++)
            {
                if(s10.charAt(i)==' ')
                x++;
                else if(s10.charAt(i)=='a'||s10.charAt(i)=='e'||s10.charAt(i)=='i'||s10.charAt(i)=='o'||s10.charAt(i)=='u'||s10.charAt(i)=='A'||s10.charAt(i)=='E'||s10.charAt(i)=='I'||s10.charAt(i)=='O'||s10.charAt(i)=='U')
                y++;
                else
                z++;
            }
            System.out.println("No. of words:"+x);
            System.out.println("No. of vowels:"+y);
            System.out.println("No. of Consonants:"+z);
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }

}