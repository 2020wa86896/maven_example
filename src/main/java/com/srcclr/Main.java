package com.srcclr;

import org.apache.commons.fileupload.MultipartStream;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.util.UriUtils;

import java.io.ByteArrayInputStream;

public class Main {

  public static void main(String[] args) throws Exception {
    System.out.println("Continous integration testing");
  }

  private static void filterXMLSignature() {
    byte[] bytes = new byte[256];

    new MultipartStream(new ByteArrayInputStream(bytes), bytes);

    new XMLSignatureInput(bytes).addNodeFilter(null);
  }
}
