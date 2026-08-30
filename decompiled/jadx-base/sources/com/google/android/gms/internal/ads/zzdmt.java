package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmt extends com.google.android.gms.internal.ads.zzbgp {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdif zzb;
    private com.google.android.gms.internal.ads.zzdjf zzc;
    private com.google.android.gms.internal.ads.zzdia zzd;

    public zzdmt(android.content.Context context, com.google.android.gms.internal.ads.zzdif zzdifVar, com.google.android.gms.internal.ads.zzdjf zzdjfVar, com.google.android.gms.internal.ads.zzdia zzdiaVar) {
        this.zza = context;
        this.zzb = zzdifVar;
        this.zzc = zzdjfVar;
        this.zzd = zzdiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.internal.ads.zzbft zzf() throws android.os.RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.internal.ads.zzbfw zzg(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbfw) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final java.lang.String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final java.lang.String zzj(java.lang.String str) {
        return (java.lang.String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final java.util.List zzk() {
        try {
            androidx.collection.SimpleArrayMap simpleArrayMapZzh = this.zzb.zzh();
            androidx.collection.SimpleArrayMap simpleArrayMapZzi = this.zzb.zzi();
            java.lang.String[] strArr = new java.lang.String[simpleArrayMapZzh.size() + simpleArrayMapZzi.size()];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMapZzh.size(); i2++) {
                strArr[i] = (java.lang.String) simpleArrayMapZzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMapZzi.size(); i3++) {
                strArr[i] = (java.lang.String) simpleArrayMapZzi.keyAt(i3);
                i++;
            }
            return java.util.Arrays.asList(strArr);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new java.util.ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzd;
        if (zzdiaVar != null) {
            zzdiaVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzm() {
        try {
            java.lang.String strZzC = this.zzb.zzC();
            if (java.util.Objects.equals(strZzC, "Google")) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (android.text.TextUtils.isEmpty(strZzC)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzd;
            if (zzdiaVar != null) {
                zzdiaVar.zzf(strZzC, false);
            }
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzn(java.lang.String str) {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzd;
        if (zzdiaVar != null) {
            zzdiaVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzo() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzd;
        if (zzdiaVar != null) {
            zzdiaVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzdia zzdiaVar;
        java.lang.Object objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof android.view.View) || this.zzb.zzu() == null || (zzdiaVar = this.zzd) == null) {
            return;
        }
        zzdiaVar.zzK((android.view.View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzq() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzd;
        return (zzdiaVar == null || zzdiaVar.zzX()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzdjf zzdjfVar;
        java.lang.Object objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof android.view.ViewGroup) || (zzdjfVar = this.zzc) == null || !zzdjfVar.zzf((android.view.ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzq().zzar(new com.google.android.gms.internal.ads.zzdms(this, com.google.android.gms.ads.nativead.NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzdjf zzdjfVar;
        java.lang.Object objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof android.view.ViewGroup) || (zzdjfVar = this.zzc) == null || !zzdjfVar.zzg((android.view.ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzs().zzar(new com.google.android.gms.internal.ads.zzdms(this, com.google.android.gms.ads.nativead.NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt() {
        com.google.android.gms.internal.ads.zzecr zzecrVarZzu = this.zzb.zzu();
        if (zzecrVarZzu == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzk(zzecrVarZzu.zza());
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new androidx.collection.ArrayMap());
        return true;
    }
}
