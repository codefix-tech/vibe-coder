package com.minor.project.vibe_coder.controller;

import com.minor.project.vibe_coder.dto.project.ProjectRequest;
import com.minor.project.vibe_coder.dto.project.ProjectResponse;
import com.minor.project.vibe_coder.dto.project.ProjectSummaryResponse;
import com.minor.project.vibe_coder.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

       @GetMapping
       public ResponseEntity<List<ProjectSummaryResponse>> getMyProject(){
           Long userId = 1L;
           return ResponseEntity.ok(projectService.getUserProject(userId));

       }

       @GetMapping("/{id}")
       public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
           Long userId = 1L;
           return ResponseEntity.ok(projectService.getUserProjectById(id,userId));

       }

       @PostMapping
       public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request){
           Long userId = 1L;
           return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request,userId));
       }

       @PatchMapping("/{id}")
        public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id , @RequestBody ProjectRequest request){
           Long userId = 1L;
           return ResponseEntity.ok(projectService.updateProject(id,request,userId));
       }

       @DeleteMapping("/{id}")
       public ResponseEntity<Void> deleteProject(@PathVariable Long id){
           Long userId = 1L;
           projectService.softDelete(id,userId);
           return ResponseEntity.noContent().build();
       }






}
