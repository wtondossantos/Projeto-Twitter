package twitter;

public enum TwetterAuth {
	
	/* Insert here your personal "Consumer Key (API Key)" from Twitter */
	API_KEY("Rn94c8CiHCP8P9UczuBtP8tpH"),
	/* Insert here your personal "Consumer Secret (API Secret)" from Twitter */
	API_SECRET("jas6SHevcs09X1iJW3c7NKxlAj9bxNEecgtfKt7MwmIkhCNdLa"),
	/* Insert here your personal "Access Token" from Twitter */
	ACCESS_TOKEN("128530922-83WhDPGxFEhYOdJaeq0XEwNBrebWSvGSgBwPBxio"),
	/* Insert here your personal "Access Token Secret" from Twitter */
	ACCESS_TOKEN_SECRET("XZrbahYRllt5gSev32kEaER0xJBqLFuHgf5dCLBuB4R6A"),
	
	
	/* Insert here your name "Owner"  from Twitter */
	OWNER("wtondossantos"),
	/* Insert here your "Owner ID" from Twitter */
	OWNER_ID("128530922");
	
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