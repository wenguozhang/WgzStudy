package proxy;
/**
 * �ӿ�ʵ��
 * Ŀ�����
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----�Ѿ���������!----");
    }
    public void delete() {
        System.out.println("----�Ѿ�ɾ������!----");
    }
}