import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProdutoController {
	
	public List<Produto> getProdutos(){
		List<Produto> lista = new LinkedList<Produto>();
		
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Lápis");
		p1.setQtde(1);
		p1.setQtdeMin(1);
		p1.setValor(1.0);
		lista.add(p1);
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Caneta");
		p2.setQtde(2);
		p2.setQtdeMin(2);
		p2.setValor(2.0);
		lista.add(p2);
		
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setNome("Borracha");
		p3.setQtde(3);
		p3.setQtdeMin(3);
		p3.setValor(3.0);
		lista.add(p3);
		
		Produto p4 = new Produto();
		p4.setId(4);
		p4.setNome("Caderno");
		p4.setQtde(4);
		p4.setQtdeMin(4);
		p4.setValor(4.0);
		lista.add(p4);
		
		return lista;
	}
}
