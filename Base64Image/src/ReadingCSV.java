import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCSV {

    public static void main(String[] args) {

        String csvFile = "C:\\Users\\M7md\\Desktop\\university_ranking_results.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] result = line.split(cvsSplitBy);
                System.out.println("[" + result[0] + " ," + result[1] + " ," + result[2] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
