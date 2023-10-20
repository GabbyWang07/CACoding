package use_case.clear_users;

// TODO Complete Me

public class ClearInteractor implements ClearInputBoundary{

    final ClearOutputBoundary clearPresenter;

    final ClearUserDataAccessInterface clearUserDataAccessObject;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){

        this.clearPresenter = clearOutputBoundary;
        this.clearUserDataAccessObject = clearUserDataAccessInterface;
    }
    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(clearUserDataAccessObject.getall());
        clearUserDataAccessObject.delete_all();
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
