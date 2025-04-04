package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj1() {
		Address addr1 = new Address();
		addr1.setHouseno(198);
		addr1.setCity("Delhi");
		addr1.setPincode(123456);
		return addr1;
	}
	@Bean
	public Address createAddrObj2() {
		Address addr2 = new Address();
		addr2.setHouseno(1986);
		addr2.setCity("Delhi");
		addr2.setPincode(123456);
		return addr2;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setRollno(101);
		std.setName("Adi");
//		std.setAddress(createAddrObj());
		return std;
	}

}
