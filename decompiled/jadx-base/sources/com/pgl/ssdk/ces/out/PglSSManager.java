package com.pgl.ssdk.ces.out;

/* JADX INFO: loaded from: classes3.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final java.lang.String REPORT_SCENE_ADSHOW = "AdShow";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.pgl.ssdk.ces.out.PglSSManager f3788a;
    private final com.pgl.ssdk.ces.b b;
    private volatile int c = 0;

    private PglSSManager(android.content.Context context, com.pgl.ssdk.ces.out.PglSSConfig pglSSConfig) {
        this.b = com.pgl.ssdk.ces.b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return com.pgl.ssdk.ces.b.g();
    }

    public static com.pgl.ssdk.ces.out.PglSSManager getInstance() {
        return f3788a;
    }

    public static java.lang.String getLoadError() {
        if (com.pgl.ssdk.ces.b.i() != null) {
            return com.pgl.ssdk.ces.b.i().b;
        }
        return null;
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static com.pgl.ssdk.ces.out.PglSSManager init(android.content.Context context, com.pgl.ssdk.ces.out.PglSSConfig pglSSConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f3788a == null) {
            synchronized (com.pgl.ssdk.ces.out.PglSSManager.class) {
                if (f3788a == null) {
                    f3788a = new com.pgl.ssdk.ces.out.PglSSManager(context, pglSSConfig);
                    if (com.pgl.ssdk.ces.b.g() == 0) {
                        f3788a.b.a(str, str3, str2, str4);
                    }
                }
            }
        }
        return f3788a;
    }

    public void checkEventVirtual(android.view.MotionEvent motionEvent) {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            this.b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            return this.b.f();
        }
        return 0L;
    }

    public java.util.Map<java.lang.String, java.lang.String> getFeatureHash(java.lang.String str, byte[] bArr) {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            return this.b.a(str, bArr);
        }
        return null;
    }

    public java.lang.String getSofChara() {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            return this.b.j();
        }
        return null;
    }

    public java.lang.String getToken() {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            return this.b.k();
        }
        return null;
    }

    public void reportNow(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            if (REPORT_SCENE_ADSHOW.equals(str)) {
                this.b.c();
            }
            if (this.c % 2 == 0) {
                this.b.a(str, map);
            }
            this.c++;
        }
    }

    public void setCustomInfo(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            this.b.a(map);
            com.pgl.ssdk.o0.b(new java.lang.Runnable() { // from class: com.pgl.ssdk.ces.out.PglSSManager.1
                @Override // java.lang.Runnable
                public void run() {
                    com.pgl.ssdk.ces.out.PglSSManager.this.b.b();
                }
            });
        }
    }

    public void setDeviceId(java.lang.String str) {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            this.b.a(str);
        }
    }

    public void setGaid(java.lang.String str) {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            this.b.b(str);
        }
    }

    public void setOaid(java.lang.String str) {
        if (com.pgl.ssdk.ces.b.g() == 0) {
            this.b.d(str);
        }
    }
}
