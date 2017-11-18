package br.com.caelum.fj91.model.representations;

public interface UserNameAndPasswordRepresentation extends UsernameRepresentation {

    String getPassword();


    default String getRepresentation(){
        return "{ username="+getUsername() + ", password="+getPassword() + "}";
    }

}
