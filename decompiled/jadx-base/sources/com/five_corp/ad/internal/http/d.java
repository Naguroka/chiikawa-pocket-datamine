package com.five_corp.ad.internal.http;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.http.connection.c f1923a;

    public d(com.five_corp.ad.internal.http.connection.b bVar) {
        this.f1923a = bVar;
    }

    public final com.five_corp.ad.internal.util.f a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.five_corp.ad.internal.util.f fVar;
        java.lang.String headerField;
        com.five_corp.ad.internal.util.f fVar2;
        if (str3 != null) {
            " with body ".concat(str3);
        }
        com.five_corp.ad.internal.util.f fVarA = this.f1923a.a(str, str2, str3, null, "gzip, deflate", str4, 10000, 10000);
        if (!fVarA.f2085a) {
            return new com.five_corp.ad.internal.util.f(false, fVarA.b, null);
        }
        com.five_corp.ad.internal.http.connection.a aVar = (com.five_corp.ad.internal.http.connection.a) fVarA.c;
        com.five_corp.ad.internal.util.g gVarA = aVar.a();
        if (!gVarA.f2085a) {
            return new com.five_corp.ad.internal.util.f(false, gVarA.b, null);
        }
        com.five_corp.ad.internal.util.f fVarB = aVar.b();
        if (fVarB.f2085a) {
            int iIntValue = ((java.lang.Integer) fVarB.c).intValue();
            if (200 <= iIntValue && iIntValue < 300) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                while (true) {
                    com.five_corp.ad.internal.util.f fVarA2 = aVar.a(bArr);
                    if (!fVarA2.f2085a) {
                        fVar = new com.five_corp.ad.internal.util.f(false, fVarA2.b, null);
                        break;
                    }
                    int iIntValue2 = ((java.lang.Integer) fVarA2.c).intValue();
                    if (iIntValue2 > 0) {
                        byteArrayOutputStream.write(bArr, 0, iIntValue2);
                    } else {
                        try {
                            byteArrayOutputStream.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            java.lang.String contentType = aVar.f1922a.getContentType();
                            if (contentType != null && (contentType.contains("text/") || contentType.contains("javascript") || contentType.contains("ecmascript") || contentType.contains(com.json.zb.L))) {
                                fVar = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.http.c(iIntValue, null, new java.lang.String(byteArray, java.nio.charset.StandardCharsets.UTF_8)));
                                break;
                            }
                            fVar2 = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.http.c(iIntValue, byteArray, null));
                            fVar = fVar2;
                            break;
                        } catch (java.io.IOException e) {
                            fVar2 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.s5, null, e, null), null);
                        }
                    }
                }
            } else if (300 <= iIntValue && iIntValue < 400 && (headerField = aVar.f1922a.getHeaderField(com.google.common.net.HttpHeaders.LOCATION)) != null) {
                try {
                    fVar = a(new java.net.URL(new java.net.URL(str), headerField).toString(), "GET", null, null);
                } catch (java.net.MalformedURLException e2) {
                    fVar2 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.t5, null, e2, null), null);
                    fVar = fVar2;
                    break;
                }
            } else {
                fVar = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.http.c(iIntValue, null, null));
            }
        } else {
            com.five_corp.ad.internal.s sVar = fVarB.b;
            int i = sVar.f2045a.f2075a;
            fVar = new com.five_corp.ad.internal.util.f(false, sVar, null);
        }
        java.io.InputStream inputStream = aVar.b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
            aVar.b = null;
        }
        java.io.InputStream errorStream = aVar.f1922a.getErrorStream();
        if (errorStream != null) {
            try {
                errorStream.close();
            } catch (java.lang.Exception unused2) {
            }
        }
        aVar.f1922a = null;
        return fVar;
    }
}
