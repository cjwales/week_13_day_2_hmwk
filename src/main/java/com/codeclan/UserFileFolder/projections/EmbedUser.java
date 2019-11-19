package com.codeclan.UserFileFolder.projections;

import com.codeclan.UserFileFolder.models.Folder;
import com.codeclan.UserFileFolder.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {
    String getName();
    List<Folder> getFolders();
}
