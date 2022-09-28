package umn.ac.id.maggotproject.global;

import umn.ac.id.maggotproject.model.UserModel;

public class AuthenticatedUser {
    private static String token = null;
    private static UserModel.User authenticatedUser = null;

    public static void setUser(UserModel.User user, String serverToken) {
        authenticatedUser = user;
        token = serverToken;
    }

    public static String getToken() {
        return token;
    }

    public static UserModel.User getUser() {
        return authenticatedUser;
    }

    public static void logout() {
        authenticatedUser = null;
    }
}