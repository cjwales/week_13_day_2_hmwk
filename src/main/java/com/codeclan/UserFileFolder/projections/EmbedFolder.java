package com.codeclan.UserFileFolder.projections;

import com.codeclan.UserFileFolder.models.File;
import com.codeclan.UserFileFolder.models.Folder;
import com.codeclan.UserFileFolder.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {
    String getTitle();
    User getUser();
    List<File> getFiles();
}
