class Item {
	int id;
	String name;
	double price;
	char danok;

	public Item(int id, String name, double price, char danok) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.danok = danok;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getDanok() {
		return danok;
	}

	public void setDanok(char danok) {
		this.danok = danok;
	}
	//TODO add variable.

	//TODO constructor

	//TODO setters and getters

	double taxReturn () {
		return danok*15/100;
		//TODO
	}
}
class  Receipt extends Item{
	List<Item> artikli=new ArrayList();
	double Sum(List<Item> lista)
	{
		int sum=0;
		for(int i=0;i<lista.size();i++)
		{
			sum=sum+lista[i].getPrice();
		}
		return sum;
	}
	double VkupenDanok(List<Item> lista)
	{
		int danok=0;
		for(int i=0;i<lista.size();i++)
		{
			danok=danok+lista[i].getPrice();
		}
		return danok;
	}
}