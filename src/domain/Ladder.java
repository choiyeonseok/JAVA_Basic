package domain;

import core.NaturalNumber;

class Ladder {
    private Row[] rows;

    Ladder(NaturalNumber height, NaturalNumber noOfPerson) {
        rows = new Row[height.getNumber()];
        for (int i = 0; i < height.getNumber(); i++) {
            rows[i] = new Row(noOfPerson);
        }
    }

    public static String generate(Row[] rows, Position position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            Row row = rows[i];
            row.generateRow(sb, i, position);
        }
        return sb.toString();
    }

    void drawLine(NaturalNumber height, NaturalNumber startPosition) {
        if (isOverHeight(height)) {
            throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어 섰습니다. 현재 값 : %d ", height));
        }
        rows[height.toArrayIndex()].drawLine(startPosition);
    }

    private boolean isOverHeight(NaturalNumber height) {
        return height.toArrayIndex() > rows.length - 1;
    }

    Marker run(Marker nthOfPerson) {
        int target = nthOfPerson.getNumber();
        for (int i = 0; i < rows.length; i++) {
            Row row = rows[i];
            nthOfPerson = row.move(nthOfPerson);
            System.out.println(generate(rows, Position.createFromArrayIndex(i, nthOfPerson.toArrayIndex())));
        }
        return nthOfPerson;
    }
}
