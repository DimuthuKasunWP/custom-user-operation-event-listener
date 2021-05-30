package org.wso2.custom.user.operation.event.listener;


import org.wso2.carbon.user.api.Permission;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.common.*;
import org.wso2.carbon.user.core.model.Condition;
import org.wso2.carbon.user.core.model.UniqueIDUserClaimSearchEntry;
import org.wso2.carbon.user.core.model.UserClaimSearchEntry;

import java.util.List;
import java.util.Map;


/**
 *
 */
public class CustomUserOperationEventListener extends AbstractUserOperationEventListener {

    private String systemUserPrefix = "system_";


    public CustomUserOperationEventListener() {
        super();
    }

    @Override
    public boolean doPreDeleteUserWithID
            (String s, UserStoreManager userStoreManager) throws UserStoreException {

        if (s.contains(systemUserPrefix)) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public int getExecutionOrderId() {
        return 9000;
    }

    @Override
    public boolean doPreDeleteUser
            (String s, UserStoreManager userStoreManager) throws UserStoreException {

        if (s.contains(systemUserPrefix)) {
            return false;
        } else {
            return true;
        }
    }

}
