package edu.nju.se.teamnamecannotbeempty.data.repository;

import edu.nju.se.teamnamecannotbeempty.data.domain.Paper;
import edu.nju.se.teamnamecannotbeempty.data.domain.Ref;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RefDao extends JpaRepository<Ref, Long> {
    List<Ref> findByRefereeIsNotNull();

    List<Ref> findByLowercaseTitleEqualsAndRefereeIsNull(String lowercaseTitle);

    List<Ref> findByReferee_Id(Long id);

    List<Ref> findByReferer_Id(Long id);

    /**
     * 获得论文的被引用数
     * @param referee
     * @return
     */
    int countRefsByReferee(Paper referee);
}
