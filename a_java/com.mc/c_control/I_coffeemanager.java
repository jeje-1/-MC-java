package c_control;

import java.util.Scanner;

public class I_coffeemanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 100000;// 잔고 100000
		int salesPrice = 0;//
		int expences = 0;

		int americanoPrice = 3000;// 아메리카노 판매가 3000
		int americanoCost = 2000;// 아메리카노 매입가 2000
		int americanoStock = 10;// 아메리카노 재고 10
		int americanoSaftyStock = 3;// 아메리카노 안전재고 3
		int americanoSalesCnt = 0;// 아메리카노 판매량

		int mochaPrice = 4000;// 모카 판매가 4000
		int mochaCost = 3000;// 모카 매입가 3000
		int mochaStock = 10;// 모카 재고 10
		int mochaSaftyStock = 3;// 모카 안전재고 3
		int mochaSalesCnt = 0;// 모카 판매량

		int lattePrice = 5000; // 라떼 판매가 5000
		int latteCost = 4000;// 라떼 매입가 4000
		int latteStock = 10;// 라떼 재고 10
		int latteSaftyStock = 3;// 라떼 안전재고 3
		int latteSalesCnt = 0;// 라떼 판매량

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n=========Menu=========");
			System.out.println("판매등록(1)");
			System.out.println("현황(2)");
			System.out.println("종료(3)");
			System.out.print("입력 : ");

			int inputMenu = sc.nextInt();

			if (inputMenu == 1) {
				// 음료메뉴판 출력
				System.out.println("\n아메리카노(1)");
				System.out.println("모카(2)");
				System.out.println("라떼(3)");

				System.out.print("\n * 판매한 커피코드 : ");
				int inputCode = sc.nextInt();
				System.out.print(" * 판매량 : ");
				int orderCnt = sc.nextInt();

				if (inputCode == 1) {

					if (orderCnt > americanoStock) {
//	            		  - 주문량이 재고보다 많으면 주문을 취소한다. 
						System.out.println("재고가 부족해 주문을 취소합니다.");
						continue;
					}
//	            	 - 주문량이 재고보다 적거나 같으면 판매 수량만큼 재고를 차감하고, 잔고에 판매 금액을 반영한다. 

					americanoStock -= orderCnt;
					balance += americanoPrice * orderCnt;
					// 매출등록
					salesPrice += americanoPrice * orderCnt;
					americanoSalesCnt += orderCnt;
//			         - 커피 재고가 안전재고 미만이 되면 안전재고의 두 배 만큼 매입한다.
					if (americanoStock < americanoSaftyStock) {

						if (balance > americanoSaftyStock * 2 * americanoCost) {
							americanoStock += americanoSaftyStock * 2;
							balance -= americanoSaftyStock * 2 * americanoCost;
							// 지출등록
							expences += americanoSaftyStock * 2 * americanoCost;
						} else {
							// 잔고가 부족해 매입이 불가능하면 안전매고 매입을 취소한다.
							System.out.println(" [system:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
						}
					}

					System.out.println("\n 제품명 : 아메리카노");
					System.out.println(" 판매가 : " + americanoPrice);
					System.out.println(" 판매수량 : " + orderCnt);
					System.out.println(" 결재금액 :" + (americanoPrice * orderCnt));
					System.out.println(" 남은재고 : " + americanoStock);
				} else if (inputCode == 2) {

					if (orderCnt > americanoStock) {
//		            		  - 주문량이 재고보다 많으면 주문을 취소한다. 
						System.out.println("재고가 부족해 주문을 취소합니다.");
						continue;
					}
//		            	 - 주문량이 재고보다 적거나 같으면 판매 수량만큼 재고를 차감하고, 잔고에 판매 금액을 반영한다. 

					americanoStock -= orderCnt;
					balance += americanoPrice * orderCnt;
					// 매출등록
					salesPrice += americanoPrice * orderCnt;
					mochaSalesCnt += orderCnt;
//				         - 커피 재고가 안전재고 미만이 되면 안전재고의 두 배 만큼 매입한다.
					if (mochaStock < mochaSaftyStock) {
						if (balance > mochaSaftyStock * 2 * mochaCost) {
							mochaStock += mochaSaftyStock * 2;
							balance -= mochaSaftyStock * 2 * mochaCost;
							// 지출등록
							expences += mochaSaftyStock * 2 * mochaCost;
						} else {
							// 잔고가 부족해 매입이 불가능하면 안전매고 매입을 취소한다.
							System.out.println(" [system:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
						}
					}
					System.out.println("\n 제품명 : 모카");
					System.out.println(" 판매가 : " + mochaPrice);
					System.out.println(" 판매수량 : " + orderCnt);
					System.out.println(" 결재금액 :" + (mochaPrice * orderCnt));
					System.out.println(" 남은재고 : " + mochaStock);

				} else if (inputCode == 3) {

					if (orderCnt > latteStock) {
//		            		  - 주문량이 재고보다 많으면 주문을 취소한다. 
						System.out.println("재고가 부족해 주문을 취소합니다.");
						continue;
					}
//		            	 - 주문량이 재고보다 적거나 같으면 판매 수량만큼 재고를 차감하고, 잔고에 판매 금액을 반영한다. 

					latteStock -= orderCnt;
					balance += lattePrice * orderCnt;
					// 매출등록
					salesPrice += lattePrice * orderCnt;
					latteSalesCnt += orderCnt;
//				         - 커피 재고가 안전재고 미만이 되면 안전재고의 두 배 만큼 매입한다.
					if (latteStock < latteSaftyStock) {
						if (balance > latteSaftyStock * 2 * latteCost) {
							latteStock += latteSaftyStock * 2;
							balance -= latteSaftyStock * 2 * latteCost;
							// 지출등록
							expences += latteSaftyStock * 2 * latteCost;
						} else {
							// 잔고가 부족해 매입이 불가능하면 안전매고 매입을 취소한다.
							System.out.println(" [system:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
						}
					}
					System.out.println("\n 제품명 : 아메리카노");
					System.out.println(" 판매가 : " + lattePrice);
					System.out.println(" 판매수량 : " + orderCnt);
					System.out.println(" 결재금액 :" + (lattePrice * orderCnt));
					System.out.println(" 남은재고 : " + latteStock);

				} else {
					System.out.println("올바른 값을 입력하세요.");
				}

			} else if (inputMenu == 2) {
				System.out.println("\n 아메리카노 재고 :" + americanoStock + "| 아메리카노 판매량 : " + americanoSalesCnt);

				System.out.println("\n 모카 재고 :" + mochaStock + "| 모카 판매량 : " + mochaSalesCnt);

				System.out.println("\n 라떼 재고 :" + latteStock + "| 라떼 판매량 : " + latteSalesCnt);

				System.out.println("\n 잔고 : " + balance + " | 매출 : " + salesPrice + "| 지출 : " + expences);

			} else if (inputMenu == 3) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("알맞은 번호를 입력하세요.");
			}

		}

	}

}
