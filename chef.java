package day15;

public class chef extends employees{

    
    public chef() {
    }

    public chef(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
