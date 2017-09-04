package com.spring.board.service;
import java.util.List;

import com.spring.board.dto.MemberVO;
 
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
    
    public void addMember(MemberVO vo);
    
    public void removeMember(MemberVO vo);
    
    public void modifyMember(MemberVO vo);
}


