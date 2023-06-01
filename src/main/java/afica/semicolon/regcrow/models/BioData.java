package afica.semicolon.regcrow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
//@EqualsAndHashCode
public class BioData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String email;
    private String password;
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
//    @Override
//    public boolean equals(Object object){
//        if (object==null)return  false;
//        if (this.getClass()!= object.getClass()) return false;
//        BioData other = ((BioData) object);
//         if (this.email!=null&&((BioData)object).getEmail()==null)return false;
//                return this.email.equals(other.getEmail());
//
//    }
//    @Override
//    public  int hashCode(){
//        return Objects.hash(...values: this.email);
//    }
}
