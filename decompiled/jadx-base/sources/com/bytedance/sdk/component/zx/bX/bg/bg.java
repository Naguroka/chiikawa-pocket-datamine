package com.bytedance.sdk.component.zx.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.sdk.component.zx.IL, java.lang.Cloneable {
    private static volatile com.bytedance.sdk.component.zx.IL ldr;
    private int IL;
    private boolean bX;
    private long bg;
    private boolean eqN;
    private java.io.File zx;

    @Override // com.bytedance.sdk.component.zx.IL
    public boolean ldr() {
        return true;
    }

    public bg(int i, long j, java.io.File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public bg(int i, long j, boolean z, boolean z2, java.io.File file) {
        this.bg = j;
        this.IL = i;
        this.bX = z;
        this.eqN = z2;
        this.zx = file;
    }

    @Override // com.bytedance.sdk.component.zx.IL
    public long bg() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.zx.IL
    public int IL() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.zx.IL
    public boolean bX() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.zx.IL
    public boolean eqN() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.zx.IL
    public java.io.File zx() {
        return this.zx;
    }

    public static void bg(android.content.Context context, com.bytedance.sdk.component.zx.IL il) {
        if (il != null) {
            ldr = il;
        } else {
            ldr = bg(new java.io.File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.zx.IL bg(java.io.File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (ldr == null) {
            iMin = java.lang.Math.min(java.lang.Long.valueOf(java.lang.Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = java.lang.Math.min(Kg() / 16, 41943040L);
        } else {
            iMin = java.lang.Math.min(ldr.IL() / 2, 31457280);
            jMin = java.lang.Math.min(ldr.bg() / 2, 41943040L);
        }
        return new com.bytedance.sdk.component.zx.bX.bg.bg(java.lang.Math.max(iMin, 26214400), java.lang.Math.max(jMin, 20971520L), file);
    }

    public static com.bytedance.sdk.component.zx.IL iR() {
        return ldr;
    }

    private static long Kg() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}
