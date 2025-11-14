package collections.Nov03Revision.solid;

interface Eatable{
    void eat();
}

interface Workable{
    void work();
}


interface Human extends Eatable, Workable{

}

interface Robot extends Workable{

}
public class LSP {
    public static void main(String[] args) {

    }
}
