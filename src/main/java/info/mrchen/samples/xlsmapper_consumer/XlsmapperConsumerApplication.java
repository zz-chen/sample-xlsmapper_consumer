package info.mrchen.samples.xlsmapper_consumer;

import java.io.FileInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gh.mygreen.xlsmapper.XlsMapper;

@SpringBootApplication
public class XlsmapperConsumerApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(XlsmapperConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(XlsmapperConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CustomersSheet sheet = new XlsMapper().load(new FileInputStream("./ExcelFiles/Northwind.xls"),
				CustomersSheet.class);
		logger.info("Sheet Name:：" + sheet.sheetName);
		logger.info("Count:" + sheet.customers.size());
		for (Customer c : sheet.customers) {
			logger.info(c.toString());
		}
	}
}
