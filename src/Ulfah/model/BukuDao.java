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

import java.util.List;

public interface BukuDao {
    Buku save(Buku buku);
    Buku update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    List<Buku> getAllBuku();

    public void update(Buku buku);

    public Buku getbuku(int index);

    
}
