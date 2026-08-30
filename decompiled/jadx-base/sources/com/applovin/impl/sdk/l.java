package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class l {
    private final com.applovin.impl.sdk.j b;
    private final com.applovin.impl.sdk.n c;
    private final boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1302a = "FileManager";
    private final java.lang.Object d = new java.lang.Object();
    private final java.util.Set e = new java.util.HashSet();

    l(com.applovin.impl.sdk.j jVar) {
        this.b = jVar;
        this.c = jVar.I();
        this.f = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.W0)).booleanValue();
    }

    private boolean f(java.io.File file) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                this.b.D().a(com.applovin.impl.ka.U, "removeFile", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("path", file.getAbsolutePath()));
            }
            g(file);
            return zDelete;
        } catch (java.lang.Throwable th) {
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.b.D().a("FileManager", "removeFile", th);
                return false;
            } finally {
                g(file);
            }
        }
    }

    private void g(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (!this.e.remove(absolutePath)) {
                this.b.D().a(com.applovin.impl.ka.U, "unlockFile", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("path", absolutePath));
            }
            this.d.notifyAll();
        }
    }

    public boolean b(java.io.InputStream inputStream, java.io.File file, boolean z) {
        return a(inputStream, file, z, false);
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final android.content.Context context) {
        this.b.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.b, false, "removeCachedResourcesForAd", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bVar, context);
            }
        }), com.applovin.impl.tm.b.CACHING);
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final android.content.Context context) {
        this.b.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.b, false, "removeCachedVideoResourceForAd", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(bVar, context);
            }
        }), com.applovin.impl.tm.b.CACHING);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, java.io.Closeable] */
    public java.lang.String e(java.io.File file) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.InputStream fileInputStream;
        java.io.IOException e;
        java.io.FileNotFoundException e2;
        if (file == null) {
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        ?? BooleanValue = ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.z)).booleanValue();
        boolean z = false;
        boolean z2 = true;
        try {
            try {
                try {
                    try {
                        if (BooleanValue != 0) {
                            try {
                                try {
                                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
                                    try {
                                        c(file);
                                        java.lang.String strA = a(fileInputStream2);
                                        z = strA == null;
                                        fileInputStream2.close();
                                        if (z && ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                                            a(file, "removeFileAfterReadFail");
                                        }
                                        g(file);
                                        return strA;
                                    } catch (java.lang.Throwable th2) {
                                        try {
                                            fileInputStream2.close();
                                        } catch (java.lang.Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.c.a("FileManager", "Unknown failure to read file.", th4);
                                    }
                                    this.c.a("FileManager", th4);
                                    this.b.D().a("FileManager", "readFile", th4);
                                    if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                                        a(file, "removeFileAfterReadFail");
                                    }
                                    g(file);
                                    return null;
                                }
                            } catch (java.io.FileNotFoundException e3) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.d("FileManager", "File not found. " + e3);
                                }
                                this.c.a("FileManager", e3);
                                this.b.D().a("FileManager", "readFileNotFound", e3);
                                if (0 != 0 && ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            } catch (java.io.IOException e4) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a("FileManager", "Failed to read file: " + file.getName() + e4);
                                }
                                this.c.a("FileManager", e4);
                                this.b.D().a("FileManager", "readFileIO", e4);
                                if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            }
                        }
                        try {
                            c(file);
                            fileInputStream = new java.io.FileInputStream(file);
                            try {
                                java.lang.String strA2 = a(fileInputStream);
                                z = strA2 == null;
                                com.applovin.impl.yp.a(fileInputStream, this.b);
                                if (z && ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return strA2;
                            } catch (java.io.FileNotFoundException e5) {
                                e2 = e5;
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.d("FileManager", "File not found. " + e2);
                                }
                                this.b.D().a("FileManager", "readFileNotFound", e2);
                                com.applovin.impl.yp.a(fileInputStream, this.b);
                                g(file);
                                return null;
                            } catch (java.io.IOException e6) {
                                e = e6;
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a("FileManager", "Failed to read file: " + file.getName() + e);
                                }
                                this.b.D().a("FileManager", "readFileIO", e);
                                com.applovin.impl.yp.a(fileInputStream, this.b);
                                if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a("FileManager", "Unknown failure to read file.", th);
                                }
                                this.b.D().a("FileManager", "readFile", th);
                                com.applovin.impl.yp.a(fileInputStream, this.b);
                                if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            }
                        } catch (java.io.FileNotFoundException e7) {
                            e2 = e7;
                            fileInputStream = null;
                        } catch (java.io.IOException e8) {
                            e = e8;
                            fileInputStream = null;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            fileInputStream = null;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        com.applovin.impl.yp.a((java.io.Closeable) BooleanValue, this.b);
                        if (z && ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        g(file);
                        throw th;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    if (z2 && ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.L0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    g(file);
                    throw th;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                z2 = false;
                if (z2) {
                    a(file, "removeFileAfterReadFail");
                }
                g(file);
                throw th;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            z = true;
            com.applovin.impl.yp.a((java.io.Closeable) BooleanValue, this.b);
            if (z) {
                a(file, "removeFileAfterReadFail");
            }
            g(file);
            throw th;
        }
    }

    private void c(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            boolean zAdd = this.e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.d.wait();
                    zAdd = this.e.add(absolutePath);
                } catch (java.lang.InterruptedException e) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
    }

    private boolean d(java.io.File file) {
        if (file == null) {
            return false;
        }
        java.lang.String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (this.e.contains(absolutePath)) {
                return false;
            }
            c(file);
            return true;
        }
    }

    public void b(android.content.Context context) {
        if (this.b.v0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, android.content.Context context) {
        if (bVar.u0() == null) {
            return;
        }
        f(a(bVar.u0().getLastPathSegment(), context));
    }

    private boolean b(java.io.File file) {
        boolean zContains;
        java.lang.String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            zContains = this.e.contains(absolutePath);
        }
        return zContains;
    }

    private java.io.File d(android.content.Context context) {
        return new java.io.File(context.getFilesDir(), "al");
    }

    public boolean b(java.lang.String str, android.content.Context context) {
        return a(a(str, false, context));
    }

    private java.util.List c(android.content.Context context) {
        java.io.File[] fileArrListFiles;
        java.io.File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return java.util.Arrays.asList(fileArrListFiles);
        }
        return java.util.Collections.emptyList();
    }

    public boolean c(java.lang.String str, android.content.Context context) {
        if (this.f) {
            return b(str, context);
        }
        boolean z = false;
        java.io.File fileA = a(str, false, context);
        if (!d(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z = true;
        }
        g(fileA);
        return z;
    }

    public void e(android.content.Context context) {
        try {
            a(".nomedia", context);
            java.io.File file = new java.io.File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b("FileManager", "Failed to create .nomedia file");
            }
            this.b.D().a(com.applovin.impl.ka.U, "createNoMediaFile");
        } catch (java.io.IOException e) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    public java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.List list, boolean z, com.applovin.impl.u2 u2Var, int i) {
        return a(context, str, str2, list, z, false, u2Var, i);
    }

    public java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.List list, boolean z, boolean z2, com.applovin.impl.u2 u2Var, int i) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.b.D().a(com.applovin.impl.ka.U, "cacheResource");
            return null;
        }
        java.lang.String strA = com.applovin.impl.yp.a(android.net.Uri.parse(str), str2, this.b);
        java.io.File fileA = a(strA, context);
        if (!a(fileA, str, list, z, u2Var, i)) {
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Caching succeeded for file " + strA);
        }
        return z2 ? android.net.Uri.fromFile(fileA).toString() : strA;
    }

    public boolean a(java.io.File file, java.lang.String str, java.util.List list, com.applovin.impl.u2 u2Var, int i) {
        return a(file, str, list, true, u2Var, i);
    }

    private boolean a(java.io.File file, java.lang.String str, java.util.List list, boolean z, com.applovin.impl.u2 u2Var) throws java.lang.Throwable {
        java.io.InputStream inputStreamA;
        java.lang.Boolean bool = (java.lang.Boolean) this.b.a(com.applovin.impl.sj.X0);
        if (bool.booleanValue()) {
            c(file);
        }
        if (a(file)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "File exists for " + str);
            }
            if (u2Var != null) {
                u2Var.a(file.length());
            }
            if (!bool.booleanValue()) {
                return true;
            }
            g(file);
            return true;
        }
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.z)).booleanValue()) {
            try {
                java.io.InputStream inputStreamA2 = a(str, list, z, u2Var);
                try {
                    boolean zA = a(inputStreamA2, file, bool.booleanValue());
                    if (inputStreamA2 != null) {
                        inputStreamA2.close();
                    }
                    if (bool.booleanValue()) {
                        g(file);
                    }
                    return zA;
                } catch (java.lang.Throwable th) {
                    if (inputStreamA2 != null) {
                        try {
                            inputStreamA2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    this.c.a("FileManager", th3);
                    this.b.D().a("FileManager", "loadAndCacheResource", th3);
                } finally {
                    if (bool.booleanValue()) {
                        g(file);
                    }
                }
            }
        }
        try {
            inputStreamA = a(str, list, z, u2Var);
            try {
                boolean zA2 = a(inputStreamA, file, bool.booleanValue());
                if (bool.booleanValue()) {
                    g(file);
                }
                com.applovin.impl.yp.a(inputStreamA, this.b);
                return zA2;
            } catch (java.lang.Throwable th4) {
                th = th4;
                if (bool.booleanValue()) {
                    g(file);
                }
                com.applovin.impl.yp.a(inputStreamA, this.b);
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            inputStreamA = null;
        }
    }

    private boolean a(java.io.File file, java.lang.String str, java.util.List list, boolean z, com.applovin.impl.u2 u2Var, int i) {
        java.util.HashMap map = new java.util.HashMap(1);
        map.put("url", str);
        this.b.D().a(com.applovin.impl.ka.m, (java.util.Map) map);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (int i2 = 1; i2 <= i; i2++) {
            if (a(file, str, list, z, u2Var)) {
                a(true, str, i2, jElapsedRealtime);
                return true;
            }
        }
        a(false, str, i, jElapsedRealtime);
        return false;
    }

    public java.io.InputStream a(java.lang.String str, java.util.List list, boolean z, com.applovin.impl.u2 u2Var) {
        java.net.HttpURLConnection httpURLConnection;
        if (z && !com.applovin.impl.yp.a(str, list)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.W2)).booleanValue() && !str.contains("https://")) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Loading " + str + "...");
        }
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(((java.lang.Integer) this.b.a(com.applovin.impl.sj.U2)).intValue());
                httpURLConnection.setReadTimeout(((java.lang.Integer) this.b.a(com.applovin.impl.sj.V2)).intValue());
                httpURLConnection.setDefaultUseCaches(true);
                httpURLConnection.setUseCaches(true);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                int responseCode = httpURLConnection.getResponseCode();
                u2Var.a(responseCode);
                this.b.D().a("loadResource", str, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a("FileManager", "Opened stream to resource " + str);
                    }
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.t3)).booleanValue()) {
                        com.applovin.impl.yp.a(httpURLConnection, this.b);
                    }
                    return inputStream;
                }
                if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.t3)).booleanValue()) {
                    com.applovin.impl.yp.a(httpURLConnection, this.b);
                }
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a("FileManager", "Error loading " + str, th);
                    }
                    this.b.D().a("FileManager", "loadResource", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str));
                    u2Var.a(th);
                    return null;
                } finally {
                    if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.t3)).booleanValue()) {
                        com.applovin.impl.yp.a(httpURLConnection, this.b);
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    public java.io.File a(java.lang.String str, android.content.Context context) {
        return a(str, true, context);
    }

    private java.io.File a(java.lang.String str, boolean z, android.content.Context context) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Looking up cached resource: " + str);
        }
        java.lang.String strReplace = str.contains(com.ironsource.y8.h.H0) ? str.replace("/", "_").replace(".", "_") : str;
        java.io.File fileD = d(context);
        java.io.File file = new java.io.File(fileD, strReplace);
        if (com.applovin.impl.yp.a(com.applovin.impl.sj.N0, this.b)) {
            boolean z2 = file.length() == 0;
            boolean zEquals = str.equals(".nomedia");
            if (file.exists() && z2 && !zEquals) {
                this.b.D().a(com.applovin.impl.ka.U, "removeEmptyCachedResource", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("path", file.getAbsolutePath()));
                f(file);
            }
        }
        if (z) {
            try {
                fileD.mkdirs();
            } catch (java.lang.Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("FileManager", "Unable to make cache directory at " + fileD, th);
                }
                this.b.D().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    public java.lang.String a(java.io.InputStream inputStream) throws java.io.IOException {
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.z)).booleanValue()) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 8192);
                        if (i >= 0) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            java.lang.String string = byteArrayOutputStream.toString(com.adjust.sdk.Constants.ENCODING);
                            byteArrayOutputStream.close();
                            return string;
                        }
                        this.c.a("FileManager", th);
                        this.b.D().a("FileManager", "readInputStreamAsString", th);
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                this.c.a("FileManager", th3);
                this.b.D().a("FileManager", "readInputStreamAsString", th3);
                return null;
            }
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        byte[] bArr2 = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr2, 0, 8192);
            if (i2 >= 0) {
                try {
                    byteArrayOutputStream2.write(bArr2, 0, i2);
                } catch (java.lang.Throwable th4) {
                    com.applovin.impl.yp.a(byteArrayOutputStream2, this.b);
                    this.b.D().a("FileManager", "readInputStreamAsString", th4);
                    return null;
                }
            } else {
                return byteArrayOutputStream2.toString(com.adjust.sdk.Constants.ENCODING);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ee */
    /* JADX WARN: Code duplicated, block: B:100:0x0180  */
    /* JADX WARN: Code duplicated, block: B:107:0x018c A[Catch: all -> 0x0185, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0185, blocks: (B:89:0x013b, B:91:0x0141, B:93:0x0147, B:94:0x0161, B:107:0x018c), top: B:188:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:112:0x019a A[Catch: all -> 0x01fe, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x01fe, blocks: (B:86:0x0131, B:105:0x0188, B:112:0x019a), top: B:214:0x0131 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x020b A[Catch: all -> 0x0235, TRY_LEAVE, TryCatch #13 {all -> 0x0235, blocks: (B:153:0x0205, B:155:0x020b), top: B:206:0x0205 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x021f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0223  */
    /* JADX WARN: Code duplicated, block: B:163:0x022d  */
    /* JADX WARN: Code duplicated, block: B:202:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01e6 A[EDGE_INSN: B:217:0x01e6->B:137:0x01e6 BREAK  A[LOOP:1: B:116:0x01a8->B:218:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0141 A[Catch: all -> 0x0185, TryCatch #3 {all -> 0x0185, blocks: (B:89:0x013b, B:91:0x0141, B:93:0x0147, B:94:0x0161, B:107:0x018c), top: B:188:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0147 A[Catch: all -> 0x0185, TryCatch #3 {all -> 0x0185, blocks: (B:89:0x013b, B:91:0x0141, B:93:0x0147, B:94:0x0161, B:107:0x018c), top: B:188:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(java.io.InputStream inputStream, java.io.File file, boolean z, boolean z2) throws java.lang.Throwable {
        androidx.core.util.AtomicFile atomicFile;
        boolean z3;
        boolean z4;
        boolean z5;
        byte[] bArr;
        int i;
        boolean z6;
        java.lang.Throwable th;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        boolean z7 = true;
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.z)).booleanValue() && !this.f) {
            if (!z2) {
                c(file);
            }
            if (com.applovin.impl.yp.a(com.applovin.impl.sj.R0, this.b) && !z && file.exists()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                }
                this.b.D().a(com.applovin.impl.ka.U, "cacheResourceOverwriteAttempted", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("path", file.getAbsolutePath()));
                return true;
            }
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                int i2 = 8192;
                try {
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int i3 = inputStream.read(bArr2, 0, i2);
                        if (i3 < 0) {
                            break;
                        }
                        try {
                            fileOutputStream.write(bArr2, 0, i3);
                            i2 = 8192;
                        } catch (java.lang.Throwable th2) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.a("FileManager", "Failed to write next buffer to file", th2);
                            }
                            try {
                                this.b.D().a("FileManager", "writeResourceStream", th2);
                                try {
                                    fileOutputStream.close();
                                    a(file, "removeFileAfterCacheFail");
                                    if (z2) {
                                        return false;
                                    }
                                    g(file);
                                    return false;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    z6 = true;
                                    try {
                                        if (com.applovin.impl.sdk.n.a()) {
                                            this.c.a("FileManager", "Unknown failure to write file.", th);
                                        }
                                        this.c.a("FileManager", th);
                                        try {
                                            this.b.D().a("FileManager", "writeResource", th);
                                            a(file, "removeFileAfterCacheFail");
                                            if (z2) {
                                                return false;
                                            }
                                            g(file);
                                            return false;
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            if (z7) {
                                                a(file, "removeFileAfterCacheFail");
                                            }
                                            if (!z2) {
                                                g(file);
                                            }
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        z7 = z6;
                                    }
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                z6 = true;
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (java.lang.Throwable th7) {
                                    th.addSuppressed(th7);
                                    throw th;
                                }
                            }
                        }
                    }
                    fileOutputStream.close();
                    if (!z2) {
                        g(file);
                    }
                    return true;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    z6 = false;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                z6 = false;
            }
        } else {
            java.io.FileOutputStream fileOutputStream2 = null;
            if (!z2) {
                try {
                    c(file);
                    try {
                        try {
                            if (!com.applovin.impl.yp.a(com.applovin.impl.sj.R0, this.b) && !z) {
                                try {
                                    if (file.exists()) {
                                        if (com.applovin.impl.sdk.n.a()) {
                                            this.c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                                        }
                                        this.b.D().a(com.applovin.impl.ka.U, "cacheResourceOverwriteAttempted", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("path", file.getAbsolutePath()));
                                        if (!this.f) {
                                            com.applovin.impl.yp.a((java.io.Closeable) null, this.b);
                                        }
                                        if (!z2) {
                                            return true;
                                        }
                                        g(file);
                                        return true;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    atomicFile = null;
                                    z3 = true;
                                    z4 = false;
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.c.a("FileManager", "Unknown failure to write file.", th);
                                    }
                                    try {
                                        this.b.D().a("FileManager", "writeResource", th);
                                        if (!this.f) {
                                            com.applovin.impl.yp.a(fileOutputStream2, this.b);
                                            a(file, "removeFileAfterCacheFail");
                                        } else if (atomicFile != null) {
                                            atomicFile.failWrite(fileOutputStream2);
                                        }
                                        if (z2) {
                                            return false;
                                        }
                                        g(file);
                                        return false;
                                    } catch (java.lang.Throwable th11) {
                                        th = th11;
                                        z5 = z3;
                                        if (!this.f) {
                                            com.applovin.impl.yp.a(fileOutputStream2, this.b);
                                            if (z5) {
                                                a(file, "removeFileAfterCacheFail");
                                            }
                                        } else if (atomicFile != null) {
                                            if (z5) {
                                                atomicFile.failWrite(fileOutputStream2);
                                            } else {
                                                atomicFile.finishWrite(fileOutputStream2);
                                            }
                                        }
                                        if (!z2) {
                                            g(file);
                                        }
                                        throw th;
                                    }
                                }
                            }
                            if (this.f) {
                                atomicFile = new androidx.core.util.AtomicFile(file);
                                try {
                                    fileOutputStream2 = atomicFile.startWrite();
                                } catch (java.lang.Throwable th12) {
                                    th = th12;
                                    z3 = true;
                                    z4 = false;
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.c.a("FileManager", "Unknown failure to write file.", th);
                                    }
                                    this.b.D().a("FileManager", "writeResource", th);
                                    if (!this.f) {
                                        com.applovin.impl.yp.a(fileOutputStream2, this.b);
                                        a(file, "removeFileAfterCacheFail");
                                    } else if (atomicFile != null) {
                                        atomicFile.failWrite(fileOutputStream2);
                                    }
                                    if (z2) {
                                        return false;
                                    }
                                    g(file);
                                    return false;
                                }
                            } else {
                                atomicFile = null;
                                fileOutputStream2 = new java.io.FileOutputStream(file);
                            }
                            bArr = new byte[8192];
                            while (true) {
                                i = inputStream.read(bArr, 0, 8192);
                                if (i < 0) {
                                    break;
                                }
                                try {
                                    fileOutputStream2.write(bArr, 0, i);
                                } catch (java.lang.Throwable th13) {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.c.a("FileManager", "Failed to write next buffer to file", th13);
                                    }
                                    try {
                                        this.b.D().a("FileManager", "writeResourceStream", th13);
                                        if (!this.f) {
                                            com.applovin.impl.yp.a(fileOutputStream2, this.b);
                                            a(file, "removeFileAfterCacheFail");
                                        } else if (atomicFile != null) {
                                            atomicFile.failWrite(fileOutputStream2);
                                        }
                                        if (z2) {
                                            return false;
                                        }
                                        g(file);
                                        return false;
                                    } catch (java.lang.Throwable th14) {
                                        th = th14;
                                        z3 = true;
                                        z4 = true;
                                    }
                                }
                            }
                            if (!this.f) {
                                com.applovin.impl.yp.a(fileOutputStream2, this.b);
                            } else if (atomicFile != null) {
                                atomicFile.finishWrite(fileOutputStream2);
                            }
                            if (z2) {
                                return true;
                            }
                            g(file);
                            return true;
                        } catch (java.lang.Throwable th15) {
                            th = th15;
                            z3 = true;
                            atomicFile = null;
                            z4 = false;
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.a("FileManager", "Unknown failure to write file.", th);
                            }
                            this.b.D().a("FileManager", "writeResource", th);
                            if (!this.f) {
                                com.applovin.impl.yp.a(fileOutputStream2, this.b);
                                a(file, "removeFileAfterCacheFail");
                            } else if (atomicFile != null) {
                                atomicFile.failWrite(fileOutputStream2);
                            }
                            if (z2) {
                                return false;
                            }
                            g(file);
                            return false;
                        }
                    } catch (java.lang.Throwable th16) {
                        th = th16;
                        z3 = true;
                    }
                } catch (java.lang.Throwable th17) {
                    th = th17;
                    atomicFile = null;
                    z3 = true;
                    z4 = false;
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a("FileManager", "Unknown failure to write file.", th);
                    }
                    this.b.D().a("FileManager", "writeResource", th);
                    if (!this.f) {
                        com.applovin.impl.yp.a(fileOutputStream2, this.b);
                        a(file, "removeFileAfterCacheFail");
                    } else if (atomicFile != null) {
                        atomicFile.failWrite(fileOutputStream2);
                    }
                    if (z2) {
                        return false;
                    }
                    g(file);
                    return false;
                }
            } else {
                if (!com.applovin.impl.yp.a(com.applovin.impl.sj.R0, this.b)) {
                    if (this.f) {
                        atomicFile = new androidx.core.util.AtomicFile(file);
                        fileOutputStream2 = atomicFile.startWrite();
                    } else {
                        atomicFile = null;
                        fileOutputStream2 = new java.io.FileOutputStream(file);
                    }
                    bArr = new byte[8192];
                    while (true) {
                        i = inputStream.read(bArr, 0, 8192);
                        if (i < 0) {
                            break;
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                    if (!this.f) {
                        com.applovin.impl.yp.a(fileOutputStream2, this.b);
                    } else if (atomicFile != null) {
                        atomicFile.finishWrite(fileOutputStream2);
                    }
                    if (z2) {
                        return true;
                    }
                    g(file);
                    return true;
                }
                if (file.exists()) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                    }
                    this.b.D().a(com.applovin.impl.ka.U, "cacheResourceOverwriteAttempted", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("path", file.getAbsolutePath()));
                    if (!this.f) {
                        com.applovin.impl.yp.a((java.io.Closeable) null, this.b);
                    }
                    if (!z2) {
                        return true;
                    }
                    g(file);
                    return true;
                }
                if (this.f) {
                    atomicFile = new androidx.core.util.AtomicFile(file);
                    fileOutputStream2 = atomicFile.startWrite();
                } else {
                    atomicFile = null;
                    fileOutputStream2 = new java.io.FileOutputStream(file);
                }
                bArr = new byte[8192];
                while (true) {
                    i = inputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        break;
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                }
                if (!this.f) {
                    com.applovin.impl.yp.a(fileOutputStream2, this.b);
                } else if (atomicFile != null) {
                    atomicFile.finishWrite(fileOutputStream2);
                }
                if (z2) {
                    return true;
                }
                g(file);
                return true;
            }
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("FileManager", "Unknown failure to write file.", th);
                }
                this.b.D().a("FileManager", "writeResource", th);
                if (!this.f) {
                    com.applovin.impl.yp.a(fileOutputStream2, this.b);
                    a(file, "removeFileAfterCacheFail");
                } else if (atomicFile != null) {
                    atomicFile.failWrite(fileOutputStream2);
                }
                if (z2) {
                    return false;
                }
                g(file);
                return false;
            } catch (java.lang.Throwable th18) {
                th = th18;
                z5 = z4;
            }
        }
    }

    private void a(boolean z, java.lang.String str, int i, long j) {
        com.applovin.impl.ka kaVar = z ? com.applovin.impl.ka.n : com.applovin.impl.ka.o;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("details", "Download attempts: " + i);
        map.put("url", str);
        map.put("duration_ms", java.lang.String.valueOf(jElapsedRealtime));
        this.b.D().a(kaVar, (java.util.Map) map);
    }

    public boolean a(java.io.InputStream inputStream, java.io.File file) {
        return a(inputStream, file, false);
    }

    private boolean a(java.io.InputStream inputStream, java.io.File file, boolean z) {
        if (file == null) {
            return false;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file, false, z)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        }
        if (!com.applovin.impl.sdk.n.a()) {
            return true;
        }
        this.c.a("FileManager", "Caching completed for " + file);
        return true;
    }

    public int a(java.lang.String str, com.applovin.impl.sdk.ad.b bVar) {
        java.util.List listZ = bVar.Z();
        if (bVar.U0() || listZ.contains(str)) {
            return bVar.G();
        }
        return 1;
    }

    private long a(android.content.Context context) {
        long jA = a();
        boolean z = jA != -1;
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis());
        java.util.List listC = this.b.c(com.applovin.impl.sj.G0);
        long length = 0;
        for (java.io.File file : c(context)) {
            if (z && !listC.contains(file.getName()) && !b(file) && seconds - java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) > jA) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                if (f(file)) {
                    this.b.C().c(com.applovin.impl.ba.j);
                }
            }
            length += file.length();
        }
        return length;
    }

    private void a(long j, android.content.Context context) {
        long jIntValue = ((java.lang.Integer) this.b.a(com.applovin.impl.sj.C0)).intValue();
        if (jIntValue == -1) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j) > jIntValue) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                java.util.Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    f((java.io.File) it.next());
                }
                this.b.C().c(com.applovin.impl.ba.k);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList(bVar.i());
        com.applovin.impl.sdk.utils.CollectionUtils.addObjectIfExists(bVar.u0(), arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(a(((android.net.Uri) it.next()).getLastPathSegment(), context));
        }
    }

    public void a(java.io.File file, java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            this.b.D().a(com.applovin.impl.ka.U, str, (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("path", file.getAbsolutePath()));
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.b.D().a("FileManager", str, th);
        }
    }

    private long a() {
        long jLongValue = ((java.lang.Long) this.b.a(com.applovin.impl.sj.B0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    private long a(long j) {
        return j / 1048576;
    }

    public boolean a(java.io.File file) {
        if (!com.applovin.impl.yp.a(com.applovin.impl.sj.Q0, this.b)) {
            return (file == null || !file.exists() || file.isDirectory()) ? false : true;
        }
        if (file == null) {
            return false;
        }
        com.applovin.impl.yp.a();
        c(file);
        boolean z = file.exists() && !file.isDirectory();
        g(file);
        return z;
    }
}
