package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1086Vf {
    public static java.lang.String[] A00 = {"GWFI2aEH9IwS9jlAmW7GhK1fzlhYxOYr", "8RR4W", "CWkLBEDZ3ckMIO6tTC6BOoN3cIPuPWQc", "H5jmeoVh4LyksNQ25zvZiIvxmGmhytkO", "GsHsqvgNRqvbvAJVDBzizJhfh8WArm0A", "4fKWUv5SQTvzMYF7waz6SD9Pf2i1NBM9", "aULd2mQrGZaata6Wu7225", "sYPqpaaM0HqFzSjGFkcoBixd8ZNH3dn1"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

    public static void A00(int[] iArr, int i, int minY, int minX, int i2, int i3, int i4) {
        int stack_start = i - 1;
        int i5 = minY - 1;
        int stack_start2 = (minX * 2) + 1;
        short s = A02[minX];
        byte b = A01[minX];
        int[] iArr2 = new int[stack_start2];
        long j = 0;
        if (i4 == 1) {
            int maxY = (i3 * minY) / i2;
            int i6 = ((i3 + 1) * minY) / i2;
            while (maxY < i6) {
                long j2 = j;
                java.lang.String[] strArr = A00;
                if (strArr[0].charAt(0) == strArr[4].charAt(0)) {
                    A00[7] = "PfdY9h9ksw7pIrLHvaMDkidEUsYS2xix";
                    long j3 = j;
                    long j4 = j;
                    long j5 = j;
                    long j6 = j;
                    long j7 = j;
                    long j8 = j;
                    long j9 = j;
                    int hm = i * maxY;
                    for (int i7 = 0; i7 <= minX; i7++) {
                        iArr2[i7] = iArr[hm];
                        j9 += (long) (((iArr[hm] >>> 16) & 255) * (i7 + 1));
                        j8 += (long) (((iArr[hm] >>> 8) & 255) * (i7 + 1));
                        j7 += (long) ((iArr[hm] & 255) * (i7 + 1));
                        j3 += (long) ((iArr[hm] >>> 16) & 255);
                        j2 += (long) ((iArr[hm] >>> 8) & 255);
                        j += (long) (iArr[hm] & 255);
                    }
                    for (int i8 = 1; i8 <= minX; i8++) {
                        if (i8 <= stack_start) {
                            hm++;
                        }
                        iArr2[i8 + minX] = iArr[hm];
                        j9 += (long) (((iArr[hm] >>> 16) & 255) * ((minX + 1) - i8));
                        j8 += (long) (((iArr[hm] >>> 8) & 255) * ((minX + 1) - i8));
                        j7 += (long) ((iArr[hm] & 255) * ((minX + 1) - i8));
                        j6 += (long) ((iArr[hm] >>> 16) & 255);
                        j5 += (long) ((iArr[hm] >>> 8) & 255);
                        j4 += (long) (iArr[hm] & 255);
                    }
                    int i9 = minX;
                    int i10 = minX;
                    if (i10 > stack_start) {
                        i10 = stack_start;
                    }
                    int i11 = (maxY * i) + i10;
                    int i12 = maxY * i;
                    for (int i13 = 0; i13 < i; i13++) {
                        iArr[i12] = (int) (((long) (iArr[i12] & androidx.core.view.ViewCompat.MEASURED_STATE_MASK)) | ((((((long) s) * j9) >>> b) & 255) << 16) | ((((((long) s) * j8) >>> b) & 255) << 8) | (((((long) s) * j7) >>> b) & 255));
                        i12++;
                        long j10 = j9 - j3;
                        long j11 = j8 - j2;
                        long j12 = j7 - j;
                        int i14 = (i9 + stack_start2) - minX;
                        if (i14 >= stack_start2) {
                            i14 -= stack_start2;
                        }
                        long j13 = j3 - ((long) ((iArr2[i14] >>> 16) & 255));
                        long j14 = j2 - ((long) ((iArr2[i14] >>> 8) & 255));
                        long j15 = j - ((long) (iArr2[i14] & 255));
                        int stack_i = i10;
                        if (stack_i < stack_start) {
                            i11++;
                            i10++;
                        }
                        iArr2[i14] = iArr[i11];
                        long j16 = j6 + ((long) ((iArr[i11] >>> 16) & 255));
                        long j17 = j5 + ((long) ((iArr[i11] >>> 8) & 255));
                        long j18 = j4 + ((long) (iArr[i11] & 255));
                        j9 = j10 + j16;
                        j8 = j11 + j17;
                        j7 = j12 + j18;
                        int i15 = i9 + 1;
                        if (i15 >= stack_start2) {
                            i15 = 0;
                        }
                        int stack_i2 = iArr2[i15];
                        i9 = i15;
                        j3 = j13 + ((long) ((stack_i2 >>> 16) & 255));
                        int stack_i3 = iArr2[i15];
                        long j19 = (stack_i3 >>> 8) & 255;
                        if (A00[1].length() == 5) {
                            java.lang.String[] strArr2 = A00;
                            strArr2[0] = "Gs6cp7XtkyimKPtddkds3pD39xD98rye";
                            strArr2[4] = "GzHB2OA1jqluXk2iMzoyOJbysCDiG3Ta";
                            j2 = j14 + j19;
                            int stack_i4 = iArr2[i15];
                            j = j15 + ((long) (stack_i4 & 255));
                            int stack_i5 = iArr2[i15];
                            j6 = j16 - ((long) ((stack_i5 >>> 16) & 255));
                            int stack_i6 = iArr2[i15];
                            j5 = j17 - ((long) ((stack_i6 >>> 8) & 255));
                            int stack_i7 = iArr2[i15];
                            j4 = j18 - ((long) (stack_i7 & 255));
                        }
                    }
                    maxY++;
                    j = 0;
                }
            }
            return;
        }
        if (i4 == 2) {
            int i16 = (i3 * i) / i2;
            int i17 = ((i3 + 1) * i) / i2;
            while (maxX < i17) {
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                long j27 = 0;
                long j28 = 0;
                int i18 = i16;
                for (int i19 = 0; i19 <= minX; i19++) {
                    iArr2[i19] = iArr[i18];
                    int maxX = i19 + 1;
                    j28 += (long) (((iArr[i18] >>> 16) & 255) * maxX);
                    j27 += (long) (((iArr[i18] >>> 8) & 255) * (i19 + 1));
                    j26 += (long) ((iArr[i18] & 255) * (i19 + 1));
                    j22 += (long) ((iArr[i18] >>> 16) & 255);
                    j21 += (long) ((iArr[i18] >>> 8) & 255);
                    j20 += (long) (iArr[i18] & 255);
                }
                int i20 = 1;
                while (i20 <= minX) {
                    if (i20 <= i5) {
                        i18 += i;
                    }
                    int stack_i8 = i20 + minX;
                    iArr2[stack_i8] = iArr[i18];
                    int stack_i9 = minX + 1;
                    j28 += (long) (((iArr[i18] >>> 16) & 255) * (stack_i9 - i20));
                    int stack_i10 = minX + 1;
                    j27 += (long) (((iArr[i18] >>> 8) & 255) * (stack_i10 - i20));
                    int stack_i11 = minX + 1;
                    j26 += (long) ((iArr[i18] & 255) * (stack_i11 - i20));
                    j25 += (long) ((iArr[i18] >>> 16) & 255);
                    long j29 = (iArr[i18] >>> 8) & 255;
                    int hm2 = A00[7].charAt(21);
                    if (hm2 != 105) {
                        j24 += j29;
                        j23 += (long) (iArr[i18] & 255);
                        i20++;
                    } else {
                        java.lang.String[] strArr3 = A00;
                        strArr3[0] = "GE7urBSjjLMQkFl7rA6N87J3ehhA8Hz6";
                        strArr3[4] = "GOWeQyuTSoYbh2z5UHQkrSxrHOD9hfFJ";
                        j24 += j29;
                        j23 += (long) (iArr[i18] & 255);
                        i20++;
                    }
                }
                int hm3 = minX;
                int i21 = minX;
                if (i21 > i5) {
                    i21 = i5;
                }
                int i22 = (i21 * i) + i16;
                int i23 = i16;
                int i24 = 0;
                while (true) {
                    java.lang.String[] strArr4 = A00;
                    java.lang.String str = strArr4[0];
                    java.lang.String str2 = strArr4[4];
                    int sp = str.charAt(0);
                    int y = str2.charAt(0);
                    if (sp == y) {
                        A00[6] = "1bwVAFoQI5Ok5WJFtwrUe";
                        int sp2 = i24;
                        if (sp2 < minY) {
                            int i25 = iArr[i23];
                            int sp3 = A00[7].charAt(21);
                            if (sp3 != 105) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr5 = A00;
                            strArr5[0] = "GGduL95yG2tM0AFXVNzOOayl6jJ8thFl";
                            strArr5[4] = "GuBrpivSQbykanIV4Dv04bmlZ4tKSmwR";
                            int y2 = (int) (((long) (i25 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK)) | ((((((long) s) * j28) >>> b) & 255) << 16) | ((((((long) s) * j27) >>> b) & 255) << 8) | (((((long) s) * j26) >>> b) & 255));
                            iArr[i23] = y2;
                            i23 += i;
                            long j30 = j28 - j22;
                            long j31 = j27 - j21;
                            long j32 = j26 - j20;
                            int stack_start3 = (hm3 + stack_start2) - minX;
                            if (stack_start3 >= stack_start2) {
                                stack_start3 -= stack_start2;
                            }
                            int y3 = iArr2[stack_start3];
                            long j33 = j22 - ((long) ((y3 >>> 16) & 255));
                            int y4 = iArr2[stack_start3];
                            long j34 = j21 - ((long) ((y4 >>> 8) & 255));
                            int y5 = iArr2[stack_start3];
                            long j35 = j20 - ((long) (y5 & 255));
                            int sp4 = i21;
                            if (sp4 < i5) {
                                i22 += i;
                                i21++;
                            }
                            int y6 = iArr[i22];
                            iArr2[stack_start3] = y6;
                            int y7 = iArr[i22];
                            long j36 = j25 + ((long) ((y7 >>> 16) & 255));
                            int y8 = iArr[i22];
                            long j37 = j24 + ((long) ((y8 >>> 8) & 255));
                            int y9 = iArr[i22];
                            long j38 = j23 + ((long) (y9 & 255));
                            j28 = j30 + j36;
                            j27 = j31 + j37;
                            j26 = j32 + j38;
                            hm3++;
                            if (hm3 >= stack_start2) {
                                hm3 = 0;
                            }
                            int y10 = iArr2[hm3];
                            j22 = j33 + ((long) ((y10 >>> 16) & 255));
                            int y11 = iArr2[hm3];
                            j21 = j34 + ((long) ((y11 >>> 8) & 255));
                            int y12 = iArr2[hm3];
                            j20 = j35 + ((long) (y12 & 255));
                            int y13 = iArr2[hm3];
                            j25 = j36 - ((long) ((y13 >>> 16) & 255));
                            int y14 = iArr2[hm3];
                            j24 = j37 - ((long) ((y14 >>> 8) & 255));
                            int y15 = iArr2[hm3];
                            j23 = j38 - ((long) (y15 & 255));
                            i24++;
                        }
                    }
                }
                i16++;
            }
            return;
        }
        return;
        throw new java.lang.RuntimeException();
    }

    @javax.annotation.Nullable
    public final android.graphics.Bitmap A02(android.graphics.Bitmap bitmap, float f) {
        int w = bitmap.getWidth();
        int h = bitmap.getHeight();
        try {
            int[] iArr = new int[w * h];
            bitmap.getPixels(iArr, 0, w, 0, 0, w, h);
            int i = com.facebook.ads.redexgen.core.ME.A00;
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            java.util.ArrayList<com.facebook.ads.internal.util.image.thirdparty.JavaBlurProcess.BlurTask> vertical = new java.util.ArrayList<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                int h2 = h;
                int cores = i2;
                arrayList.add(new com.facebook.ads.redexgen.core.MD(iArr, w, h2, (int) f, i, cores, 1));
                h = h2;
                int cores2 = i2;
                vertical.add(new com.facebook.ads.redexgen.core.MD(iArr, w, h, (int) f, i, cores2, 2));
            }
            try {
                com.facebook.ads.redexgen.core.ME.A01.invokeAll(arrayList);
                try {
                    com.facebook.ads.redexgen.core.ME.A01.invokeAll(vertical);
                    try {
                        return android.graphics.Bitmap.createBitmap(iArr, w, h, android.graphics.Bitmap.Config.ARGB_8888);
                    } catch (java.lang.OutOfMemoryError unused) {
                        return null;
                    }
                } catch (java.lang.InterruptedException unused2) {
                    java.lang.String[] strArr = A00;
                    if (strArr[0].charAt(0) != strArr[4].charAt(0)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A00;
                    strArr2[0] = "GYxXddv1X7Qsu4uKyRk7X4E4VL4ApWq6";
                    strArr2[4] = "GxDga6TmLrnNDJa4WhYbU4AfHiRAiIT6";
                    return null;
                }
            } catch (java.lang.InterruptedException unused3) {
                return null;
            }
        } catch (java.lang.OutOfMemoryError unused4) {
            return null;
        }
    }
}
