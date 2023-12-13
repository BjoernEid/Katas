package advent.notQuiteLisp;

public class NotQuiteLisp {
    private final Integer BASEMENT = -1;
    public static Integer calculateFloor(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        Integer floor = 0;
        while (stringBuffer.length() > 0) {
            if (stringBuffer.substring(0, 1).equals("(")) {
                floor++;
            }
            if (stringBuffer.substring(0, 1).equals(")")) {
                floor--;
            }
            stringBuffer.deleteCharAt(0);
        }
        return floor;
    }

    public static Integer calculateFirstFloorEnteringPosition(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        Integer position = 0;
        Integer currentFloor = 0;
        while(currentFloor != -1 && stringBuffer.length() > 0) {
            if (stringBuffer.substring(0, 1).equals("(")) {
                currentFloor++;
            }
            if (stringBuffer.substring(0, 1).equals(")")) {
                currentFloor--;
            }
            stringBuffer.deleteCharAt(0);
            position++;
        }
        return position;
    }
}
