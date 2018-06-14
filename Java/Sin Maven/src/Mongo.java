import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Mongo {

	
	static List<FechaCantida> lista = new ArrayList<FechaCantida>();
	
	 public static void main(String[] args) throws Exception {
		 
	     List<Integer> arreglo=new ArrayList<Integer>();
	        arreglo.add(20171124);
	        arreglo.add(20171125);
	        arreglo.add(20171122);
		 
	        MongoClient mongoClient = new MongoClient("localhost", 27017);
	        DB db = mongoClient.getDB("myGameDB");
	        DBCollection gameCollection = db.getCollection("myGameCollection");
	        BasicDBObject obj = new BasicDBObject().append("asunto", "10101010").append("ID_FECHA", arreglo);
	        
	        List<Map<String, Object>> jiji = new ArrayList<Map<String, Object>>();
	        Map<String, Object> listaIDX = new HashMap<String,Object>();
	        listaIDX.put("fecha"   , new Date());
	        listaIDX.put("cantidad", 25L);
	        Map<String, Object> listaIDX2 = new HashMap<String,Object>();
	        listaIDX2.put("fecha"   , 201724121L);
	        listaIDX2.put("cantidad", 215L);
	        jiji.add(listaIDX);
	        jiji.add(listaIDX2);
	       	        
	        obj.append("registrosPorFecha", jiji);
	        
	        List<FechaCantida> fechaCantidad = new ArrayList<FechaCantida>();
//	        FechaCantida a = new FechaCantida(); a.setCantidad(0L); a.setFecha("asd1");
//	        FechaCantida b = new FechaCantida(); b.setCantidad(0L); b.setFecha("asd1");
//	        FechaCantida c = new FechaCantida(); c.setCantidad(0L); c.setFecha("asd1");
	        FechaCantida a = new FechaCantida("a1",0L); 
	        FechaCantida b = new FechaCantida("b1",1L);
	        FechaCantida c = new FechaCantida("c1",2L);
	        
	        fechaCantidad.add(a);
	        fechaCantidad.add(b);
	        fechaCantidad.add(c);
	        
	        insertUpdateListQuantities("a1");
	        insertUpdateListQuantities("b1");
	        insertUpdateListQuantities("c1");
	        insertUpdateListQuantities("d1");
	        insertUpdateListQuantities("e1");
	        insertUpdateListQuantities("d1");
	        insertUpdateListQuantities("d1");
	        insertUpdateListQuantities("d1");
	        
	        for(FechaCantida forTopicCantidad: lista) {
	        	System.out.println(forTopicCantidad);
	        }
	        obj.append("xx", fechaCantidad);
	        
	        gameCollection.insert(obj);
	        printCollectionContent(gameCollection);
	    }
	 
		public static void insertUpdateListQuantities(String topic) {
			
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println(topic);
			FechaCantida aux;
			if(!lista.contains(new FechaCantida(topic,0L))) {
				System.out.println("no existe");
				aux =  new FechaCantida(topic,1L);
				lista.add(aux);
			}else {
				System.out.println("se busca");
				for(FechaCantida forTopicCantidad: lista) {
				
					System.out.println(forTopicCantidad);
					if(forTopicCantidad.getFecha().trim().equals(topic.trim())){
						forTopicCantidad.setCantidad(forTopicCantidad.getCantidad()+1);
					}
				}
			}
			System.out.println(lista.size());
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println("**************************************");
			
		}


	    static void printCollectionContent(DBCollection coll) {
	        BasicDBObject query = new BasicDBObject();
	        BasicDBObject fields = new BasicDBObject("server", true).append("_id", false).append("players",true);
	        DBCursor curs = coll.find(query);
	        while (curs.hasNext()) {
	            DBObject o = curs.next();
	            System.out.println(o.toString());
	        }
	        curs = coll.find(query, fields);
	        while (curs.hasNext()) {
	            DBObject o = curs.next();
	            System.out.println(o.toString());
	        }
	    }
}
