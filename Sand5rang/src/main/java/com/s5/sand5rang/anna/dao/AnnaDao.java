package com.s5.sand5rang.anna.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.s5.sand5rang.anna.vo.Enroll;
import com.s5.sand5rang.anna.vo.Inquery;
import com.s5.sand5rang.anna.vo.Store;
import com.s5.sand5rang.common.model.vo.PageInfo;

@Repository
public class AnnaDao {
	
	
	
	// 게시글 총 갯수 조회
	public int selectListCount(SqlSessionTemplate sqlSession, int cate) {
		return sqlSession.selectOne("annaMapper.selectListCount", cate);
	}
	
	// 문의게시판 전체리스트 조회
	public ArrayList<Inquery> inqueryList(SqlSessionTemplate sqlSession, PageInfo pi, int cate) {
	
		int limit = pi.getBoardLimit();
		int offset =(pi.getCurrentPage()-1) *limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		return (ArrayList)sqlSession.selectList("annaMapper.inqueryList",cate, rowBounds);
	}
	
	// 문의게시판 상세 조회 
	public Inquery selectInquery(SqlSessionTemplate sqlSession, int inqNo) {
		return sqlSession.selectOne("annaMapper.selectInquery", inqNo);
	}
	
	// 문의 답변 달기 폼
	public Inquery answerForm(SqlSessionTemplate sqlSession, Inquery i) {
		return sqlSession.selectOne("annaMapper.answerForm");
	}
	
	// 문의 답변 등록
	public int enrollAnswer(SqlSessionTemplate sqlSession, Inquery i) {
		return sqlSession.update("annaMapper.enrollAnswer",i);
	}
	
	
	// 이메일 중복확인
	public int checkEmail(SqlSessionTemplate sqlSession, String email) {
		return sqlSession.selectOne("annaMapper.checkEmail", email);
	}

	// 가맹문의 등록 
	public int insertStore(SqlSessionTemplate sqlSession, Enroll e) {
		return sqlSession.insert("annaMapper.insertStore", e);
	}
	

	
	

}