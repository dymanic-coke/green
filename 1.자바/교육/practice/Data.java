package practice;

class Data<K> {
	K obj;
	
	Data(K obj){
		this.obj = obj;
	}
	
	K getObj() {
		return obj;
	}
	
	void showType() {
		System.out.println("Type of K : " + obj.getClass().getSimpleName());
	}

}

