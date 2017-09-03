package po;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * BizCheckResult entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "BIZ_CHECK_RESULT", schema = "BDQN")
public class BizCheckResult implements java.io.Serializable {

	// Fields

	private Long id;
	private BizClaimVoucher bizClaimVoucher;
	private Timestamp checkTime;
	private String checkerSn;
	private String result;
	private String comm;

	// Constructors

	/** default constructor */
	public BizCheckResult() {
	}

	/** full constructor */
	public BizCheckResult(Long id, BizClaimVoucher bizClaimVoucher,
			Timestamp checkTime, String checkerSn, String result, String comm) {
		this.id = id;
		this.bizClaimVoucher = bizClaimVoucher;
		this.checkTime = checkTime;
		this.checkerSn = checkerSn;
		this.result = result;
		this.comm = comm;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chk_result")
	@SequenceGenerator(name = "chk_result", sequenceName = "SEQ_CHECK_RESULT", allocationSize = 1)
	@Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLAIM_ID")
	public BizClaimVoucher getBizClaimVoucher() {
		return this.bizClaimVoucher;
	}

	public void setBizClaimVoucher(BizClaimVoucher bizClaimVoucher) {
		this.bizClaimVoucher = bizClaimVoucher;
	}

	@Column(name = "CHECK_TIME", length = 7)
	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	@Column(name = "CHECKER_SN", length = 50)
	public String getCheckerSn() {
		return this.checkerSn;
	}

	public void setCheckerSn(String checkerSn) {
		this.checkerSn = checkerSn;
	}

	@Column(name = "RESULT", length = 50)
	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Column(name = "COMM", length = 500)
	public String getComm() {
		return this.comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

}