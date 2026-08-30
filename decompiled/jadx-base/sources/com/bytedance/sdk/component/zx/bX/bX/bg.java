package com.bytedance.sdk.component.zx.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public static boolean bg(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return options.outWidth > 0;
    }

    public static boolean IL(byte[] bArr) {
        return bArr != null && bArr.length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }
}
