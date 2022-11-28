import edu.duke.*;

/**
* 
* @author: Amir Armion 
* 
* @version: V.01
* 
*/
public class WordPlay 
{

    public boolean isVowel(char ch)
    {
        String vowels     = "AEIOU";
        int    vowelIndex = vowels.indexOf(Character.toUpperCase(ch));

        if(vowelIndex != -1)
        {
            return true;
        }

        return false;
    }

    public String replaceVowels(String phrase, char ch)
    {
        StringBuilder newPhrase = new StringBuilder("");

        for(int i = 0; i < phrase.length(); i++)
        {
            char currentChar = phrase.charAt(i);

            if(isVowel(currentChar))
            {
                newPhrase.append(ch);
            }
            else
            {
                newPhrase.append(currentChar);
            }
        }

        return newPhrase.toString();
    }

    public String emphasize(String phrase, char ch)
    {
        StringBuilder newPhrase = new StringBuilder("");

        for(int i = 0; i < phrase.length(); i++)
        {
            char currentChar = phrase.charAt(i);

            if(Character.toUpperCase(currentChar) == Character.toUpperCase(ch))
            {
                if(i % 2 == 0)
                {
                    newPhrase.append('*');
                }
                else
                {
                    newPhrase.append('+');
                }
            }
            else
            {
                newPhrase.append(currentChar);
            }
        }

        return newPhrase.toString();
    }

    public void testIsVowel()
    {
        System.out.println(isVowel('f'));
        System.out.println(isVowel('A'));
    }

    public void testReplaceVowels()
    {
        System.out.println(replaceVowels("Hello World", '*'));
    }

    public void testEmphasize()
    {
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
}
