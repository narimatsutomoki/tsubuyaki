package jp.kobe_u.cs.daikibo.tsubuyaki.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;

@Repository

public interface TsubuyakiRepository extends CrudRepository<Tsubuyaki, Long>{
    @Query(value = "SELECT * FROM tsubuyaki p WHERE p.comment LIKE %?1%",  nativeQuery = true)
    public Iterable<Tsubuyaki> findTsubuyakiByCommentLike(String word);
}
