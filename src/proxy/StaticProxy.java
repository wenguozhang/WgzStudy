package proxy;
/**
 * ������
 */
public class StaticProxy {
    public static void main(String[] args) {
        //Ŀ�����
        UserDao target = new UserDao();

        //�������,��Ŀ����󴫸��������,���������ϵ
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//ִ�е��Ǵ���ķ���
        
        proxy.delete();
    }
}