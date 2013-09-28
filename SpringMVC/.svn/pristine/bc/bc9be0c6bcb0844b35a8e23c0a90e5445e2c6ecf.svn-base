package cjp.learn.gof.singleton;

/**
 * 测试单例
 * @author cjp1989
 *
 */

public class TestSingleton {
	
	private String name;
	
	//该类只有一个实例
	private TestSingleton(){}//私有无参构造方法
	
	//该类必须自行创建 有2中方式
	/**
	 * 1.final 修饰，在类初始化时，已经自行实例化了-----饿汉式单例类
	 * 2.初始化为null， 在第一次调用的时候实例化  -------懒汉式单例类
	 */
	private static final TestSingleton singleton = new TestSingleton();
	
//	private static TestSingleton singleton = null;
	
	//这个类必须自动向整个系统提供这个实例对象
	public static TestSingleton getInstance(){
//		if(singleton==null){
//			singleton = new TestSingleton();
//		}
		return singleton;
	}
	public void getInfo(){
		System.out.println("output message "+name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
