package advisor;

public class OAuth {
    private boolean authorize = false;
    private final String REDIRECT_URI = "http://localhost:8080";
    private final String CLIENT_ID = "1212b5725991444488c88586334f413b";


    public boolean isAuthorize() {

        return authorize;
    }

    public void setAuthorize(boolean authorize) {
        this.authorize = authorize;
    }
    public void printURL(){
        String URL_AUTH = "https://accounts.spotify.com/authorize?client_id=" + CLIENT_ID + "&redirect_uri=" + REDIRECT_URI + "&response_type=code";
        System.out.println(URL_AUTH);
    }
}
