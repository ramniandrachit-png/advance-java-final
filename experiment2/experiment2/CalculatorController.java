import java.awt.event.*;

public class CalculatorController implements ActionListener {

    ViewsCalculator view;
    ModelsCalculator model;

    public CalculatorController(ViewsCalculator view, ModelsCalculator model) {

        this.view = view;
        this.model = model;

        view.btnAdd.addActionListener(this);
        view.btnSub.addActionListener(this);
        view.btnMul.addActionListener(this);
        view.btnDiv.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(view.txtNum1.getText());
        double b = Double.parseDouble(view.txtNum2.getText());

        double result = 0;

        if (e.getSource() == view.btnAdd)
            result = model.add(a, b);

        else if (e.getSource() == view.btnSub)
            result = model.sub(a, b);

        else if (e.getSource() == view.btnMul)
            result = model.mul(a, b);

        else if (e.getSource() == view.btnDiv)
            result = model.div(a, b);

        view.txtResult.setText(String.valueOf(result));
    }
}