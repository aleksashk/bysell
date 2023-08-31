package com.aleksandrphilimonov.bysell.repositories;

import com.aleksandrphilimonov.bysell.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {


}
