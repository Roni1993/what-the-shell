package org.roni.man;

public enum ManPageDir {
    MAN1("http://manpages.ubuntu.com/manpages/artful/en/man1/"),
    MAN2("http://manpages.ubuntu.com/manpages/artful/en/man2/"),
    MAN3("http://manpages.ubuntu.com/manpages/artful/en/man3/"),
    MAN4("http://manpages.ubuntu.com/manpages/artful/en/man4/"),
    MAN5("http://manpages.ubuntu.com/manpages/artful/en/man5/"),
    MAN6("http://manpages.ubuntu.com/manpages/artful/en/man6/"),
    MAN7("http://manpages.ubuntu.com/manpages/artful/en/man7/"),
    MAN8("http://manpages.ubuntu.com/manpages/artful/en/man8/");

    private final String baseUrl;

    ManPageDir(String manpageBaseUrl) {
        this.baseUrl = manpageBaseUrl;
    }

    public String getBaseUrl(){
        return baseUrl;
    }
}
