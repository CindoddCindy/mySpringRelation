package myrelationonetoone.onetoonetest.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="address")
@Getter
@Setter
public class Address {
    @Id
    @Column(name="id")
    @SequenceGenerator(initialValue=1, name="address_seq", sequenceName="address_sequence")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="address_seq")
    private int id;

    @Column(name="doornumber")
    private String doorNumber;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;
}
