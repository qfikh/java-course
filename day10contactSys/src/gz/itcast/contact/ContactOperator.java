package gz.itcast.contact;

import java.util.List;

/**
 * �ýӿ����ڴ����ϵ����ز����ķ�����
 * @author APPle
 *
 */
public interface ContactOperator {
	public void addContact(Contact contact);//������ϵ��
	public void updateContact(Contact contact);//�޸���ϵ��
	public void deleteContact(String id);//����IDɾ����ϵ��
	public List<Contact> findAll();//��ѯ������ϵ��
}
