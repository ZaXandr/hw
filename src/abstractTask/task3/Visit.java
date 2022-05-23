package abstractTask.task3;

public class Visit extends BaseEntity{
    protected User user;
    protected WebSite site;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WebSite getSite() {
        return site;
    }

    public void setSite(WebSite site) {
        this.site = site;
    }

    @Override
    public String getInfo() {
        return user.getInfo() + " " + "visit info: " + super.getInfo() + " " + site.getInfo();
    }
}
