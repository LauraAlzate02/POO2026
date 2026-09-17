public class TestRoomReservation {
    
    public static void main(String[] args){

        RoomReservation room1 = new RoomReservation();

        room1.setGuest("Laura");
        room1.setNumberOfNigths(3);
        room1.setPricePerNight(200000);
        room1.setRoomNumber(212);
        
        System.out.println(room1.getGuest());
        System.out.println(room1.getNumberOfNights());
        System.out.println(room1.getPricePerNight());
        System.out.println(room1.getRoomNumber());

        System.out.println(room1.getTotalCost());

    }
}
