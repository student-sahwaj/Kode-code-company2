package com.company.serialization.model;

import java.nio.file.Path;
import java.util.Objects;

public class SerializationServiceImpl implements SerializationService {
	  
	 // ================= SERIALIZATION =================

	@Override
	public void serialize(Student student, Path filePath) {
		// TODO Auto-generated method stub
		 // Null validation:
        // Agar student null hai toh processing start nahi hogi.
		Objects.requireNonNull(student, "Student cannot be null");
		Objects.requireNonNull(filePath, "file path cannot be null");
		Path target = filePath.toAbsolutePath();
		// Temporary file ka reference maintain karenge.
		Path temp = null;
//		try {
			
//		}
	}

	@Override
	public Student deserialize(Path filePath) {
		// TODO Auto-generated method stub
		return null;
	}

}
