package abstractTask.task3;

public class WebSite extends BaseEntity{
    protected String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getInfo() {
        return  "Site: " + super.getInfo() + " url: " + url;
    }
}
