package com.minor.project.vibe_coder.service;

import com.minor.project.vibe_coder.dto.project.ProjectRequest;
import com.minor.project.vibe_coder.dto.project.ProjectResponse;
import com.minor.project.vibe_coder.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
     List<ProjectSummaryResponse> getUserProject(Long userId);

     ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
