package domain;

class Row {
    private enum Direction {
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

    private int[] persons;

    Row(NaturalNumber noOfPersons){
        persons = new int[noOfPersons.getNumber()];
    }

    void drawLine(NaturalNumber startPosition) {
        int startIndex = startPosition.toArrayIndex();
        if (startIndex >= persons.length - 1) {
            throw new IllegalArgumentException(String.format("시작 점은 %d미만이어야 합니다. 현재 값은 : %d", persons.length - 1, startIndex));
        }

        if (persons[startIndex] == -1) {
            throw new IllegalArgumentException("선을 그을 수 없는 위치입니다.");
        }
        persons[startIndex] = Direction.RIGHT.getNo();
        persons[startIndex + Direction.RIGHT.getNo()] = Direction.LEFT.getNo();
    }

    Marker move(Marker startMarker) {
        if (isNoLine(startMarker.toArrayIndex())) {
            return startMarker;
        }

        if (isRightDirection(startMarker.toArrayIndex())) {
            return startMarker.moveRight();
        }

        return startMarker.moveLeft();
    }

    private boolean isRightDirection(int nthOfPerson) {
        return persons[nthOfPerson] == Direction.RIGHT.getNo();
    }

    private boolean isNoLine(int nthOfPerson) {
        return persons[nthOfPerson] == Direction.CENTER.getNo();
    }
}
