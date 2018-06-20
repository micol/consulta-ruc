package com.example.demo.web;

//import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Compras;
import com.example.demo.domain.Ruc;
import com.example.demo.domain.RucUbigeo;
import com.example.demo.domain.RucsRegistrados;
import com.example.demo.domain.Ubigeo;
import com.example.demo.domain.Ventas;
import com.example.demo.service.ComprasService;
//import com.example.demo.service.ProductoService;
import com.example.demo.service.RucService;
import com.example.demo.service.RucsRegistradosService;
import com.example.demo.service.UbigeoService;
import com.example.demo.service.VentasService;

//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
//import org.springframework.stereotype.Controller;

//import org.postgresql.jdbc3.Jdbc3PoolingDataSource;
//import java.sql.*;

@RestController
public class GreetingController {
	
//	private static final String template = "Consulta %s!";
//    private final Greeting gre = new Greeting();

    @Autowired
    private RucService rucsservice;
    
    @Autowired
    private UbigeoService ubigeoservice;
    
/*    @Autowired
    private ProductoService productoservice;*/
    
    @Autowired
    private ComprasService comprasservice;
    
    @Autowired
    private VentasService ventasservice;
    
    @Autowired
    private RucsRegistradosService rucsregistradosservice;
    
    @RequestMapping("/rucs")
    public RucUbigeo getruc(@RequestParam String nroruc,@RequestParam String rucauth){
    	RucsRegistrados tmprucregis = rucsregistradosservice.getRucbyNoRucRegistrado(rucauth);
    	Ruc tmpruc = rucsservice.getRucbyNoRuc(nroruc);
    	//Ubigeo tmpubigeo = ubigeoservice.getUbigeobyNoUbigeo(tmpruc.getubigeo());
    	RucUbigeo tmprucubigeo = new RucUbigeo();
    	if(tmprucregis != null && tmpruc != null) {
    		//System.out.println(tmprucregis.getnombre());
    		tmprucubigeo.setruc(tmpruc.getruc_nro());
    		tmprucubigeo.setnombre(tmpruc.getnombre());
    		tmprucubigeo.setestado_contribuyente(tmpruc.getestado_contribuyente());
    		tmprucubigeo.setestado_domicilio(tmpruc.getestado_domicilio());
    		tmprucubigeo.setubigeo(tmpruc.getubigeo());
    		tmprucubigeo.settipo_via(tmpruc.gettipo_via());
    		tmprucubigeo.setnombre_via(tmpruc.getnombre_via());
    		tmprucubigeo.setcod_zona(tmpruc.getcod_zona());
    		tmprucubigeo.settipo_zona(tmpruc.gettipo_zona());
    		tmprucubigeo.setnumero(tmpruc.getnumero());
    		tmprucubigeo.setinterior(tmpruc.getinterior());
    		tmprucubigeo.setlote(tmpruc.getlote());
    		tmprucubigeo.setdepartamento(tmpruc.getdepartamento());
    		tmprucubigeo.setmanzana(tmpruc.getmanzana());
    		tmprucubigeo.setkilometro(tmpruc.getkilometro());
    		if(tmpruc.getubigeo().contains("-"))
    		{
    			tmprucubigeo.setdepartamento_ubigeo("-");
    			tmprucubigeo.setprovincia("-");
    			tmprucubigeo.setdistrito("-");
    		}else{
    			Ubigeo tmpubigeo = ubigeoservice.getUbigeobyNoUbigeo(tmpruc.getubigeo());
    			tmprucubigeo.setdepartamento_ubigeo(tmpubigeo.getdepartamento());
    			tmprucubigeo.setprovincia(tmpubigeo.getprovincia());
    			tmprucubigeo.setdistrito(tmpubigeo.getdistrito());
    		}
    	}
    	//return new RucUbigeo(tmpruc.getruc_nro(),tmpruc.getnombre(),tmpruc.getestado_contribuyente(),tmpruc.getestado_domicilio(),tmpruc.getubigeo(),tmpruc.gettipo_via(),tmpruc.getnombre_via(),tmpruc.getcod_zona(),tmpruc.gettipo_zona(),tmpruc.getnumero(),tmpruc.getinterior(),tmpruc.getlote(),tmpruc.getdepartamento(),tmpruc.getmanzana(),tmpruc.getkilometro(),tmpubigeo.getdepartamento(),tmpubigeo.getprovincia(),tmpubigeo.getdistrito());
    	return tmprucubigeo;
    }
    
    @RequestMapping("/rucsreg")
    public RucsRegistrados getrucregistrados(@RequestParam String rucauth){
    	RucsRegistrados tmpruc2 = new RucsRegistrados();
    	RucsRegistrados tmprucregis = rucsregistradosservice.getRucbyNoRucRegistrado(rucauth);
    	if(tmprucregis != null ) {
    		tmpruc2.setruc_nro(tmprucregis.getruc_nro());
    		tmpruc2.setnombre(tmprucregis.getnombre());
    		tmpruc2.setestado_contribuyente(tmprucregis.getestado_contribuyente());
    		tmpruc2.settelefono(tmprucregis.gettelefono());
    		tmpruc2.setemail(tmprucregis.getemail());
    		//System.out.println(tmprucregis.getnombre());
    	}
    	//return new RucUbigeo(tmpruc.getruc_nro(),tmpruc.getnombre(),tmpruc.getestado_contribuyente(),tmpruc.getestado_domicilio(),tmpruc.getubigeo(),tmpruc.gettipo_via(),tmpruc.getnombre_via(),tmpruc.getcod_zona(),tmpruc.gettipo_zona(),tmpruc.getnumero(),tmpruc.getinterior(),tmpruc.getlote(),tmpruc.getdepartamento(),tmpruc.getmanzana(),tmpruc.getkilometro(),tmpubigeo.getdepartamento(),tmpubigeo.getprovincia(),tmpubigeo.getdistrito());
    	return tmpruc2;
    }
    
    @RequestMapping("/addcompras")
    public @ResponseBody String addNewCompra (@RequestParam String nom
			, @RequestParam String desc, @RequestParam double cant
			, @RequestParam Date fecha, @RequestParam String ubigeo
			, @RequestParam String categ, @RequestParam String rubro 
			, @RequestParam String undmed, @RequestParam double prec
			, @RequestParam String coduni) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
    	Compras comp = new Compras(nom,desc,cant,fecha,ubigeo,categ,rubro,undmed,prec,coduni);
    	comprasservice.saveCompras(comp);
		return "Saved";
	}
    
    @RequestMapping("/addventas")
    public @ResponseBody String addNewVenta (@RequestParam String nom
			, @RequestParam String desc, @RequestParam double cant
			, @RequestParam Date fecha, @RequestParam String ubigeo
			, @RequestParam String categ, @RequestParam String rubro
			, @RequestParam String undmed, @RequestParam double prec
			, @RequestParam String coduni) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
    	Ventas vent = new Ventas(nom,desc,cant,fecha,ubigeo,categ,rubro,undmed,prec,coduni);
    	ventasservice.saveVentas(vent);
		return "Saved";
	}
    
    @RequestMapping("/addrucclient")
    public @ResponseBody String addNewRucClient (@RequestParam String ruc
			, @RequestParam String nom, @RequestParam String estado
			, @RequestParam String telefono, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
    	RucsRegistrados rucreg = new RucsRegistrados();
    	rucreg.setruc_nro(ruc);
    	rucreg.setnombre(nom);
    	rucreg.setestado_contribuyente(estado);
    	rucreg.settelefono(telefono);
    	rucreg.setemail(email);
    	rucsregistradosservice.saveRucRegistrado(rucreg);
		return "Saved";
	}
    
  /*  @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="nroruc") String nameruc) {
    	
    	Jdbc3PoolingDataSource source = gre.getcon();
    	Connection con = null;
    	String ruc_nro = null;
    	String nombre = null;
    	String estado_contribuyente = null;
    	String estado_domicilio = null;
    	String ubigeo = null;
    	String tipo_via = null;
    	String nombre_via = null;
    	String cod_zona = null;
    	String tipo_zona = null;
    	String numero = null;
    	String interior = null;
    	String lote = null;
    	String departamento = null;
    	String manzana = null;
    	String kilometro = null;
    	try {
    	    con = source.getConnection();
    	    Statement statement = con.createStatement();
    	    String sql = "SELECT ruc,nombre,estado_contribuyente,estado_domicilio,ubigeo,tipo_via,nombre_via,cod_zona,tipo_zona,numero,interior,lote,departamento,manzana,kilometro FROM ruc where ruc = '" + nameruc + "'";
    	    ResultSet res = statement.executeQuery(sql);
    	    if (res != null) {
    	    	while ( res.next() ) {
                    ruc_nro = res.getString("ruc");
                    nombre = res.getString("nombre");
                    estado_contribuyente = res.getString("estado_contribuyente");
                    estado_domicilio = res.getString("estado_domicilio");
                    ubigeo = res.getString("ubigeo");
                    tipo_via = res.getString("tipo_via");
                    nombre_via = res.getString("nombre_via");
                    cod_zona = res.getString("cod_zona");
                    tipo_zona = res.getString("tipo_zona");
                    numero = res.getString("numero");
                    interior = res.getString("interior");
                    lote = res.getString("lote");
                    departamento = res.getString("departamento");
                    manzana = res.getString("manzana");
                    kilometro = res.getString("kilometro");
                }
    	    }
    	    res.close();
    	    // use connection
    	} catch (SQLException e) {
    	    // log error
    	} finally {
    	    if (con != null) {
    	        try { con.close(); } catch (SQLException e) {}
    	    }
    	}
        return new Greeting(String.format(template, nameruc),ruc_nro,nombre,estado_contribuyente,estado_domicilio,ubigeo,tipo_via,nombre_via,cod_zona,tipo_zona,numero,interior,lote,departamento,manzana,kilometro);
    }*/

}
