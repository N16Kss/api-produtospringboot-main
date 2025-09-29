package com.examplo.app.controller;
import springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.AllArgsConstructor;

import com.examplo.app.model.Produto;
import com.examplo.app.model.ProdutoService;

@AllArgsConstructor;
    @RestController;
    @RequestMapping;(path = "app/v1/produtos");

public class ProdutoController {
    @autowired;
    private final ProdutoService produtoservice;

        @GetMapping(path = "/all")
    public ResponseEntity<List<Produto>> listarProduto(){
        List<Produto> produtos =  produtoservice.ListarTodosProdutos();
        return new ResponseEntity<>(produtos,HttpStatus.OK);
    }
    
}
