package kr.or.bit.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import kr.or.bit.dto.KoreaMember;



/*
DB작업
CRUD 작업을 하기위한 함수를 생성하는 곳

memo table 에 데이터 에 대해서
전제조회 : select id, email ,content from memo
조건조회 : select id, email ,content from memo where id=?
수정 : update memo set email=? , content=? where id=?
삭제 : delete from memo where id=?
삽입 : insert into memo(id,email,content) values(?,?,?)

default 5개
필요하시면 함수는 추가 .....^^
*/
public class MemberDao{
	/*
	기존 방식
	Connection conn = null;
	public memodao() {
		conn = Singleton_Helper.getConnection("oracle");
	}
	*/
    /*
     * DataSource ds = null; public memodao(){ try { Context context = new
     * InitialContext(); //현재 프로젝트에 이름기반 검색 ds =
     * (DataSource)context.lookup("java:comp/env/jdbc/oracle");//java:comp/env/ +
     * name //각가의 함수 안에서 얻고 반환하고 .... } catch (Exception e) {
     * System.out.println(e.getMessage()); }
     *
     * }
     */
    
    
    //전체 데이터 read (where 조건절이 없어요)
    public ArrayList<KoreaMember> getMemberList() throws SQLException{
        
        
        return null;
    }
    
    //Insert
    //권장: public int insertMemo(memo m){} >> FrameWork 자동화..
    public int joinMember(KoreaMember m){
        
        
        return 0;
    }
    
    //Update
    public int updateMember(KoreaMember m){
        //update memo set email=? , content=? where id=?
        //m.getId()
        
        return 0;
    }
    
    //Delete
    public int deleteMember(String id){
        //delete from memo where id=?
        
        return -1;//디비에러
    }
    
    //추가함수 (ID 존재 유무 판단 함수)
    public String isCheckById(String id){
        
        //System.out.println("ismemoid : " + ismemoid);
        return null;
    }
    
    //멤버 상세 페이지
    public KoreaMember detailMember(String id){
        
        return null;
    }
    
    //여러명의 멤버 데이터 불러오기
    public KoreaMember getMemoListById(String id){
        
        return null;
    }
    
}






