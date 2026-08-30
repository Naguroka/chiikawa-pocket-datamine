package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzw extends com.google.android.gms.internal.games_v2.zzaj {
    final /* synthetic */ com.google.android.gms.games.internal.zzak zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(com.google.android.gms.games.internal.zzak zzakVar) {
        super(zzakVar.getContext().getMainLooper(), 1000);
        this.zza = zzakVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.games_v2.zzaj
    protected final void zza(java.lang.String str, int i) {
        try {
            if (this.zza.isConnected()) {
                ((com.google.android.gms.games.internal.zzap) this.zza.getService()).zzw(str, i);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 89);
            sb.append("Unable to increment event ");
            sb.append(str);
            sb.append(" by ");
            sb.append(i);
            sb.append(" because the games client is no longer connected");
            com.google.android.gms.internal.games_v2.zzez.zzc("GamesGmsClientImpl", sb.toString());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.games.internal.zzak.zzU(e);
        } catch (java.lang.SecurityException e2) {
            int i2 = com.google.android.gms.games.internal.zzak.zze;
            com.google.android.gms.internal.games_v2.zzez.zzd("GamesGmsClientImpl", "Is player signed out?", e2);
        }
    }
}
