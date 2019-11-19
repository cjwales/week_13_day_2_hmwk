package com.codeclan.UserFileFolder.projections;

import com.codeclan.UserFileFolder.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbedFile {
    String getName();
    String getExtension();
    int getSize();
}
