package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearController {
    final ClearInputBoundary clearInteractor;

    public ClearController(ClearInputBoundary clearInteractor) {
        this.clearInteractor = clearInteractor;
    }

    public void execute(){
        clearInteractor.execute();
    }
}
