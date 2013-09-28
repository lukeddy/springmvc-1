package cjp.learn.gof.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例类
 * @author cjp1989
 * 类似Spring里面的方法，将类名注册，下次从里面直接获取
 */
public class Singleton2 {
	
	private static Map<String,Singleton2> map = new HashMap<String, Singleton2>();
	
	static {
		Singleton2 single = new Singleton2();
		map.put(single.getClass().getName(), single);
	}
	//保护的默认构造函数
	protected Singleton2(){};
	
	//静态工厂方法，返还此类唯一的实例
	public static Singleton2 getInstance(String name){
		//类名为null，则重新创建一个类名
		if(name==null){
			name = Singleton2.class.getName();
			System.out.println("name == null "+" ---->name= "+name);
		}
		if(map.get(name)==null){
			try {
				
				//利用类名反射生成类
				map.put(name,(Singleton2) Class.forName(name).newInstance());
				
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		System.out.println("map集合数目  "+map.size());
		return map.get(name);
	}
	
	//一个示意性的商业方法
	public String about(){
		return "Hello , I am RegSingleton";
	}
	
}
