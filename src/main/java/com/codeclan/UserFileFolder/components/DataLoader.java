package com.codeclan.UserFileFolder.components;

import com.codeclan.UserFileFolder.models.File;
import com.codeclan.UserFileFolder.models.Folder;
import com.codeclan.UserFileFolder.models.User;
import com.codeclan.UserFileFolder.repositories.FileRepository;
import com.codeclan.UserFileFolder.repositories.FolderRepository;
import com.codeclan.UserFileFolder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user = new User("Clive");
        userRepository.save(user);
        Folder folder = new Folder("My Files", user);
        folderRepository.save(folder);
        File file = new File("My File", ".mp3", 1024, folder);
        fileRepository.save(file);
    }

}
