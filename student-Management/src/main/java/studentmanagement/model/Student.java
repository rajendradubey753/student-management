package studentmanagement.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

    @Entity
    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
    public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String email;

        private String course;




    }


