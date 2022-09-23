package classesWithAttributes;

public class Product {

	public Product(int _id,	String _name,String _desciription,double _price,int _stockAmount,String _renk) {
		System.out.println("Yapıcı blok çalıştı");
		this._id=_id;
		this._name = _name;
		this._desciription = _desciription;
		this._price = _price;
		this._stockAmount = _stockAmount; 
		this._renk = _renk;
	}

	int _id;
	String _name;
	String _desciription;
	double _price;
	int _stockAmount;
	String _renk;
	String _kod;

	// getter
	public int getId() {

		return _id;
	}

	// setter
	public void setId(int id) {
		_id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_desciription() {
		return _desciription;
	}

	public void set_desciription(String _desciription) {
		this._desciription = _desciription;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String get_kod() {
		return this._name.substring(0, 1) + _id;
	}
	// HasanCihadÖrgün

}
