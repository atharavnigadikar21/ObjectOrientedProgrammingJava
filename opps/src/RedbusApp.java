
class BookLaturSeat {
 static int totalseat = 20;
    synchronized static void bookseat(int seat){
        if(totalseat>=seat){
            System.out.println(seat+" seats booked sucessfully");
            totalseat = totalseat - seat;
            System.out.println("seat left  "+totalseat);

        }else{
            System.out.println("Sorry, seats are not available");
            System.out.println("left seats  are "+totalseat);

        }
    }
}
class Mythread1 extends Thread{
    BookLaturSeat b;
    int seats;
    Mythread1(BookLaturSeat b,int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookseat(seats);
    }
}


class Mythread2 extends Thread{
    BookLaturSeat b;
    int seats;
    Mythread2(BookLaturSeat b,int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookseat(seats);
    }
}

public class RedbusApp {
 public static void main(String[] args) {
    BookLaturSeat b1 = new BookLaturSeat();

    Mythread1 t1 = new Mythread1(b1, 7);
    t1.start();

    Mythread1 t2 = new Mythread1(b1, 5);
    t2.start();


    BookLaturSeat b2 = new BookLaturSeat();

    Mythread1 t3 = new Mythread1(b2, 9);
    t3.start();

    Mythread1 t4 = new Mythread1(b2, 4);
    t4.start();
 }   
}
