/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * *
 * @version 2014-03-13
 */

public class Controller {
    private View view;

    public Controller() {
        view = new View();
        view.setController(this);
        view.setVisible(true);
    }

    public void doSomething(String pData)
    {
        // example of what a function could look like.
        // these will be executed when e.g. a button in the view has been clicked
    }

    public static void main(String[] args) {
        new Controller();
    }
}
