package entities;

import java.util.Date;

public class LogEntry{

    private String username;
    private Date momemt;
    public LogEntry(String username, Date momemt) {
        this.username = username;
        this.momemt = momemt;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Date getMomemt() {
        return momemt;
    }
    public void setMomemt(Date momemt) {
        this.momemt = momemt;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }
    
}