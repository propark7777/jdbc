package hello.jdbc.repository;

import static org.junit.jupiter.api.Assertions.*;

import hello.jdbc.domain.Member;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class MemberRepositoryV0Test {
    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void CRUD() throws SQLException {
        //save
        Member member = new Member("V2", 10000);
        repository.save(member);

        //findById
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember = {}",findMember);
        Assertions.assertThat(findMember).isEqualTo(member);
    }

}