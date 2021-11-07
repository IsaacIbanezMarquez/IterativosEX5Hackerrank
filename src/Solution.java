import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//ENUNCIADO:

// Suma N nombres

/*  Demana N nombres, suma'ls i imprimeix el resultat.

Input Format

Introdueix primer un nombre N: nombre de números a introduir. Introdueix aquests n nombres dins un bucle.

Constraints

No n'hi ha.

Output Format

Imprimeix la suma de tots els nombres introduïts.

Sample Input 0

5
4 -5 3 5 10
Sample Output 0

17

 */








public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numq = sc.nextInt();

        int var = 0;

        while ( numq != 0)
        {
            int num = sc.nextInt();

            var = var + num;
            numq--;

        }

        System.out.println(var);

    }
}
