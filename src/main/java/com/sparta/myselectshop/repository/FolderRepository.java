package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);

    // select * from folder where user_id = ? and name in (?, ?, ?);
    // select * from folder where user_id = 1 and name in ('1', '2', '3');
    // user_id가 1이고, 폴더이름이 '1', '2', '3'인 조건문
    List<Folder> findAllByUser(User user);
}
