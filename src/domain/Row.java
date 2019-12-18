package domain;

public class Row {
    enum Direction {
        LEFT(-1),
        RIGHT(1),
        CENTER(0);

        private int no;

        Direction(int no) {
            this.no = no;
        }

        int getNo(){
            return no;
        }

    }

    int[] persons;

    Row(int noOfPersons){
        persons = new int[noOfPersons];
    }

    void drawLine(int startPosition) {
        persons[startPosition] = Direction.RIGHT.getNo();
        persons[startPosition + Direction.RIGHT.getNo()] = Direction.LEFT.getNo();
    }

    int move(int nthOfPerson) {
        if (isNoLine(nthOfPerson)) {
            return nthOfPerson;
        }

        if (isRightDirection(nthOfPerson)) {
            return nthOfPerson + Direction.RIGHT.getNo();
        }

        return nthOfPerson + Direction.LEFT.getNo();
    }

    private boolean isRightDirection(int nthOfPerson) {
        return persons[nthOfPerson] == Direction.RIGHT.getNo();
    }

    private boolean isNoLine(int nthOfPerson) {
        return persons[nthOfPerson] == Direction.CENTER.getNo();
    }
}
