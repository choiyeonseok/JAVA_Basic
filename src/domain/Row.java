package domain;

public class Row {
    private static final int RIGHT_DIRECTION = 1;
    private static final int LEFT_DIRECTION = -1;
    private static final int CENTER_DIRECTION = 0;


    int[] persons;

    Row(int noOfPersons){
        persons = new int[noOfPersons];
    }

    void drawLine(int startPosition) {
        persons[startPosition] = RIGHT_DIRECTION;
        persons[startPosition + RIGHT_DIRECTION] = LEFT_DIRECTION;
    }

    int move(int nthOfPerson) {
        if (isNoLine(nthOfPerson)) {
            return nthOfPerson;
        }

        if (isRightDirection(nthOfPerson)) {
            return nthOfPerson + RIGHT_DIRECTION;
        }

        return nthOfPerson + LEFT_DIRECTION;
    }

    private boolean isRightDirection(int nthOfPerson) {
        return persons[nthOfPerson] == RIGHT_DIRECTION;
    }

    private boolean isNoLine(int nthOfPerson) {
        return persons[nthOfPerson] == CENTER_DIRECTION;
    }
}
