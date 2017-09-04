package com.spring.board.dao;
import java.util.List;
 
import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dto.MemberVO;
 
 
@Repository
public class MemberDAOImpl implements MemberDAO {
 
    @Autowired
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.spring.board.mappers.memberMapper";
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectMember");
    }
    
    @Override
    public void addMember(MemberVO vo) {
    	
    	sqlSession.insert(Namespace+".addMember",vo);
    	
    }
    
    @Override
    public void removeMember(MemberVO vo) {
    	sqlSession.delete(Namespace+".removeMember",vo);
    }
    
    @Override
    public void modifyMember(MemberVO vo) {
    	sqlSession.update(Namespace+".modifyMember",vo);
    }
 
}


