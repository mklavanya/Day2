class Switchcase{
  public static void main(String[] args) {
		int number = 3;
		String monthname = "";
		switch(number) {
		case 1:
			 monthname = "jan";
			System.out.println("not my birthday");
		break;
		case 2:
			monthname= "feb";
			System.out.println("not my birthday");
		break;
		case 3:
			monthname = "mar";
			System.out.println("my birthday");
		break;
		case 4:
			monthname = "apr";
			System.out.println("not my birthday");
		break;
		default:
			System.out.println("not in the List");
		}

	}

}
