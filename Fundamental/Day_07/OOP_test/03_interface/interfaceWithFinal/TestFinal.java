class TestFinal  {

	public static void main(String[] args) {
		useFinal();

     int data=20;
		MyInter inter=new MyInter(){
			@Override
			public void show(){
				System.out.println("Show data "+data);
			}
		};
		// data=20;

		inter.show();
	}

	static void useFinal(){
		 
		int data=10;
		class Data{

			//must be finla or ecffectively final cus it is used in local class 
			void showData(){
				System.out.println("Show dat "+data);
			}
		}
		// data=20;

		Data d=new Data();

		d.showData();
	}
	
}

interface MyInter{
	void show();
}

