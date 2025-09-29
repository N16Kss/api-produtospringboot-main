package com.examplo.app.service;
import java.util.List;

import com.examplo.app.model.Produto;
import com.examplo.app.repository.produtorepositorio;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.produtorepositorio;
import lombok.AllArgsConstructor;

@AllArgsConstructor;
@Service;

public class ProdutoService {

@autowired;
private final Produtorepositorio produtorepositorio;
//GET
public List<Produto> ListarTodosProdutos(){
    return(List<Produto>) produtorepositorio.findAll();
}

public Optional<Produto> buscarProdutoPorID(Long id){
    return produtorepositorio.findById(id);
}

//post
    
public Produto salvarProduto(Porduto produto){
    return produtorepositorio.save(produto);
}
//DELETE

public void excluirProduto(Long id){
    produtorepositorio.deleteById(id);
}


//PUT

public Produto atualizarProduto(long id, Produto ProdutoAtualizado){
    Produto produto = produtoRepositorio.findById(id);
    .orElseThrow(() => new illegalArgumentException( String format( "Produto não encontrado com ID = %d", id)));
    produto.setNome(produtoAtualizado.getNome());
    produto.seQuantidade(produtoAtualizado.getQuantidade());
    produto.setPreco(produtoAtualizado.getPreco());
    return produtoRepositorio.save(produto);
}


}
