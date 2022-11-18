package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Crypto {

    @Id
    private Long id;
    private LocalDateTime timestamp;
    private String symbol;
    private double price;
}
