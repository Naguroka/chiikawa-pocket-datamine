package com.bytedance.sdk.openadsdk.Lq;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static int IL = 0;
    public static int bX = 1;
    public static int bg = -1;
    public static int eqN = 2;
    public static int zx = 3;
    private int ldr = bg;
    private long iR = 0;
    private long Kg = 0;
    private final java.util.List<com.bytedance.sdk.openadsdk.Lq.bX> WR = new java.util.ArrayList();
    private long eo = 0;

    public void bg(long j) {
        this.ldr = IL;
        this.iR = j;
    }

    public void IL(long j) {
        int i;
        int i2 = this.ldr;
        if (i2 == bg || i2 == (i = zx)) {
            return;
        }
        this.ldr = i;
        this.Kg = j;
    }

    public void bX(long j) {
        int i;
        int i2 = this.ldr;
        if (i2 == bg || i2 == (i = eqN) || i2 == zx) {
            return;
        }
        this.ldr = i;
        this.eo = j;
    }

    public void eqN(long j) {
        int i = this.ldr;
        if (i == bg || i != eqN) {
            return;
        }
        this.ldr = bX;
        this.WR.add(new com.bytedance.sdk.openadsdk.Lq.bX(this.eo, j));
        this.eo = 0L;
    }

    public long bg(long j, long j2) {
        long j3;
        long j4;
        long jIL;
        long j5 = this.Kg;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i = 0;
        for (com.bytedance.sdk.openadsdk.Lq.bX bXVar : this.WR) {
            if (bXVar.IL() > j) {
                if (j < bXVar.bg()) {
                    j4 = i;
                    jIL = bXVar.IL() - bXVar.bg();
                } else {
                    j4 = i;
                    jIL = bXVar.IL() - j;
                }
                i = (int) (j4 + jIL);
            }
        }
        long j6 = this.iR;
        if (j6 < j) {
            long j7 = this.eo;
            if (j7 == 0) {
                j7 = this.Kg;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - ((long) i);
        }
        long j8 = this.eo;
        if (j8 == 0) {
            j8 = this.Kg;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - ((long) i);
        return j3 - ((long) i);
    }

    public int bg() {
        return this.ldr;
    }
}
