package domain;

public class Row {
    int[] persons;

    Row(int noOfPersons){
        persons = new int[noOfPersons];
    }

    void drawLine(int startPosition) {
        persons[startPosition] = 1;
        persons[startPosition + 1] = 1;
    }

    int moveRow(int nthOfPerson) {
        if (persons[nthOfPerson] == 0) {  // 좌,우 이동 없이 바로 내려온다.
            return nthOfPerson;
        }
        if (nthOfPerson - 1 >= 0) {   // 0 보다 큰 인덱스까지, 1 감소한 인덱스를 반환
            int leftValue = persons[nthOfPerson - 1];
            if (leftValue == 1) {
                return nthOfPerson - 1;
            }
        }
        return nthOfPerson + 1;
    }
}
