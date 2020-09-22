public class SnakeAndLadder
{
    public static void main(String args[])
{
    int start_pos=0, start2=0;int n=0,m=0; int lad_1=0,lad_2=0;
    while(start_pos!=100||start2!=100) {
        lad_1=0;
        int die_number_1 = (int) (Math.random() * 6 + 1);
        int die_number_2 = (int) (Math.random() * 6 + 1);
        n++;m++;
        int option_1 = (int) (Math.random() * 3 + 1);
        int option_2 = (int) (Math.random() * 3 + 1);
        if(lad_2!=1){
        switch (option_1) {
            case 1:
                start_pos += 0;
                break;
            case 2:
                start_pos += die_number_1;
                lad_1=1;
                break;
            case 3:
                start_pos -= die_number_1;
                break;
            default:
                start_pos = start_pos;
        }
        if(start_pos<0)
            start_pos=0;
        if(start_pos>100)
            start_pos-=die_number_1;
        System.out.println("For player 1 position after die roll number "+n+" = "+start_pos);}
        if(lad_1==1)
            continue;
        lad_2=0;
        switch (option_2) {
            case 1:
                start2 += 0;
                break;
            case 2:
                start2 += die_number_2;
                lad_2=1;
                break;
            case 3:
                start2 -= die_number_2;
                break;
            default:
                start2 = start2;
        }
        if(start2<0)
            start2=0;
        if(start2>100)
            start2-=die_number_2;
        System.out.println("For player 2 position after die roll number "+m+" = "+start2);
    }
    if(start_pos==100)
    {System.out.println("Winner is player 1");
    System.out.println("Total number of die rolls="+n);}
    else
    {
        System.out.println("Winner is player 2");
        System.out.println("Total number of die rolls="+m);
    }
}
}