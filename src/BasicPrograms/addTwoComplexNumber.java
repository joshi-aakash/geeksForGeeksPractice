//Java Program to Add two Complex Numbers

package BasicPrograms;

public class addTwoComplexNumber {
    //declare variables
    int real, image;

    //add constructor to pass param
    public addTwoComplexNumber(int r, int i){
       this.real = r;
       this.image = i;
    }

    //Method to print real number
    public void show(){
            System.out.println(this.real + " +i" + this.image);
        }

    //Add method
    public static addTwoComplexNumber add(addTwoComplexNumber n1, addTwoComplexNumber n2){
        addTwoComplexNumber number = new addTwoComplexNumber(0,0);
        number.real = n1.real + n2.real;
        number.image = n1.image + n2.image;
        return number;
    }

    public static void main(String[] args) {
        addTwoComplexNumber c1 = new addTwoComplexNumber(4, 5);
        addTwoComplexNumber c2 = new addTwoComplexNumber(10, 5);

        //print complex number
        System.out.println("first complex number = ");
        c1.show();
        System.out.println("second complex number = ");
        c2.show();

        //calling add method to perform addition
        addTwoComplexNumber result = add(c1, c2);
        System.out.println("Addition is = ");
        result.show();
    }
}
