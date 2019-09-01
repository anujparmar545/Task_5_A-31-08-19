
public class Project {

	private int pcode;
	private String pname;
	private int teamMembers;
	private String client;
	
	public Project(int pcode, String pname, int teamMembers, String client) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.teamMembers = teamMembers;
		this.client = client;
	}
	
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(int teamMembers) {
		this.teamMembers = teamMembers;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", pname=" + pname + ", teamMembers=" + teamMembers + ", client=" + client
				+ "]";
	}

	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + pcode;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + teamMembers;
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
		Project other = (Project) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (pcode != other.pcode)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (teamMembers != other.teamMembers)
			return false;
		return true;
	}
	
	
	*/
	
}
