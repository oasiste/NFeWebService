package br.com.nfe.webservice.v1;

import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.ProtNfe;
import br.com.usicamp.nfe.core.dto.RetConsReciNFe;
import br.com.usicamp.nfe.core.dto.Retorno;
import br.inf.portalfiscal.nfe.RetConsReciNFeDocument;

public abstract class NFeRetRecepcao implements WebService{
	
	protected RetConsReciNFeDocument retConsReciNFeDocument;
	
	public Retorno getRetorno() {
		RetConsReciNFe retConsReciNFe = new RetConsReciNFe();
		
		retConsReciNFe.setVersao(retConsReciNFeDocument.getRetConsReciNFe().getVersao());
        retConsReciNFe.setTpAmb(retConsReciNFeDocument.getRetConsReciNFe().getTpAmb().intValue());
        retConsReciNFe.setVerAplic(retConsReciNFeDocument.getRetConsReciNFe().getVerAplic());
        retConsReciNFe.setnRec(retConsReciNFeDocument.getRetConsReciNFe().getNRec());
        retConsReciNFe.setcStat(Integer.parseInt(retConsReciNFeDocument.getRetConsReciNFe().getCStat()));
        retConsReciNFe.setxMotivo(retConsReciNFeDocument.getRetConsReciNFe().getXMotivo());
        retConsReciNFe.setcUF(retConsReciNFe.getcUF());

        if (retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray() != null) {
            for (int i = 0; i < retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray().length; i++) {
                ProtNfe protNFe = new ProtNfe();
                protNFe.setVersao(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getVersao());
                protNFe.setId(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getId());
                protNFe.setTpAmb(Integer.parseInt(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getTpAmb().toString()));
                protNFe.setVerAplic(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getVerAplic());
                protNFe.setChNFe(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getChNFe());
               // SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                //protNFe.setDhRecbto(formato.format(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getDhRecbto().getTime()));
                protNFe.setDhRecbto(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getDhRecbto());
                protNFe.setnProt(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getNProt());
                //protNFe.setDigValue(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getDigVal().toString());
                protNFe.setcStat(Integer.parseInt(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getCStat()));
                protNFe.setxMotivo(retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].getInfProt().getXMotivo());
                protNFe.setXmlRetorno (retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()[i].xmlText());
                retConsReciNFe.addProtNFe(protNFe);
            }
        }
        
        retConsReciNFe.setXmlRetorno(retConsReciNFeDocument.toString());
		return retConsReciNFe;
	}
	
}
