package tnsif.c2tc.m07.Service;

import tnsif.c2tc.m07.entity.Certificate;

public interface CertificateService {
	public void addCertificate(Certificate c);
	public Certificate updateCertificate(Certificate c);
	public Certificate searchCertificate(int cid);
	public void deleteCertificate(Certificate c);
	//public List<Certificate> getCertificate();  to returning the all the details
	public Certificate getCertificate(int id);
}
