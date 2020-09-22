public class SnakeAndLadder
{
    public static void main(String args[])
{
    int start_pos=0;
    while(start_pos!=100) {
        int die_number = (int) (Math.random() * 6 + 1);
        int option = (int) (Math.random() * 3 + 1);
        switch (option) {
            case 1:
                start_pos += 0;
                break;
            case 2:
                start_pos += die_number;
                break;
            case 3:
                start_pos -= die_number;
                break;
            default:
                start_pos = start_pos;
        }
        if(start_pos<0)
            start_pos=0;
        if(start_pos>100)
            start_pos-=die_number;
    }
}
}