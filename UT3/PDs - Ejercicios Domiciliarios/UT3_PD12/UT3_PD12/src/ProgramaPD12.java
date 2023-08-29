import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class ProgramaPD12 {

    public static void main(String[] args) throws IOException {

        // instanciar curso BasicoIng...
        Conjunto<Alumno> BasicoIng = new Conjunto<>();
        String[] alumnosBasicoIng = ManejadorArchivosGenerico.leerArchivo("..\\UT3_PD12\\src\\basico-ing.txt");
        for (String lineaAlumno : alumnosBasicoIng){
            lineaAlumno = lineaAlumno.trim();
            String[] datosAlumno = lineaAlumno.split(",");
            Alumno alumno = new Alumno(Integer.parseInt(datosAlumno[0]), datosAlumno[1]);
            BasicoIng.insertar(datosAlumno[0], alumno);
        }
        

        // instanciar curso BasicoEmp...
        Conjunto<Alumno> BasicoEmp = new Conjunto<>();
        String[] alumnosBasicoEmp = ManejadorArchivosGenerico.leerArchivo("..\\UT3_PD12\\src\\basico-emp.txt");
        for (String lineaAlumno : alumnosBasicoEmp){
            lineaAlumno = lineaAlumno.trim();
            String[] datosAlumno = lineaAlumno.split(",");
            Alumno alumno = new Alumno(Integer.parseInt(datosAlumno[0]), datosAlumno[1]);
            BasicoEmp.insertar(datosAlumno[0], alumno);
        }

        // generar el curso "integrador101" con los alumnos que están en condiciones de cursarlo  
        Conjunto<Alumno> integrador101 = (Conjunto<Alumno>) BasicoIng.union(BasicoEmp);
        //integrador101.imprimir();
        
        // guardar en un archivo "integrador101.txt"  - IDEALMENTE ordenados por código de alumno -
        String[] integradorLista = integrador101.toString().split(" ");
        ManejadorArchivosGenerico.escribirArchivo("..\\UT3_PD12\\src\\integrador101.txt", integradorLista);
        
        // generar el curso "exigente102" con los alumnos que están en condiciones de cursarlo 
        Conjunto<Alumno> exigente102 = (Conjunto<Alumno>) BasicoIng.interseccion(BasicoEmp);
        //exigente102.imprimir();
        
        // guardar en un archivo "exigente102.txt" - IDEALMENTE ordenados por código de alumno -
        String[] exigenteLista = exigente102.toString().split(" ");
        ManejadorArchivosGenerico.escribirArchivo("..\\UT3_PD12\\src\\exigente102.txt", exigenteLista);
    }
}
