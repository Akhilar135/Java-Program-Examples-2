 class Demo{
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
}
 class EncapsulationDemo{
    public static void main(String[] args){
        Demo d1= new Demo();
        d1.setId(101);
        d1.setName("Akhila");
        System.out.println("ID: "+d1.getId());
        System.out.println("Name: "+d1.getName());

    }
}