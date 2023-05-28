package org.testing.math.trig;

public class TanFunc extends AbsTrigFunc {
    SinFunc sin;

    public TanFunc(CosFunc cos, SinFunc sin) {
        setBaseTrigFunc(cos);
        this.sin = sin;
    }

    @Override
    public Double solveFunc(double x, double eps) {
        double res = sin.solveFunc(x, eps)/cos.cos(x, eps);
        writeToCsv(buildCSVRes(x, res, null), FILENAME);
        return res;
    }

    @Override
    public void setBaseTrigFunc(CosFunc cos) {
        this.cos = cos;
    }

}
