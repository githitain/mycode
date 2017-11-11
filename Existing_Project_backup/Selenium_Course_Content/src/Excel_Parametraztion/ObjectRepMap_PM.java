package Excel_Parametraztion;

public class ObjectRepMap_PM {

	private String locator;
	private String locatorvalue;
	

	public String getLocator() 
	{
		return locator;
	}

	public ObjectRepMap_PM() 
	{
		super();
		// TODO Auto-generated constructor stub
	}



	public ObjectRepMap_PM(String locator, String locatorvalue) {
		super();
		this.locator = locator;
		this.locatorvalue = locatorvalue;
		
	}

	@Override
	public String toString() {
		return "ObjectRepository [locator=" + locator + ", locatorvalue="
				+ locatorvalue + "]";
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getLocatorvalue() {
		return locatorvalue;
	}

	public void setLocatorvalue(String locatorvalue) {
		this.locatorvalue = locatorvalue;
	}
	
}

