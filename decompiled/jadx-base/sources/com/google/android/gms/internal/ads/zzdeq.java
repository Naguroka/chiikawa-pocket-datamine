package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdeq extends com.google.android.gms.internal.ads.zzcqz {
    private final android.content.Context zzc;
    private final java.lang.ref.WeakReference zzd;
    private final com.google.android.gms.internal.ads.zzdcw zze;
    private final com.google.android.gms.internal.ads.zzdgc zzf;
    private final com.google.android.gms.internal.ads.zzcru zzg;
    private final com.google.android.gms.internal.ads.zzfnt zzh;
    private final com.google.android.gms.internal.ads.zzcwg zzi;
    private final com.google.android.gms.internal.ads.zzbzq zzj;
    private boolean zzk;

    zzdeq(com.google.android.gms.internal.ads.zzcqy zzcqyVar, android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzdcw zzdcwVar, com.google.android.gms.internal.ads.zzdgc zzdgcVar, com.google.android.gms.internal.ads.zzcru zzcruVar, com.google.android.gms.internal.ads.zzfnt zzfntVar, com.google.android.gms.internal.ads.zzcwg zzcwgVar, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        super(zzcqyVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new java.lang.ref.WeakReference(zzcexVar);
        this.zze = zzdcwVar;
        this.zzf = zzdgcVar;
        this.zzg = zzcruVar;
        this.zzh = zzfntVar;
        this.zzi = zzcwgVar;
        this.zzj = zzbzqVar;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            final com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) this.zzd.get();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgA)).booleanValue()) {
                if (!this.zzk && zzcexVar != null) {
                    com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzf;
                    java.util.Objects.requireNonNull(zzcexVar);
                    zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdep
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
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
    public final boolean zzc(boolean z, @javax.annotation.Nullable android.app.Activity activity) {
        android.content.Context context;
        com.google.android.gms.internal.ads.zzfbo zzfboVarZzD;
        this.zze.zzb();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaN)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
            } else {
                com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) this.zzd.get();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlL)).booleanValue() || zzcexVar == null || (zzfboVarZzD = zzcexVar.zzD()) == null || !zzfboVarZzD.zzar || zzfboVarZzD.zzas == this.zzj.zzb()) {
                    if (this.zzk) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial ad has been shown.");
                        this.zzi.zza(com.google.android.gms.internal.ads.zzfdk.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzk) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        try {
                            this.zzf.zza(z, context, this.zzi);
                            this.zze.zza();
                            this.zzk = true;
                            return true;
                        } catch (com.google.android.gms.internal.ads.zzdgb e) {
                            this.zzi.zzc(e);
                        }
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial consent form has been shown.");
                    this.zzi.zza(com.google.android.gms.internal.ads.zzfdk.zzd(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            com.google.android.gms.internal.ads.zzcex zzcexVar2 = (com.google.android.gms.internal.ads.zzcex) this.zzd.get();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlL)).booleanValue()) {
                if (this.zzk) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial ad has been shown.");
                    this.zzi.zza(com.google.android.gms.internal.ads.zzfdk.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            } else {
                if (this.zzk) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial ad has been shown.");
                    this.zzi.zza(com.google.android.gms.internal.ads.zzfdk.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            }
        }
        return false;
    }
}
