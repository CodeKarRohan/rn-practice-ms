package com.rohan.practices.annotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.rohan.practices.Exceptions.JsonSerializeException;

public class JsonSerializer {
	
	public String serialize(Object object) throws JsonSerializeException
	{
		String JsonData = "";
		HashMap<String, String> jsonElem = new HashMap<>();
		
		try {
			if(null == object)
			{
				throw new JsonSerializeException("Null can't be serialized.");
			}
			
			Class<?> objectClass = object.getClass();
			
			for(Field field: objectClass.getDeclaredFields())
			{
				field.setAccessible(true);
				if(field.isAnnotationPresent(JsonField.class)) {
					jsonElem.put(getSerailizedKey(field), (String) field.get(object));
				}
			}
			
			
		} catch(IllegalAccessException  e)
		{
			 throw new JsonSerializeException(e.getMessage());
		}
		
		
		
		// System.out.println(toJsonString(jsonElem));
         return toJsonString(jsonElem);
	}
	
	
	
	public String toJsonString(Map<String, String> jsonMap)
	{
		 String elementsString = jsonMap.entrySet()
				 .stream()
				 .map(entry -> "\""  + entry.getKey() + "\":\"" + entry.getValue() + "\"") 
				 .collect(Collectors.joining(","));
		 
		 return "{" + elementsString + "}";
	}
	public String getSerailizedKey(Field field)
	{
		String annotationValue = field.getAnnotation(JsonField.class).value();
		
        if (annotationValue.isEmpty()) {
            return field.getName();
        }
        else {
            return annotationValue;
        }
	}

}
