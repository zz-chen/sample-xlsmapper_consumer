package info.mrchen.samples.xlsmapper_consumer;

import java.util.List;

import com.gh.mygreen.xlsmapper.annotation.XlsHorizontalRecords;
import com.gh.mygreen.xlsmapper.annotation.XlsSheet;
import com.gh.mygreen.xlsmapper.annotation.XlsSheetName;

@XlsSheet(name = "Customers")
public class CustomersSheet {

	@XlsSheetName
	public String sheetName;

	@XlsHorizontalRecords(headerAddress = "A1")
	public List<Customer> customers;
}
