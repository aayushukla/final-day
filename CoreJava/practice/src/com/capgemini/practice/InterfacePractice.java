package com.capgemini.practice;

interface InterfacePractice {
	
	void fruit(String s);
	
	static void show(String s)
	{
		System.out.println("Fav fruit is "+s);
	}
}

class FavFruit implements InterfacePractice {
	
	public void fruit(String fav)
	{
		if(fav=="apple")
		{
			InterfacePractice.show("Apple");
		} 
		else if(fav=="orange")
		{
			InterfacePractice.show("Orange");
		}	
	}

	

}
