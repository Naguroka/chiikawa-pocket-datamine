package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
class IL implements java.lang.Comparable, java.lang.Runnable {
    private com.bytedance.sdk.component.Kg.bg IL;
    private long bX;
    private com.bytedance.sdk.component.Kg.Kg bg;
    private java.lang.Thread eqN = null;

    public IL(com.bytedance.sdk.component.Kg.Kg kg, com.bytedance.sdk.component.Kg.bg bgVar) {
        this.bX = 0L;
        this.bg = kg;
        this.IL = bgVar;
        this.bX = android.os.SystemClock.uptimeMillis();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.bX;
        this.eqN = java.lang.Thread.currentThread();
        com.bytedance.sdk.component.Kg.Kg kg = this.bg;
        if (kg != null) {
            kg.run();
        }
        long jUptimeMillis2 = android.os.SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.IL != null) {
            com.bytedance.sdk.component.Kg.eqN.bg();
        }
        if (com.bytedance.sdk.component.utils.PX.bg()) {
            java.lang.Object[] objArr = new java.lang.Object[8];
            com.bytedance.sdk.component.Kg.bg bgVar = this.IL;
            if (bgVar != null) {
                bgVar.bg();
            }
            java.lang.Long.valueOf(j);
            java.lang.Long.valueOf(jUptimeMillis2);
            com.bytedance.sdk.component.Kg.Kg kg2 = this.bg;
            if (kg2 != null) {
                kg2.getName();
            }
            java.lang.String strBg = this.IL.bg();
            strBg.hashCode();
            byte b = -1;
            switch (strBg.hashCode()) {
                case 3107:
                    if (strBg.equals("ad")) {
                        b = 0;
                    }
                    break;
                case 3366:
                    if (strBg.equals("io")) {
                        b = 1;
                    }
                    break;
                case 107332:
                    if (strBg.equals("log")) {
                        b = 2;
                    }
                    break;
                case 3237136:
                    if (strBg.equals(com.ironsource.y8.a.f)) {
                        b = 3;
                    }
                    break;
                case 212371911:
                    if (strBg.equals("computation")) {
                        b = 4;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        com.bytedance.sdk.component.Kg.bg bgVar2 = this.IL;
                        java.lang.String strBg2 = bgVar2 != null ? bgVar2.bg() : "null";
                        com.bytedance.sdk.component.Kg.Kg kg3 = this.bg;
                        bg(strBg2, kg3 != null ? kg3.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        com.bytedance.sdk.component.Kg.bg bgVar3 = this.IL;
                        java.lang.String strBg3 = bgVar3 != null ? bgVar3.bg() : "null";
                        com.bytedance.sdk.component.Kg.Kg kg4 = this.bg;
                        bg(strBg3, kg4 != null ? kg4.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                        com.bytedance.sdk.component.Kg.bg bgVar4 = this.IL;
                        java.lang.String strBg4 = bgVar4 != null ? bgVar4.bg() : "null";
                        com.bytedance.sdk.component.Kg.Kg kg5 = this.bg;
                        bg(strBg4, kg5 != null ? kg5.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        com.bytedance.sdk.component.Kg.bg bgVar5 = this.IL;
                        java.lang.String strBg5 = bgVar5 != null ? bgVar5.bg() : "null";
                        com.bytedance.sdk.component.Kg.Kg kg6 = this.bg;
                        bg(strBg5, kg6 != null ? kg6.getName() : "null", jUptimeMillis2);
                    }
                    break;
            }
        }
    }

    private void bg(java.lang.String str, java.lang.String str2, long j) {
        com.bytedance.sdk.component.utils.PX.bg("DelegateRunnable", "pool is " + str + "  name is " + str2 + "is timeout,cost " + j);
    }

    public com.bytedance.sdk.component.Kg.Kg bg() {
        return this.bg;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj instanceof com.bytedance.sdk.component.Kg.IL) {
            return this.bg.compareTo(((com.bytedance.sdk.component.Kg.IL) obj).bg());
        }
        return 0;
    }

    public int hashCode() {
        return this.bg.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        com.bytedance.sdk.component.Kg.Kg kg;
        return (obj instanceof com.bytedance.sdk.component.Kg.IL) && (kg = this.bg) != null && kg.equals(((com.bytedance.sdk.component.Kg.IL) obj).bg());
    }
}
