package HW1;

class Model {

    private String hello;
    private String java;
    private String helloJava;

    //Program logic
    String createHelloJava(){
        this.helloJava = this.hello + " " + this.java;
        return this.helloJava;
    }

    void setHello(String hello){
        this.hello = hello;
    }

    void setJava(String java){
        this.java = java;
    }

}