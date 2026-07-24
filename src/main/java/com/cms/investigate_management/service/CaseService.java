package com.cms.investigate_management.service;

import com.cms.investigate_management.model.Case;
import com.cms.investigate_management.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService {

    @Autowired
    private CaseRepository caseRepository;

    public Case saveCase(Case caseData) {
        return caseRepository.save(caseData);
    }

    public List<Case> getAllCases() {
        return caseRepository.findAll();
    }

    public Case getCaseById(String id) {
        return caseRepository.findById(id).orElse(null);
    }

    public Case updateCase(String id, Case updatedCase) {

        if (caseRepository.existsById(id)) {
            updatedCase.setCaseId(id);
            return caseRepository.save(updatedCase);
        }

        return null;
    }

    public boolean deleteCase(String id) {

        if (caseRepository.existsById(id)) {
            caseRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
