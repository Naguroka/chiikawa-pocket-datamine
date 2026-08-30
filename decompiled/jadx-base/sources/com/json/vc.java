package com.json;

/* JADX INFO: loaded from: classes5.dex */
class vc implements java.util.concurrent.Callable<com.json.bb> {
    private static final java.lang.String d = "FileWorkerThread";
    private static final java.lang.String e = "X-Android-Protocols";
    private static final java.lang.String f = "http/1.1,h2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.ab f3493a;
    private final java.lang.String b;
    private long c;

    vc(com.json.ab abVar, java.lang.String str, long j) {
        this.f3493a = abVar;
        this.b = str;
        this.c = j;
    }

    int a(byte[] bArr, java.lang.String str) throws java.lang.Exception {
        return com.json.sdk.utils.IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.json.bb call() throws java.lang.Throwable {
        int i;
        if (this.c == 0) {
            this.c = 1L;
        }
        com.json.bb bbVarA = null;
        for (int i2 = 0; i2 < this.c; i2++) {
            bbVarA = a(this.f3493a.e(), i2, this.f3493a.a(), this.f3493a.c(), this.f3493a.f());
            int iB = bbVarA.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
        }
        if (bbVarA != null && bbVarA.a() != null) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(this.b);
            java.lang.String str = java.io.File.separator;
            java.lang.String string = sbAppend.append(str).append(this.f3493a.b().getName()).toString();
            java.lang.String str2 = this.f3493a.d() + str + com.json.a9.E + this.f3493a.b().getName();
            try {
                if (a(bbVarA.a(), str2) == 0) {
                    bbVarA.a(1006);
                } else if (!a(str2, string)) {
                    bbVarA.a(1014);
                }
            } catch (java.io.FileNotFoundException e2) {
                com.json.l9.d().a(e2);
                i = 1018;
                bbVarA.a(i);
            } catch (java.lang.Error e3) {
                com.json.l9.d().a(e3);
                if (!android.text.TextUtils.isEmpty(e3.getMessage())) {
                    com.json.sdk.utils.Logger.i(d, e3.getMessage());
                }
                i = 1019;
                bbVarA.a(i);
            } catch (java.lang.Exception e4) {
                com.json.l9.d().a(e4);
                if (!android.text.TextUtils.isEmpty(e4.getMessage())) {
                    com.json.sdk.utils.Logger.i(d, e4.getMessage());
                }
                bbVarA.a(1009);
            }
        }
        return bbVarA;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x017a A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #13 {all -> 0x0176, blocks: (B:103:0x0172, B:107:0x017a), top: B:118:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0108 A[Catch: all -> 0x0104, PHI: r5 r9
  0x0108: PHI (r5v13 java.net.HttpURLConnection) = 
  (r5v8 java.net.HttpURLConnection)
  (r5v9 java.net.HttpURLConnection)
  (r5v10 java.net.HttpURLConnection)
  (r5v11 java.net.HttpURLConnection)
  (r5v14 java.net.HttpURLConnection)
 binds: [B:63:0x0106, B:88:0x0142, B:80:0x012f, B:96:0x0155, B:72:0x011c] A[DONT_GENERATE, DONT_INLINE]
  0x0108: PHI (r9v24 int) = (r9v14 int), (r9v17 int), (r9v19 int), (r9v21 int), (r9v27 int) binds: [B:63:0x0106, B:88:0x0142, B:80:0x012f, B:96:0x0155, B:72:0x011c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0104, blocks: (B:60:0x0100, B:64:0x0108, B:71:0x0119, B:79:0x012c, B:87:0x013f, B:95:0x0152), top: B:112:0x001a }] */
    /* JADX WARN: Multi-variable type inference failed */
    com.json.bb a(java.lang.String str, int i, int i2, int i3, boolean z) throws java.lang.Throwable {
        java.net.HttpURLConnection httpURLConnection;
        com.json.bb bbVar = new com.json.bb();
        if (android.text.TextUtils.isEmpty(str)) {
            bbVar.a(str);
            bbVar.a(1007);
            return bbVar;
        }
        java.io.InputStream inputStream = null;
        java.lang.Object[] objArr = 0;
        java.io.InputStream inputStream2 = null;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        java.net.URL url = new java.net.URL(str);
                        url.toURI();
                        httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            if (z) {
                                try {
                                    httpURLConnection.setRequestProperty(e, f);
                                } catch (java.lang.IllegalStateException e2) {
                                    com.json.l9.d().a(e2);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i2);
                            httpURLConnection.setReadTimeout(i3);
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 400) {
                                com.json.sdk.utils.Logger.i(d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i);
                                responseCode = 1011;
                            } else {
                                inputStream2 = httpURLConnection.getInputStream();
                                bbVar.a(a(inputStream2));
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } catch (java.io.FileNotFoundException e3) {
                            e = e3;
                            com.json.l9.d().a(e);
                            i = 1018;
                            if (0 != 0) {
                                (objArr2 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            bbVar.a(str);
                            bbVar.a(i);
                            return bbVar;
                        } catch (java.lang.Error e4) {
                            e = e4;
                            com.json.l9.d().a(e);
                            responseCode = 1019;
                            if (!android.text.TextUtils.isEmpty(e.getMessage())) {
                                com.json.sdk.utils.Logger.i(d, e.getMessage());
                            }
                            if (0 != 0) {
                                (objArr3 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                            }
                            bbVar.a(str);
                            bbVar.a(responseCode);
                            return bbVar;
                        } catch (java.net.MalformedURLException e5) {
                            e = e5;
                            com.json.l9.d().a(e);
                            i = 1004;
                            if (0 != 0) {
                                (objArr4 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            bbVar.a(str);
                            bbVar.a(i);
                            return bbVar;
                        } catch (java.net.SocketTimeoutException e6) {
                            e = e6;
                            com.json.l9.d().a(e);
                            i = 1008;
                            if (0 != 0) {
                                (objArr5 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            bbVar.a(str);
                            bbVar.a(i);
                            return bbVar;
                        } catch (java.net.URISyntaxException e7) {
                            e = e7;
                            com.json.l9.d().a(e);
                            i = 1010;
                            if (0 != 0) {
                                (objArr6 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            bbVar.a(str);
                            bbVar.a(i);
                            return bbVar;
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            com.json.l9.d().a(e);
                            if (!android.text.TextUtils.isEmpty(e.getMessage())) {
                                com.json.sdk.utils.Logger.i(d, e.getMessage());
                            }
                            i = 1009;
                            if (0 != 0) {
                                (objArr7 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            bbVar.a(str);
                            bbVar.a(i);
                            return bbVar;
                        }
                    } catch (java.lang.Throwable th) {
                        com.json.l9.d().a(th);
                        com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
                        bbVar.a(str);
                        bbVar.a(i);
                    }
                } catch (java.lang.Throwable th2) {
                    com.json.l9.d().a(th2);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(th2.toString());
                }
            } catch (java.io.FileNotFoundException e9) {
                e = e9;
                httpURLConnection = null;
            } catch (java.lang.Error e10) {
                e = e10;
                httpURLConnection = null;
            } catch (java.net.MalformedURLException e11) {
                e = e11;
                httpURLConnection = null;
            } catch (java.net.SocketTimeoutException e12) {
                e = e12;
                httpURLConnection = null;
            } catch (java.net.URISyntaxException e13) {
                e = e13;
                httpURLConnection = null;
            } catch (java.lang.Exception e14) {
                e = e14;
                httpURLConnection = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (0 != 0) {
                    try {
                        inputStream.close();
                        if (0 != 0) {
                            (objArr == true ? 1 : 0).disconnect();
                        }
                    } catch (java.lang.Throwable th4) {
                        com.json.l9.d().a(th4);
                        com.json.mediationsdk.logger.IronLog.INTERNAL.error(th4.toString());
                        bbVar.a(str);
                        bbVar.a(0);
                        throw th;
                    }
                } else if (0 != 0) {
                    (objArr == true ? 1 : 0).disconnect();
                }
                bbVar.a(str);
                bbVar.a(0);
                throw th;
            }
            httpURLConnection.disconnect();
            bbVar.a(str);
            bbVar.a(responseCode);
            return bbVar;
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    boolean a(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        return com.json.sdk.utils.IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
