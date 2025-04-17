class Box
{
	int width,length,height;
	Box(int w,int l,int h)
	{
		width = w;
		length = l;
		height = h;
	}
	public String toString()
	{
		return width+" is width "+height+"  height "+length+" with length ";
	}
}
public class StringProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b = new Box(10,20,10);
		System.out.println(b);
	}

}
