public class Rect {
    double width;
    double  heigth;
    String nameOfRect;

    double getArea(){
        return width*heigth;
    }

    void maignify(double koeff) {
        width *= koeff;
        heigth *= koeff;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", heigth=" + heigth +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }
}


