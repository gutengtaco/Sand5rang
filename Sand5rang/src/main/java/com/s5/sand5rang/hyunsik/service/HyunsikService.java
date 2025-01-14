package com.s5.sand5rang.hyunsik.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.s5.sand5rang.common.model.vo.PageInfo;
import com.s5.sand5rang.hyunsik.dao.HyunsikDao;
import com.s5.sand5rang.hyunsik.vo.Chart;
import com.s5.sand5rang.hyunsik.vo.Enroll;
import com.s5.sand5rang.hyunsik.vo.Indent;
import com.s5.sand5rang.hyunsik.vo.Main;
import com.s5.sand5rang.hyunsik.vo.Payment;
import com.s5.sand5rang.hyunsik.vo.StockF;

@Component
@Service
public class HyunsikService {

	@Autowired
	private HyunsikDao hyunsikDao;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int ad1ListCount() {
		return hyunsikDao.ad1ListCount(sqlSession);
	}
	
	public ArrayList<String> selectAd1List(PageInfo pi){
		return hyunsikDao.selectAd1List(sqlSession, pi);
	}
	
	public ArrayList<Indent> selectIndLIst(String id){
		return hyunsikDao.selectIndLIst(sqlSession, id);
	}
	
	public int adCusApp(HashMap<String, String> map) {
		return hyunsikDao.adCusApp(sqlSession, map);
	}
	
	public int storePay(String storeId) {
		return hyunsikDao.storePay(sqlSession, storeId);
	}
	
	public int adCusDis(String id) {
		return hyunsikDao.adCusDis(sqlSession, id);
	}
	
	public int disAll() {
		return hyunsikDao.disAll(sqlSession);
	}
	
	public int facInd(int i) {
		return hyunsikDao.facInd(sqlSession, i);
	}
	
	public ArrayList<Indent> storeInList(){
		return hyunsikDao.storeInList(sqlSession);
	}
	
	public int addStock(Indent i) {
		return hyunsikDao.addStock(sqlSession, i);
	}
	
	public int addFlow(Indent i) {
		return hyunsikDao.addFlow(sqlSession, i);
	}
	
	public int facListCount() {
		return hyunsikDao.facListCount(sqlSession);
	}
	
	public ArrayList<String> selectAd2List(PageInfo pi){
		return hyunsikDao.selectAd2List(sqlSession, pi);
	}
	
	public ArrayList<Indent> facIndList(String date) {
		return hyunsikDao.facIndList(sqlSession, date);
	}
	
	public int payListCount() {
		return hyunsikDao.payListCount(sqlSession);
	}
	
	public ArrayList<Payment> paymentList(PageInfo pi){
		return hyunsikDao.paymentList(sqlSession, pi);
	}
	
	public int realPayList(Payment p) {
		return hyunsikDao.realPayList(sqlSession, p);
	}
	
	public int getMyStock(StockF sf){
		return hyunsikDao.getMyStock(sqlSession, sf);
	}
	
	public int endFlowDate(String storeId) {
		return hyunsikDao.endFlowDate(sqlSession, storeId);
	}
	
	public ArrayList<StockF> indexList(PageInfo pi, int index){
		return hyunsikDao.indexList(sqlSession, pi, index);
	}
	
	public StockF flowList(StockF s) {
		return hyunsikDao.flowList(sqlSession, s);
	}
	
	public Main befIndent() {
		return hyunsikDao.befIndent(sqlSession);
	}
	
	public Main befIndent2(String storeId) {
		return hyunsikDao.befIndent2(sqlSession, storeId);
	}
	
	public int payListCount2(String storeId) {
		return hyunsikDao.payListCount2(sqlSession, storeId);
	}
	
	public ArrayList<Payment> paymentList2(PageInfo pi, String storeId){
		return hyunsikDao.paymentList2(sqlSession, pi, storeId);
	}
	
	public int realPayList2(Payment p) {
		return hyunsikDao.realPayList2(sqlSession, p);
	}
	
	public Chart getChart() {
		return hyunsikDao.getChart(sqlSession);
	}
	
	public Chart getChart2(String storeId) {
		return hyunsikDao.getChart2(sqlSession, storeId);
	}
	
	public int countSales(String storeId) {
		return hyunsikDao.countSales(sqlSession, storeId);
	}
	
	public int checkEmail(String email) {
		return hyunsikDao.checkEmail(sqlSession, email);
	}
	
	public int insertStore(Enroll e) {
		return hyunsikDao.insertStore(sqlSession, e);
	}
	
}

