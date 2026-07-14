package FileHandling;

import java.io.File;

public class DeleteFiles {

    public static void main(String[] args) {

        try {
            File myObj = new File("C:\\Files\\demo.xlsx");

            if (myObj.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}