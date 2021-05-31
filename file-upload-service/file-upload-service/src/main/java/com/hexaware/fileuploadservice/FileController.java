package com.hexaware.fileuploadservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class FileController {
	@Autowired
	FileStorageService fileStorageService;

	@PostMapping("uploadFile")
	String uploadFile(@RequestParam("file") MultipartFile multipartFile) {
		String fileName = fileStorageService.storeFile(multipartFile);
		String downloadUrl = ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/").path(fileName)
				.toUriString();
		System.out.println(downloadUrl);
		return downloadUrl;
	}
@GetMapping("/download/{filename}")	
private ResponseEntity<Resource> downloadFile(@PathVariable("filename")String filename)
{
	Resource resource=fileStorageService.loadFile(filename);
	return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/octet-stream")).
			header(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename\""
					+resource.getFilename()+"\"").body(resource);
	
}
}
