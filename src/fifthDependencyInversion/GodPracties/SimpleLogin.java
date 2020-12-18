package fifthDependencyInversion.GodPracties;


/**
 Здесь  хорошая логика  - т.к. есть слабая зависимость между классами низкого уровня и
 высокго через посредника  - И.

 а  class LoginManager инмплементит методы И.
 */
public class SimpleLogin implements IMediator{

    //Low level

    @Override
    public Boolean checkLogin(User user) {
        //Business Logic

        return true;
    }
}
