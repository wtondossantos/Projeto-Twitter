package twitter;

public enum TwetterAuth {
	
	/* Insert here your personal "Consumer Key (API Key)" from Twitter */
	API_KEY(""),
	/* Insert here your personal "Consumer Secret (API Secret)" from Twitter */
	API_SECRET(""),
	/* Insert here your personal "Access Token" from Twitter */
	ACCESS_TOKEN(""),
	/* Insert here your personal "Access Token Secret" from Twitter */
	ACCESS_TOKEN_SECRET(""),
	
	
	/* Insert here your name "Owner"  from Twitter */
	OWNER("wtondossantos"),
	/* Insert here your "Owner ID" from Twitter */
	OWNER_ID("");
	
	private String key;

	/**
	 * @param arg0
	 */
	private TwetterAuth(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
