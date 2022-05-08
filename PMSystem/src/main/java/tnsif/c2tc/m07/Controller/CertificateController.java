package tnsif.c2tc.m07.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.m07.Service.CertificateService;
import tnsif.c2tc.m07.entity.Certificate;


@RestController
public class CertificateController {
	@Autowired
	CertificateService service;
	@RequestMapping("/addCertificate")
	public void addCertificate(@RequestBody Certificate c)
	{
		service.addCertificate(c);
	}
	
	@GetMapping("/getCertificate/{cid}")
	public Certificate getCertificate(@PathVariable int cid)
	{
		return service.getCertificate(cid);
	}
	
	@PutMapping("/updateCertificate")
	public Certificate updateCertificate(@RequestBody Certificate c)
	{
		return service.updateCertificate(c);
	}
	@DeleteMapping("/deleteCertificate")
	public void deleteCertificate(@PathVariable Certificate c)
	{
		service.deleteCertificate(c);
	}
}
