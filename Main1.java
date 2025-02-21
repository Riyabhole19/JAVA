interface Resizable 
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable
{
    private int width;
    private int height;


    public Rectangle( int height, int width)
    {
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }


    public void resizeWidth(int width)
    {
        this.width += width;
    }

    public void resizeHeight(int height)
    {
        this.height += height;
    }
	
}
	


public class Main1
{
    public static void main(String[] args)
    {
        Rectangle R = new Rectangle(10, 20);
        System.out.println("Initial dimensions printed");
	System.out.println("W: " + R.getWidth());
        System.out.println("H: " + R.getHeight());
        System.out.println("Updated dimensions are printed");
        R.resizeHeight(12);
        R.resizeWidth(22);
        System.out.println("H: " + R.getHeight());
        System.out.println("W: " + R.getWidth());
    }
}
