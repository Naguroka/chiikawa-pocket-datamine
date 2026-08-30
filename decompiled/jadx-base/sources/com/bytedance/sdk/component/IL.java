package com.bytedance.sdk.component;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private static android.util.ArrayMap<java.io.File, com.bytedance.sdk.component.IL> PX = null;
    private static com.bytedance.sdk.component.IL.bg Ta = null;
    private static android.util.ArrayMap<java.lang.String, java.io.File> VB = null;
    private static boolean bg = false;
    private final java.lang.Object IL;
    private long Kg;
    private final java.io.File WR;
    private final java.lang.Object bX;
    private final java.io.File eo;
    private java.util.Properties eqN;
    private long iR;
    private int ldr;
    private volatile boolean zx;

    public interface bg {
        java.util.concurrent.ExecutorService getExecutorService();
    }

    static /* synthetic */ int WR(com.bytedance.sdk.component.IL il) {
        int i = il.ldr;
        il.ldr = i - 1;
        return i;
    }

    static /* synthetic */ long ldr(com.bytedance.sdk.component.IL il) {
        long j = il.iR;
        il.iR = 1 + j;
        return j;
    }

    static /* synthetic */ int zx(com.bytedance.sdk.component.IL il) {
        int i = il.ldr;
        il.ldr = i + 1;
        return i;
    }

    public static void bg(com.bytedance.sdk.component.IL.bg bgVar) {
        Ta = bgVar;
    }

    public static com.bytedance.sdk.component.IL bg(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (com.bytedance.sdk.component.IL.class) {
            if (VB == null) {
                VB = new android.util.ArrayMap<>();
            }
            java.io.File file = VB.get(str);
            if (file == null) {
                file = new java.io.File(context.getFilesDir(), str);
                VB.put(str, file);
            }
            if (PX == null) {
                PX = new android.util.ArrayMap<>();
            }
            com.bytedance.sdk.component.IL il = PX.get(file);
            if (il != null) {
                return il;
            }
            com.bytedance.sdk.component.IL il2 = new com.bytedance.sdk.component.IL(file);
            PX.put(file, il2);
            return il2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.sdk.component.IL$1] */
    private IL(java.io.File file) {
        java.lang.Object obj = new java.lang.Object();
        this.IL = obj;
        this.bX = new java.lang.Object();
        this.eqN = new java.util.Properties();
        this.zx = false;
        this.ldr = 0;
        this.WR = file;
        this.eo = bg(file);
        synchronized (obj) {
            this.zx = false;
        }
        com.bytedance.sdk.component.IL.bg bgVar = Ta;
        if (bgVar == null || bgVar.getExecutorService() == null) {
            new java.lang.Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.IL.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.IL.this.bg();
                }
            }.start();
        } else {
            Ta.getExecutorService().execute(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.IL.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.IL.this.bg();
                }
            });
        }
    }

    static java.io.File bg(java.io.File file) {
        return new java.io.File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00db A[Catch: all -> 0x00e7, TryCatch #3 {, blocks: (B:48:0x00d5, B:50:0x00db, B:51:0x00dd, B:52:0x00e5), top: B:67:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[Catch: all -> 0x00e7, TryCatch #3 {, blocks: (B:48:0x00d5, B:50:0x00db, B:51:0x00dd, B:52:0x00e5), top: B:67:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void bg() {
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th;
        synchronized (this.IL) {
            if (this.zx) {
                if (bg) {
                    android.util.Log.d("TTPropHelper", "reload: already loaded, ignore");
                }
                return;
            }
            if (this.eo.exists()) {
                this.WR.delete();
                this.eo.renameTo(this.WR);
            }
            if (bg) {
                android.util.Log.d("TTPropHelper", "reload: " + this.WR.getAbsolutePath() + ", exist? " + this.WR.exists());
            }
            java.util.Properties properties = null;
            if (this.WR.exists()) {
                java.util.Properties properties2 = new java.util.Properties();
                try {
                    try {
                        fileInputStream = new java.io.FileInputStream(this.WR);
                        try {
                            properties2.load(fileInputStream);
                            if (bg) {
                                android.util.Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.WR.getAbsolutePath());
                            }
                            fileInputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            try {
                                android.util.Log.e("TTPropHelper", "reload: ", th);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                properties = properties2;
                                synchronized (this.IL) {
                                    if (properties != null) {
                                        if (!properties.isEmpty()) {
                                            this.eqN = properties;
                                        }
                                        this.zx = true;
                                        this.IL.notifyAll();
                                    }
                                    this.zx = true;
                                    this.IL.notifyAll();
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (java.lang.Throwable th4) {
                                        android.util.Log.w("TTPropHelper", th4.getMessage());
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        fileInputStream = null;
                        th = th5;
                    }
                } catch (java.lang.Throwable th6) {
                    android.util.Log.w("TTPropHelper", th6.getMessage());
                }
                properties = properties2;
            }
            synchronized (this.IL) {
                if (properties != null) {
                    if (!properties.isEmpty()) {
                        this.eqN = properties;
                    }
                    this.zx = true;
                    this.IL.notifyAll();
                } else {
                    this.zx = true;
                    this.IL.notifyAll();
                }
                throw th;
            }
        }
    }

    private void eqN() {
        while (!this.zx) {
            try {
                this.IL.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        java.lang.String property;
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.IL) {
            eqN();
            property = this.eqN.getProperty(str, str2);
        }
        return property;
    }

    public int bg(java.lang.String str, int i) {
        int i2;
        if (android.text.TextUtils.isEmpty(str)) {
            return i;
        }
        synchronized (this.IL) {
            try {
                try {
                    eqN();
                    i2 = java.lang.Integer.parseInt(this.eqN.getProperty(str, java.lang.String.valueOf(i)));
                } catch (java.lang.NumberFormatException e) {
                    android.util.Log.e("TTPropHelper", e.getMessage());
                    return i;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public long bg(java.lang.String str, long j) {
        long j2;
        if (android.text.TextUtils.isEmpty(str)) {
            return j;
        }
        synchronized (this.IL) {
            try {
                try {
                    eqN();
                    j2 = java.lang.Long.parseLong(this.eqN.getProperty(str, java.lang.String.valueOf(j)));
                } catch (java.lang.NumberFormatException e) {
                    android.util.Log.e("TTPropHelper", e.getMessage());
                    return j;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public float bg(java.lang.String str, float f) {
        float f2;
        if (android.text.TextUtils.isEmpty(str)) {
            return f;
        }
        synchronized (this.IL) {
            try {
                try {
                    eqN();
                    f2 = java.lang.Float.parseFloat(this.eqN.getProperty(str, java.lang.String.valueOf(f)));
                } catch (java.lang.NumberFormatException e) {
                    android.util.Log.e("TTPropHelper", e.getMessage());
                    return f;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f2;
    }

    public boolean bg(java.lang.String str, boolean z) {
        boolean z2;
        if (android.text.TextUtils.isEmpty(str)) {
            return z;
        }
        synchronized (this.IL) {
            try {
                try {
                    eqN();
                    z2 = java.lang.Boolean.parseBoolean(this.eqN.getProperty(str, java.lang.String.valueOf(z)));
                } catch (java.lang.NumberFormatException e) {
                    android.util.Log.e("TTPropHelper", e.getMessage());
                    return z;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public boolean bg(java.lang.String str) {
        boolean zContainsKey;
        synchronized (this.IL) {
            try {
                try {
                    eqN();
                    zContainsKey = this.eqN.containsKey(str);
                } catch (java.lang.NumberFormatException e) {
                    android.util.Log.e("TTPropHelper", e.getMessage());
                    return false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    public com.bytedance.sdk.component.IL.bX IL() {
        return new com.bytedance.sdk.component.IL.bX();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.IL$IL, reason: collision with other inner class name */
    private static class C0096IL {
        final java.util.Properties IL;
        final java.util.concurrent.CountDownLatch bX;
        final long bg;
        volatile boolean eqN;
        boolean zx;

        private C0096IL(long j, java.util.Properties properties) {
            this.bX = new java.util.concurrent.CountDownLatch(1);
            this.eqN = false;
            this.zx = false;
            this.bg = j;
            this.IL = properties;
        }

        void bg(boolean z, boolean z2) {
            this.zx = z;
            this.eqN = z2;
            this.bX.countDown();
        }
    }

    public class bX implements android.content.SharedPreferences.Editor {
        private final java.lang.Object IL = new java.lang.Object();
        private final java.util.Map<java.lang.String, java.lang.Object> bX = new java.util.HashMap();
        private boolean eqN = false;

        public bX() {
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
            return bg(str, (java.util.Set<java.lang.String>) set);
        }

        public com.bytedance.sdk.component.IL.bX bg(java.lang.String str, java.util.Set<java.lang.String> set) {
            synchronized (this.IL) {
                this.bX.put(str, set == null ? null : new java.util.HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.component.IL.bX putInt(java.lang.String str, int i) {
            synchronized (this.IL) {
                this.bX.put(str, java.lang.Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.component.IL.bX putLong(java.lang.String str, long j) {
            synchronized (this.IL) {
                this.bX.put(str, java.lang.Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.component.IL.bX putFloat(java.lang.String str, float f) {
            synchronized (this.IL) {
                this.bX.put(str, java.lang.Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.component.IL.bX putString(java.lang.String str, java.lang.String str2) {
            synchronized (this.IL) {
                this.bX.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.component.IL.bX putBoolean(java.lang.String str, boolean z) {
            synchronized (this.IL) {
                this.bX.put(str, java.lang.Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.component.IL.bX remove(java.lang.String str) {
            synchronized (this.IL) {
                this.bX.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.component.IL.bX clear() {
            synchronized (this.IL) {
                this.eqN = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = com.bytedance.sdk.component.IL.bg ? java.lang.System.currentTimeMillis() : 0L;
            com.bytedance.sdk.component.IL.C0096IL c0096ilIL = IL();
            com.bytedance.sdk.component.IL.this.bg(c0096ilIL, true);
            try {
                c0096ilIL.bX.await();
                return c0096ilIL.eqN;
            } catch (java.lang.InterruptedException unused) {
            } finally {
                if (com.bytedance.sdk.component.IL.bg) {
                    android.util.Log.d("TTPropHelper", com.bytedance.sdk.component.IL.this.WR.getName() + ":" + c0096ilIL.bg + " committed after " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            com.bytedance.sdk.component.IL.this.bg(IL(), false);
        }

        private com.bytedance.sdk.component.IL.C0096IL IL() {
            java.util.Properties properties;
            long j;
            java.lang.Object obj;
            boolean z;
            synchronized (com.bytedance.sdk.component.IL.this.IL) {
                if (com.bytedance.sdk.component.IL.this.ldr > 0) {
                    java.util.Properties properties2 = new java.util.Properties();
                    properties2.putAll(com.bytedance.sdk.component.IL.this.eqN);
                    com.bytedance.sdk.component.IL.this.eqN = properties2;
                }
                properties = com.bytedance.sdk.component.IL.this.eqN;
                com.bytedance.sdk.component.IL.zx(com.bytedance.sdk.component.IL.this);
                synchronized (this.IL) {
                    boolean z2 = false;
                    if (this.eqN) {
                        if (properties.isEmpty()) {
                            z = false;
                        } else {
                            properties.clear();
                            z = true;
                        }
                        this.eqN = false;
                        z2 = z;
                    }
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.bX.entrySet()) {
                        java.lang.String key = entry.getKey();
                        java.lang.Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z2 = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(java.lang.String.valueOf(value))) {
                            properties.put(key, java.lang.String.valueOf(value));
                            z2 = true;
                        }
                    }
                    this.bX.clear();
                    if (z2) {
                        com.bytedance.sdk.component.IL.ldr(com.bytedance.sdk.component.IL.this);
                    }
                    j = com.bytedance.sdk.component.IL.this.iR;
                }
            }
            return new com.bytedance.sdk.component.IL.C0096IL(j, properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.component.IL.C0096IL c0096il, final boolean z) {
        boolean z2;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.IL.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (com.bytedance.sdk.component.IL.this.bX) {
                    try {
                        com.bytedance.sdk.component.IL.this.IL(c0096il, z);
                    } catch (java.lang.OutOfMemoryError unused) {
                    }
                }
                synchronized (com.bytedance.sdk.component.IL.this.IL) {
                    com.bytedance.sdk.component.IL.WR(com.bytedance.sdk.component.IL.this);
                }
            }
        };
        if (z) {
            synchronized (this.IL) {
                z2 = this.ldr == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.bX.bg(runnable, true ^ z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:118:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0129 A[Catch: all -> 0x01a5, TryCatch #4 {all -> 0x01a5, blocks: (B:39:0x0093, B:40:0x0095, B:76:0x0125, B:78:0x0129, B:80:0x0130, B:82:0x0139, B:84:0x0141, B:86:0x014d, B:96:0x01a3, B:97:0x01a4, B:75:0x0124, B:55:0x00ee, B:56:0x00f4, B:74:0x011d, B:94:0x01a1, B:93:0x0198, B:89:0x0192, B:70:0x0117, B:51:0x00e8), top: B:112:0x0093, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0139 A[Catch: all -> 0x01a5, TryCatch #4 {all -> 0x01a5, blocks: (B:39:0x0093, B:40:0x0095, B:76:0x0125, B:78:0x0129, B:80:0x0130, B:82:0x0139, B:84:0x0141, B:86:0x014d, B:96:0x01a3, B:97:0x01a4, B:75:0x0124, B:55:0x00ee, B:56:0x00f4, B:74:0x011d, B:94:0x01a1, B:93:0x0198, B:89:0x0192, B:70:0x0117, B:51:0x00e8), top: B:112:0x0093, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013f  */
    /* JADX WARN: Code duplicated, block: B:86:0x014d A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #4 {all -> 0x01a5, blocks: (B:39:0x0093, B:40:0x0095, B:76:0x0125, B:78:0x0129, B:80:0x0130, B:82:0x0139, B:84:0x0141, B:86:0x014d, B:96:0x01a3, B:97:0x01a4, B:75:0x0124, B:55:0x00ee, B:56:0x00f4, B:74:0x011d, B:94:0x01a1, B:93:0x0198, B:89:0x0192, B:70:0x0117, B:51:0x00e8), top: B:112:0x0093, inners: #2 }] */
    public void IL(com.bytedance.sdk.component.IL.C0096IL c0096il, boolean z) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        java.lang.Throwable th;
        long jCurrentTimeMillis3;
        java.lang.String str;
        java.lang.String message;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z2;
        long jCurrentTimeMillis6 = bg ? java.lang.System.currentTimeMillis() : 0L;
        boolean zExists = this.WR.exists();
        if (bg) {
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (this.Kg >= c0096il.bg) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.IL) {
                    z2 = this.iR == c0096il.bg;
                }
            }
            if (!z2) {
                c0096il.bg(false, true);
                return;
            }
            boolean zExists2 = this.eo.exists();
            if (bg) {
                jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            }
            if (!zExists2) {
                if (!this.WR.renameTo(this.eo)) {
                    android.util.Log.e("TTPropHelper", "Couldn't rename file " + this.WR + " to backup file " + this.eo);
                    c0096il.bg(false, false);
                    return;
                }
            } else {
                this.WR.delete();
            }
        }
        try {
            synchronized (this.bX) {
                java.io.FileOutputStream fileOutputStream = null;
                try {
                    try {
                        java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(this.WR);
                        try {
                            try {
                                jCurrentTimeMillis3 = bg ? java.lang.System.currentTimeMillis() : 0L;
                                try {
                                    c0096il.IL.store(fileOutputStream2, (java.lang.String) null);
                                    if (bg) {
                                        android.util.Log.d("TTPropHelper", "save: " + c0096il.IL);
                                        android.util.Log.d("TTPropHelper", "saveToLocal: save to" + this.WR.getAbsolutePath() + "success");
                                    }
                                    try {
                                        fileOutputStream2.close();
                                    } catch (java.lang.Throwable th2) {
                                        str = "TTPropHelper";
                                        message = th2.getMessage();
                                        android.util.Log.w(str, message);
                                    }
                                } catch (java.lang.Exception e) {
                                    e = e;
                                    fileOutputStream = fileOutputStream2;
                                    android.util.Log.e("TTPropHelper", "saveToLocal: ", e);
                                    c0096il.bg(false, false);
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (java.lang.Throwable th3) {
                                            str = "TTPropHelper";
                                            message = th3.getMessage();
                                            android.util.Log.w(str, message);
                                        }
                                    }
                                }
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                fileOutputStream = fileOutputStream2;
                                jCurrentTimeMillis3 = 0;
                                android.util.Log.e("TTPropHelper", "saveToLocal: ", e);
                                c0096il.bg(false, false);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (bg) {
                                    jCurrentTimeMillis4 = java.lang.System.currentTimeMillis();
                                } else {
                                    jCurrentTimeMillis4 = 0;
                                }
                                this.eo.delete();
                                if (bg) {
                                    jCurrentTimeMillis5 = java.lang.System.currentTimeMillis();
                                } else {
                                    jCurrentTimeMillis5 = 0;
                                }
                                this.Kg = c0096il.bg;
                                c0096il.bg(true, true);
                                if (bg) {
                                    android.util.Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (java.lang.Throwable th5) {
                                    android.util.Log.w("TTPropHelper", th5.getMessage());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                }
            }
            if (bg) {
                jCurrentTimeMillis4 = java.lang.System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            this.eo.delete();
            if (bg) {
                jCurrentTimeMillis5 = java.lang.System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            this.Kg = c0096il.bg;
            c0096il.bg(true, true);
            if (bg) {
                android.util.Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (java.lang.Throwable th7) {
            android.util.Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.WR.exists() && !this.WR.delete()) {
                android.util.Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.WR);
            }
            c0096il.bg(false, false);
        }
    }
}
