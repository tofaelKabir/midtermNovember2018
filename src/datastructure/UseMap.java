package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> HospitalList = new ArrayList<String>();
		HospitalList.add("Doctor");
		HospitalList.add("Nurse");
		HospitalList.add("Doctor's Assistant");
		HospitalList.add("Therapist");
		HospitalList.add("Medical Student");

		List<String> UniversityList = new ArrayList<String>();
		UniversityList.add("Vice Chancellor");
		UniversityList.add("Professor");
		UniversityList.add("Associate Professor");
		UniversityList.add("Assistant Professor");
		UniversityList.add("Lecturer");

		Map<String, List<String>> institute = new HashMap<String, List<String>>();
		institute.put("Mount Sinai Hospital", HospitalList);
		institute.put("New York University", UniversityList);

		System.out.println("Printing HashMap by using For Each Loop :\n");
		for(Map.Entry<String,List<String>> professionalList : institute.entrySet()){
			System.out.println(professionalList.getKey()+" ----> "+professionalList.getValue());
		}
		System.out.println("\n---------------------------------------\n");
		System.out.println("Printing HashMap by using Iterator :\n");
		Iterator<Map.Entry<String,List<String>>> it = institute.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> pair = it.next();
			System.out.println(pair.getKey()+" --> "+pair.getValue());
		}
	}

}

