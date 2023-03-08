package com.project.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public class ProjectService{
    private List<Person> persons = new ArrayList<>();

public void addPerson(Person person){
    persons.add(person);
}

public List<Person> getPersons(){
    return new ArrayList<>(persons);
}

public boolean removePerson(String hobby){
    Person a = getHobby(hobby);

    if(a !=null){
        return persons.remove(a);
    }else {
        return false;
    }
}

private Person getHobby(String Hobby){
    return null;
}
//Etsitään henkilöt harratuksen mukaan
public List<Person> getPersonsByHobby(String hobby){
    List<Person> foundHobby = new ArrayList<>();

    for(Person a : persons){
        if(a.getHobby().equals(hobby)){
            foundHobby.add(a);
        }
    }
    return foundHobby;
}
//Etsitään henkilöt nimen mukaan
public List<Person> getPersonsByName(String name){
    List<Person> foundName = new ArrayList<>();

    for(Person a : persons){
        if(a.getName().equals(name)){
            foundName.add(a);
        }

    }
    return foundName;
}



}