/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsika.pertemuan9;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class InputData {
    ArrayList<Mahasiswa> Mhs;
    
    public InputData(){
        Mhs = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat, String matkul, double nilaiAkhir){
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, matkul, nilaiAkhir);
        Mhs.add(mhs);
    }
    
    public ArrayList<Mahasiswa>getALL(){
        return Mhs;
    }
    
    public void deleteData(int index){
        Mhs.remove(index);
    }
}
