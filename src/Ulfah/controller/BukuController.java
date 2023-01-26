/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah.controller;

/**
 *
 * @author ASUS
 */

import Ulfah.controller.*;
import Ulfah.view.*;
import Ulfah.model.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BukuController {
    private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku; 
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formBuku.getTxtKodebuku().setText("");
        formBuku.getTxtJudulbuku().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
    }
    
    
    
    public void saveBuku(){
        buku = new Buku();
        buku.setKodebuku(formBuku.getTxtKodebuku().getText());
        buku.setJudulbuku(formBuku.getTxtJudulbuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
	buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert Ok");
    }
    
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getbuku(index);
        buku.setKodebuku(formBuku.getTxtKodebuku().getText());
        buku.setJudulbuku(formBuku.getTxtJudulbuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
	  buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update Ok");
    }
    
    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete Ok");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku : list){
            Object[] row = {
                buku.getKodebuku(),
                buku.getJudulbuku(),
                buku.getPengarang(),
		buku.getPenerbit()
            };
            tabelModel.addRow(row);
        }
            
    }
    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getbuku(index); // ada juga dibagian update
        if(buku!=null){
            formBuku.getTxtKodebuku().setText(buku.getKodebuku());
            formBuku.getTxtJudulbuku().setText(buku.getJudulbuku());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            
        }
    }

    
    
    
}
