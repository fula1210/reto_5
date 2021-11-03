/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto_5.back;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioMachine {
   @Autowired
    private InterfaceMachine crud;
    
    public List<Machine> getAll(){
        return(List<Machine>) crud.findAll();
    }
    
    public Optional <Machine> getMachine(int id){
        return crud.findById(id);
    }
    public Machine save(Machine machine){
        return crud.save(machine);
    }
    public void delete(Machine machine){
        crud.delete(machine);
    }
}
