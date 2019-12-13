package domain.card;

public enum Type {
    SPADE("�����̵�"),
    DIAMOND("���̾Ƹ��"),
    HEART("��Ʈ"),
    CLUB("Ŭ�ι�");
    
    private String koreanWord;

    Type(String koreanWord) {
        this.koreanWord = koreanWord;
    }
    
    public String getKoreanWord() {
    	return koreanWord;
    }
    
}
