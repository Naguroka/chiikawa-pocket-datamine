package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcog extends com.google.android.gms.internal.ads.zzcqz {
    private final com.google.android.gms.internal.ads.zzcex zzc;
    private final int zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzcnu zzf;
    private final com.google.android.gms.internal.ads.zzdgc zzg;
    private final com.google.android.gms.internal.ads.zzdcw zzh;
    private final com.google.android.gms.internal.ads.zzcwg zzi;
    private final boolean zzj;
    private final com.google.android.gms.internal.ads.zzbzq zzk;
    private boolean zzl;

    zzcog(com.google.android.gms.internal.ads.zzcqy zzcqyVar, android.content.Context context, com.google.android.gms.internal.ads.zzcex zzcexVar, int i, com.google.android.gms.internal.ads.zzcnu zzcnuVar, com.google.android.gms.internal.ads.zzdgc zzdgcVar, com.google.android.gms.internal.ads.zzdcw zzdcwVar, com.google.android.gms.internal.ads.zzcwg zzcwgVar, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        super(zzcqyVar);
        this.zzl = false;
        this.zzc = zzcexVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcnuVar;
        this.zzg = zzdgcVar;
        this.zzh = zzdcwVar;
        this.zzi = zzcwgVar;
        this.zzj = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfq)).booleanValue();
        this.zzk = zzbzqVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    public final void zzb() {
        super.zzb();
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        if (zzcexVar != null) {
            zzcexVar.destroy();
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzazx zzazxVar) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        if (zzcexVar != null) {
            zzcexVar.zzak(zzazxVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzd(android.app.Activity activity, com.google.android.gms.internal.ads.zzbak zzbakVar, boolean z) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        com.google.android.gms.internal.ads.zzfbo zzfboVarZzD;
        android.content.Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(context)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaN)).booleanValue()) {
                    new com.google.android.gms.internal.ads.zzfnt(context.getApplicationContext(), com.google.android.gms.ads.internal.zzv.zzu().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlL)).booleanValue() && (zzcexVar = this.zzc) != null && (zzfboVarZzD = zzcexVar.zzD()) != null && zzfboVarZzD.zzar && zzfboVarZzD.zzas != this.zzk.zzb()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The app open consent form has been shown.");
            this.zzi.zza(com.google.android.gms.internal.ads.zzfdk.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(com.google.android.gms.internal.ads.zzfdk.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            this.zzg.zza(z, context, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (com.google.android.gms.internal.ads.zzdgb e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
