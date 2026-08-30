package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class HexDumpUtils {
    public static java.lang.String dump(byte[] bArr, int i, int i2, boolean z) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i2 <= 0 || i + i2 > length) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((z ? 75 : 57) * ((i2 + 15) / 16));
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i3 > 0) {
            if (i4 == 0) {
                if (i2 < 65536) {
                    sb.append(java.lang.String.format("%04X:", java.lang.Integer.valueOf(i)));
                } else {
                    sb.append(java.lang.String.format("%08X:", java.lang.Integer.valueOf(i)));
                }
                i5 = i;
            } else if (i4 == 8) {
                sb.append(" -");
            }
            sb.append(java.lang.String.format(" %02X", java.lang.Integer.valueOf(bArr[i] & 255)));
            i3--;
            i4++;
            if (z && (i4 == 16 || i3 == 0)) {
                int i6 = 16 - i4;
                if (i6 > 0) {
                    for (int i7 = 0; i7 < i6; i7++) {
                        sb.append("   ");
                    }
                }
                if (i6 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i8 = 0; i8 < i4; i8++) {
                    char c = (char) bArr[i5 + i8];
                    if (c < ' ' || c > '~') {
                        c = '.';
                    }
                    sb.append(c);
                }
            }
            if (i4 == 16 || i3 == 0) {
                sb.append('\n');
                i4 = 0;
            }
            i++;
        }
        return sb.toString();
    }
}
