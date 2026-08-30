package com.apm.insight.l;

/* JADX INFO: compiled from: DebugMemInfoCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.l.c.a f440a = new com.apm.insight.l.c.b(0);

    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    static class a {
        public int a(android.os.Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(android.os.Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(android.os.Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    static class b extends com.apm.insight.l.c.a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.apm.insight.l.c.a
        public final int a(android.os.Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int b(android.os.Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int c(android.os.Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    public static int a(android.os.Debug.MemoryInfo memoryInfo) {
        return f440a.a(memoryInfo);
    }

    public static int b(android.os.Debug.MemoryInfo memoryInfo) {
        return f440a.b(memoryInfo);
    }

    public static int c(android.os.Debug.MemoryInfo memoryInfo) {
        return f440a.c(memoryInfo);
    }

    /* JADX INFO: renamed from: com.apm.insight.l.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    public static /* synthetic */ class AnonymousClass1 {
        public static java.lang.Long a(java.util.Map<? super java.lang.String, java.lang.Long> map, java.lang.String str, java.lang.Long l) {
            if (str == null || map == null) {
                return -1L;
            }
            java.lang.Long l2 = map.get(str);
            if (l2 != null) {
                l = java.lang.Long.valueOf(l2.longValue() + l.longValue());
            }
            map.put(str, l);
            return l;
        }

        public static java.lang.Float a(java.util.Map<? super java.lang.String, java.lang.Float> map) {
            float fFloatValue = 0.0f;
            for (java.lang.Float f : map.values()) {
                if (f != null) {
                    fFloatValue += f.floatValue();
                }
            }
            return java.lang.Float.valueOf(fFloatValue);
        }

        public static int a(java.lang.Object obj, int i) {
            if (obj == null) {
                return i;
            }
            if (obj instanceof java.lang.Integer) {
                return ((java.lang.Integer) obj).intValue();
            }
            if (obj instanceof java.lang.String) {
                try {
                    return java.lang.Integer.parseInt(java.lang.String.valueOf(obj));
                } catch (java.lang.Throwable unused) {
                }
            }
            return i;
        }
    }
}
