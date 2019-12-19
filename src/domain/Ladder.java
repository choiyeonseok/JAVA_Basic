package domain;

class Ladder {
    private Row[] rows;

    Ladder(NaturalNumber height, NaturalNumber noOfPerson) {
        rows = new Row[height.getNumber()];
        for (int i = 0; i < height.getNumber(); i++) {
            rows[i] = new Row(noOfPerson);
        }
    }

    void drawLine(NaturalNumber height, NaturalNumber startPosition) {
        int startIndex = height.toArrayIndex();
        if (startIndex > rows.length - 1) {
            throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어 섰습니다. 현재 값 : %d ", startIndex));
        }
        rows[startIndex].drawLine(startPosition);
    }

    Marker run(Marker nthOfPerson) {
        int target = nthOfPerson.getNumber();
        for (int i = 0; i < rows.length; i++) {
            Row row = rows[i];
            nthOfPerson = row.move(nthOfPerson);
        }
        return nthOfPerson;
    }
}
