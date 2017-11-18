package br.com.caelum.fj91.model.login;

import br.com.caelum.fj91.model.Authenticable;
import br.com.caelum.fj91.model.representations.UserNameAndPasswordRepresentation;

import java.util.Optional;

public class EmailStrategy implements Provider<UserNameAndPasswordRepresentation> {

    @Override
    public Optional<Authenticable> login(UserNameAndPasswordRepresentation user) {
        return Optional.of(new Authenticable(user, "EMAIL"));
    }
}
