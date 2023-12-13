package advent.trebuchet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrebuchetTest {
    @Test
    void findFirstValueInStringWithOnlyANumberFindsCorrectValue() {
        Assertions.assertEquals(1, Trebuchet.findFirstValueInString("1"));
    }

    @Test
    void findFirstValueInStringWithLiteralsPrecedingANumberFindsCorrectValue() {
        Assertions.assertEquals(1, Trebuchet.findFirstValueInString("abc1"));
    }

    @Test
    void findLastValueInStringWithANumberPreceedingLiteralsFindsCorrectValue() {
        Assertions.assertEquals(1, Trebuchet.findLastValueInString("1abc"));
    }

    @Test
    void findCalibrationValueForStringContainingTwoValuesReturnsCorrectValue() {
        Assertions.assertEquals(12, Trebuchet.findCalibrationValue("1abc2"));
        Assertions.assertEquals(38, Trebuchet.findCalibrationValue("pqr3stu8vwx"));
    }

    @Test
    void findCalibrationValueForStringContainingOneValueReturnsCorrectValue() {
        Assertions.assertEquals(77, Trebuchet.findCalibrationValue("treb7uchet"));
    }

    @Test
    void readFileListContainsFileNotFoundMessageInCaseFileIsNotFound() {
        List StringList = Trebuchet.readFileInList("testinput2.txt");
        Assertions.assertTrue(StringList.contains(Trebuchet.FILE_NOT_FOUND));
    }

    @Test
    void readFileListReadsFile() {
        List StringList = Trebuchet.readFileInList("testInput.txt");
        Assertions.assertTrue(StringList.contains("hallo"));
    }

    @Test
    void calculateCalibrationSumFromFileReturnsCorrectSum() {
        Assertions.assertEquals(148, Trebuchet.calculateCalibrationSumFromFile("testInput2.txt"));
    }

    @Test
    void acceptanceTest() {
        Assertions.assertEquals(54674, Trebuchet.calculateCalibrationSumFromFile("input.txt"));
    }

    @Test
    void convertSpelledNumbersToDigitsWorksForOne() {
        Assertions.assertEquals("1", Trebuchet.convertSpelledNumbersToDigits("one"));
    }

    @Test
    void convertSpelledNumbersToDigitsWorksForTwo() {
        Assertions.assertEquals("2", Trebuchet.convertSpelledNumbersToDigits("two"));
    }

    @Test
    void convertSpelledNumbersToDigitsWorksForTwoTwo() {
        Assertions.assertEquals("22", Trebuchet.convertSpelledNumbersToDigits("twotwo"));
    }

    @Test
    void convertSpelledNumbersToDigitsWorksForTwoTwoWithCharInBetween() {
        Assertions.assertEquals("2s2", Trebuchet.convertSpelledNumbersToDigits("twostwo"));
    }

    @Test
    void convertSpelledNumbersToDigitsWorksForOverlappingSpelledNumbers() {
        Assertions.assertEquals("twone", Trebuchet.convertSpelledNumbersToDigits("21"));
    }

    @Test
    void findCalibrationValueForConvertedStringWorks() {
        Assertions.assertEquals(29, Trebuchet.findCalibrationValueForConvertedString("two1nine"));
        // Assertions.assertEquals(83, Trebuchet.findCalibrationValueForConvertedString("eightwothree"));
    }
}