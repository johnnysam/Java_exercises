public class Time2
{
    private int hour;
    private int minute;
    private int second;

    public Time2()
    {
        this(0, 0, 0);  // Time2 constructor with 3 arguments
    }

    public Time2(int h)
    {
        this(h, 0, 0);  // Time2 constructor with 3 arguments
    }

    public Time2(int h, int m)
    {
        this(h, m, 0);  // Time2 constructor with 3 arguments
    }

    public Time2(int h, int m, int s)
    {
        setTime(h, m, s);   // call of setTime to validate and set time
    }

    public Time2( Time2 time)
    {
          // Time2 constructor with 3 arguments
        this( time.getHour(), time.getMinute(), time.getSecond() );
    }

}
