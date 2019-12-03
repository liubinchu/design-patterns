package top.ericcliu.structural.adapter;

public  class Target {
    public void request(String arg){
        System.out.println(this.getClass().getName()+arg);
    }
}