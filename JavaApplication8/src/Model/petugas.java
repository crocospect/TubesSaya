/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NANDHA
 */
public class petugas {
	private String id_petugas;
	private int shift;
	private String nama_petugas;
	
	public void set_id_petugas(String id_petugas){
		this.id_petugas = id_petugas;
	}
	public String get_id_petugas(){
		return id_petugas;
	}
	public void set_shift(int shift){
		this.shift=shift;
	}
	public int get_shift(){
		return shift;
	}
	public void set_nama_petugas(String nama_petugas){
		this.nama_petugas=nama_petugas;
	}
	public String get_nama_petugas(){
		return nama_petugas;
	}
}
