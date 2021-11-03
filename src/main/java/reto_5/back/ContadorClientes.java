/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto_5.back;

public class ContadorClientes {
    private Long total;
    private Cliente Client;

    public ContadorClientes(Long total, Cliente Client) {
        this.total = total;
        this.Client = Client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return Client;
    }

    public void setClient(Cliente Client) {
        this.Client = Client;
    }
    
    
    
}
