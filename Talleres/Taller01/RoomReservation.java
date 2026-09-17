public class RoomReservation {

    private String guest= "";
    private int room_number = 0;
    private int number_of_nights = 0;
    private double price_per_night = 0;


    public boolean setGuest(String guest){
        if(guest.isEmpty()){
            return false;
        }
        this.guest = guest;
        return true;
    }

    public boolean setNumberOfNigths(int number_of_nights){
        if(number_of_nights <= 0){
            return false;
        }
        this.number_of_nights = number_of_nights;
        return true;
    }
    
    public boolean setPricePerNight(double price_per_night){
        if(price_per_night <= 0){
            return false;
        }
        this.price_per_night = price_per_night;
        return true;
    }

    public boolean setRoomNumber(int room_number){
        if(room_number <= 0){
            return false;
        }
        this.room_number = room_number;
        return true;
    }

    public int getRoomNumber(){
        return room_number;
    }


    public String getGuest(){
        return guest;
    }


    public int getNumberOfNights(){
        return number_of_nights;
    }

    public double getPricePerNight(){
        return price_per_night;
    }

    public double getTotalCost(){
        return price_per_night * number_of_nights;
    }
}
