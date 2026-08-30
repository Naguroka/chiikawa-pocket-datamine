package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapCompat {
    public static int sizeAtStep(int i, int i2, int i3, int i4) {
        if (i3 == 0) {
            return i2;
        }
        return i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }

    public static boolean hasMipMap(android.graphics.Bitmap bitmap) {
        return androidx.core.graphics.BitmapCompat.Api17Impl.hasMipMap(bitmap);
    }

    public static void setHasMipMap(android.graphics.Bitmap bitmap, boolean z) {
        androidx.core.graphics.BitmapCompat.Api17Impl.setHasMipMap(bitmap, z);
    }

    public static int getAllocationByteCount(android.graphics.Bitmap bitmap) {
        return androidx.core.graphics.BitmapCompat.Api19Impl.getAllocationByteCount(bitmap);
    }

    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap bitmap, int i, int i2, android.graphics.Rect rect, boolean z) {
        double dFloor;
        double dFloor2;
        android.graphics.Bitmap bitmap2;
        int i3;
        int i4;
        android.graphics.Rect rect2;
        android.graphics.Bitmap bitmapCreateBitmap;
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new java.lang.IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        android.graphics.Bitmap bitmapCopyBitmapIfHardware = android.os.Build.VERSION.SDK_INT >= 27 ? androidx.core.graphics.BitmapCompat.Api27Impl.copyBitmapIfHardware(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f = i / iWidth;
        float f2 = i2 / iHeight;
        int i5 = rect != null ? rect.left : 0;
        int i6 = rect != null ? rect.top : 0;
        if (i5 == 0 && i6 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapCopyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : bitmapCopyBitmapIfHardware;
        }
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setFilterBitmap(true);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.graphics.BitmapCompat.Api29Impl.setPaintBlendMode(paint);
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        }
        if (iWidth == i && iHeight == i2) {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(i, i2, bitmapCopyBitmapIfHardware.getConfig());
            new android.graphics.Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCopyBitmapIfHardware, -i5, -i6, paint);
            return bitmapCreateBitmap2;
        }
        double dLog = java.lang.Math.log(2.0d);
        if (f > 1.0f) {
            dFloor = java.lang.Math.ceil(java.lang.Math.log(f) / dLog);
        } else {
            dFloor = java.lang.Math.floor(java.lang.Math.log(f) / dLog);
        }
        int i7 = (int) dFloor;
        if (f2 > 1.0f) {
            dFloor2 = java.lang.Math.ceil(java.lang.Math.log(f2) / dLog);
        } else {
            dFloor2 = java.lang.Math.floor(java.lang.Math.log(f2) / dLog);
        }
        int i8 = (int) dFloor2;
        if (!z || android.os.Build.VERSION.SDK_INT < 27 || androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(bitmap)) {
            bitmap2 = null;
            i3 = i5;
            i4 = 0;
        } else {
            android.graphics.Bitmap bitmapCreateBitmapWithSourceColorspace = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(i7 > 0 ? sizeAtStep(iWidth, i, 1, i7) : iWidth, i8 > 0 ? sizeAtStep(iHeight, i2, 1, i8) : iHeight, bitmap, true);
            new android.graphics.Canvas(bitmapCreateBitmapWithSourceColorspace).drawBitmap(bitmapCopyBitmapIfHardware, -i5, -i6, paint);
            i4 = 1;
            i6 = 0;
            i3 = 0;
            bitmap2 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmapWithSourceColorspace;
        }
        android.graphics.Rect rect3 = new android.graphics.Rect(i3, i6, iWidth, iHeight);
        android.graphics.Rect rect4 = new android.graphics.Rect();
        int i9 = i7;
        int i10 = i8;
        while (true) {
            if (i9 == 0 && i10 == 0) {
                break;
            }
            if (i9 < 0) {
                i9++;
            } else if (i9 > 0) {
                i9--;
            }
            if (i10 < 0) {
                i10++;
            } else if (i10 > 0) {
                i10--;
            }
            int i11 = i10;
            android.graphics.Paint paint2 = paint;
            android.graphics.Rect rect5 = rect3;
            rect4.set(0, 0, sizeAtStep(iWidth, i, i9, i7), sizeAtStep(iHeight, i2, i11, i8));
            boolean z2 = i9 == 0 && i11 == 0;
            boolean z3 = bitmap2 != null && bitmap2.getWidth() == i && bitmap2.getHeight() == i2;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z) {
                    rect2 = rect4;
                    if (android.os.Build.VERSION.SDK_INT < 27 || androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(bitmap2)) {
                    }
                    android.graphics.Rect rect6 = rect2;
                    new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect5, rect6, paint2);
                    rect5.set(rect6);
                    i10 = i11;
                    android.graphics.Bitmap bitmap3 = bitmapCopyBitmapIfHardware;
                    bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint = paint2;
                    bitmap2 = bitmap3;
                } else {
                    rect2 = rect4;
                }
                if (!z2 || (z3 && i4 == 0)) {
                    bitmapCreateBitmap = bitmap2;
                }
                android.graphics.Rect rect7 = rect2;
                new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect5, rect7, paint2);
                rect5.set(rect7);
                i10 = i11;
                android.graphics.Bitmap bitmap4 = bitmapCopyBitmapIfHardware;
                bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
                rect4 = rect7;
                rect3 = rect5;
                paint = paint2;
                bitmap2 = bitmap4;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int iSizeAtStep = sizeAtStep(iWidth, i, i9 > 0 ? i4 : i9, i7);
            int iSizeAtStep2 = sizeAtStep(iHeight, i2, i11 > 0 ? i4 : i11, i8);
            if (android.os.Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(iSizeAtStep, iSizeAtStep2, bitmap, z && !z2);
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iSizeAtStep, iSizeAtStep2, bitmapCopyBitmapIfHardware.getConfig());
            }
            android.graphics.Rect rect8 = rect2;
            new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect5, rect8, paint2);
            rect5.set(rect8);
            i10 = i11;
            android.graphics.Bitmap bitmap5 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
            rect4 = rect8;
            rect3 = rect5;
            paint = paint2;
            bitmap2 = bitmap5;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return bitmapCopyBitmapIfHardware;
    }

    private BitmapCompat() {
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static boolean hasMipMap(android.graphics.Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        static void setHasMipMap(android.graphics.Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static int getAllocationByteCount(android.graphics.Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    static class Api27Impl {
        private Api27Impl() {
        }

        static android.graphics.Bitmap createBitmapWithSourceColorspace(int i, int i2, android.graphics.Bitmap bitmap, boolean z) {
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
            android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = android.graphics.Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == android.graphics.Bitmap.Config.HARDWARE) {
                config = android.graphics.Bitmap.Config.ARGB_8888;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    config = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return android.graphics.Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        static boolean isAlreadyF16AndLinear(android.graphics.Bitmap bitmap) {
            return bitmap.getConfig() == android.graphics.Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }

        static android.graphics.Bitmap copyBitmapIfHardware(android.graphics.Bitmap bitmap) {
            if (bitmap.getConfig() != android.graphics.Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            android.graphics.Bitmap.Config hardwareBitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                hardwareBitmapConfig = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(bitmap);
            }
            return bitmap.copy(hardwareBitmapConfig, true);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setPaintBlendMode(android.graphics.Paint paint) {
            paint.setBlendMode(android.graphics.BlendMode.SRC);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static android.graphics.Bitmap.Config getHardwareBitmapConfig(android.graphics.Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return android.graphics.Bitmap.Config.RGBA_F16;
            }
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
    }
}
