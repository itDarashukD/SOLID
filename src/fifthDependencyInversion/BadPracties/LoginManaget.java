package fifthDependencyInversion.BadPracties;


/**
   Здесь плохая логика  - т.к. есть сильная зависимость между классами низкого уровня и высокго:

 public class LoginManaget {
 SimpleLogin simpleLogin = new SimpleLogin();

 надо ослабить зависимотсь(полностью избавиться не получится) надо внедрить И или А.Класс между ними
 */
public class LoginManaget {

//Hight level
    SimpleLogin simpleLogin = new SimpleLogin();

    public void logging(User user) {
        simpleLogin.checkLogin(user);

    }

}
