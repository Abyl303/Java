package Portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    List<Task> tasks=new ArrayList<>();

    private int generateId=1;

    public int generatedID(){
        return generateId++;
    }

    public void addTask(Task task){  //create
        if(task==null){
            throw new IllegalArgumentException("Task can't be empty");
        }
        tasks.add(task);
    }
    public boolean removeTaskbyId(int id){   //delete
        for(int i=0; i<tasks.size(); i++){
            if(tasks.get(i).getId()==id){
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Task> getAllTasks(){    //read
        return new ArrayList<>(tasks);
    } //read

    public boolean activateStatusbyId(int id){ //update
        for(int i=0; i<tasks.size(); i++){
            if(tasks.get(i).getId()==id){
                tasks.get(i).setStatus(true);
                return true;
            }
        }
        return false;
    }

    public boolean deactivateStatusbyId(int id){   //update
        for(int i=0; i<tasks.size(); i++){
            if(tasks.get(i).getId()==id){
                tasks.get(i).setStatus(false);
                return true;
            }
        }
        return false;
    }




}
