package com.cms.investigate_management.repository;

import com.cms.investigate_management.model.Case;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaseRepository extends MongoRepository<Case, String> {

}
