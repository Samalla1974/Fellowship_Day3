public class Line_ComputationUC2
{
	public static void main(String[] args) 
	{
		//line 1
		// point 1
		double x1 = 1;
		double y1 = 1;

		// point 2
		double x2 = 5;
		double y2 = 5;

		double length1;

		length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)* (y2 - y1));
		System.out.println("length of a line :" + length1);
	
		//line 2
                // point 1
                double lx1 = 1;
                double ly1 = 1;

                // point 2
                double lx2 = 5;
                double ly2 = 5;

                double length2;

                length2 = Math.sqrt((lx2 - lx1) * (lx2 - lx1) + (ly2 - ly1)* (ly2 - ly1));
                System.out.println("length of a line :" + length2);
		
		if ( length1 == length2 )
		{
			System.out.println ("length of two lines are equal");
		}
		else
		{
			System.out.println ("length of two lines are not equal");
		}
	}
}



