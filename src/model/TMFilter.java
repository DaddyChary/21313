/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DaddyChary
 */
public class TMFilter extends AbstractTableModel {

    private List<Filtro> filtroLista;

    public TMFilter(List<Filtro> filtroLista) {
        this.filtroLista = filtroLista;
    }

    @Override
    public int getRowCount() {
        return filtroLista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Filtro filtro = filtroLista.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                filtro.getId();
            case 1 ->
                filtro.getPrice();
            case 2 ->
                filtro.getUser_id();
            case 3 ->
                filtro.getAmount();
            case 4 ->
                filtro.getDate();
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
                "Precio";
            case 2 ->
                "ID Usuario";
            case 3 ->
                "Cantidad";
            case 4 ->
                "Fecha";
            default ->
                " ";
        };
    }

}
