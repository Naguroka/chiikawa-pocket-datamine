package com.bytedance.sdk.openadsdk.IL;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.IL.bg {
    private int IL;
    private int bX;
    private volatile boolean eqN;

    public IL(int i, int i2) {
        this.IL = 15;
        this.bX = 3;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Max count must be positive number!");
        }
        this.IL = i;
        this.bX = i2;
    }

    public IL(int i, int i2, boolean z) {
        this.IL = 15;
        this.bX = 3;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Max count must be positive number!");
        }
        this.IL = i;
        this.bX = i2;
        this.eqN = z;
    }

    @Override // com.bytedance.sdk.openadsdk.IL.bg
    protected boolean bg(long j, int i) {
        return i <= this.IL;
    }

    @Override // com.bytedance.sdk.openadsdk.IL.bg
    protected boolean bg(java.io.File file, long j, int i) {
        return i <= this.bX;
    }

    @Override // com.bytedance.sdk.openadsdk.IL.bg
    protected void bg(java.util.List<java.io.File> list) {
        if (this.eqN) {
            eqN(list);
            this.eqN = false;
        } else {
            bX(list);
        }
    }

    private void bX(java.util.List<java.io.File> list) {
        long jIL = IL(list);
        int size = list.size();
        if (bg(jIL, size)) {
            return;
        }
        for (java.io.File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jIL -= length;
            }
            if (bg(file, jIL, size)) {
                return;
            }
        }
    }

    private void eqN(java.util.List<java.io.File> list) {
        long jIL;
        int size;
        boolean zBg;
        if (list != null) {
            try {
                if (list.size() == 0 || (zBg = bg((jIL = IL(list)), (size = list.size())))) {
                    return;
                }
                java.util.TreeMap treeMap = new java.util.TreeMap();
                for (java.io.File file : list) {
                    treeMap.put(java.lang.Long.valueOf(file.lastModified()), file);
                }
                for (java.util.Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !zBg) {
                        ((java.lang.Long) entry.getKey()).longValue();
                        java.io.File file2 = (java.io.File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            jIL -= length;
                        }
                        if (bg(file2, jIL, size)) {
                            return;
                        }
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
