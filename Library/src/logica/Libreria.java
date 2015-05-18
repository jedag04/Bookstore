package logica;

import java.util.Map;

public class Libreria {
	
	private GestorUsuario gestorUsuario;
	private GestorAutor gestorAutor;
	private GestorLibro gestorLibro;
	
	public Libreria() {
		
	}
	
	public void registrarCompra(){
		  String vista = "exito";

          Map<String, Object> activeSession = ActionContext.getContext()
                          .getSession();

          objCompra = (CompraBean) activeSession.get(Constantes.COMPRA_SESSION);
          LibroBean objLibroSelec = new LibroBean();
          objLibroSelec = (LibroBean) activeSession
                          .get(Constantes.OBJ_LIBROSELECCIONADO);
          UsuarioBean user = (UsuarioBean) activeSession
                          .get(Constantes.USUARIO_SESSION);

          System.out.println("Libro Selecciono " + objLibroSelec.getAutor());
          // objCompra.setCodUsu((String) activeSession.get("usuario"));
          // objCompra.setCodLib((String) activeSession.get("codigoLibro"));
          // objCompra.setMonto((Double) activeSession.get("monto"));

          try {

                  if (objCompra != null) {
                          
                          System.out.println("Ingreso al != null");
                          System.out.println("fecha " + objCompra.getFcompra());
                          if (buscarCompra(objCompra.getLstLibro(),
                                          objLibroSelec.getCodigo()) == -1) {

                                  objCompra.getLstLibro().add(objLibroSelec);
                                  objLibroSelec.setCantidad(cantidad);
                                  activeSession.put(Constantes.COMPRA_SESSION, objCompra);
                          }

                  } else {
                          System.out.println("Ingreso al else");
                          objCompra = new CompraBean();
                          objCompra.setCodUsu(Integer.parseInt(user.getCodigo()));
                          Date dia = new Date();
                          objCompra.setFcompra(dia);
                          objLibroSelec.setCantidad(cantidad);
                          objCompra.getLstLibro().add(objLibroSelec);

                          activeSession.put("objCompra", objCompra);

                  }

                  // Calculando el total de la compra
                  
                  for (LibroBean l : objCompra.getLstLibro()) {
                          total += l.getPrecio() * l.getCantidad();

                  }

          } catch (Exception e) {
                  e.printStackTrace();
          }

          return vista;
  }
		
	}
	
	public void registrarUsuario(){
				
	}
	
	public void registrarAutor() {
		
	}
}