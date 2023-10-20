package interface_adapter.clear_users;

import interface_adapter.signup.SignupState;

public class ClearState {
    private String deletedUsers = "";

    public ClearState(ClearState copy) {
        deletedUsers = copy.deletedUsers;
    }

    public ClearState() {
    }

    public void setDeletedUsers(String deletedUser) {
        this.deletedUsers = deletedUser;
    }

    public String getDeletedUsers(){
        return deletedUsers;
    }

    @Override
    public String toString() {
        return "ClearState{" +
                "username='" + deletedUsers + '}';
    }
}
