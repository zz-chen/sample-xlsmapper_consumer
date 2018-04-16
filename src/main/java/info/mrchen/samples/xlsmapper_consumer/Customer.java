package info.mrchen.samples.xlsmapper_consumer;

import com.gh.mygreen.xlsmapper.annotation.XlsColumn;

public class Customer {
	@XlsColumn(columnName = "CustomerID")
	public String CustomerID;

	@XlsColumn(columnName = "CompanyName")
	public String CompanyName;

	@XlsColumn(columnName = "ContactName")
	public String ContactName;

	@XlsColumn(columnName = "ContactTitle")
	public String ContactTitle;

	@XlsColumn(columnName = "Address")
	public String Address;

	@XlsColumn(columnName = "City")
	public String City;

	@XlsColumn(columnName = "Region")
	public String Region;

	@XlsColumn(columnName = "Country")
	public String Country;

	@XlsColumn(columnName = "Phone")
	public String Phone;

	@XlsColumn(columnName = "Fax")
	public String Fax;

	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", CompanyName=" + CompanyName + ", ContactName=" + ContactName
				+ ", ContactTitle=" + ContactTitle + ", Address=" + Address + ", City=" + City + ", Region=" + Region
				+ ", Country=" + Country + ", Phone=" + Phone + ", Fax=" + Fax + "]";
	}

}
