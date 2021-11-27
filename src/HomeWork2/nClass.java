package HomeWork2;

public class nClass {
    private String[][] arr;
    public void bringOne(String[][] arr) {
        try {
            sizeArray(arr);
            this.arr = arr;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
    private void sizeArray(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4){
            throw new MyArraySizeException("Недопустимый размер массива");
        }
    }
    public void nullAr(){
        if (arr == null) {return;}
        try {
            arraySum();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    private void arraySum() throws MyArrayDataException {
        int c = 0;
        for (int a = 0; a < arr.length;a++) {
            String[] r = arr[a];
            for (int b = 0; b < r.length; b++) {
                try {
                    c += Integer.parseInt(r[b]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("В ячейке: " + a + ":" + b + " лежит символ или текст вместо числа");}
            }
        }
        System.out.println("Результат расчета: " + c);}
}








