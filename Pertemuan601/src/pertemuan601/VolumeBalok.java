/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan601;

/**
 *
 * @author Alfaniii Dahatttt
 * TGL : 15 April 2025
 */
public class VolumeBalok {
    private int panjang,lebar,tinggi;
    private int hasil;
    
    public int Volume (){
        this.hasil = this.panjang*this.lebar*this.tinggi;
        return this.hasil;
        
    }
    public void setpanjang(int pj){
        this.panjang = pj;
    }
    public void setlebar(int lb){
        this.lebar = lb;
    }
    public void settinggi(int tg){
        this.tinggi = tg;   
    }
    
    
    public int getpanjang(){
        return this.panjang;
    }
    public int getlebar(){
        return this.lebar;
    }
    public int gettinggi(){
        return this.tinggi;
    }
}
