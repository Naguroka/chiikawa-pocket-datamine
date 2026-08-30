package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class j {
    @com.pgl.ssdk.ces.out.DungeonFlag
    public static java.util.List<com.pgl.ssdk.e> a(java.io.File file) throws java.lang.Throwable {
        java.security.cert.CertificateFactory certificateFactory;
        java.io.FileInputStream fileInputStream;
        java.util.zip.ZipInputStream zipInputStream = null;
        try {
            certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (java.security.cert.CertificateException unused) {
            certificateFactory = null;
        }
        if (certificateFactory == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
                fileInputStream = new java.io.FileInputStream(file);
                try {
                    java.util.zip.ZipInputStream zipInputStream2 = new java.util.zip.ZipInputStream(fileInputStream);
                    while (true) {
                        try {
                            java.util.zip.ZipEntry nextEntry = zipInputStream2.getNextEntry();
                            if (nextEntry != null) {
                                java.lang.String name = nextEntry.getName();
                                if (name.startsWith("META-INF/")) {
                                    if (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC")) {
                                        try {
                                            for (java.security.cert.Certificate certificate : certificateFactory.generateCertificates(new java.io.ByteArrayInputStream(a(zipInputStream2)))) {
                                                if (certificate instanceof java.security.cert.X509Certificate) {
                                                    arrayList.add(new com.pgl.ssdk.e(java.lang.String.valueOf(((java.security.cert.X509Certificate) certificate).getSubjectDN()), certificate.getEncoded()));
                                                }
                                            }
                                        } catch (java.security.cert.CertificateException unused2) {
                                        }
                                    } else {
                                        zipInputStream2.closeEntry();
                                    }
                                }
                            } else {
                                try {
                                    break;
                                } catch (java.io.IOException unused3) {
                                }
                            }
                        } catch (java.io.IOException unused4) {
                            zipInputStream = zipInputStream2;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (java.io.IOException unused5) {
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return arrayList;
                        } catch (java.lang.Throwable th) {
                            zipInputStream = zipInputStream2;
                            th = th;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (java.io.IOException unused6) {
                                }
                            }
                            if (fileInputStream == null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (java.io.IOException unused7) {
                                throw th;
                            }
                        }
                    }
                    zipInputStream2.close();
                    fileInputStream.close();
                } catch (java.io.IOException unused8) {
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException unused9) {
            }
        } catch (java.io.IOException unused10) {
            fileInputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        return arrayList;
    }

    private static byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
