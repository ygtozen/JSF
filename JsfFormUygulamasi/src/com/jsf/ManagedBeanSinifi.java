package com.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
//@RequestScoped
public class ManagedBeanSinifi {

	// xhtml sayfamızda girilen verilerin tutulacağı değişkenleri ekliyoruz.
	String isimSoyisim;
	String adres;
	String il;
	String parola;
	List<String> cinsiyet = new ArrayList<String>(); // selectManyCheckbox value'sunun bir liste olmasını bekliyor
	String ehliyetVarMi;
	boolean kabulEdildiMi;
	String mesaj;

	public String getIsimSoyisim() {
		return isimSoyisim;
	}

	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public List<String> getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(List<String> cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getEhliyetVarMi() {
		return ehliyetVarMi;
	}

	public void setEhliyetVarMi(String ehliyetVarMi) {
		this.ehliyetVarMi = ehliyetVarMi;
	}

	public boolean isKabulEdildiMi() {
		return kabulEdildiMi;
	}

	public void setKabulEdildiMi(boolean kabulEdildiMi) {
		this.kabulEdildiMi = kabulEdildiMi;
	}

	public String getMesaj() {
		if (!kabulEdildiMi) {
			mesaj = "Şartlar kabul edilmedi.";
		} else {
			mesaj = "Şartları kabul ettiniz.";
		}
		return mesaj;
	}

	/*
	 * public void setMesaj(String mesaj) { this.mesaj = mesaj; }
	 */

}
