package br.com.caelum.fj91.model.login;

import br.com.caelum.fj91.model.Authenticable;
import br.com.caelum.fj91.model.User;

import java.util.Optional;

public interface Provider {
    Optional<Authenticable> login(User user);
}
