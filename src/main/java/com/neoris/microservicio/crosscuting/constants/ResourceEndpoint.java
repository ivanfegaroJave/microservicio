package com.neoris.microservicio.crosscuting.constants;
/**
 * Class that help to initialize the endPoint for each service
 *
 * @author Iván García
 * @version 1.0.0
 */
public class ResourceEndpoint {

    public ResourceEndpoint() {
        super();
    }

    public static final String API = "api/v1";
    public static final String ACCOUNTS = "getCuentas";
    public static final String USERS = "getUsuarios";
    public static final String CREATE_USER = "createUser";
    public static final String CREATE_ACCOUNT = "createAccount";
    public static final String CREATE_TRANSACTION = "createTransaction";
    public static final String DELETE_USER = "deleteUser/{id}";
    public static final String UPDATE_USER = "updateUser/{id}";
    public static final String UPDATE_ACCOUNT = "updateAccount/{id}";
    public static final String DELETE_ACCOUNT = "deleteAccount/{id}";
    public static final String DELETE_TRANSACTIONS = "UpdateTransactions/{id}";
    public static final String UPDATE_TRANSACTIONS = "deleteTransactions/{id}";



}
