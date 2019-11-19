package com.codeclan.UserFileFolder.repositories;

import com.codeclan.UserFileFolder.models.File;
import com.codeclan.UserFileFolder.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
