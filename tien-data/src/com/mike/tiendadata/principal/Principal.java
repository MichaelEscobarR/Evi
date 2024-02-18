/**
 * 
 */
package com.mike.tiendadata.principal;


import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.mike.tiendadata.connection.ConnectionFactory;
import com.mike.tiendadata.dao.TipoTiendaDAO;
import com.mike.tiendadata.dao.impl.TipoTiendaDAOImpl;
import com.mike.tiendadata.entity.TipoTienda;
import com.mike.tiendadata.myexceptions.TiendaException;

/**
 * @author Michael Escobar
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TipoTiendaDAOImpl tiendaDAOImpl = new TipoTiendaDAOImpl();
		
	
		
		//::::::::::::::::PRUEBA DE INSERT::::::::::::::::
//		TipoTienda tipoTienda = new TipoTienda();
//		tipoTienda.setDescripcion("Elite");
//		tipoTienda.setFechaCreacion(LocalDateTime.now());
//		tipoTienda.setEstatus(true);
		
//		try {
//			
//			int guardado = tiendaDAOImpl.guardar(tipoTienda);
//			
//			if (guardado > 0) {
//				System.out.println("El tipo de tienda " + tipoTienda.getDescripcion() + " fue guardada" );
//			} else {
//				System.err.println("Hubo un error al guardar el tipo de tienda");
//			}
//			
//			
//		} catch (SQLException e) {
//			System.err.println("Error " + e.getMessage());
//			e.printStackTrace();
//		}
		//::::::::::::::::PRUEBA DE INSERT::::::::::::::::
		
		
		
		//::::::::::::::::PRUEBA UPDATE::::::::::::::::
//		TipoTienda tipoTienda = new TipoTienda();
//		tipoTienda.setIdTipoTienda(15);
//		tipoTienda.setDescripcion("SuperElite");
//		tipoTienda.setFechaModificacion(LocalDateTime.now());
//		tipoTienda.setEstatus(false);
//		
//		try {
//			
//			int guardado = tiendaDAOImpl.actualizar(tipoTienda);
//			
//			if (guardado > 0) {
//				System.out.println("El tipo de tienda " + tipoTienda.getDescripcion() + " fue actualizado" );
//			} else {
//				System.err.println("Hubo un error al actualizar el tipo de tienda");
//			}
//			
//			
//		} catch (SQLException e) {
//			System.err.println("Error " + e.getMessage());
//			e.printStackTrace();
//		}
		//::::::::::::::::PRUEBA UPDATE::::::::::::::::
		
		
		
		
		//::::::::::::::::PRUEBA DELETE::::::::::::::::
		
//		try {
//			
//			int eliminado = tiendaDAOImpl.eliminar(24);
//			
//			if (eliminado > 0) {
//				System.out.println("El tipo de tienda fue eliminado" );
//			} else {
//				System.err.println("Hubo un error al eliminar el tipo de tienda");
//			}
//			
//			
//		} catch (SQLException e) {
//			System.err.println("Error " + e.getMessage());
//			e.printStackTrace();
//		}	
		//::::::::::::::::PRUEBA DELETE::::::::::::::::
		
		//::::::::::::::::PRUEBA SELECT::::::::::::::::
//		try {
//			List<TipoTienda>tiposConsultados = tiendaDAOImpl.consultar();
//			
//			
//			for (TipoTienda tipoTienda : tiposConsultados) {
//				System.out.println("ID: " + tipoTienda.getIdTipoTienda());
//				System.out.println("NOMBRE: " + tipoTienda.getDescripcion());
//				System.out.println("ESTATUS: " + tipoTienda.isEstatus() + "\n");
//			}
//			
//		} catch (SQLException e) {
//			System.err.println("Error " + e.getMessage());
//			e.printStackTrace();
//		}
		//::::::::::::::::PRUEBA SELECT::::::::::::::::
		
		
		//::::::::::::::::PRUEBA SELECT WHERE::::::::::::::::
		try {
			
			TipoTienda tipoConsultado = tiendaDAOImpl.consultarPorId(17);
			
			if (tipoConsultado != null) {
				System.out.println("ID: " + tipoConsultado.getIdTipoTienda());
				System.out.println("DESCRIPCION: " + tipoConsultado.getDescripcion());
				System.out.println("ESTATUS: " + tipoConsultado.isEstatus());
			} else {
				System.err.println("No encontrado");
			}
			
		} catch (SQLException e) {
			System.err.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		
		catch (TiendaException e) {
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}
		//::::::::::::::::PRUEBA SELECT WHERE::::::::::::::::
	}

}
