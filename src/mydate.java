
public class mydate {

	private int day,month,year;
	public void Mydate() {
		day = 1;month = 01;year=2021;
	}
	
	
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}
	void display() {
		System.out.println(day + "/"+ month + "/" + year);
	}
	static void show() {
		System.out.println("In static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is change from remote repo");
		mydate d = new mydate();
		d.display();
		mydate.show();
	}

}
