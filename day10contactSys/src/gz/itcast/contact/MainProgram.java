package gz.itcast.contact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * ������
 * @author APPle
 *
 */
public class MainProgram {

	public static void main(String[] args) {
		try {
			/*Scanner scanner = new Scanner(System.in);
			String command = scanner.next();*/
			
			BufferedReader br = 
							new BufferedReader(new InputStreamReader(System.in));
			
			ContactOperator operator = new ContactOperatorImpl();
			//���Ͻ�������
			while(true){
				//1.�����˵�
				printMenu();
				
				//2.�����û����������
				String command = br.readLine();
				
				//3.�����û�������ִ�в�ͬ�Ĳ���
				if("1".equals(command)){
					//�����ϵ��
					//��ȡ�����������
					Contact contact  = new Contact();
					//��ȡID
					System.out.println("�������ţ�");
					String id = br.readLine();
					//��ȡ����
					System.out.println("������������");
					String name = br.readLine();
					//��ȡ�Ա�
					System.out.println("�������Ա�");
					String gender = br.readLine();
					//��ȡ����
					System.out.println("���������䣺");
					String age = br.readLine();
					//��ȡ�绰
					System.out.println("������绰��");
					String phone = br.readLine();
					//��ȡ����
					System.out.println("���������䣺");
					String email = br.readLine();
					//��ȡQQ
					System.out.println("������QQ��");
					String qq = br.readLine();
					
					contact.setId(id);
					contact.setName(name);
					contact.setGender(gender);
					contact.setAge(Integer.parseInt(age));
					contact.setPhone(phone);
					contact.setEmail(email);
					contact.setQq(qq);
					
					operator.addContact(contact);
				}else if("2".equals(command)){
					//�޸���ϵ��
					//��ȡ�����������
					Contact contact  = new Contact();

					//��ȡID
					System.out.println("��������Ҫ�޸ĵı�ţ�");
					String id = br.readLine();
					//��ȡ����
					System.out.println("�������޸ĺ��������");
					String name = br.readLine();
					//��ȡ�Ա�
					System.out.println("�������޸ĺ���Ա�");
					String gender = br.readLine();
					//��ȡ����
					System.out.println("�������޸ĺ�����䣺");
					String age = br.readLine();
					//��ȡ�绰
					System.out.println("�������޸ĺ�ĵ绰��");
					String phone = br.readLine();
					//��ȡ����
					System.out.println("�������޸ĺ�����䣺");
					String email = br.readLine();
					//��ȡQQ
					System.out.println("�������޸ĺ��QQ��");
					String qq = br.readLine();
					
					contact.setId(id);
					contact.setName(name);
					contact.setGender(gender);
					contact.setAge(Integer.parseInt(age));
					contact.setPhone(phone);
					contact.setEmail(email);
					contact.setQq(qq);
					
					
					operator.updateContact(contact);
				}else if("3".equals(command)){
					//ɾ����ϵ��
					//��ȡ��Ҫɾ����ID
					System.out.println("������ɾ���ı�ţ�");
					String id = br.readLine();
					
					operator.deleteContact(id);
				}else if("4".equals(command)){
					//��ѯ������ϵ��
					List<Contact> list = operator.findAll();
					//��ӡ���
					for (Contact con : list) {
						System.out.println(con);
					}
				}else if("Q".equals(command)){
					break;
				}else{
					System.out.println("�������������");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new  RuntimeException(e);
		}
			
		
	}

	private static void printMenu() {
		System.out.println("====================");
		System.out.println("[1]�����ϵ��");
		System.out.println("[2]�޸���ϵ��");
		System.out.println("[3]ɾ����ϵ��");
		System.out.println("[4]�鿴������ϵ��");
		System.out.println("[Q]�˳�ϵͳ");
		System.out.println("====================");
	}

}
