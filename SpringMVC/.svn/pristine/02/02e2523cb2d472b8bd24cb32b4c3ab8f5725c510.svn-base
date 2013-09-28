package cjp.learn.gof.singleton;

/**
 * 测试single单例运行状态
 * @author cjp1989
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		//简单测试单例模式
//		testSingleton();
		
		
		//测试登记式单例类
		testSingleton2();
		
	}
	
	/**
	 * 运行方法，测试单例模式
	 */
	public static void testSingleton(){
		TestSingleton s1 = TestSingleton.getInstance();
		s1.setName("cjp1989");
		System.out.println(s1.getName());
		
		TestSingleton s2 = TestSingleton.getInstance();
		s2.setName("hello,new name");
		System.out.println(s2.getName());
		
		s1.getInfo();
		s2.getInfo();
		
		if(s1==s2){
			System.out.println("s1==s2 为同一对象");
		}else if(s1!=s2){
			System.out.println("s1!=s2   不为同一对象");
		}else{
			System.out.println("application error");
		}
		
	}
	/**
	 * 测试登记式单例类
	 * @mess Singleton2
	 */
	public static void testSingleton2(){
		Singleton2 s1 = new Singleton2();
		Singleton2 s2 = new Singleton2();
		
		System.out.println("s1 类名  "+s1.getClass().getName());
		
		Singleton2 s3 = Singleton2.getInstance(null);
		Singleton2 s4 = Singleton2.getInstance("cjp.learn.gof.singleton.Singleton2");
		
		System.out.println(s1.about());
		System.out.println(s3.about());
		System.out.println("s1 s2 是否为同一对象"+(s1==s2));
		System.out.println("s1 s3 是否为同一对象"+(s1==s3));
		System.out.println("s1 s4 是否为同一对象"+(s1==s4));
		System.out.println("s1 s4 是否为同一对象"+(s2==s4));
		System.out.println("s2 s3 是否为同一对象"+(s2==s3));
		System.out.println("s3 s4 是否为同一对象"+(s3==s4));
	}
}
