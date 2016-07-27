package Utils;

import com.google.gson.JsonElement;

/**
 * Created by abarabash on 5/26/16.
 */
public class FacebookTestUserAccount {

    private final FacebookTestUserStore helper;
    private JsonElement jsonUser;

    public FacebookTestUserAccount(FacebookTestUserStore helper, JsonElement user) {
        this.helper = helper;
        this.jsonUser = user;
    }

    public void delete() {
        String result = helper.delete("/%s", id());

    }

    public void copyToOtherApplication(String applicationId, String accessToken, boolean appInstalled, String permissions) {
        String result = helper.post("/%s/accounts/test-users",
                helper.buildList("installed", Boolean.toString(appInstalled), "permissions", permissions == null ? "email, offline_access" : permissions, "owner_access_token", helper.getAccessToken()),
                helper.buildList("access_token", accessToken), applicationId);

    }

    public void copyToTestUserStore(FacebookTestUserStore testUserStore, boolean appInstalled, String permissions) {
        if (testUserStore instanceof FacebookTestUserStore) {
            FacebookTestUserStore knownStore = (FacebookTestUserStore) testUserStore;
            copyToOtherApplication(knownStore.getApplicationId(), knownStore.getAccessToken(), appInstalled, permissions);
        } else {
            throw new IllegalArgumentException("The provided testUserStore is of unknown type");
        }
    }

    public String id() {
        return userDataAsString("id");
    }

    public String accessToken() {
        return userDataAsString("access_token");
    }

    public String loginUrl() {
        return userDataAsString("login_url");
    }

    public String getPassword() {
        return userDataAsString("password");
    }

    public String getEmail() {
        return userDataAsString("email");
    }

    public String json() {
        return jsonUser.toString();
    }

    private String userDataAsString(String data) {
        if (jsonUser == null) {
            return null;
        }

        String anObject = jsonUser.getAsJsonObject().get(data).getAsString();

        return anObject != null ? anObject.toString() : null;
    }

    private String get(String resource, Object... pathParams) {
        return helper.get(resource, helper.buildList("access_token", accessToken()), pathParams);
    }


}
