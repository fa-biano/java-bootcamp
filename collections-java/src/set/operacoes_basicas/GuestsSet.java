package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {
    private Set<Guest> guests;

    public GuestsSet() {
        this.guests = new HashSet<>();
    }

    public void addGuest(String name, int inviteCode) {
        this.guests.add(new Guest(name, inviteCode));
    }

    public void removeGuestByInviteCode(int inviteCode) {
       Guest guestToRemove = null;

       for (Guest guest : guests) {
            if (guest.getInviteCode() == inviteCode) {
                guestToRemove = guest;
                break;
            }
       }
       this.guests.remove(guestToRemove);
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void printGuests() {
        System.out.println(guests);
    }

    public static void main(String[] args) {
        GuestsSet guestsSet = new GuestsSet();
        guestsSet.addGuest("Convidado 1", 1234);
        guestsSet.addGuest("Convidado 2", 1235);
        guestsSet.addGuest("Convidado 3", 1235);
        guestsSet.addGuest("Convidado 4", 1237);

        System.out.println("Existem " + guestsSet.countGuests() + " convidados dentro do Set Guests");
        
        guestsSet.removeGuestByInviteCode(1234);
        System.out.println("Existem " + guestsSet.countGuests() + " convidados dentro do Set Guests");

        guestsSet.printGuests();
    }
}
