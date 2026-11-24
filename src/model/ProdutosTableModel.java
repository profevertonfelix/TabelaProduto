/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author profe
 */
public class ProdutosTableModel extends AbstractTableModel{
    private List<Produtos> listaProdutos = new ArrayList<>();
    private String[] colunas = {"Nome", "Categoria", "Preço", "Quantidade"};
    
    @Override
    public int getRowCount() {
        return listaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaProdutos.get(rowIndex).getNome();
            case 1:
                return listaProdutos.get(rowIndex).getCategoria();
            case 2:
                return listaProdutos.get(rowIndex).getPreco();
            case 3:
                return listaProdutos.get(rowIndex).getQuantidade();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        return colunas[column];
    }
    public void addRow(Produtos  p){
        listaProdutos.add(p);
    }
    
}
