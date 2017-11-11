package Java_8_1_2017;

public class Java_interfaceClass implements Java_interface 
{

	@Override
	public void start() 
	{
		Java_StaticMethod.info();
		System.out.println("Start the car");		
		
	}

	@Override
	public void Stop() 
	{
		System.out.println("stop the car");	
		System.out.println("Speed:" +  speed);

	}	
		public static void main(String args[])
		{
			Java_StaticMethod.info();
			Java_interfaceClass obj = new Java_interfaceClass();
			obj.start();
			obj.Stop();
			//obj.speed;
			
			
		}
	}


