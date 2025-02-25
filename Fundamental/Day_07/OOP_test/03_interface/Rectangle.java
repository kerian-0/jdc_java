class Rectangle extends Calculate implements Shape,Color{

	@Override
	public void showArea(){
		System.out.println("show area from reactangle: ");
	}

    @Override
    public void draw(){
	System.out.println("Drawing::::");
    }

    @Override
    public void printt(){
	System.out.println("red color::;;");
    }

}