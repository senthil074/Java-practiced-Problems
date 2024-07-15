//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
class StudentResult {
    private static final int SUBJECT_COUNT = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentNames = new String[3];
        int[][] marks = new int[3][SUBJECT_COUNT];
        double[] percentages = new double[3];
        String[] results = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            studentNames[i] = scanner.nextLine();
            System.out.println("Enter the marks for 5 subjects:");
            int totalMarks = 0;
            for (int j = 0; j < SUBJECT_COUNT; j++) {
                marks[i][j] = scanner.nextInt();
                totalMarks += marks[i][j];
            }
            percentages[i] = totalMarks / (double) SUBJECT_COUNT;
            results[i] = percentages[i] >= 40 ? "Pass" : "Fail";
            scanner.nextLine();  // Consume newline left-over
        }

        writeDataToExcel(studentNames, marks, percentages, results);
        scanner.close();
    }

    private static void writeDataToExcel(String[] names, int[][] marks, double[] percentages, String[] results) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Student Results");

        String[] headers = {"Name", "Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5", "Percentage", "Result"};
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
        }

        for (int i = 0; i < names.length; i++) {
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(names[i]);
            for (int j = 0; j < SUBJECT_COUNT; j++) {
                row.createCell(j + 1).setCellValue(marks[i][j]);
            }
            row.createCell(SUBJECT_COUNT + 1).setCellValue(percentages[i]);
            row.createCell(SUBJECT_COUNT + 2).setCellValue(results[i]);
        }

        try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\senth\\OneDrive\\Desktop\\deatils.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
