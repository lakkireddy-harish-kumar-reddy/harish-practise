class A
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

	class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}

//    static class B
//    {
//        public void config()
//        {
//            System.out.println("in config");
//        }
//    }
}


public class  InnerClass{
    public static void main(String[] args) {

    	A.B obj1= new A().new B();
    	obj1.config();

//        A.B obj1=new A.B();
//        obj1.config();

    }
}
