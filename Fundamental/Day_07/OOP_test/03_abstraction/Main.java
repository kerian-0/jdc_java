class Main{
	public static void main(String[] args) {
		//by sub class
		Reaction emoji=new Emoji();
		// Reaction emoji=new Reaction();

		emoji.love();
		emoji.hate();
		emoji.haha();

		emoji.setMessage("Use Emoji: ");
		System.out.println(emoji.getMessage());



        //by sub class
		Reaction avator =new Avator();
		avator.setMessage("use Avator");
		System.out.println(avator.getMessage());

		avator.love();
		avator.hate();
		avator.haha();
		Reaction react =new Reaction(){
			void love(){
				System.out.println(" React:  I love you");
			}
			void hate(){
				System.out.println(" React:  I hate you");
			}
			void haha(){
				System.out.println(" React:  I haha you");
			}

		};
		// System.out.println(react);
		react.setMessage("use React");
		System.out.println(react.getMessage());

		react.love();
		react.hate();
		react.haha();


	}
}