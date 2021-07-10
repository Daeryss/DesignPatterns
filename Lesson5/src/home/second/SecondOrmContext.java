package home.second;

import home.DbUserEntity;
import home.DbUserInfoEntity;

import java.util.Set;

public interface SecondOrmContext {

    Set<DbUserEntity> getUsers();

    Set<DbUserInfoEntity> getUserInfos();
}
