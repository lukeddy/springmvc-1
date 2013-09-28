package cjp.learn.gof.singleton;

/**
 * @version 1.0
 * @des :单例模式--private--唯一实例
 * @author cjp1989
 * 
 */
public class Singleton {
	
	//私有静态类的自身实例
	private static Singleton singleton = new Singleton();
	
	/*** 私有的 构造方法
	 * 
	 *   通过java反射机制是能够实例化构造方法为private的类的。
	 */
	private Singleton(){
		
	}
	//公开，静态的工厂方法
	public static Singleton getInstance(){
		
		//Lazy loading
		/**
		 * 对于资源密集，配置开销较大的单体更合理的做法是
		 * 将实例化(new)推迟到使用它的时候
		 * 
		 */
		if(singleton == null){
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	// Other methods...
}
