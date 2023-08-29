class MyGenericClass <T extends Number> {
    private T data;
    public MyGenericClass (T data) {
        this.data = data;
    }
    public double square () {
        return data.doubleValue () * data.doubleValue () ;
    }

MyGenericClass<Integer> integerObj = new MyGenericClass<> (5);
// MyGenericClass<String> stringObj = new MyGenericClass<> ("Hello");
double resulti = integerObj.square () ;
// double result2 = stringObj.square ();
}