package sec01.exam05;

public class Mem {
	
	public String name;
	public int age;
	
	public Mem(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mem) {
			Mem member = (Mem) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
		@Override
		public int hashCode() {
			return name.hashCode() + age;
		}
	
}
