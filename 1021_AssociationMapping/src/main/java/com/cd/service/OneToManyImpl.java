package com.cd.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.cd.entity.Person;
import com.cd.entity.PhoneNumber;
import com.cd.repo.IPersonRepo;
import com.cd.repo.IphoneNumberRepo;

public class OneToManyImpl implements IOneToManyPerson {

	@Autowired
	private IPersonRepo personRepo;
	@Autowired
	private IphoneNumberRepo phRepo;
	
	@Override
	public void saveDataUsingParent() {
		Person per=new Person("abhi","hyd");
		
		PhoneNumber ph1=new PhoneNumber(null, 9999999L,"airtel","personal", per);
		PhoneNumber ph2=new PhoneNumber(null, 9999998L,"Jio","Ofc", per);
		
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		
		Set<PhoneNumber> phoneSet=new HashSet();
		phoneSet.add(ph1);
		phoneSet.add(ph2);
		per.setContactDetails(phoneSet);
		
		personRepo.save(per);

	}

	@Override
	public void saveDataUsingChild() {
		Person per=new Person("Ramesh","vizag");
		PhoneNumber ph1=new PhoneNumber(null, 8888888L,"airtel","Personal", per);
		PhoneNumber ph2=new PhoneNumber(null, 777777L,"Jio","Office", per);
		
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		
		Set<PhoneNumber> phoneSet=new HashSet<PhoneNumber>();
		phoneSet.add(ph2);
		phoneSet.add(ph1);
		per.setContactDetails(phoneSet);
		
		phRepo.save(ph1);
		phRepo.save(ph2);

	}

	@Override
	public void loadDataUsingParent() {
		
		Iterable<Person> it=personRepo.findAll();
		it.forEach(per -> {
			System.out.println("parent::"+per);
		});
	}

}
