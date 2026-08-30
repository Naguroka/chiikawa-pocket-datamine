package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Lq implements com.bytedance.sdk.openadsdk.core.settings.zx {
    private com.bytedance.sdk.openadsdk.core.settings.Lq.bg eo;
    private final java.lang.String iR;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> bX = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.lang.Object eqN = new java.lang.Object();
    private final java.lang.Object zx = new java.lang.Object();
    private final java.util.concurrent.CountDownLatch ldr = new java.util.concurrent.CountDownLatch(1);
    private java.util.Properties Kg = new java.util.Properties();
    private volatile boolean WR = false;

    public interface bg {
        void IL();

        void bg();
    }

    public Lq(java.lang.String str, com.bytedance.sdk.openadsdk.core.settings.Lq.bg bgVar) {
        this.iR = str;
        this.eo = bgVar;
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("SetL_".concat(java.lang.String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.Lq.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.settings.Lq.this.bg(false);
            }
        });
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        zx();
        return this.Kg.getProperty(str, str2);
    }

    private void zx() {
        if (this.WR) {
            return;
        }
        try {
            android.os.SystemClock.elapsedRealtime();
            this.ldr.await(com.bytedance.sdk.openadsdk.utils.VJ.zx() ? 4 : 8, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    public int bg(java.lang.String str, int i) {
        if (str != null && !str.isEmpty()) {
            zx();
            try {
                return java.lang.Integer.parseInt(this.Kg.getProperty(str, java.lang.String.valueOf(i)));
            } catch (java.lang.NumberFormatException e) {
                com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long bg(java.lang.String str, long j) {
        if (str != null && !str.isEmpty()) {
            zx();
            try {
                return java.lang.Long.parseLong(this.Kg.getProperty(str, java.lang.String.valueOf(j)));
            } catch (java.lang.NumberFormatException e) {
                com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float bg(java.lang.String str, float f) {
        if (str != null && !str.isEmpty()) {
            zx();
            try {
                return java.lang.Float.parseFloat(this.Kg.getProperty(str, java.lang.String.valueOf(f)));
            } catch (java.lang.NumberFormatException e) {
                com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public boolean bg(java.lang.String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            zx();
            try {
                return java.lang.Boolean.parseBoolean(this.Kg.getProperty(str, java.lang.String.valueOf(z)));
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.core.settings.Lq.bg bgVar;
        java.lang.Object obj;
        synchronized (this.eqN) {
            if (!this.WR || z) {
                java.io.File fileLdr = ldr();
                if (fileLdr.exists()) {
                    java.util.Properties properties = new java.util.Properties();
                    java.io.FileInputStream fileInputStream = null;
                    try {
                        try {
                            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(fileLdr);
                            try {
                                properties.load(fileInputStream2);
                                java.lang.Object[] objArr = new java.lang.Object[3];
                                java.lang.Integer.valueOf(properties.size());
                                java.lang.String str = "items from " + fileLdr.getAbsolutePath();
                                if (!properties.isEmpty()) {
                                    this.Kg = properties;
                                    this.bX.clear();
                                }
                                com.bytedance.sdk.openadsdk.utils.eo.bg(fileInputStream2);
                                obj = this.eqN;
                            } catch (java.lang.OutOfMemoryError unused) {
                                fileInputStream = fileInputStream2;
                                try {
                                    com.bytedance.sdk.component.utils.ldr.bX(fileLdr);
                                } catch (java.lang.Throwable th) {
                                    com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "delete: ", th);
                                }
                                if (fileInputStream != null) {
                                    com.bytedance.sdk.openadsdk.utils.eo.bg(fileInputStream);
                                }
                                obj = this.eqN;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "reload: ", th);
                                if (fileInputStream != null) {
                                    com.bytedance.sdk.openadsdk.utils.eo.bg(fileInputStream);
                                }
                                obj = this.eqN;
                            }
                        } catch (java.lang.Throwable th3) {
                            if (fileInputStream != null) {
                                com.bytedance.sdk.openadsdk.utils.eo.bg(fileInputStream);
                            }
                            this.eqN.notifyAll();
                            throw th3;
                        }
                    } catch (java.lang.OutOfMemoryError unused2) {
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                    obj.notifyAll();
                } else if (com.bytedance.sdk.component.utils.VzQ.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()) && "tt_sdk_settings.prop".equals(this.iR)) {
                    try {
                        boolean z2 = false;
                        android.content.SharedPreferences sharedPreferences = com.bytedance.sdk.openadsdk.core.VzQ.bg().getSharedPreferences("tt_sdk_settings", 0);
                        if (!sharedPreferences.getAll().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.settings.zx.bg bgVarBg = bg();
                            for (java.util.Map.Entry<java.lang.String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                java.lang.String key = entry.getKey();
                                java.lang.Object value = entry.getValue();
                                if (key != null && !key.isEmpty() && value != null) {
                                    bgVarBg.bg(key, value.toString());
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                bgVarBg.bg();
                            }
                            sharedPreferences.edit().clear().commit();
                        }
                    } catch (java.lang.Exception unused3) {
                    }
                }
                if (!this.WR && (bgVar = this.eo) != null) {
                    bgVar.bg();
                }
                this.WR = true;
                this.ldr.countDown();
            }
        }
    }

    private java.io.File ldr() {
        return new java.io.File(com.bytedance.sdk.openadsdk.core.VzQ.bg().getFilesDir(), this.iR);
    }

    public com.bytedance.sdk.openadsdk.core.settings.zx.bg bg() {
        return new com.bytedance.sdk.openadsdk.core.settings.Lq.IL();
    }

    public <T> T bg(java.lang.String str, T t, com.bytedance.sdk.openadsdk.core.settings.zx.IL<T> il) {
        T tIL;
        if (str != null && !str.isEmpty()) {
            if (this.bX.containsKey(str)) {
                try {
                    return (T) this.bX.get(str);
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "", e);
                    return t;
                }
            }
            zx();
            java.lang.String property = this.Kg.getProperty(str, null);
            if (property != null && il != null && (tIL = il.IL(property)) != null) {
                this.bX.put(str, tIL);
                return tIL;
            }
        }
        return t;
    }

    public boolean IL() {
        return this.WR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.util.Properties properties) {
        synchronized (this.zx) {
            java.io.File fileLdr = ldr();
            java.io.FileOutputStream fileOutputStream = null;
            try {
                try {
                    java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(fileLdr);
                    try {
                        properties.store(fileOutputStream2, (java.lang.String) null);
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        fileLdr.getAbsolutePath();
                        com.bytedance.sdk.openadsdk.utils.eo.bg(fileOutputStream2);
                    } catch (java.lang.Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        com.bytedance.sdk.component.utils.PX.bg("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.eo.bg(fileOutputStream);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.eo.bg(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        }
        com.bytedance.sdk.openadsdk.core.settings.xxp.ews();
    }

    public void bX() {
        java.io.File fileLdr = ldr();
        if (fileLdr.exists()) {
            fileLdr.delete();
        }
    }

    public class IL implements com.bytedance.sdk.openadsdk.core.settings.zx.bg {
        private final java.util.Map<java.lang.String, java.lang.Object> IL = new java.util.HashMap();
        private final java.lang.Object bX = new java.lang.Object();

        public IL() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.bg
        public void bg() {
            java.lang.Object obj;
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.util.Properties properties = new java.util.Properties();
            synchronized (this.bX) {
                properties.putAll(com.bytedance.sdk.openadsdk.core.settings.Lq.this.Kg);
                boolean z = false;
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.IL.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z = true;
                        }
                    } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                        properties.put(key, java.lang.String.valueOf(value));
                        z = true;
                    }
                }
                this.IL.clear();
                if (z) {
                    com.bytedance.sdk.openadsdk.core.settings.Lq.this.bg(properties);
                    com.bytedance.sdk.openadsdk.core.settings.Lq.this.Kg = properties;
                    com.bytedance.sdk.openadsdk.core.settings.Lq.this.bX.clear();
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.bg
        public com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, java.lang.String str2) {
            synchronized (this.bX) {
                this.IL.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.bg
        public com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, int i) {
            synchronized (this.bX) {
                this.IL.put(str, java.lang.Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.bg
        public com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, long j) {
            synchronized (this.bX) {
                this.IL.put(str, java.lang.Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.bg
        public com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str) {
            synchronized (this.bX) {
                this.IL.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.bg
        public com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, float f) {
            synchronized (this.bX) {
                this.IL.put(str, java.lang.Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.bg
        public com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, boolean z) {
            synchronized (this.bX) {
                this.IL.put(str, java.lang.Boolean.valueOf(z));
            }
            return this;
        }
    }

    protected void eqN() {
        com.bytedance.sdk.openadsdk.core.settings.Lq.bg bgVar = this.eo;
        if (bgVar != null) {
            bgVar.IL();
        }
    }
}
