/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Raka
 */
public class PasienInap {
    
    private Pasien pasien;
    private Dokter dokter;
    private ArrayList<String> diagnosa;
        
    public PasienInap (Pasien pasien, Dokter dokter, ArrayList<String> diagnosa){
        diagnosa = new ArrayList<String> ();
        this.pasien=pasien;
        this.dokter=dokter;     
}
	
	public void setDokter (Dokter d){
		this.dokter = new Dokter();
                this.dokter.setNama(d.nama);
                this.dokter.setUsia(d.usia);
                this.dokter.setPekerjaan(d.pekerjaan);
                this.dokter.setAlamat(d.alamat);
                this.dokter.setId(d.id);
                this.dokter.setNoHp(d.noHp);
                this.dokter.setJenis(d.jenis);
                this.dokter.setTarif(d.tarif); 
		
	}
	
	public void addDiagnosa ( String d){
            for(int i=0;i<diagnosa.size();i++){
                diagnosa.add(d);
            break;
        }
		
}
	
	public getPasienInap (){
		return pasien;
	}
	
	public getDiagnosa (){
		return diagnosa;
	}
	
	public void RemovePasienInap(){
		
		
	}
    
}
