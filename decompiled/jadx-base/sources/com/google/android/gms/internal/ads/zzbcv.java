package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbcv extends com.google.android.gms.internal.ads.zzbcw {
    zzbcv() {
    }

    private static final java.lang.String zzb(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbcw
    public final java.lang.String zza(java.lang.String str, java.lang.String str2) {
        java.lang.String strZzb = zzb(str);
        java.lang.String strZzb2 = zzb(str2);
        if (android.text.TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        if (android.text.TextUtils.isEmpty(strZzb2)) {
            return strZzb;
        }
        return strZzb + "," + strZzb2;
    }
}
