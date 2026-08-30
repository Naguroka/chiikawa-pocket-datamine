package com.bytedance.sdk.component.zx.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private final android.widget.ImageView.ScaleType Kg;
    private final android.graphics.Bitmap.Config bX;
    private int eqN;
    private final int iR;
    private final int ldr;
    private int zx;
    public static final android.widget.ImageView.ScaleType bg = android.widget.ImageView.ScaleType.CENTER_INSIDE;
    public static final android.graphics.Bitmap.Config IL = android.graphics.Bitmap.Config.ARGB_4444;
    private final int WR = 3840;
    private final int eo = 104857600;

    public bg(int i, int i2, android.widget.ImageView.ScaleType scaleType, android.graphics.Bitmap.Config config, int i3, int i4) {
        this.bX = config;
        this.eqN = i;
        this.zx = i2;
        this.Kg = scaleType;
        this.ldr = i3;
        this.iR = i4;
        bg(i, i2);
    }

    static int bg(int i, int i2, int i3, int i4, int i5, int i6) {
        double dMin = java.lang.Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        if (i5 > 0 && i6 > 0) {
            dMin = java.lang.Math.max(dMin, java.lang.Math.min(((double) java.lang.Math.max(i, i2)) / ((double) java.lang.Math.max(i5, i6)), ((double) java.lang.Math.min(i, i2)) / ((double) java.lang.Math.min(i5, i6))));
        }
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > dMin) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int bg(int i, int i2, int i3, int i4, android.widget.ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == android.widget.ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        if (scaleType == android.widget.ImageView.ScaleType.CENTER_CROP) {
            double d2 = i2;
            return ((double) i) * d < d2 ? (int) (d2 / d) : i;
        }
        double d3 = i2;
        return ((double) i) * d > d3 ? (int) (d3 / d) : i;
    }

    public android.graphics.Bitmap bg(byte[] bArr) {
        android.graphics.Bitmap bitmapDecodeByteArray;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (this.eqN == 0 && this.zx == 0) {
            options.inPreferredConfig = this.bX;
            bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int iBg = bg(this.eqN, this.zx, i, i2, this.Kg);
            int iBg2 = bg(this.zx, this.eqN, i2, i, this.Kg);
            options.inJustDecodeBounds = false;
            options.inSampleSize = bg(i, i2, iBg, iBg2, this.ldr, this.iR);
            bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iBg || bitmapDecodeByteArray.getHeight() > iBg2)) {
                android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapDecodeByteArray, iBg, iBg2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                android.graphics.Bitmap bitmapCreateScaledBitmap2 = android.graphics.Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void bg(int i, int i2) {
        if (i > 3840 && i2 > 3840) {
            if (i > i2) {
                this.eqN = 3840;
                this.zx = (i2 * 3840) / i;
                return;
            } else {
                this.eqN = (i * 3840) / i2;
                this.zx = 3840;
                return;
            }
        }
        if (i > 3840) {
            this.eqN = 3840;
            this.zx = (i2 * 3840) / i;
        } else if (i2 > 3840) {
            this.eqN = (i * 3840) / i2;
            this.zx = 3840;
        }
    }
}
