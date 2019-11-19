package com.codeclan.UserFileFolder.repositories;

import com.codeclan.UserFileFolder.models.User;
import com.codeclan.UserFileFolder.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
