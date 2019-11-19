package com.codeclan.UserFileFolder.repositories;

import com.codeclan.UserFileFolder.models.Folder;
import com.codeclan.UserFileFolder.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
