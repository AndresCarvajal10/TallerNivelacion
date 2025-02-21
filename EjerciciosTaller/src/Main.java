public class Main {
    public static void main(String[] args) {
        //Instancia la clase reverso para colocar un texto en sentido contrario
        Reverso reversed = new Reverso();
        reversed.reversed();

        //Instancia la clase operaciones para ejecutar diferentes procesos aritmeticos
        Operaciones aritmetica = new Operaciones();
        aritmetica.leerNumeros();
        aritmetica.suma();
        aritmetica.resta();
        aritmetica.multiplica();
        aritmetica.division();
        aritmetica.Resultado();

        //Instacia la clase vocales para hallar las consonantes y vocales de una palabra
        Vocales voc = new Vocales();
        voc.hallarVocales();
    }
}