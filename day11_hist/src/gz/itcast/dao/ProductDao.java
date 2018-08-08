package gz.itcast.dao;

import gz.itcast.entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * �����д�Ŷ�Prodcut�����CRUD����
 * @author APPle
 *
 */
public class ProductDao {
	//ģ��"���ݿ�",���������Ʒ����
	private static List<Product> data = new ArrayList<Product>();
	
	/**
	 * ��ʼ����Ʒ����
	 */
	static{
		//ִֻ��һ��
		for(int i=1;i<=10;i++){
			data.add(new Product(""+i,"�ʼǱ�"+i,"LN00"+i,34.0+i));
		}
	}
	
	
	
	/**
	 * �ṩ��ѯ������Ʒ�ķ���
	 */
	public List<Product> findAll(){
		return data;
	}
	
	/**
	 * �ṩ���ݱ�Ų�ѯ��Ʒ�ķ���
	 */
	public Product findById(String id){
		for(Product p:data){
			if(p.getId().equals(id)){
				return p;
			}
		}
		return null;
	}

}
