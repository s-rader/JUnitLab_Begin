package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class GiftCardTest{
	@Test
	public void getIssuingStore(){
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}
	
	@Test
	public void getBalance(){
		double balance;
		GiftCard card;
		int issuingStore;
		double tolerance;
		
		issuingStore = 1337;
		balance = 100.00;
		tolerance = 0.001;
		
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getBalance()", balance, card.getBalance(), tolerance);
	}	
	
	@Test
	public void deduct(){
		double balance;
		double amount;
		GiftCard card;
		int issuingStore;
		String expected;
		
		issuingStore = 1337;
		balance = 100.00;
		amount = 20.00;
		expected = "Remaining Balance:  80.00";
		
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("deduct()", expected, card.deduct(amount));
	}
}