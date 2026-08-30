package com.apm.insight.runtime;

/* JADX INFO: compiled from: CallbackCenter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List<com.apm.insight.ICrashCallback> f475a = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.List<com.apm.insight.ICrashCallback> b = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.List<com.apm.insight.ICrashCallback> c = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.List<com.apm.insight.ICrashCallback> d = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.List<com.apm.insight.IOOMCallback> e = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CallbackCenter.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f476a;

        static {
            int[] iArr = new int[com.apm.insight.CrashType.values().length];
            f476a = iArr;
            try {
                iArr[com.apm.insight.CrashType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f476a[com.apm.insight.CrashType.ANR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f476a[com.apm.insight.CrashType.JAVA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f476a[com.apm.insight.CrashType.LAUNCH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f476a[com.apm.insight.CrashType.NATIVE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    final void a(com.apm.insight.ICrashCallback iCrashCallback, com.apm.insight.CrashType crashType) {
        int i = com.apm.insight.runtime.c.AnonymousClass1.f476a[crashType.ordinal()];
        if (i == 1) {
            this.f475a.add(iCrashCallback);
            this.b.add(iCrashCallback);
            this.c.add(iCrashCallback);
            this.d.add(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.d.add(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.b.add(iCrashCallback);
        } else if (i == 4) {
            this.f475a.add(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.c.add(iCrashCallback);
        }
    }

    final void b(com.apm.insight.ICrashCallback iCrashCallback, com.apm.insight.CrashType crashType) {
        int i = com.apm.insight.runtime.c.AnonymousClass1.f476a[crashType.ordinal()];
        if (i == 1) {
            this.f475a.remove(iCrashCallback);
            this.b.remove(iCrashCallback);
            this.c.remove(iCrashCallback);
            this.d.remove(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.d.remove(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.b.remove(iCrashCallback);
        } else if (i == 4) {
            this.f475a.remove(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.c.remove(iCrashCallback);
        }
    }

    final void a(com.apm.insight.IOOMCallback iOOMCallback) {
        this.e.add(iOOMCallback);
    }

    final void b(com.apm.insight.IOOMCallback iOOMCallback) {
        this.e.remove(iOOMCallback);
    }

    public final java.util.List<com.apm.insight.IOOMCallback> a() {
        return this.e;
    }

    public final java.util.List<com.apm.insight.ICrashCallback> b() {
        return this.f475a;
    }

    public final java.util.List<com.apm.insight.ICrashCallback> c() {
        return this.b;
    }

    public final java.util.List<com.apm.insight.ICrashCallback> d() {
        return this.c;
    }

    public final java.util.List<com.apm.insight.ICrashCallback> e() {
        return this.d;
    }
}
