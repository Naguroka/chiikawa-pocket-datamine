package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
final class zzav extends com.google.android.gms.internal.nearby.zzdv {
    private final android.content.Context zza;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.Connections.MessageListener> zzb;

    zzav(android.content.Context context, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.Connections.MessageListener> listenerHolder) {
        this.zza = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zzb = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzdw
    public final void zzb(com.google.android.gms.internal.nearby.zzfm zzfmVar) {
        this.zzb.notifyListener(new com.google.android.gms.internal.nearby.zzat(this, zzfmVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzdw
    public final void zzc(com.google.android.gms.internal.nearby.zzfe zzfeVar) {
        this.zzb.notifyListener(new com.google.android.gms.internal.nearby.zzau(this, zzfeVar));
    }
}
