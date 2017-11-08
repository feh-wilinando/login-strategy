package br.com.caelum.fj91.model;

public class Authenticable {

    private final User user;
    private String provider;

    public Authenticable(User user, String provider) {
        this.user = user;
        this.provider = provider;
    }


    public String getProvider() {
        return provider;
    }

    public boolean isAuthenticated() {
        return user != null;
    }
}
