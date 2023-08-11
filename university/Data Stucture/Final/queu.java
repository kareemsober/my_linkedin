

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	class Queue {
		int Rear;
		int Front;
		Object[] Queue;
		
		int size;
		
		String status;
		
		
		public  Queue(int size) {
			this.size = size;
			Queue = new Object[size];
			Front = -1;
			Rear = -1;
			
		}

		
		
		public String is_full() {
			if (Rear == size - 1) {
				status = "full";
				return status;
			}
			else {
				status = "not full";
				return status;
			}
		}
		
		public String is_empty() {
			if (Front ==  -1) {
				status = "empty";
				return status;
			}
			else {
				status = "not empty";
				return status;
			}
		}
		
		
		public void Queuee(Object Item) {
			
			if (is_full() == "full") {
				System.out.println("full");
				return;
			}
			
			Rear++;
			
			if (Front == -1) {
				Front++;
			
			}
			
			Queue[Rear]= Item;
			
		}
		
		
		
		
		public Object Dequeuee() {
			
			if (is_empty()== "empty") {
				System.out.println("empty");
				return null;
			}
			else {
				
			Object Object =(Object)Queue[Front];
			
			Front++;
			
			return Object;
			}
		}
	}


	Queue test1= new Queue(10);
	test1.Queuee(1);
	test1.Queuee(2);
	test1.Queuee(3);
	test1.Queuee(4);
	test1.Queuee(5);
	test1.Queuee(6);
	test1.Queuee(7);
	test1.Queuee(8);
	test1.Queuee(9);
	test1.Queuee(10);

	System.out.println(test1.Dequeuee());
	System.out.println(test1.Dequeuee());
	System.out.println(test1.Front);
	System.out.println(test1.Rear);
	
	
	
}}
