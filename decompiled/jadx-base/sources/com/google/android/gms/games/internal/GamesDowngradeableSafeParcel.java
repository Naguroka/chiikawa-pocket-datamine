package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GamesDowngradeableSafeParcel extends com.google.android.gms.common.internal.DowngradeableSafeParcel {
    protected static boolean zzo(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        return com.google.android.gms.common.util.GmsVersion.isAtLeastFenacho(num.intValue());
    }

    @Override // com.google.android.gms.common.internal.DowngradeableSafeParcel
    public final boolean prepareForClientVersion(int i) {
        setShouldDowngrade(!zzo(java.lang.Integer.valueOf(i)));
        return true;
    }
}
