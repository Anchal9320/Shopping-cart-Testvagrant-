
public class Prod {
	private String prod;
	private int unPr;
	private int gst;
	private int quant;
	private double pri;
	private double gstAmt;

	public Prod(String prod, int unPri, int gst, int quant) {
		this.product = prod;
		this.unitPrice = unPr;
		this.gst = gst;
		this.quantity = quant;
		applyGST();
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public int getUnitPrice() {
		return unPr;
	}

	public void setUnitPrice(int unPr) {
		this.unPr = unPr;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPri() {
		return price;
	}

	public double getGstAmt() {
		return gstAmt;
	}

	public void applyGST() {
		pri = unPr * quant;
		gstAmt = pri * gst / 100;
		pri += gstAmt;
		if (pri >= 500) {
			pri = pri + (pri * 0.05);
		}
	}

	@Override
	public String toString() {
		return "Prod [product=" + prod + ", unitPrice=" + unPr + ", gst=" + gst + ", quant=" + quant
				+ ", price=" + pri + "]";
	}

}
