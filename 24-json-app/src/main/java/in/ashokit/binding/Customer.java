package in.ashokit.binding;

public class Customer {

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phno=" + phno + "]";
	}

	private Integer cid;
	private String name;
	private Long phno;

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
