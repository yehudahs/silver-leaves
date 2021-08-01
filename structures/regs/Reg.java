package regs;

public class Reg {
	
	protected String _address;
	private String _name;
	
	public Reg(String name, String address) {
		_name = name;
		_address = address;
	}

	public String get_address() {
		return _address;
	}

	public String get_name() {
		return _name;
	}

}
