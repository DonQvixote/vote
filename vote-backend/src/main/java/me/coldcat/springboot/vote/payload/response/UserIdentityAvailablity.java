package me.coldcat.springboot.vote.payload.response;

public class UserIdentityAvailablity {
    private Boolean available;

    public UserIdentityAvailablity(Boolean available) {
        this.available = available;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
