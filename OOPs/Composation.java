class Room{
void showRoom(){
System.out.println("Room is created");
}
}
class House{
private Room room;//Composition

House(){
room  = new Room();//create inside House 
}
void showHouse(){
System.out.println("hous is created");
room.showRoom();
}
}

class Test {
public static void main(String [] args){
House h = new House();
h.showHouse();
} }