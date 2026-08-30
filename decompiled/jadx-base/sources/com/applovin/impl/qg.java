package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f1191a = new java.util.concurrent.atomic.AtomicReference();

    public static java.lang.String a() {
        return "iabtechlab-Applovin";
    }

    public static java.net.URL b() {
        try {
            return new java.net.URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String c() {
        return "iabtechlab.com-omid";
    }

    /* JADX WARN: Code duplicated, block: B:48:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static java.lang.String a(com.applovin.impl.sdk.j jVar) {
        java.io.InputStream inputStreamA;
        java.lang.String str = (java.lang.String) f1191a.get();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return str;
        }
        java.net.URL urlB = b();
        java.io.BufferedReader bufferedReader = null;
        if (urlB == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.z)).booleanValue()) {
            try {
                java.io.InputStream inputStreamA2 = jVar.A().a(urlB.toString(), (java.util.List) null, false, new com.applovin.impl.u2());
                try {
                    java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamA2));
                    while (true) {
                        try {
                            java.lang.String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line).append("\n");
                        } catch (java.lang.Throwable th) {
                            try {
                                bufferedReader2.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        if (inputStreamA2 != null) {
                            try {
                                inputStreamA2.close();
                            } catch (java.lang.Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th;
                    }
                    bufferedReader2.close();
                    if (inputStreamA2 != null) {
                        inputStreamA2.close();
                    }
                } catch (java.lang.Throwable th4) {
                    if (inputStreamA2 != null) {
                        inputStreamA2.close();
                    }
                    throw th4;
                }
            } catch (java.lang.Throwable th5) {
                jVar.I().a("OpenMeasurementTestParameters", th5);
                jVar.D().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th5);
            }
        } else {
            try {
                inputStreamA = jVar.A().a(urlB.toString(), (java.util.List) null, false, new com.applovin.impl.u2());
                try {
                    java.io.BufferedReader bufferedReader3 = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamA));
                    while (true) {
                        try {
                            java.lang.String line2 = bufferedReader3.readLine();
                            if (line2 == null) {
                                break;
                            }
                            sb.append(line2).append("\n");
                        } catch (java.lang.Throwable unused) {
                            bufferedReader = bufferedReader3;
                            com.applovin.impl.yp.a(inputStreamA, jVar);
                            com.applovin.impl.yp.a(bufferedReader, jVar);
                        }
                    }
                    com.applovin.impl.yp.a(inputStreamA, jVar);
                    com.applovin.impl.yp.a(bufferedReader3, jVar);
                } catch (java.lang.Throwable unused2) {
                }
            } catch (java.lang.Throwable unused3) {
                inputStreamA = null;
            }
        }
        java.lang.String string = sb.toString();
        f1191a.set(string);
        return string;
    }
}
