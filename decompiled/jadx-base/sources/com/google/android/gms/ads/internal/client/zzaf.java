package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaf extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpe zzb;

    zzaf(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = zzbpeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        android.content.Context context = this.zza;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperWrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjm)).booleanValue()) {
            return zzcpVar.zzi(iObjectWrapperWrap, this.zzb, 244410000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        android.content.Context context = this.zza;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperWrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjm)).booleanValue()) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.internal.client.zzdv) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzae
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdv ? (com.google.android.gms.ads.internal.client.zzdv) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdv(iBinder);
                }
            })).zze(iObjectWrapperWrap, this.zzb, 244410000);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            com.google.android.gms.internal.ads.zzbuh.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
