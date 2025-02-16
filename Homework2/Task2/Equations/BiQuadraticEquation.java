package Homework2.Task2.Equations;

public class BiQuadraticEquation extends QuadraticEquation{
    private double near_x4;
    private double near_x3;
    public BiQuadraticEquation(double[] coefficients) {
        super(new double[]{coefficients[2],coefficients[3],coefficients[4]});
        this.near_x4 = coefficients[0];
        this.near_x3 = coefficients[1];
    }

    @Override
    public double[] solve(){
        if(near_x3!=0){
            throw new IllegalArgumentException("Incorrect condition");
        }
        if (near_x4==0){
            return super.solve();
        }
        double D = a*a - 4*c*near_x4;
        if(D<0){
            throw new ArithmeticException("The equation has zero roots");
        } else if (D==0) {
            if(-b/(2*a)>0){
                return new double[] {Math.sqrt(-b/(2*a)),-Math.sqrt(-b/(2*a))};
            } else if (-b/(2*a)==0) {
                return new double[]{0};
            }else{
                throw new ArithmeticException("The equation has zero roots");
            }
        } else {
            double t1 = (-b+Math.sqrt(D))/(2*a);
            double t2 = (-b-Math.sqrt(D))/(2*a);
            if(t1>0&&t2>0){
                return new double[]{Math.sqrt(t1),Math.sqrt(t2),-Math.sqrt(t1),-Math.sqrt(t2)};
            } else if (t1>0&&t2==0) {
                return new double[]{Math.sqrt(t1),0,-Math.sqrt(t1)};
            } else if (t1>0&&t2<0) {
                return new double[]{Math.sqrt(t1), -Math.sqrt(t1)};
            } else if (t1==0&&t2>0) {
                return new double[]{0,Math.sqrt(t2),-Math.sqrt(t2)};
            } else if (t2>0&&t1<0) {
                return new double[]{Math.sqrt(t2), -Math.sqrt(t2)};
            }else {
                throw new ArithmeticException("The equation has zero roots");
            }
        }
    }

    @Override
    public void printEquation() {
        System.out.println(near_x4+"x^4+"+a+"x^2+"+c+"=0");
    }
}
