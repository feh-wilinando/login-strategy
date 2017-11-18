package br.com.caelum.fj91.model;

import br.com.caelum.fj91.model.representations.UserNameAndPasswordRepresentation;
import br.com.caelum.fj91.model.representations.UsernameRepresentation;

public class SystemUser implements UserNameAndPasswordRepresentation {
    private final String username;
    private final String password;

    public SystemUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
