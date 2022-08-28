package cs544.ea.jobsearchprojectpractice.repository;

import cs544.ea.jobsearchprojectpractice.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
