package DAO;

import java.util.ArrayList;
import model.Comida;

public class CadastroComidaControle {
    
    CadastroComidaDAO comidaDao = new CadastroComidaDAO();

    public void salvar(Comida comida) {
        comidaDao.salvar(comida);
    }
     
    public ArrayList<Comida> listarPizza() throws Exception {
        return comidaDao.listarPizza();
   }
     
    public ArrayList<Comida> listarSanduiche() throws Exception {
        return comidaDao.listarSanduiche();
   }
    
   public ArrayList<Comida> listarPorcao() throws Exception {
        return comidaDao.listarPorcao();
   }
   
   public ArrayList<Comida> listarBebida() throws Exception {
        return comidaDao.listarBebida();
   }
   
}
