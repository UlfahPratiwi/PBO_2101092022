/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah.model;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;
import java.util.List;

public class BukuDaoImpl implements BukuDao{
    private List<Buku> data = new ArrayList<>();
    
    //contruktor -- cara untuk menambah data secara manual
    public BukuDaoImpl() {
        data.add(new Buku("1111","Laskar Pelngi","Andrea Hirata","Bentang Pustaka"));
        data.add(new Buku("1112","Cinta Brontosaurus","Raditya Dika","Gagas Media"));
        data.add(new Buku("1113","Sepatu Dahlan","Khrisna Pabichara","Noura Books"));
    }
    
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }

    public Buku update(int index, Buku buku) {
        data.set(index, buku);
        return buku;
    }

    public void delete(int index) {
       data.remove(index);
    }

    public Buku getBuku(int index) {
        return data.get(index);
    }

    public List<Buku> getAllBuku() {
        return data;
    }

    @Override
    public void update(Buku buku) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Buku getbuku(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
