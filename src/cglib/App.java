package cglib;

/**
 * ������
 */
public class App {

    public void test(){
        //Ŀ�����
        UserDao target = new UserDao();

        //�������
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //ִ�д������ķ���
        proxy.save();
    }
}