package VendingMachineData;

public enum Drink{
	
	COK("COKE",25),
	PEP("PEPSI",35),
	SOD("SODA",45);
	
	private int price;
	private String name;

	private Drink(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public String getName()
	{
		return this.name;
	}
}