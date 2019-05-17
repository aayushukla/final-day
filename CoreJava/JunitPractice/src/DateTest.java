class DateTest {

	public static void main(String[] args)
	{
		Date obj=new Date(06,10,1996);
		Date obj2=new Date(06,10,2016);

		System.out.println(obj);
		System.out.println(obj2);

		
		Date obj3;
		obj3=obj.isSmaller(obj2);
		System.out.println(obj3);
	}
	

}
































