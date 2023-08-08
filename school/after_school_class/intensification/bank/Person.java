package bank;

// 클래스 -> 설계도!
// 객체지향언어에서는 재활용이 제일 중요함 -> 하나의 클래스를 한번만 쓰는 것이 아닌 다른 누군가가 같이 사용하는 것!
// 하지만 누군가가 사용할 때 클래스의 내용을 변경하면 사용하기 어려워짐 -> 그래서 생성자를 이용해서 복사본을 전달해줌

public class Person {
	
	// 입금 및 출금을 하기 위해선 어떤 사람이 입/출금하였는지 또는 누가 누구에게 이체하였는지 등등의 정보가 필요함
	// -> 그래서 사람의 이름 및 나이와 가지고 있는 돈, 계좌에 대한 정보가 필요함
	
	// 사람이 은행에 가입할 때마다 이 클래스를 복제해서 사람의 정보를 저장함
	
	// 필드 (접근 제한자명이 없으면 default로 설정됨)
	String name;    // 이름
	int age;        // 나이
	int cashAmount; // 현금보유량
	
	// 계좌 -> 계좌를 구성하기 위해선 BankAccount 클래스에 있는 필드값이 필요함
	BankAccount account; // 계좌 정보 (account -> BankAccount 클래스에 있는 잔액의 정보를 가짐)
}
