package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbb extends com.google.android.gms.internal.nearby.zzej {
    private final android.content.Context zza;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.PayloadCallback> zzb;
    private final java.util.Map<com.google.android.gms.internal.nearby.zzba, com.google.android.gms.nearby.connection.PayloadTransferUpdate> zzc = new androidx.collection.ArrayMap();
    private final com.google.android.gms.internal.nearby.zzfx zzd;

    zzbb(android.content.Context context, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.PayloadCallback> listenerHolder, com.google.android.gms.internal.nearby.zzfx zzfxVar) {
        this.zza = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zzb = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        this.zzd = zzfxVar;
    }

    @Override // com.google.android.gms.internal.nearby.zzek
    public final synchronized void zzb(com.google.android.gms.internal.nearby.zzfm zzfmVar) {
        com.google.android.gms.nearby.connection.Payload payloadZza = com.google.android.gms.internal.nearby.zzgf.zza(this.zza, zzfmVar.zzb());
        if (payloadZza == null) {
            android.util.Log.w("NearbyConnectionsClient", java.lang.String.format("Failed to convert incoming ParcelablePayload %d to Payload.", java.lang.Long.valueOf(zzfmVar.zzb().zza())));
            return;
        }
        java.util.Map<com.google.android.gms.internal.nearby.zzba, com.google.android.gms.nearby.connection.PayloadTransferUpdate> map = this.zzc;
        com.google.android.gms.internal.nearby.zzba zzbaVar = new com.google.android.gms.internal.nearby.zzba(zzfmVar.zza(), zzfmVar.zzb().zza());
        com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder builder = new com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder();
        builder.setPayloadId(zzfmVar.zzb().zza());
        map.put(zzbaVar, builder.build());
        this.zzb.notifyListener(new com.google.android.gms.internal.nearby.zzax(this, zzfmVar, payloadZza));
    }

    @Override // com.google.android.gms.internal.nearby.zzek
    public final synchronized void zzc(com.google.android.gms.internal.nearby.zzfo zzfoVar) {
        if (zzfoVar.zzb().getStatus() == 3) {
            this.zzc.put(new com.google.android.gms.internal.nearby.zzba(zzfoVar.zza(), zzfoVar.zzb().getPayloadId()), zzfoVar.zzb());
        } else {
            this.zzc.remove(new com.google.android.gms.internal.nearby.zzba(zzfoVar.zza(), zzfoVar.zzb().getPayloadId()));
            com.google.android.gms.internal.nearby.zzfx zzfxVar = this.zzd;
            if (zzfxVar != null) {
                zzfxVar.zzb(zzfoVar.zzb().getPayloadId());
            }
        }
        this.zzb.notifyListener(new com.google.android.gms.internal.nearby.zzay(this, zzfoVar));
    }

    final synchronized void zzd() {
        for (java.util.Map.Entry<com.google.android.gms.internal.nearby.zzba, com.google.android.gms.nearby.connection.PayloadTransferUpdate> entry : this.zzc.entrySet()) {
            this.zzb.notifyListener(new com.google.android.gms.internal.nearby.zzaz(this, entry.getKey().zza(), entry.getValue()));
        }
        this.zzc.clear();
    }
}
