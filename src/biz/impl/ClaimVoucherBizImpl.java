package biz.impl;

import biz.ClaimVoucherBiz;
import dao.ClaimVoucherDao;
import po.BizClaimVoucher;

public class ClaimVoucherBizImpl implements ClaimVoucherBiz {
	private ClaimVoucherDao claimVoucherDao;
	@Override
	public void addNewClaimVoucher(BizClaimVoucher claimVoucher) {
		claimVoucherDao.save(claimVoucher);
	}
	
	
	
	
	
	
	//setter
	public void setClaimVoucherDao(ClaimVoucherDao claimVoucherDao) {
		this.claimVoucherDao = claimVoucherDao;
	}

}
