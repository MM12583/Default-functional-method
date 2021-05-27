package default_method_and_functional;

public class SayableDemmo implements Sayable {

	public static void main(String[] args) {
//		 �ϥ�lambda �w�q��H��k
		Sayable sayable = (String message)->{
			System.out.println(message);
		}; 
		sayable.sayMore("�ϥ�lambda�w�q");
		
//		�ե�default
		sayable.say();
		
//		override �����k�ե�
		SayableDemmo sd = new SayableDemmo() ;
		sd.sayMore("");
		
//		default �i�Qoverride
		sd.say();
		
//		use static method
		Sayable.sayAgain("After Java 8 Interface can use static method");
	}
	
	@Override
	public void say() {
		System.out.println("default �i�Qoverride");
	}
	
	@Override
	public  void sayMore(String message) {
		System.out.println(message + "override �����k�ե�");
		
	}

}

@FunctionalInterface
interface Sayable{
	// default �w�q���������k
	default void say(){
		System.out.println("�ե�default");
	}
	
	// �q�`��H��k (FunctionalInterface �u�঳�@�ө�H��k)
	void sayMore(String message);
	
	// �i�]�t object ��k(�h�ө�H��k lambda �|�䤣��)
//	int hashcode();
//	boolean equals();
	
	
	// �R�A�i�w�q�����k
	static void sayAgain(String message){
		System.out.println(message);
	}
}
