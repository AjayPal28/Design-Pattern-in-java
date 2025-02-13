package com.ajay.BuilderDesignPattern;

class Food {

	private String name;
	private int calories;
	private String sauce;
	private boolean isVeg;
	private boolean isSpicy;

	public Food(Builder builder) {
		this.name = builder.name;
		this.calories = builder.calories;
		this.sauce = builder.sauce;
		this.isSpicy = builder.isSpicy;
		this.isVeg = builder.isVeg;
	}

	
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", calories=" + calories + ", sauce=" + sauce + ", isVeg=" + isVeg + ", isSpicy="
				+ isSpicy + "]";
	}



	public static class Builder {
		private String name;
		private int calories;
		private String sauce;
		private boolean isVeg;
		private boolean isSpicy;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setCalories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder setSauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public Builder setVeg(boolean isVeg) {
			this.isVeg = isVeg;
			return this;
		}

		public Builder setSpicy(boolean isSpicy) {
			this.isSpicy = isSpicy;
			return this;
		}

		public Food build() {
			return new Food(this);
		}
	}

}

public class Client {
	public static void main(String[] args) {
		Food food= new Food.Builder().setName("burger").setCalories(100).setVeg(true).build();
		System.out.println(food);
	}
}
