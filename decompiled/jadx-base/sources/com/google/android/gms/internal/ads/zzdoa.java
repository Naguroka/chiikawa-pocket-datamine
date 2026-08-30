package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdoa extends com.google.android.gms.internal.ads.zzcqz {
    private final android.content.Context zzc;
    private final java.lang.ref.WeakReference zzd;
    private final com.google.android.gms.internal.ads.zzdgc zze;
    private final com.google.android.gms.internal.ads.zzdcw zzf;
    private final com.google.android.gms.internal.ads.zzcwg zzg;
    private final com.google.android.gms.internal.ads.zzcxn zzh;
    private final com.google.android.gms.internal.ads.zzcru zzi;
    private final com.google.android.gms.internal.ads.zzbwm zzj;
    private final com.google.android.gms.internal.ads.zzfnt zzk;
    private final com.google.android.gms.internal.ads.zzfcc zzl;
    private boolean zzm;

    zzdoa(com.google.android.gms.internal.ads.zzcqy zzcqyVar, android.content.Context context, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzdgc zzdgcVar, com.google.android.gms.internal.ads.zzdcw zzdcwVar, com.google.android.gms.internal.ads.zzcwg zzcwgVar, com.google.android.gms.internal.ads.zzcxn zzcxnVar, com.google.android.gms.internal.ads.zzcru zzcruVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfnt zzfntVar, com.google.android.gms.internal.ads.zzfcc zzfccVar) {
        super(zzcqyVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdgcVar;
        this.zzd = new java.lang.ref.WeakReference(zzcexVar);
        this.zzf = zzdcwVar;
        this.zzg = zzcwgVar;
        this.zzh = zzcxnVar;
        this.zzi = zzcruVar;
        this.zzk = zzfntVar;
        com.google.android.gms.internal.ads.zzbwi zzbwiVar = zzfboVar.zzl;
        this.zzj = new com.google.android.gms.internal.ads.zzbxg(zzbwiVar != null ? zzbwiVar.zza : "", zzbwiVar != null ? zzbwiVar.zzb : 1);
        this.zzl = zzfccVar;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            final com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) this.zzd.get();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgA)).booleanValue()) {
                if (!this.zzm && zzcexVar != null) {
                    com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzf;
                    java.util.Objects.requireNonNull(zzcexVar);
                    zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdnz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcexVar.destroy();
                        }
                    });
                }
            } else if (zzcexVar != null) {
                zzcexVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final android.os.Bundle zza() {
        return this.zzh.zzb();
    }

    public final com.google.android.gms.internal.ads.zzbwm zzc() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.ads.zzfcc zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) this.zzd.get();
        return (zzcexVar == null || zzcexVar.zzaG()) ? false : true;
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
    public final boolean zzh(boolean z, android.app.Activity activity) {
        android.content.Context context;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaN)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The rewarded ad have been showed.");
            this.zzg.zza(com.google.android.gms.internal.ads.zzfdk.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (com.google.android.gms.internal.ads.zzdgb e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
