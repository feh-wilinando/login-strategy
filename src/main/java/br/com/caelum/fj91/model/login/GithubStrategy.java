package br.com.caelum.fj91.model.login;

import br.com.caelum.fj91.model.Authenticable;
import br.com.caelum.fj91.model.User;

import java.util.Optional;

public class GithubStrategy implements Provider {
    @Override
    public Optional<Authenticable> login(User user) {
        return Optional.of(new Authenticable(user, "Github"));
    }
}
