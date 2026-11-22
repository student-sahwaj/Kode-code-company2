package com.company.serialization.model;

import java.nio.file.Path;

public interface SerializationService {
	 // Student object ko byte stream mein convert
    // karke file mein store karne ka contract.
	void serialize(Student student, Path filePath);
	// File se byte stream read karke
    // original Student object retrieve karne ka contract
	Student deserialize(Path filePath);
}
