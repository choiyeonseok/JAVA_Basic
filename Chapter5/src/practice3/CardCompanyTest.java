package practice3;

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber()); //10001
		System.out.println(yourCard.getCardNumber()); //10002
		
	}

}
