package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1506a;
    private boolean b;
    private boolean c;
    public byte[] d;
    public int e;

    public xf(int i, int i2) {
        this.f1506a = i;
        byte[] bArr = new byte[i2 + 3];
        this.d = bArr;
        bArr[2] = 1;
    }

    public void b() {
        this.b = false;
        this.c = false;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                this.d = java.util.Arrays.copyOf(bArr2, i4 * 2);
            }
            java.lang.System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public void b(int i) {
        com.applovin.impl.b1.b(!this.b);
        boolean z = i == this.f1506a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }

    public boolean a(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public boolean a() {
        return this.c;
    }
}
