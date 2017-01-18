package dao;

import java.util.List;

import domain.EnumerationValue;

public interface IEnumerationValueRepository extends IRepository<EnumerationValue> {
	
	public List<EnumerationValue> withName (String name);
	public List<EnumerationValue> withIntKey (int key, String name);
	public List<EnumerationValue> withStringKey (String key, String name);


}
