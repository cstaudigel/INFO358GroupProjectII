package io.github.cstaudigel.groupprojectii.Service.Interfaces;

import io.github.cstaudigel.groupprojectii.Domain.Objects.Service;

/**
 * created by chris on 11/14/17
 */


public interface ServiceService {

    /**
     * returns service by code
     * @param code
     * @return
     */
    Service getServiceByCode(int code);

    /**
     * updates service in database
     * @param newService
     * @return
     */
    Service modifyService(Service newService);

    /**
     * removes service from database
     * @param s
     * @return
     */
    Service removeService(Service s);

    /**
     * creates service in database
     * @param s
     * @return
     */
    Service createService(Service s);
}
