package com.test.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.test.junit.model.PromoCodes;



//
//public class AppTest 
//    extends TestCase
//{
//    PromoCodes promoCodes;
//    public AppTest( String testName )
//    {
//        super( testName );
//       promoCodes = new PromoCodes(); 
//    }
//
//    
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//   
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//    public void testAppAgain() {
//    	int expectedCabFare = 500;
//    	int actualCabFare = 500;
//    	assertEquals(expectedCabFare, actualCabFare);
//    }
//    
//    public void testPromoCode() {
//    	assertEquals(true, promoCodes.checkPromoCodes("bingo"));
//    }
//}

		
		public class AppTest{
			PromoCodes promoCodes = new PromoCodes();
//			
//			@Test
//			public void testPromoCode() {
//				assertEquals(true, promoCodes.checkPromoCodes("bingo"));
//		    }
//			@Test
//			public void TestDiscount() {
//				String pCode = "JUMBO";
//				double expectedDiscount = 0.4;
//				double actualDiscount = promoCodes.getDiscount(pCode);
//				assertEquals(expectedDiscount, actualDiscount);
//			}
//			
//			@Test
//			public void testAmountAfterDiscount() {
//				String pCode = "TRYNEW90";
//				double amount = 1000.0;
//				double expectedAmountAfterDiscount = 100.0;
//				double actualAmountAfterDiscount = promoCodes.getAmountAfterDiscount(pCode, amount);
//			}
//			
//			@Test
//			public void testDiscountAmountWithTax() {
//				String pCode = "SUNDAY";
//				double amount = 1000.0;
//				double expectedDiscountAmountWithTaxes = 885.0;
//				double actualDiscountAmountWithTaxes = promoCodes.getDiscountAmountWithTaxes(pCode, amount);
//				assertEquals(expectedDiscountAmountWithTaxes, actualDiscountAmountWithTaxes);
//			}
		
			@Test
			public void testBasicFlow() {
				assertEquals(0.4,promoCodes.getDiscount("JUMBO"));
				assertEquals(0.4, promoCodes.getDiscount("BINGO"));
			}
				@Test
				public void testGroup() {
					assertAll("PromoCode Discount", 
							() -> assertEquals(0.4, promoCodes.getDiscount("JUMBO")),
							() -> assertEquals(0.4, promoCodes.getDiscount("BINGO")),
							() -> assertEquals(0.4, promoCodes.getDiscount("TRYNEW90"))
							);
				}
				
				@Test 
				public void testLuckyPromoCode() {
					Exception exception =  assertThrows(ArrayIndexOutOfBoundsException.class,
									() -> promoCodes.luckyPromoCode(7));
					System.out.println("Message: " + exception.getMessage());
				}
		}