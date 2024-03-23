package main;
public class Axis { 

    public static String pos(int x, int y) {
        if (x == 0 && y == 0){
            return "Trùng điểm O";
        } else 
        if (x == 0){
            return "Trục tung";
        } else 
        if (y == 0){
            return "Trục hoành";
        } else 
        if ( x < 0) {
            if (y > 0) return "Góc 1/4 thứ 2";
            else return "Góc 1/4 thứ 3"; 
        } else {
            if (y > 0) return "Góc 1/4 thứ 1";
            else return "Góc 1/4 thứ 4";
        }
    }

	public static void main(String[] args) { 
		int x = 1, y = 2;
		System.out.println(pos(x,y)); 
		
	} 
}