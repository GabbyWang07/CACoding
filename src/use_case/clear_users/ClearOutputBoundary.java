package use_case.clear_users;

import use_case.signup.SignupOutputData;

//TODO
public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData deleted_users);

}
