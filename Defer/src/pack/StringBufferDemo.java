package pack;

public class StringBufferDemo {
	
	public void chk()
	{
		StringBuilder sb=new StringBuilder("Hello"); 
		sb.append("Java");
		System.out.println(sb);
	}	
	public void chk1()
	{
		StringBuilder sb=new StringBuilder("Hello"); 
		sb.insert(1,"Java");
		System.out.println(sb);
	}
	
	public void chk2()
	{
		StringBuilder sb=new StringBuilder("Hello"); 
		sb.replace(1,2,"Java");  
		System.out.println(sb);
	}	
	public void chk3()
	{
		StringBuilder sb=new StringBuilder("Hello"); 
		sb.delete(1,4);  //char you want to keep
		System.out.println(sb);
	}
	
	public void chk4()
	{
		StringBuilder sb=new StringBuilder("PALINDROME"); 
		sb.reverse();  
		System.out.println(sb);
	}
	
	public void chk5()
	{
		StringBuilder sb=new StringBuilder(); 
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
	}	
	public void chk6()
	{
		StringBuilder sb=new StringBuilder(); 
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBufferDemo oo=new StringBufferDemo();
oo.chk();
oo.chk1();
oo.chk2();
oo.chk3();
oo.chk4();
oo.chk5();
oo.chk6();
	}

}
