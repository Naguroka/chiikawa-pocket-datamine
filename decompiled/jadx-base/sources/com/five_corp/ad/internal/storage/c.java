package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.five_corp.ad.internal.storage.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.File f2051a;
    public final com.five_corp.ad.internal.logger.a b;

    public c(java.io.File file, com.five_corp.ad.internal.logger.a aVar) {
        this.f2051a = new java.io.File(file, "com.five_corp");
        this.b = aVar;
    }

    public final com.five_corp.ad.internal.util.g a(java.lang.String str) {
        com.five_corp.ad.internal.util.f fVarB = b(str);
        if (!fVarB.f2085a) {
            return new com.five_corp.ad.internal.util.g(false, fVarB.b);
        }
        if (!((java.lang.Boolean) fVarB.c).booleanValue()) {
            return new com.five_corp.ad.internal.util.g(true, null);
        }
        java.io.File file = new java.io.File(this.f2051a, str);
        try {
            return !file.delete() ? new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.S2, "File path: " + file.getAbsolutePath(), null, null)) : new com.five_corp.ad.internal.util.g(true, null);
        } catch (java.lang.SecurityException e) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.T2, "File path: " + file.getAbsolutePath(), e, null));
        }
    }

    public final com.five_corp.ad.internal.util.f b(java.lang.String str) {
        java.io.File file = new java.io.File(this.f2051a, str);
        try {
            return new com.five_corp.ad.internal.util.f(true, null, java.lang.Boolean.valueOf(file.exists()));
        } catch (java.lang.SecurityException e) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Q2, "File path: " + file.getAbsolutePath(), e, null), null);
        }
    }

    public final com.five_corp.ad.internal.util.f c(java.lang.String str) {
        java.io.File file = new java.io.File(this.f2051a, str);
        try {
            return new com.five_corp.ad.internal.util.f(true, null, java.lang.Integer.valueOf((int) file.length()));
        } catch (java.lang.SecurityException e) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.R2, "File path: " + file.getAbsolutePath(), e, null), null);
        }
    }

    public final com.five_corp.ad.internal.util.g d(java.lang.String str) {
        com.five_corp.ad.internal.util.f fVarB = b(str);
        if (!fVarB.f2085a) {
            return new com.five_corp.ad.internal.util.g(false, fVarB.b);
        }
        java.io.File file = new java.io.File(this.f2051a, str);
        try {
            return !file.setReadable(true, false) ? new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.g3, "File path: " + file.getAbsolutePath(), null, null)) : new com.five_corp.ad.internal.util.g(true, null);
        } catch (java.lang.SecurityException e) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.h3, "File path: " + file.getAbsolutePath(), e, null));
        }
    }

    public final com.five_corp.ad.internal.util.g b() {
        try {
            if (this.f2051a.exists()) {
                return new com.five_corp.ad.internal.util.g(true, null);
            }
            if (!this.f2051a.mkdirs()) {
                return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.b3, "Data directory path: " + this.f2051a.getAbsolutePath(), null, null));
            }
            if (!this.f2051a.setReadable(true, false)) {
                return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.c3, "Data directory path: " + this.f2051a.getAbsolutePath(), null, null));
            }
            if (!this.f2051a.setWritable(true, false)) {
                return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.d3, "Data directory path: " + this.f2051a.getAbsolutePath(), null, null));
            }
            if (!this.f2051a.setExecutable(true, false)) {
                return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.e3, "Data directory path: " + this.f2051a.getAbsolutePath(), null, null));
            }
            return new com.five_corp.ad.internal.util.g(true, null);
        } catch (java.lang.SecurityException e) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.f3, "Data directory path: " + this.f2051a.getAbsolutePath(), e, null));
        }
    }

    public final com.five_corp.ad.internal.util.f a() {
        try {
            java.io.File[] fileArrListFiles = this.f2051a.listFiles();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.io.File file : fileArrListFiles) {
                arrayList.add(file.getName());
            }
            return new com.five_corp.ad.internal.util.f(true, null, arrayList);
        } catch (java.lang.SecurityException e) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.P2, "Data directory path: " + this.f2051a.getAbsolutePath(), e, null), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00ea: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:54:0x00ea */
    public final com.five_corp.ad.internal.util.g a(java.lang.String str, byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        java.io.File file = new java.io.File(this.f2051a, str);
        java.io.FileOutputStream fileOutputStream3 = null;
        try {
            try {
                java.io.File fileCreateTempFile = java.io.File.createTempFile("tmp", null, this.f2051a);
                fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    if (!fileCreateTempFile.renameTo(file)) {
                        com.five_corp.ad.internal.util.g gVar = new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.k3, "File path: " + file.getAbsolutePath(), null, null));
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e) {
                            android.util.Log.getStackTraceString(e);
                        }
                        return gVar;
                    }
                    if (!file.setReadable(true, false)) {
                        com.five_corp.ad.internal.util.g gVar2 = new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.a3, "File path: " + file.getAbsolutePath(), null, null));
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e2) {
                            android.util.Log.getStackTraceString(e2);
                        }
                        return gVar2;
                    }
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException e3) {
                        android.util.Log.getStackTraceString(e3);
                    }
                    return new com.five_corp.ad.internal.util.g(true, null);
                } catch (java.io.IOException e4) {
                    e = e4;
                    com.five_corp.ad.internal.util.g gVar3 = new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Z2, "File path: " + file.getAbsolutePath(), e, null));
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e5) {
                            android.util.Log.getStackTraceString(e5);
                        }
                    }
                    return gVar3;
                } catch (java.lang.SecurityException e6) {
                    e = e6;
                    com.five_corp.ad.internal.util.g gVar4 = new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Y2, "File path: " + file.getAbsolutePath(), e, null));
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e7) {
                            android.util.Log.getStackTraceString(e7);
                        }
                    }
                    return gVar4;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e8) {
                            android.util.Log.getStackTraceString(e8);
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                fileOutputStream3 = fileOutputStream2;
                fileOutputStream = fileOutputStream3;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (java.io.IOException e9) {
            e = e9;
            fileOutputStream = null;
        } catch (java.lang.SecurityException e10) {
            e = e10;
            fileOutputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileOutputStream = fileOutputStream3;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }
}
