package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private static java.util.concurrent.atomic.AtomicInteger bX = new java.util.concurrent.atomic.AtomicInteger(0);
    public static final java.lang.String[] bg = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final java.lang.String[] IL = {"tt_pangle", "bd_tracker"};
    private static int eqN = 0;
    private static int zx = 0;

    public static void bg() {
        try {
            IL();
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void IL() {
        int i;
        com.bytedance.sdk.component.Kg.bX bXVarWR = com.bytedance.sdk.component.Kg.ldr.WR();
        if (bXVarWR == null) {
            return;
        }
        int i2 = 1;
        int iAddAndGet = bX.addAndGet(1);
        if (com.bytedance.sdk.component.Kg.ldr.bX < 0 || iAddAndGet % com.bytedance.sdk.component.Kg.ldr.bX != 0 || android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            return;
        }
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
        java.util.HashMap map = new java.util.HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zBg = com.bytedance.sdk.component.utils.PX.bg();
        int size = allStackTraces.size();
        if (size > zx) {
            zx = size;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> next = it.next();
            i4 += i2;
            java.lang.Thread key = next.getKey();
            java.lang.StackTraceElement[] value = next.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\n");
            if (zBg) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            int length = value.length;
            java.lang.String str = null;
            int i5 = 0;
            while (i5 < length) {
                java.lang.String string = value[i5].toString();
                java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it2 = it;
                if (zBg) {
                    sb.append(string + "\n");
                }
                if (android.text.TextUtils.isEmpty(str) && (bg(string, bg) || bg(key.getName(), IL))) {
                    i3++;
                    str = string;
                }
                i5++;
                it = it2;
            }
            java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it3 = it;
            if (zBg) {
                if (android.text.TextUtils.isEmpty(str)) {
                    i = 1;
                } else {
                    java.lang.String str2 = str + com.ironsource.y8.i.c + key.getName();
                    com.bytedance.sdk.component.Kg.eqN.bg bgVar = (com.bytedance.sdk.component.Kg.eqN.bg) map.get(str2);
                    if (bgVar != null) {
                        i = 1;
                        bgVar.bg(bgVar.bg() + 1);
                    } else {
                        i = 1;
                        bgVar = new com.bytedance.sdk.component.Kg.eqN.bg(str2, 1, sb.toString(), key.getName());
                    }
                    map.put(str2, bgVar);
                }
                if (!android.text.TextUtils.isEmpty(sb.toString())) {
                    android.util.Log.e("PoolTaskStatistics", "Thread index = " + i4 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    android.util.Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i = 1;
            }
            i2 = i;
            it = it3;
        }
        if (i3 > eqN) {
            eqN = i3;
        }
        if (zBg) {
            android.util.Log.e("PoolTaskStatistics", "SDK current threads=" + i3 + ", SDK Max threads=" + eqN + ", Application threads = " + size + ", Application max threads = " + zx);
            java.util.Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                android.util.Log.i("PoolTaskStatistics", ((com.bytedance.sdk.component.Kg.eqN.bg) ((java.util.Map.Entry) it4.next()).getValue()).toString());
            }
        }
        bXVarWR.bg(new com.bytedance.sdk.component.Kg.IL.bg(i3, eqN, size, zx));
    }

    private static boolean bg(java.lang.String str, java.lang.String[] strArr) {
        if (!android.text.TextUtils.isEmpty(str) && strArr != null) {
            for (java.lang.String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class bg {
        public java.lang.String IL;
        public java.lang.String bX;
        public int bg;
        public java.lang.String eqN;

        public bg(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
            this.bX = str;
            this.bg = i;
            this.eqN = str2;
            this.IL = str3;
        }

        public void bg(int i) {
            this.bg = i;
        }

        public int bg() {
            return this.bg;
        }

        public java.lang.String toString() {
            return "ThreadModel{times=" + this.bg + ", name='" + this.IL + "', lastStackStack='" + this.bX + "'}";
        }
    }
}
