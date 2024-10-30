package laboral.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import laboral.conexion.Conexion;
import laboral.model.Empleado;
import laboral.model.Nomina;

public class NominaDAO {

	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;

	/**
	 * Método que obtiene todas las nóminas registradas en la base de datos.
	 * 
	 * @return
	 * @throws SQLException
	 */
	public List<Nomina> obtenerNominas() throws SQLException {
		ResultSet resultSet = null;
		List<Nomina> listaNominas = new ArrayList<>();

		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM Nomina";

			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				Nomina nomina = new Nomina();

				nomina.setDniEmpleado(resultSet.getString(1));
				nomina.setSueldoCalculado(resultSet.getDouble(2));

				listaNominas.add(nomina);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaNominas;
	}

	/**
	 * Método que obtiene una nómina registrada en la base de datos por el DNI de un
	 * empleado.
	 * 
	 * @param dniEmpleado
	 * @return
	 * @throws SQLException
	 */
	public Nomina obtenerNomina(String dniEmpleado) throws SQLException {
		ResultSet resultSet = null;

		Nomina nomina = new Nomina();

		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM Nomina WHERE empleado_dni = '" + dniEmpleado + "'";

			statement = connection.prepareStatement(sql);

			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				nomina.setDniEmpleado(resultSet.getString(1));
				nomina.setSueldoCalculado(resultSet.getDouble(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nomina;
	}

	/**
	 * Método que comprueba conexión a la base de datos.
	 * 
	 * @return
	 * @throws SQLException
	 */
	private Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}

}