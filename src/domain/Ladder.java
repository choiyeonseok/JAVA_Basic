package domain;

public class Ladder {
    private int[][] rows;

    Ladder(int countOfRows, int noOfPerson) {
        rows = new int[countOfRows][noOfPerson];
    }

    public void drawLine(int noOfRow, int startPosition) {
        rows[noOfRow][startPosition] = 1;
        rows[noOfRow][startPosition + 1] = 1;
    }

    public int run(int nthOfPerson) {
        for (int i = 0; i < rows.length; i++) {
            int[] row = rows[i];
            nthOfPerson = moveRow(nthOfPerson, row);
        }
        return nthOfPerson;
    }

    private int moveRow(int nthOfPerson, int[] row) {
        if (row[nthOfPerson] == 0) {  // 좌,우 이동 없이 바로 내려온다.
            return nthOfPerson;
        }
        if (nthOfPerson - 1 >= 0) {   // 0 보다 큰 인덱스까지, 1 감소한 인덱스를 반환
            int leftValue = row[nthOfPerson - 1];
            if (leftValue == 1) {
                return nthOfPerson - 1;
            }
        }
        return nthOfPerson + 1;
    }
}
