package Portfolio;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean status;

    public Task(int id,String title,String description,boolean status){
        this.id=id;
        setTitle(title);
        setDescription(description);
        setStatus(status);
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public boolean isStatus(){
        return status;
    }

    public void setTitle(String title){
        if(title==null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title can't be empty");
        }
        this.title=title;
    }
    public void setDescription(String description){
        if(description==null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description can't be empty");
        }
        this.description=description;
    }
    public void setStatus(boolean status){
        this.status=status;
    }

    public String toString(){
        return "ID: "+id+". Title: "+title+". Description: "+description+". Status: "+status;
    }
}
