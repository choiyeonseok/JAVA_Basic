package domain;

public enum Operator {
    PLUS("+", "덧셈"),
    MINUS("-", "뺄셈"),
    MULTIPLE("*", "곱셈"),
    DIVIDE("/", "나눗셈");

    private String sign;
    private String signKor;

    Operator(String sign, String signKor) {
        this.sign = sign;
        this.signKor = signKor;
    }

    public String getSign() {
        return sign;
    }

    public String getSignKor() {
        return signKor;
    }

    public static Operator fromString(String sign) {
        for (Operator op : Operator.values()) {
            if (op.sign.equalsIgnoreCase(sign)) {
                return op;
            }
        }
        return null;
    }

}
