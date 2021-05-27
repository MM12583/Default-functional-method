package default_method_and_functional;

public class SayableDemmo implements Sayable {

	public static void main(String[] args) {
//		 使用lambda 定義抽象方法
		Sayable sayable = (String message)->{
			System.out.println(message);
		}; 
		sayable.sayMore("使用lambda定義");
		
//		調用default
		sayable.say();
		
//		override 物件方法調用
		SayableDemmo sd = new SayableDemmo() ;
		sd.sayMore("");
		
//		default 可被override
		sd.say();
		
//		use static method
		Sayable.sayAgain("After Java 8 Interface can use static method");
	}
	
	@Override
	public void say() {
		System.out.println("default 可被override");
	}
	
	@Override
	public  void sayMore(String message) {
		System.out.println(message + "override 物件方法調用");
		
	}

}

@FunctionalInterface
interface Sayable{
	// default 定義介面具體方法
	default void say(){
		System.out.println("調用default");
	}
	
	// 通常抽象方法 (FunctionalInterface 只能有一個抽象方法)
	void sayMore(String message);
	
	// 可包含 object 方法(多個抽象方法 lambda 會找不到)
//	int hashcode();
//	boolean equals();
	
	
	// 靜態可定義具體方法
	static void sayAgain(String message){
		System.out.println(message);
	}
}
