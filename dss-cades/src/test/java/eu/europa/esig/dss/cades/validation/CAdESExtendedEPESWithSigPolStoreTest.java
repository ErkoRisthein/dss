package eu.europa.esig.dss.cades.validation;

import eu.europa.esig.dss.diagnostic.DiagnosticData;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.FileDocument;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CAdESExtendedEPESWithSigPolStoreTest extends AbstractCAdESTestValidation {

    @Override
    protected DSSDocument getSignedDocument() {
        return new FileDocument("src/test/resources/validation/cades-extended-epes-sig-pol-store.pkcs7");
    }

    @Override
    protected void checkSignatureLevel(DiagnosticData diagnosticData) {
        // no signing-time -> not Baseline
        assertEquals(SignatureLevel.CAdES_EPES, diagnosticData.getSignatureFormat(diagnosticData.getFirstSignatureId()));
    }

    @Override
    protected void checkSigningDate(DiagnosticData diagnosticData) {
        assertNull(diagnosticData.getSignatureDate(diagnosticData.getFirstSignatureId()));
    }

}
