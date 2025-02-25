 class Factory {
	//composition
	//has a relation
private Employee employee=new Employee();

Factory(Employee employee){
	this.employee=employee;
}



void setPosition(String position){
	employee.setPosition(position);
}

void showPosition(){
	employee.showPosition();
}
	


}

 class Employee{

	private String position;

	void setPosition(String position){
	  this.position=position;
	}


    void showPosition(){
    	System.out.println("Message :Show message "+message);
    }

}