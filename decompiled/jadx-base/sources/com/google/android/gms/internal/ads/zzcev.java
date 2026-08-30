package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzcev {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
        zza = iArr;
        try {
            iArr[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            zza[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            zza[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            zza[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            zza[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}
