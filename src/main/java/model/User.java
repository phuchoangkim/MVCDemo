package model;

public class User {
	private String _name;
	private int _age;
	
	public User() {};
	
	public User(User user) {
		this._name = user._name;
		this._age = user._age;
	}
	
	public User(String name, int age) {
		this._name = name;
		this._age = age;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		this._age = age;
	}

	@Override
	public String toString() {
		return "User [_name=" + _name + ", _age=" + _age + "]";
	}
}
