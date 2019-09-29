package co.domain;

public class Car {
	
	private Integer id;
    private String license;
    private Integer passagenger;
    private Account driver; 
    
    
  
    

	
	public Car(Integer id, String license, Integer passagenger, Account driver) {
		super();
		this.id = id;
		this.license = license;
		this.passagenger = passagenger;
		this.setDriver(driver);
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Integer getPassagenger() {
		return passagenger;
	}
	public void setPassagenger(Integer passagenger) {
		this.passagenger = passagenger;
	}


	public Account getDriver() {
		return driver;
	}


	public void setDriver(Account driver) {
		this.driver = driver;
	}
    
    

}
