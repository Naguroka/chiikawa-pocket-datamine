package com.bytedance.sdk.openadsdk.core.iR;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static volatile boolean IL;
    private static volatile long bX;
    private static volatile com.bytedance.sdk.openadsdk.core.iR.bg bg;
    private final java.util.Queue<com.bytedance.sdk.openadsdk.core.iR.bg.C0153bg> eqN = new java.util.LinkedList();
    private final com.bytedance.sdk.openadsdk.core.settings.ldr ldr = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
    private android.os.Handler zx;

    private bg() {
    }

    public static com.bytedance.sdk.openadsdk.core.iR.bg bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.iR.bg.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.core.iR.bg();
                }
            }
        }
        return bg;
    }

    private synchronized boolean IL(java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        int iKMt = this.ldr.kMt();
        long jRri = this.ldr.rri();
        if (this.eqN.size() > 0 && this.eqN.size() >= iKMt) {
            long jAbs = java.lang.Math.abs(jCurrentTimeMillis - this.eqN.peek().bg);
            if (jAbs <= jRri) {
                IL(jRri - jAbs);
                return true;
            }
            this.eqN.poll();
            this.eqN.offer(new com.bytedance.sdk.openadsdk.core.iR.bg.C0153bg(jCurrentTimeMillis, str));
        } else {
            this.eqN.offer(new com.bytedance.sdk.openadsdk.core.iR.bg.C0153bg(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized boolean bg(java.lang.String str) {
        if (IL(str)) {
            bg(true);
            bg(bX);
        } else {
            bg(false);
        }
        return IL;
    }

    private synchronized void bg(long j) {
        if (this.zx == null) {
            this.zx = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.zx.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iR.bg.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.iR.bg.this.bg(false);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bg(boolean z) {
        IL = z;
    }

    public synchronized boolean IL() {
        return IL;
    }

    private synchronized void IL(long j) {
        bX = j;
    }

    public synchronized java.lang.String bX() {
        java.lang.String str;
        java.util.HashMap map = new java.util.HashMap();
        for (com.bytedance.sdk.openadsdk.core.iR.bg.C0153bg c0153bg : this.eqN) {
            if (map.containsKey(c0153bg.IL)) {
                map.put(c0153bg.IL, java.lang.Integer.valueOf(((java.lang.Integer) map.get(c0153bg.IL)).intValue() + 1));
            } else {
                map.put(c0153bg.IL, 1);
            }
        }
        str = "";
        int i = Integer.MIN_VALUE;
        for (java.lang.String str2 : map.keySet()) {
            int iIntValue = ((java.lang.Integer) map.get(str2)).intValue();
            if (i < iIntValue) {
                str = str2;
                i = iIntValue;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.iR.bg$bg, reason: collision with other inner class name */
    private static class C0153bg {
        private final java.lang.String IL;
        private final long bg;

        private C0153bg(long j, java.lang.String str) {
            this.bg = j;
            this.IL = str;
        }
    }
}
