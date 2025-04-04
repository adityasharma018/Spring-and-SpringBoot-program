package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(198);
		addr.setCity("Delhi");
		addr.setPincode(123456);
		return addr;
	}
	
	@Bean
	public Subjects createSubjObj() {
		Subjects subj = new Subjects();
		
		List<String> subjects_list =new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("python");
		subjects_list.add("javascript");
		subj.setSubjects(subjects_list);
		return subj;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setRollno(101);
		std.setName("Adi");
//		std.setAddress(createAddrObj());   //mannually dependency injection
//		std.setSubjects(createSubjObj());
		return std;
	}

}
