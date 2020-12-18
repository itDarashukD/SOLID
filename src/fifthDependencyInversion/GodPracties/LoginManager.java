package fifthDependencyInversion.GodPracties;


/**
   Здесь  хорошая логика  - т.к. есть слабая зависимость между классами низкого уровня и
 высокго через посредника  - И.

 class LoginManaget создает переменную И. и конструктор
 а  class LoginManager инмплементит методы И.
 */
//Hight level
public class LoginManager {
     IMediator iMediator;

    public LoginManager(IMediator iMediator) {
        this.iMediator = iMediator;
    }

    public void logging(User user) {
        iMediator.checkLogin(user);

    }

}
