package domain;

public class LadderRunner {
    private Row[] rows;

    public LadderRunner(Row[] rows){
        this.rows = rows;
    }

    Marker run(Marker nthOfPerson) {
        for (int i = 0; i < rows.length; i++) {
            Row row = rows[i];
            nthOfPerson = row.move(nthOfPerson);
            System.out.println(generate(rows, Position.createFromArrayIndex(i, nthOfPerson.toArrayIndex())));
        }
        return nthOfPerson;
    }

    public static String generate(Row[] rows, Position position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            Row row = rows[i];
            row.generateRow(sb, i, position);
        }
        return sb.toString();
    }

}
