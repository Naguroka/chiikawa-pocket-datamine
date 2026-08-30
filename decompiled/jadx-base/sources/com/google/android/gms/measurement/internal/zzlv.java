package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlv implements android.app.Application.ActivityLifecycleCallbacks, com.google.android.gms.measurement.internal.zzlt {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zza;

    zzlv(com.google.android.gms.measurement.internal.zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zza(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zza(com.google.android.gms.internal.measurement.zzdj zzdjVar, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzio zzioVar;
        android.net.Uri uri;
        try {
            try {
                com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zza;
                com.google.android.gms.measurement.internal.zzio zzioVar2 = zzlwVar.zzu;
                zzioVar2.zzaW().zzj().zza("onActivityCreated");
                android.content.Intent intent = zzdjVar.zzc;
                if (intent != null) {
                    android.net.Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        android.os.Bundle extras = intent.getExtras();
                        uri = null;
                        if (extras != null) {
                            java.lang.String string = extras.getString("com.android.vending.referral_url");
                            if (!android.text.TextUtils.isEmpty(string)) {
                                data = android.net.Uri.parse(string);
                                uri = data;
                            }
                        }
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        zzioVar2.zzw();
                        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        zzioVar2.zzaX().zzq(new com.google.android.gms.measurement.internal.zzlu(this, bundle == null, uri, ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto", uri.getQueryParameter(com.adjust.sdk.Constants.REFERRER)));
                        zzioVar = this.zza.zzu;
                    }
                    com.google.android.gms.measurement.internal.zzmo zzmoVarZzt = zzioVar.zzt();
                }
                zzioVar = zzlwVar.zzu;
            } catch (java.lang.RuntimeException e) {
                this.zza.zzu.zzaW().zze().zzb("Throwable caught in onActivityCreated", e);
            }
            com.google.android.gms.measurement.internal.zzmo zzmoVarZzt2 = zzioVar.zzt();
        } finally {
            this.zza.zzu.zzt().zzs(zzdjVar, bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzb(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        this.zza.zzu.zzt().zzt(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzc(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zzu;
        zzioVar.zzt().zzu(zzdjVar);
        com.google.android.gms.measurement.internal.zzop zzopVarZzv = zzioVar.zzv();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzopVarZzv.zzu;
        zzioVar2.zzaX().zzq(new com.google.android.gms.measurement.internal.zzoi(zzopVarZzv, zzioVar2.zzaU().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzd(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zzu;
        com.google.android.gms.measurement.internal.zzop zzopVarZzv = zzioVar.zzv();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzopVarZzv.zzu;
        zzioVar2.zzaX().zzq(new com.google.android.gms.measurement.internal.zzoh(zzopVarZzv, zzioVar2.zzaU().elapsedRealtime()));
        zzioVar.zzt().zzv(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zze(com.google.android.gms.internal.measurement.zzdj zzdjVar, android.os.Bundle bundle) {
        this.zza.zzu.zzt().zzw(zzdjVar, bundle);
    }
}
