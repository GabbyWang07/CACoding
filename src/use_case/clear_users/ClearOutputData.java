package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private final String deletedUser;

    public ClearOutputData(String deleted_users) {
        this.deletedUser = deleted_users;
    }

    public String getDeletedUser() {
        return deletedUser;
    }
}
