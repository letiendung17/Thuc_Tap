public class Bai30_simplecaculator {
    public static void main(String[] args) {
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(2);
calculator.setSecondNumber(3);
calculator.getAdditionResult();
calculator.getSubtractionResult();
calculator.getMultiplicationResult();
calculator.getDivisionResult();
System.out.println("ketqua phep cong hai so "+calculator.getFirstNumber()+" va "+calculator.getSecondNumber()+" la " + calculator.getAdditionResult());

    }
}
