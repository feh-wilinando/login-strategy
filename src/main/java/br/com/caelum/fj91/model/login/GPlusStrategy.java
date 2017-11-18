package br.com.caelum.fj91.model.login;

import br.com.caelum.fj91.model.Authenticable;
import br.com.caelum.fj91.model.representations.UsernameRepresentation;

import java.util.Optional;

public class GPlusStrategy implements Provider<UsernameRepresentation> {
    @Override
    public Optional<Authenticable> login(UsernameRepresentation user) {
        return Optional.of(new Authenticable(user, "GPLUS"));
    }
}
