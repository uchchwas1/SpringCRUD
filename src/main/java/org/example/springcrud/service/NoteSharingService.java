package org.example.springcrud.service;

import org.example.springcrud.entity.NoteSharingTable;
import org.example.springcrud.repository.NoteSharingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteSharingService {

    @Autowired
    NoteSharingRepository noteSharingRepository;

    public void create(NoteSharingTable noteSharingTable) {
        noteSharingRepository.save(noteSharingTable);
    }

    public void update(NoteSharingTable noteSharingTable) {
        noteSharingRepository.save(noteSharingTable);
    }

    public void delete(Long id) {
        noteSharingRepository.deleteById(id);
    }

    public NoteSharingTable findById(Long id) {
        return noteSharingRepository.findById(id).orElse(null);
    }
}
