package classes;
import org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo1;
import org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo2;
import org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1;
import org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2;
import org.tempuri.IsRegistroMercantilQuitoProxy;

public class ConsultWS {

	
	public RetornoRetornoMetodo1 findByChasisAndNumInscripcion(String chasis, String  numeroDeInscripcion) throws Exception{
		if(chasis.equalsIgnoreCase("") || chasis == null){
			throw new Exception("Chasis is mandatory entry");
		}
		if(chasis.equalsIgnoreCase("") || chasis == null){
			throw new Exception("numeroDeInscripcion is mandatory entry");
		}
		IsRegistroMercantilQuitoProxy proxy = new IsRegistroMercantilQuitoProxy();
		ParametroEntradaMetodo1 parametro = new ParametroEntradaMetodo1();
		RetornoRetornoMetodo1 retorno = null;
		parametro.setChasis(chasis);
		parametro.setNumeroInscripcion(numeroDeInscripcion);
		retorno = proxy.consultarTramitesInscripcion(parametro);
		
		if(retorno != null){
			return retorno;
		}
		return null;
	}
	
	public RetornoRetornoMetodo2 findByDateAndNumTramite(Integer anio, Integer numeroTramite) throws Exception{
		if(anio < 0 || anio == null){
			throw new Exception("anio is mandatory entry");
		}
		if(numeroTramite < 0 || numeroTramite == null){
			throw new Exception("numeroTramite is mandatory entry");
		}
		IsRegistroMercantilQuitoProxy proxy = new IsRegistroMercantilQuitoProxy();
		ParametroEntradaMetodo2 parametro = new ParametroEntradaMetodo2();
		RetornoRetornoMetodo2 retorno = null;
		parametro.setAnio(anio);
		parametro.setNumeroTramite(numeroTramite);
		retorno = proxy.consultarTramitesCertificacion(parametro);
		
		if(retorno != null){
			return retorno;
		}
		return null;
	}
	
	

}
