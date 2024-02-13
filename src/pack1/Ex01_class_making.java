package pack1;

/*
	java 파일에 클래스 생성시키기
	
	이와 같이 java파일을 만들고 package와 class를 지정하면 해당 위치의 bin 폴더에 클래스 파일이 생성됨
	이클립스는 저장과 동시에 컴파일을 하므로 저장만 해도 bin에 바이트 코드가 생성되는 원리
*/

class A { // A.class가 생성
	
}

class B { // B.class가 생성
	
}

class C { // C.class가 생성
	class D { // C$D.class가 생성
		
	}
}