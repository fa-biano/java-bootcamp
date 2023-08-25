package set.operacoes_basicas;

public class Guest {
    private String name;
    private int inviteCode;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getInviteCode() {
        return inviteCode;
    }
    public void setInviteCode(int inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Guest(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    @Override
    public String toString() {
        return "Guest [name=" + name + ", inviteCode=" + inviteCode + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + inviteCode;
        return result;
    }
    
    // altera comportamento do Set para identificar apenas o atributo inviteCode como único
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Guest other = (Guest) obj;
        if (inviteCode != other.inviteCode)
            return false;
        return true;
    }

    
}
