package careerdevs.api.GitHubUserAPI.Model;

public class User {
    private Long id;
    private String login;
//    private String node_id;
//    private String avatar_url;
//    private String gravatar_id;
    private String url;
//    private String followers_url;
//    private String following_url;
//    private String gists_url;
//    private String starred_url;
//    private String subscriptions_url;
//    private String organizations_url;
    private String repos_url;
//    private String events_url;
//    private String received_events_url;
//    private String type;
//    private boolean site_admin;

    public User(Long id, String login, String url, String repos_url) {
        this.id = id;
        this.login = login;
        this.url = url;
        this.repos_url = repos_url;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

}
