public class Main {
    public static void main(String[] args) {

        Summator summator = new Summator();

        summator.setFirstNumber(2);
        summator.setSecondNumber(2);
        System.out.println(summator.sum());

        summator.setFirstNumber(6);
        summator.setSecondNumber(-4);
        System.out.println(summator.sum());

        summator.setFirstNumber(64);
        summator.setSecondNumber(36);
        System.out.println(summator.sum());

        summator.setFirstNumber(2000000000);
        summator.setSecondNumber(2000000000);
        System.out.println(summator.sum());

    }
}
