package home;

import java.time.LocalDateTime;

public class DbUserInfoEntity implements DbEntity{

    private Long id;
    private String name;
    private LocalDateTime birthday;

    public DbUserInfoEntity() {
    }

    public DbUserInfoEntity(Long id, String name, LocalDateTime birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}
