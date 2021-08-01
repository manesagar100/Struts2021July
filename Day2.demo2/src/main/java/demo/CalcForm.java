package demo;

		import org.apache.struts.action.ActionForm;

		public class CalcForm extends ActionForm {

			public CalcForm() {
				System.out.println("CalcFrom Constructor invoked ...");
			}
			private int number1;
			private int number2;
			private int sum;
			public int getNumber1() {
				System.out.println("getNumber1 invoked ...");
				return number1;
			}
			public void setNumber1(int number1) {
				System.out.println("setNumber1 invoked ...");
				this.number1 = number1;
			}
			public int getNumber2() {
				return number2;
			}
			public void setNumber2(int number2) {
				this.number2 = number2;
			}
			public int getSum() {
				return sum;
			}

			public void add() {
				sum = number1+number2;
			}

		}