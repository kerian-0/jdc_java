class Main{
	public static void main(String[] args) {
		// int value=20;
		// updateValue(value);
		// System.out.println("Update : " +value);

		Data data=new Data();
		data.value=20;
		updateData(data);
		// System.out.println("Update data: "+data.value);
		// updateDataTow(data);

		System.out.println("Upadate data: "+data.value);
	}


	// static void updateValue(int value){
	// 	value=30;

	// }

	static void updateData(Data data){
		data.value=30;
		// System.out.println(data.value);
	}

	// static void updateDataTow(Data data){
	// 	data=new Data();
	// 	data.value=30;}
}

class Data{

	int value;
}