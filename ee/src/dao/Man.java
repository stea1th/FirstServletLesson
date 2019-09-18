package dao;

public class Man {

    @CheckEmail
    private String email;

    @CheckSiteUrl(protocol = "http")
    private String site;
}
