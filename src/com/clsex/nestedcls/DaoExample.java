package com.clsex.nestedcls;

public interface DataAccessObject {
    void select();
    void insert();
    void update();
    void delete();
}

class Oracle implements DataAccessObject {
	@Override
    public void select() {
        System.out.println("Oracle DB에서 검색"); 
    }

    @Override
    public void insert() {
        System.out.println("Oracle DB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB를 수정"); 
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB에서 삭제"); 
    }
}
class MySql implements DataAccessObject {
	@Override
    public void select() {
        System.out.println("MySql DB에서 검색"); 
    }

    @Override
    public void insert() {
        System.out.println("MySql DB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySql DB를 수정"); 
    }

    @Override
    public void delete() {
        System.out.println("MySql DB에서 삭제"); 
    }
}
public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new Oracle());
		dbWork(new MySql());
	}
}
