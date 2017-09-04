package com.spring.board.dao;

import java.util.List;

import com.spring.board.dto.MemberVO;

 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
    
    public void addMember(MemberVO vo);
    
    public void removeMember(MemberVO vo);
    
    public void modifyMember(MemberVO vo);
}
 


