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