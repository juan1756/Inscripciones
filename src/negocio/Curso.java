package negocio;

import java.util.ArrayList;
import java.util.List;

import view.CursoView;

public class Curso {

	private static int numerador;
	private int numero;
	private Profesor profesor;
	private Materia materia;
	private String dia;
	private String turno;
	private List<Alumno> alumnos;
	private int maximo;
	
	public Curso(Profesor profesor, Materia materia, String dia, String turno, int maximo) {
		Curso.numerador++;
		this.numero = Curso.numerador;
		this.profesor = profesor;
		this.materia = materia;
		this.dia = dia;
		this.turno = turno;
		this.maximo = maximo;
		alumnos = new ArrayList<Alumno>();
	}
	/** Si hay vacantes*/
	public void anotarAlumno(Alumno alumno){
		if(!alumnos.contains(alumno))
			alumnos.add(alumno);
	}
	
	public void eliminarAlumno(Alumno alumno){
		if(alumnos.contains(alumno))
			alumnos.remove(alumno);		
	}
	
	public void reasignarProfesor(Profesor profesor){
		if(!this.profesor.soyElProfesor(profesor.getLegajo())){
			this.profesor.removerCurso(this);
			this.profesor = profesor;
		}
	}
	
	public boolean hayVacantes(){
		return maximo > alumnos.size();
	}
	
	public boolean soyElCurso(int numero){
		return this.numero == numero;
	}
	
	public List<Alumno> obtenerAlumnos(){
		return alumnos;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public Materia getMateria() {
		return materia;
	}
	
	public String getDia() {
		return dia;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public int getMaximo() {
		return maximo;
	}
	
	public CursoView toView(){
		return new CursoView(numero, materia.getDescripcion(), profesor.getNombre(), dia, turno, maximo - alumnos.size() );
	}
}
