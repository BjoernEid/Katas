package advent.trebuchet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Trebuchet {
    public static final String FILE_NOT_FOUND = "FILE NOT FOUND";
    public static final Map<String, String> SPELLED_NUMBERS =
            Map.of(
                    "one","1",
                    "two", "2",
                    "three", "3",
                    "four", "4",
                    "five", "5",
                    "six", "6",
                    "seven", "7",
                    "eight", "8",
                    "nine", "9",
                    "zero", "0"
            );

    public static Integer findFirstValueInString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        Integer result = null;
        while(result == null && stringBuilder.length() > 0) {
            String firstChar = stringBuilder.substring(0,1);
            result = parseInteger(firstChar);
            stringBuilder.deleteCharAt(0);
        }
        return result;
    }

    public static Integer findLastValueInString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reversedStringBuilder = stringBuilder.reverse();
        return findFirstValueInString(reversedStringBuilder.toString());
    }

    private static Integer parseInteger(String firstChar) {
        Integer result = null;
        try {
            result = Integer.valueOf(firstChar);
        } catch (NumberFormatException e) {

        }
        return result;
    }

    public static int findCalibrationValue(String s) {
        Integer firstValue = findFirstValueInString(s);
        Integer lastValue = findLastValueInString(s);
        return ((firstValue * 10) + lastValue);
    }

    public static List<String> readFileInList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(
                    Paths.get(fileName),
                    StandardCharsets.UTF_8);
        }
        catch (IOException e) {
            List<String> exceptionList = new ArrayList<>();
            exceptionList.add(FILE_NOT_FOUND);
            lines = exceptionList;
        }
        return lines;
    }

    public static int calculateCalibrationSumFromFile(String file) {
        List<String> lines = readFileInList(file);
        int result = 0;
        for(String line : lines) {
            // String convertedLine = convertSpelledNumbersToDigits(line);
            result += findCalibrationValueForConvertedString(line);
        }
        return result;
    }

    public static String convertSpelledNumbersToDigits(String s) {
        String result = "";

        findFirstSpelledNumber(s);
//        for(String spelledNumberString : spelledNumbers.keySet()) {
//            if(stringToConvert.contains(spelledNumberString)) {
//                stringToConvert = stringToConvert.replace(spelledNumberString, spelledNumbers.get(spelledNumberString).toString());
//            }
//        }
        return result;
    }

    private static String findFirstSpelledNumber(String s) {
        int firstSpelledNumberIndex = -1;
        String firstSpelledNumber = "";
        for(String spelledNumberString : SPELLED_NUMBERS.keySet()) {
            int currentSpelledNumberindex = s.indexOf(spelledNumberString);
            if(currentSpelledNumberindex > -1) {
                if(firstSpelledNumberIndex > currentSpelledNumberindex || firstSpelledNumberIndex == -1) {
                    firstSpelledNumberIndex = currentSpelledNumberindex;
                    firstSpelledNumber = spelledNumberString;
                }
            }
        }
        return firstSpelledNumber;
    }

    public static int findCalibrationValueForConvertedString(String s) {
        String convertedString = convertSpelledNumbersToDigits(s);
        System.out.println(convertedString);
        return findCalibrationValue(convertedString);
    }
}
