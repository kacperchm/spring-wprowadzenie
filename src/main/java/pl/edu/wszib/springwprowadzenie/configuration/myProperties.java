package pl.edu.wszib.springwprowadzenie.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my")
public class myProperties {

    private String url;
    private String username;
    private String password;

    private Dodatkowe dodatkowe;

    public Dodatkowe getDodatkowe() {
        return dodatkowe;
    }

    public void setDodatkowe(Dodatkowe dodatkowe) {
        this.dodatkowe = dodatkowe;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static class Dodatkowe {
        private String pierwszy;
        private String drugi;

        public String getPierwszy() {
            return pierwszy;
        }

        public void setPierwszy(String pierwszy) {
            this.pierwszy = pierwszy;
        }

        public String getDrugi() {
            return drugi;
        }

        public void setDrugi(String drugi) {
            this.drugi = drugi;
        }
    }
}


