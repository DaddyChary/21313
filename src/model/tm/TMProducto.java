/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Producto;

/**
 *
 * @author DaddyChary
 */
public class TMProducto extends AbstractTableModel{
    
    private List<Producto> productList;

    public TMProducto(List<Producto> productList) {
        this.productList = productList;
    }
    
    @Override
    public int getRowCount() {
        return productList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = productList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                producto.getId();
            case 1 ->
                producto.getName();
            case 2 ->
                producto.getPrice();
            case 3 ->
              producto.getDescription();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "ID";
            case 1 ->
                "Nombre";
            case 2 ->
                "Precio";
            case 3 ->
                "Decripcion";
            default ->
                " ";
        };
    }
    
}
