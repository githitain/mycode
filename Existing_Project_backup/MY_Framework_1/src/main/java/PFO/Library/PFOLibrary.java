package PFO.Library;

public interface PFOLibrary {
	public void goTo(String url);
	public Object login(String...cred); 
	public Object search(String... s);
	public Object verifyText(String... text);
	public Object clickLink(String... link);
	public Object clickButton(String... button);
	public Object checkBox(String... click);
	public Object emailSend(String... text);
	public Object Re_Com_Search(String... text);
	public Object dropDown(String... text);
	public Object sendKeys(String... text);
	public Object popHandling(String... text);
	public Object dropDownvalue(int... text);
	public Object popSwitch(String... text);
	public Object popSwitchBack(int... text);
	public void waitForOjecttoLoad(String... text);
	public Object alertAccept(String... text);
	public Object searchSelect(String... text);
	public Object sortBy(String... text);
	public Object formSubmission(String... text);
	public Object refineBy(String... text);

}
