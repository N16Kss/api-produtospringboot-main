import com.examplo.app.controller;

import org.springframework.data.repository.CrudRepository;
import com.examplo.app.model.Produto;

public interface Produtorepositorio extends CrudRepository<produto, long>{
    
}
