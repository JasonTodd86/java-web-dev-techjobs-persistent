package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}

//Employer Repository is a crud repository that takes employer and integer. It takes the generic crud and specifies it with these new types.