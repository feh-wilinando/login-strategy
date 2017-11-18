package br.com.caelum.fj91.model.representations;

public interface UsernameRepresentation {
    String getUsername();

    default String getRepresentation(){
        return "{ username="+getUsername() + "}";
    }
}
