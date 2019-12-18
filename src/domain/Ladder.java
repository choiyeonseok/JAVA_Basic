package domain;

public class Ladder {
    Row[] rows;

    Ladder(int countOfRows, int noOfPerson) {
        rows = new Row[countOfRows];
        for (int i = 0; i < countOfRows; i++) {
            rows[i] = new Row(noOfPerson);
        }
    }

    public void drawLine(int noOfRow, int startPosition) {
        rows[noOfRow].drawLine(startPosition);
    }

    public int run(int nthOfPerson) {
        for (int i = 0; i < rows.length; i++) {
            Row row = rows[i];
            nthOfPerson = row.move(nthOfPerson);
        }
        return nthOfPerson;
    }
}
