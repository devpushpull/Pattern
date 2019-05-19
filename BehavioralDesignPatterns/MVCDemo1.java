package BehavioralDesignPatterns;

class Employee{
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeView{
    public void printEmployeeDetails(String name,String no){
        System.out.println("Employee:");
        System.out.println("name:"+name);
        System.out.println("id:"+no);
    }
}

class EmployeeController{
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model,EmployeeView view){
        this.model=model;
        this.view=view;
    }
    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(String name){
        return model.getName();
    }
    public void setEmployeeId(String rollNo){
        model.setId(rollNo);
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName(),model.getId());
    }
}

public class MVCDemo1 {
    public static void main(String[] args){
        Employee model=new Employee();
        model.setId("1");
        model.setName("Tom");
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model,view);
        controller.updateView();
        controller.setEmployeeName("new name");
        controller.updateView();
    }
}
