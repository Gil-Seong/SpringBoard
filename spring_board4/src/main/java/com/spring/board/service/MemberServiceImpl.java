package com.spring.board.service;
import java.util.List;

import javax.inject.Inject;
 
import org.springframework.stereotype.Service;

import com.spring.board.dao.MemberDAO;
import com.spring.board.dto.MemberVO;
 
 
@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return dao.selectMember();
    }
    
    @Override
    public void addMember(MemberVO vo) {
    	 dao.addMember(vo);
    }
    
    @Override
    public void removeMember(MemberVO vo) {
    	dao.removeMember(vo);
    }
    
    @Override
    public void modifyMember(MemberVO vo) {
    	dao.modifyMember(vo);
    }
 
}


