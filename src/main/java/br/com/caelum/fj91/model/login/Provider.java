package br.com.caelum.fj91.model.login;

import br.com.caelum.fj91.model.Authenticable;
import br.com.caelum.fj91.model.representations.UsernameRepresentation;

import java.util.Optional;

public interface Provider<T extends UsernameRepresentation> {
    Optional<Authenticable> login(T user);
}
