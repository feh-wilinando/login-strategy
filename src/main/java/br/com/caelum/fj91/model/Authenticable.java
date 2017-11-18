package br.com.caelum.fj91.model;

import br.com.caelum.fj91.model.representations.UsernameRepresentation;

public class Authenticable {

    private final UsernameRepresentation user;
    private String provider;

    public Authenticable(UsernameRepresentation user, String provider) {
        System.out.println(provider+"->"+user.getRepresentation());
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
