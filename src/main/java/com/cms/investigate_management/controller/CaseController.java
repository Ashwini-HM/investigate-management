package com.cms.investigate_management.controller;

import com.cms.investigate_management.model.Case;
import com.cms.investigate_management.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cases")
@CrossOrigin(origins = "*")
public class CaseController {

    @Autowired
    private CaseService caseService;

    @PostMapping
    public Case addCase(@RequestBody Case caseData) {
        return caseService.saveCase(caseData);
    }

    @GetMapping
    public List<Case> getAllCases() {
        return caseService.getAllCases();
    }

    @GetMapping("/{id}")
    public Case getCaseById(@PathVariable String id) {
        return caseService.getCaseById(id);
    }

    @PutMapping("/{id}")
    public Case updateCase(@PathVariable String id,
            @RequestBody Case updatedCase) {

        return caseService.updateCase(id, updatedCase);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCase(@PathVariable String id) {

        if (caseService.deleteCase(id)) {
            return ResponseEntity.ok("Case deleted successfully.");
        }

        return ResponseEntity.notFound().build();
    }
}
