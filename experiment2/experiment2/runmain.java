public class runmain {

    public static void main(String[] args) {

        ViewsCalculator view = new ViewsCalculator();
        ModelsCalculator model = new ModelsCalculator();

        new CalculatorController(view, model);
    }
}