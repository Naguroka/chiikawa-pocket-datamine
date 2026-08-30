package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X9 implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"Qq", "sLav", "xXJIeuat1Un3oETUCUBgWYVlLTYdvUXR", "pXicUG6N1XHbCG5QhjJ94uJ", "HKhocTo1", "Z1k35KQ5uMLjnmzbQjJ", "rJGKNzEqvOEIyk4kxb4", "sIOIMXdckNxf1vD7TuVkHKtZXYRsYSsj"};
    public long A00;
    public android.content.res.AssetFileDescriptor A01;
    public android.net.Uri A02;
    public java.io.FileInputStream A03;
    public boolean A04;
    public final android.content.ContentResolver A05;
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.X9> A06;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{105, 69, 95, 70, 78, 10, 68, 69, 94, 10, 69, 90, 79, 68, 10, 76, 67, 70, 79, 10, 78, 79, 89, 73, 88, 67, 90, 94, 69, 88, 10, 76, 69, 88, 16, 10, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws com.facebook.ads.redexgen.core.C0720Gv {
        try {
            this.A02 = h3.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 106));
            if (this.A01 == null) {
                throw new java.io.FileNotFoundException(A00(0, 36, 0) + this.A02);
            }
            this.A03 = new java.io.FileInputStream(this.A01.getFileDescriptor());
            long startOffset = this.A01.getStartOffset();
            long jSkip = this.A03.skip(h3.A03 + startOffset) - startOffset;
            if (jSkip != h3.A03) {
                throw new java.io.EOFException();
            }
            if (h3.A02 != -1) {
                this.A00 = h3.A02;
            } else {
                long length = this.A01.getLength();
                if (length == -1) {
                    java.nio.channels.FileChannel channel = this.A03.getChannel();
                    long size = channel.size();
                    this.A00 = size != 0 ? size - channel.position() : -1L;
                } else {
                    this.A00 = length - jSkip;
                }
            }
            this.A04 = true;
            if (this.A06 != null) {
                this.A06.ADs(this, h3);
            }
            return this.A00;
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C0720Gv(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public X9(android.content.Context context, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.X9> hl) {
        this.A05 = context.getContentResolver();
        this.A06 = hl;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return this.A02;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004b */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws com.facebook.ads.redexgen.core.C0720Gv {
        this.A02 = null;
        try {
            if (this.A03 != null) {
                this.A03.close();
            }
            this.A03 = null;
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                } catch (java.io.IOException e) {
                    throw new com.facebook.ads.redexgen.core.C0720Gv(e);
                }
            } catch (java.lang.Throwable th) {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    if (this.A06 != null) {
                        this.A06.ADr(this);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e2) {
            throw new com.facebook.ads.redexgen.core.C0720Gv(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i2 = (int) java.lang.Math.min(this.A00, i2);
            }
            int i3 = this.A03.read(bArr, i, i2);
            if (i3 == -1) {
                if (this.A00 == -1) {
                    return -1;
                }
                throw new com.facebook.ads.redexgen.core.C0720Gv(new java.io.EOFException());
            }
            if (this.A00 != -1) {
                this.A00 -= (long) i3;
            }
            if (this.A06 != null) {
                this.A06.ABS(this, i3);
            }
            return i3;
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C0720Gv(e);
        }
    }
}
