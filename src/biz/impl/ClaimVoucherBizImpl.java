package biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.ClaimVoucherBiz;
import dao.ClaimVoucherDao;
import po.BizClaimVoucher;
@Service
public class ClaimVoucherBizImpl implements ClaimVoucherBiz {
	private ClaimVoucherDao claimVoucherDao;
	@Override
	public void addNewClaimVoucher(BizClaimVoucher claimVoucher) {
		claimVoucherDao.save(claimVoucher);
	}
	
	
	
	
	
	
	//setter
	@Autowired
	public void setClaimVoucherDao(ClaimVoucherDao claimVoucherDao) {
		this.claimVoucherDao = claimVoucherDao;
	}

}
