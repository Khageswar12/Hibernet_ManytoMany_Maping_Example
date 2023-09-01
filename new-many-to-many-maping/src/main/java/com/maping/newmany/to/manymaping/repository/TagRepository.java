package com.maping.newmany.to.manymaping.repository;

import com.maping.newmany.to.manymaping.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository <Tag,Long>{
}
