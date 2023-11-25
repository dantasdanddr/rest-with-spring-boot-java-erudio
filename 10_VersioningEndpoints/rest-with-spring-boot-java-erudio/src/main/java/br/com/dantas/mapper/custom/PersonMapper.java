package br.com.dantas.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.dantas.data.vo.v2.PersonVOV2;
import br.com.dantas.model.Person;

@Service
public class PersonMapper {
	
	public PersonVOV2 convertEntityToVo(Person person) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setBirthDay(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		return vo;
	}
	
	
	public Person convertVoToEntity(PersonVOV2 vo) {
		Person entity = new Person();
		entity.setId(vo.getId());
		entity.setAddress(vo.getAddress());
		//entity.setBirthDay(new Date());
		entity.setFirstName(vo.getFirstName());
		entity.setLastName(vo.getLastName());
		entity.setGender(vo.getGender());
		return entity;
	}
}
