package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
class Kg {
    private final java.io.RandomAccessFile bg;

    Kg(java.io.File file, java.lang.String str) throws com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg {
        try {
            this.bg = new java.io.RandomAccessFile(file, str);
        } catch (java.io.FileNotFoundException e) {
            throw new com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg(e);
        }
    }

    void bg(long j) throws com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg {
        try {
            this.bg.seek(j);
        } catch (java.io.IOException e) {
            throw new com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg(e);
        }
    }

    void bg(byte[] bArr, int i, int i2) throws com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg {
        try {
            this.bg.write(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw new com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg(e);
        }
    }

    int bg(byte[] bArr) throws com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg {
        try {
            return this.bg.read(bArr);
        } catch (java.io.IOException e) {
            throw new com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg(e);
        }
    }

    void bg() {
        com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(this.bg);
    }

    static class bg extends java.lang.Exception {
        bg(java.lang.Throwable th) {
            super(th);
        }
    }
}
