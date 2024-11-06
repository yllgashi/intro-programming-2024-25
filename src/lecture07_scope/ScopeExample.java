package lecture07_scope;


// inside scope we can access variables (change value or retrieve value)
// you can define a scope with {...}
public class ScopeExample {
    public static void main(String[] args) {
        // example 1
        int variableInsideMain = 10;
        variableInsideMain = 20;
        System.out.println(variableInsideMain);



        // example 2
        {
            int variableInsideInnerScope = 50;
            variableInsideInnerScope = 70;
            System.out.println(variableInsideInnerScope);
        }
        // variableInsideInnerScope = 80; => We cannot access there after scope in which variable is created has ended



        // example 3
        int variableAsGlobal = 100;
        {
            variableAsGlobal = 200;
        }
        variableAsGlobal = 300;

    }
}
