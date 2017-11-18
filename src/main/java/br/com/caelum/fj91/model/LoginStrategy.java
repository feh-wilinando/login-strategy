package br.com.caelum.fj91.model;

import br.com.caelum.fj91.model.login.*;
import br.com.caelum.fj91.model.representations.UsernameRepresentation;

import java.util.Optional;

public enum LoginStrategy{
    FACEBOOK(new FacebookStrategy()),
    EMAIL(new EmailStrategy()),
    GPLUS(new GPlusStrategy()),
    GITHUB(new GithubStrategy());

    private final Provider provider;

    LoginStrategy(Provider provider) {
        this.provider = provider;
    }

    public Optional<Authenticable> validate(UsernameRepresentation user) {
        return provider.login(user);
    }
}
