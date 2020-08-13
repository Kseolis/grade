public class Grade {
    private int quality;
    private int formalization;
    private int speed = -1;
    private int politeness = -1;

    public Grade(final int quality, final int formalization) {
        this.quality = quality;
        this.formalization = formalization;
    }

    public Grade(final int quality, final int formalization, final int speed) {
        this.quality = quality;
        this.formalization = formalization;
        this.speed = speed;
    }

    public Grade(final int quality, final int formalization, final int speed, final int politeness) {
        this.quality = quality;
        this.formalization = formalization;
        this.speed = speed;
        this.politeness = politeness;
    }

    public double calculateGrade() {
        int[] gradeArr = {quality, formalization, speed, politeness};
        double sum = 0;
        double count = 0;
        for (int i : gradeArr) {
            if (i != -1) {
                sum += i;
                count++;
            }
        }
        return sum / count;
    }

    public int getFormalization() {
        return formalization;
    }

    public int getPoliteness() {
        return politeness;
    }

    public int getQuality() {
        return quality;
    }

    public int getSpeed() {
        return speed;
    }

    public void setFormalization(int formalization) {
        if (formalization >= 0) {
            this.formalization = formalization;
        } else {
            System.out.print("Введите значение больше или равное 0");
        }
    }

    public void setPoliteness(int politeness) {
        if (politeness >= 0) {
            this.politeness = politeness;
        } else {
            System.out.print("Введите значение больше или равное 0");
        }
    }

    public void setQuality(int quality) {
        if (quality >= 0) {
            this.quality = quality;
        } else {
            System.out.print("Введите значение больше или равное 0");
        }
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.print("Введите значение больше или равное 0");
        }
    }

    public static void main(String[] args) {
        System.out.println("4 Оценки - " + new Grade(3,4,2,4).calculateGrade());
        System.out.println("3 Оценки - " + new Grade(4,3,3).calculateGrade());
        System.out.println("2 Оценки - " + new Grade(2,5).calculateGrade());
    }
}
