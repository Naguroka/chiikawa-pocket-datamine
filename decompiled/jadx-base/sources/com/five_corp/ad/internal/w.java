package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements com.five_corp.ad.internal.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.File f2116a;

    public w(java.io.File file) {
        this.f2116a = new java.io.File(file, "com.five_corp.ad");
    }

    public final void a(java.lang.String str) {
        c(str + "_SUCCESS").delete();
        c(str).delete();
    }

    public final boolean b(java.lang.String str) {
        return c(new java.lang.StringBuilder().append(str).append("_SUCCESS").toString()).exists() && c(str).exists();
    }

    public final java.io.File c(java.lang.String str) {
        return new java.io.File(this.f2116a, str);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final com.five_corp.ad.internal.util.f d(java.lang.String str) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                if (!b(str)) {
                    a(str);
                    return com.five_corp.ad.internal.util.f.a(com.five_corp.ad.internal.t.w);
                }
                fileInputStream = new java.io.FileInputStream(c(str));
                try {
                    byte[] bArr = new byte[(int) fileInputStream.getChannel().size()];
                    fileInputStream.read(bArr);
                    com.five_corp.ad.internal.util.f fVar = new com.five_corp.ad.internal.util.f(true, null, bArr);
                    try {
                        fileInputStream.close();
                        return fVar;
                    } catch (java.io.IOException e) {
                        android.util.Log.getStackTraceString(e);
                        return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e, null), null);
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    android.util.Log.getStackTraceString(e);
                    com.five_corp.ad.internal.util.f fVar2 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e, null), null);
                    if (fileInputStream == null) {
                        return fVar2;
                    }
                    try {
                        fileInputStream.close();
                        return fVar2;
                    } catch (java.io.IOException e3) {
                        android.util.Log.getStackTraceString(e3);
                        return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e3, null), null);
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        fileInputStream2.close();
                    } catch (java.io.IOException e4) {
                        android.util.Log.getStackTraceString(e4);
                        return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e4, null), null);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e5) {
            e = e5;
            fileInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (0 != 0) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public static java.lang.String a(long j) {
        return "adcfg-" + java.lang.Long.toString(j) + ".json";
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final com.five_corp.ad.internal.util.g b(java.lang.String str, byte[] bArr) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                java.io.File fileC = c(str);
                fileOutputStream = new java.io.FileOutputStream(fileC);
                try {
                    fileOutputStream.write(bArr);
                    if (!fileC.setReadable(true, false)) {
                        com.five_corp.ad.internal.util.g gVarB = com.five_corp.ad.internal.util.g.b(com.five_corp.ad.internal.t.w);
                        try {
                            fileOutputStream.close();
                            return gVarB;
                        } catch (java.io.IOException e) {
                            android.util.Log.getStackTraceString(e);
                            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e, null));
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    try {
                        fileOutputStream.close();
                        return new com.five_corp.ad.internal.util.g(true, null);
                    } catch (java.io.IOException e2) {
                        android.util.Log.getStackTraceString(e2);
                        return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e2, null));
                    }
                } catch (java.io.IOException e3) {
                    e = e3;
                    android.util.Log.getStackTraceString(e);
                    com.five_corp.ad.internal.util.g gVar = new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e, null));
                    if (fileOutputStream == null) {
                        return gVar;
                    }
                    try {
                        fileOutputStream.close();
                        return gVar;
                    } catch (java.io.IOException e4) {
                        android.util.Log.getStackTraceString(e4);
                        return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e4, null));
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        fileOutputStream2.close();
                    } catch (java.io.IOException e5) {
                        android.util.Log.getStackTraceString(e5);
                        return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w, null, e5, null));
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            e = e6;
            fileOutputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (0 != 0) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public final com.five_corp.ad.internal.util.g a() {
        java.io.File file = this.f2116a;
        return (file.exists() || (file.mkdirs() && file.setReadable(true, false) && file.setWritable(true, false) && file.setExecutable(true, false))) ? new com.five_corp.ad.internal.util.g(true, null) : com.five_corp.ad.internal.util.g.b(com.five_corp.ad.internal.t.w);
    }

    public final com.five_corp.ad.internal.util.g a(java.lang.String str, byte[] bArr) {
        com.five_corp.ad.internal.util.g gVarB = b(str, bArr);
        if (!gVarB.f2085a) {
            a(str);
            return gVarB;
        }
        com.five_corp.ad.internal.util.g gVarB2 = b(str + "_SUCCESS", new byte[0]);
        if (!gVarB2.f2085a) {
            a(str);
            return gVarB2;
        }
        return new com.five_corp.ad.internal.util.g(true, null);
    }
}
