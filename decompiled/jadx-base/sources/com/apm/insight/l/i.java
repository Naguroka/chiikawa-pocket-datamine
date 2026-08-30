package com.apm.insight.l;

/* JADX INFO: compiled from: JellyBeanV16Compat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.l.i.a f448a = new com.apm.insight.l.i.b(0);

    /* JADX INFO: compiled from: JellyBeanV16Compat.java */
    static class a {
        public long a(android.app.ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX INFO: compiled from: JellyBeanV16Compat.java */
    static class b extends com.apm.insight.l.i.a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.apm.insight.l.i.a
        public final long a(android.app.ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    public static long a(android.app.ActivityManager.MemoryInfo memoryInfo) {
        return f448a.a(memoryInfo);
    }
}
