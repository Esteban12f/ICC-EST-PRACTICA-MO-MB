import views.View;
import controller.*;


public class App {
    public static void main(String[] args) throws Exception {
        /// Crear la vista
        View vista = new View();

        // Crear clases con los metodos de ordenamiento y busqueda
        SortingMethods1 sortingMethods = new SortingMethods1();
        SearchMethods1 searchMethods = new SearchMethods1();

        // Crear controlador
        Controller controlador = new Controller(vista, sortingMethods, searchMethods);
    }

}
