import javax.swing.text.AbstractDocument.BranchElement;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		class stak {
			int top;
			Boolean empty;
			int size;
			Object[] stakk;
			public  stak(int z) {
				this.size = size++;
				stakk = new Object[size];
				
			}
			public boolean is_full() {
				if (size == top) {
					return true;
				}
				else {
					return false;
				}
			}
			public Boolean is_empty() {
//				if (size == 0) {
//					return true;
//				}
//				else {
//					return false;
//				}
				return empty;
			}
			public int get_size() {
				return size;
				
			}
			public void push(Object item) {
				top++;
				stakk[top]= item;
				empty = false;
			}
			public void pop() {
				
				if (empty == true) {
					System.out.println("you cant its empty or you have poped too much");
//					top = 1;
				}
				else {
					top--;
					stakk[top]=null;
					if (top==0) {
						empty = true;				
					}
					
				}
			}
			

		}



	
	
	
}}
