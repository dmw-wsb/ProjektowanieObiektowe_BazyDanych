package pl.wsb.hotel;

import java.time.LocalDate;

public class PremiumClient extends Client{
    public enum Level{
        PREMIUM,
        PREMIUM_PLUS
    }
    private Level premium_level;

    public PremiumClient(String firstName, String lastName, LocalDate birthDate, Level lev) {
        super(firstName, lastName, birthDate);
        this.premium_level = lev;
    }

    @Override
    public String getFullName(){
        return "[premium] " + firstName + " " + lastName;
    }
}
