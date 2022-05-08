package tnsif.c2tc.m07.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.m07.entity.Certificate;
import tnsif.c2tc.m07.repo.CertificateRepo;

@Service
public class CertificateServiceImpl implements CertificateService {
	@Autowired
	CertificateRepo cr;
	@Override
	public void addCertificate(Certificate c) {
		cr.save(c);		
	}

	@Override
	public Certificate updateCertificate(Certificate c) {
		Certificate c1=cr.save(c);
		return c1;
	}

	@Override
	public Certificate searchCertificate(int cid) {
		Certificate c1=cr.getById(cid);
		return c1;
	}

	@Override
	public void deleteCertificate(Certificate c) {
		cr.delete(c);
	}

	@Override
	public Certificate getCertificate(int id) {
		Certificate c=cr.findById(id).get();
		return c;
	}
}

