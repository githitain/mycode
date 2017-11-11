package RD_Flag;


public class FlagMap {

	private String value;
	

	public String getvalue() 
	{
		return value;
	}

	public FlagMap() 
	{
		super();
		// TODO Auto-generated constructor stub
	}



	public FlagMap(String value) {
		super();
		this.value=value;
		
	}

	@Override
	public String toString() {
		return  value;
	}

	public void setLocator(String value) {
		this.value = value;
	}

	
}

