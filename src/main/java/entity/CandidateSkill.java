package entity;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;



@Entity
@Table(name = "candidateSkill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CandidateSkillID.class)
public class CandidateSkill implements Serializable {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	@JsonBackReference
	private Candidate candidate;
	private Skill skill;
	private String skilllevel;
	 private String moreInfos;
	 @Override
	    public String toString() {
	        return "CandidateSkill{" +
	                ", SkillLevel='" + SkillLevel + '\'' +
	                ", moreInfos='" + moreInfos + '\'' +
	                '}';
	    }
	

}
