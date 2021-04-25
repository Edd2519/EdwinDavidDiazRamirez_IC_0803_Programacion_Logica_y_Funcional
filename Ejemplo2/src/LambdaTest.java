public class LambdaTest{
    public static void main(String[] args) {
        //Expresión Lambda
        FunctionTest ft = () -> System.out.println("Hola Mundo");

        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(ft);
    }
    public void miMetodo(FunctionTest parametro){
        parametro.saludar();
    }
}