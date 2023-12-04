import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int min(int x, int y, int z) {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }

        public static int dynamicED(String s1, String s2, int x, int y) {

        //declare a matrix, add 1 more column and row
        int matrix[][] = new int[x + 1][y+ 1];

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                // fill the first column
                if (i == 0)
                    matrix[i][j] = j;
                //fill the first row
                else if (j == 0)
                    matrix[i][j] = i;
                //If both index are the same return the value of the diagonal index
                else if (s1.charAt(i - 1)== s2.charAt(j - 1))
                    matrix[i][j] = matrix[i - 1][j - 1];
                //else we have 3 operations: remove,insert, and replace. We search for the smallest one, then add 1
                else
                    matrix[i][j] = min(matrix[i-1][j],
                            matrix[i][j-1],
                            matrix[i - 1][j - 1]) + 1;
            }
        }
        return matrix[x][y];
    }

        public static int recursiveED(String str1, String str2, int m, int n)
        {
            // If first string is empty, we insert all characters of second string into first
            if (m == 0)
                return n;

            // If second string is empty, we remove all characters from the first string
            if (n == 0)
                return m;

            //If the last characters of both strings are the same then we just ignore them and do the next call without them
            if (str1.charAt(m - 1) == str2.charAt(n - 1))
                return recursiveED(str1, str2, m - 1, n - 1);

            // If last characters are not same, consider all three operations on last character of first string, recursively
            // compute minimum cost for all three operations and take minimum of the three values using min function that we built.
            return 1 + min(recursiveED(str1, str2, m, n - 1), // Insert
                    recursiveED(str1, str2, m - 1, n), // Remove
                    recursiveED(str1, str2, m - 1, n - 1) // Replace
            );
        }


    public static String[] stringGenerator(int len1, int len2){

        // create a string of uppercase and lowercase characters and numbers
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String str[] = {"" , ""};
        Random random = new Random();

        for(int i = 0; i < len1; i++) {
            // generate random index number
            int index1 = random.nextInt(alphabet.length());
            // get character specified by index from the alphabet string
            char randomChar1 = alphabet.charAt(index1);
            // append the character to our string
            str[0] = str[0] + randomChar1;
        }
        for(int i = 0; i < len2; i++) {
            int index2 = random.nextInt(alphabet.length());
            char randomChar2 = alphabet.charAt(index2);
            str[1] = str[1] + randomChar2;
        }
        return str;//Contains both strings in str[0] and str[1]
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int len1 , len2;
        System.out.println("Enter length1 and length2 of both strings: ");
        len1 = input.nextInt();
        len2 = input.nextInt();

        String str[] = stringGenerator(len1,len2);

        long startTime1 = System.nanoTime();
        int ED1 = dynamicED(str[0], str[1], len1, len2);
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        int ED2 = recursiveED(str[0], str[1], len1, len2);
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;

        //Time Complexity:
        int tc1 = len1*len2;    //Time Complexity
        int tc2 = (int) Math.pow(ED2 , Math.min(len1,len2)); //Time Complexity

        //Note that if we enter high values of len1 and len2,
        // the running time of recursiveED will be very big (may take minutes)

        System.out.println("The generated strings are: \n S1: "+str[0]+"\n S2: "+str[1]);
        System.out.println("Edit Distance using Dynamic Algorithm is: " + ED1);
        System.out.println("Edit Distance using Recursive Algorithm is: " + ED2);
        System.out.println("\nThe time complexity of Dynamic Algorithm is: "+tc1);
        System.out.println("The time complexity of Recursive Algorithm is: "+tc2);
        System.out.println("\nThe running time of the Dynamic Algorithm is: " + totalTime1+" ns");
        System.out.println("The running time of the Recursive Algorithm is: " + totalTime2+" ns");


        //sHSPdb: small Heat Shock Proteins DataBase:

        //String protein1 = "MQLSSGVSEIRHTADRWRVSLDVNHFAPDELTVKTKDGVVEITGKHEERQDEHGYISRCFTRKYTLPPGVDPTQVSSSLSPEGTLTVEAPMPKLATQS";
        //int protien1Class = 99;

        String protein2 = "GAMAQVPTDPGYFSVLLDVKHFSPEEISVKVVGDHVEVHARHEERPDEHGFIAREFHRRYRLPPGVDPAAVTSALSPEGVLSIQATPASAQASLPSPPAAK";
        int protien2Class = 99;

        //String protein3 = "MGHHHHHHSHMRKIDLCLSSEGSEVILATSSDEKHPPENIIDGNPETFWTTTGMFPQEFIICFHKHVRIERLVIQSYFVQTLKIEKSTSKEPVDFEQWIEKDLVHTEGQLQNEEIVAHGSATYLRFIIVSAFDHFASVHSVSAEGTVVSNLSS";
        //int protien3Class = 16;

        String protein4 = "TVQTSKNPQVDIAEDNAFFPSEYSLSQYTSPVSDLDGVDYPKPYRGKHKILVIAADERYLPTDNGKLFSTGNHPIETLLPLYHLHAAGFEFEVATISGLMTKFEYWAMPHKDEKVMPFFEQHKSLFRNPKKLADVVASLNADSEYAAIFVPGGHGALIGLPESQDVAAALQWAIKNDRFVISLCHGPAAFLALRHGDNPLNGYSICAFPDAADKQTPEIGYMPGHLTWYFGEELKKMGMNIINDDITGRVHKDRKLLTGDSPFAANALGKLAAQEMLAAYAG";
        int protien4Class = 20;

        String protein5 = "APSVALPVAQVPTDPGHFSVLLDVKHFSPEEIAVKVVGEHVEVHARHEERPDEHGFVAREFHRRYRLPPGVDPAAVTSALSPEGVLSIQAAPASAQAPPPAAAK";
        int protien5Class = 99;

        //String protein6 =  "ITIPVTFE";
        //int protien6Class = 99;

        int EDP1 = dynamicED(protein4, protein2, protein4.length() , protein2.length());    //Different Class
        //int EDP2 = dynamicED(protein1, protein5, protein1.length() , protein5.length());
        int EDP3 = dynamicED(protein2, protein5, protein2.length() , protein5.length());    //Same Class
        // EDP4 = dynamicED(protein2, protein6, protein2.length() , protein6.length());

        System.out.println("\nEdit Distance Between 2 strings of DIFFERENT classes numbers: C1="
                +protien2Class + " and C2=" + protien4Class + " is ED=" + EDP1);
        //System.out.println("EDP2: " + EDP2);
        System.out.println("Edit Distance Between 2 strings of the SAME class number: "+protien2Class + " is ED=" + EDP3);
        //System.out.println("EDP4: " + EDP4);
    }

}

