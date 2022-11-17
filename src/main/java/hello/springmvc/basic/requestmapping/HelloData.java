package hello.springmvc.basic.requestmapping;

import lombok.Data;

@Data                              // @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequireArgsConstructor 를 자동으로 등록
public class HelloData {

    private String username;
    private int age;

}
