package it.dstech.formazione.users.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import it.dstech.formazione.users.model.Immagine;
import it.dstech.formazione.users.repository.ImmagineRepository;

@Service
public class ImmagineServiceImpl implements ImmagineService {

	@Autowired
	private ImmagineRepository immagineRepos;

	@Override
	public Immagine salvaFile(MultipartFile file) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				return null;
			}

			Immagine dbFile = new Immagine(fileName, file.getContentType(), file.getBytes());

			return immagineRepos.save(dbFile);
		} catch (IOException ex) {
			return null;
		}
	}

	@Override
	public Immagine recuperaFile(Long fileId) {
		return immagineRepos.findById(fileId)
				.orElseThrow(() -> null);
	}
}
