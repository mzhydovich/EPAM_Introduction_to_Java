package Task_02;

import java.util.Arrays;

public class Payment {
	
	private int sum;
	private int size;
	private int capacity = 1;
	private Product[] productList = new Product[capacity];
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}


	public Product[] getProductList() {
		return productList;
	}


	public void setProductList(Product[] productList) {
		this.productList = productList;
	}
	
	@Override
	public String toString() {
		return "Payment [summ=" + sum + ", size=" + size + ", capacity="
				+ capacity + ", productList=" + Arrays.toString(productList) + "]";
	}

	public class Product{
		
		private int cost;
		private String name;
		
		public Product() {
			
		}
		
		public Product(String name, int cost) {
			this.name = name;
			this.cost = cost;
			
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Product [cost=" + cost + ", name=" + name + "]";
		}

	}

}
