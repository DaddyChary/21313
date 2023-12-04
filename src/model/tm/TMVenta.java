/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Venta;

/**
 *
 * @author DaddyChary
 */
public class TMVenta extends AbstractTableModel {

    private List<Venta> ventaLista;

    public TMVenta(List<Venta> ventaLista) {
        this.ventaLista = ventaLista;
    }

    @Override
    public int getRowCount() {
        return ventaLista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venta venta = ventaLista.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                venta.getId();
            case 1 ->
                venta.getProductName();
            case 2 ->
                venta.getUserName();
            case 3 ->
                venta.getAmount();
            case 4 ->
                venta.getFecha();
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
                "Producto";
            case 2 ->
                "Usuario";
            case 3 ->
                "Cantidad";
            case 4 ->
                "Fecha";
            default ->
                " ";
        };
    }

}
