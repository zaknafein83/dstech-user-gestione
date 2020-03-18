package it.dstech.formazione.users.service;

import org.springframework.web.multipart.MultipartFile;

import it.dstech.formazione.users.model.Immagine;

public interface ImmagineService {

	public Immagine salvaFile(MultipartFile file); // upload

	public Immagine recuperaFile(Long fileId); // download

}
