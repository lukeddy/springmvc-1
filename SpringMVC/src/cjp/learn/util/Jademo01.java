package cjp.learn.util;

public class Jademo01 {
	
	public  static  void main(String[] args){
		
		//测试结果
		System.out.println(testRandF());
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//测试return， 和finally
	public static String testRandF(){
		try {
			String mm = "b";
			return mm;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("是否在return 前执行嗯?");
		}
		return "a";
	}
}
