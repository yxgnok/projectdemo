package resources.bean;

public class ProjectUsers {
    private int id;
    private int project_id;
    private int user_id;
    private int role_id;

    public ProjectUsers(int id, int project_id, int user_id, int role_id) {
        this.id = id;
        this.project_id = project_id;
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
