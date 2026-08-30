package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfgy implements com.google.android.gms.internal.ads.zzfgw {
    private final android.content.Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private com.google.android.gms.internal.ads.zzfhm zzj = com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private java.lang.String zzk = "";
    private java.lang.String zzl = "";
    private java.lang.String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    zzfgy(android.content.Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzA() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzK(int i) {
        this.zzq = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzb(com.google.android.gms.internal.ads.zzfbz zzfbzVar) {
        zzs(zzfbzVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzc(java.lang.String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzd(java.lang.String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zze(java.lang.String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzf(com.google.android.gms.internal.ads.zzfhm zzfhmVar) {
        zzw(zzfhmVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzg(boolean z) {
        zzx(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzh(java.lang.Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final boolean zzl() {
        return !android.text.TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final synchronized com.google.android.gms.internal.ads.zzfha zzm() {
        com.google.android.gms.internal.ads.zzfgz zzfgzVar = null;
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new com.google.android.gms.internal.ads.zzfha(this, zzfgzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzn(int i) {
        zzK(i);
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        android.os.IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            com.google.android.gms.internal.ads.zzcvm zzcvmVar = (com.google.android.gms.internal.ads.zzcvm) iBinder;
            java.lang.String strZzk = zzcvmVar.zzk();
            if (!android.text.TextUtils.isEmpty(strZzk)) {
                this.zzf = strZzk;
            }
            java.lang.String strZzi = zzcvmVar.zzi();
            if (!android.text.TextUtils.isEmpty(strZzi)) {
                this.zzg = strZzi;
            }
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzs(com.google.android.gms.internal.ads.zzfbz zzfbzVar) {
        if (!android.text.TextUtils.isEmpty(zzfbzVar.zzb.zzb)) {
            this.zzf = zzfbzVar.zzb.zzb;
        }
        for (com.google.android.gms.internal.ads.zzfbo zzfboVar : zzfbzVar.zza) {
            if (!android.text.TextUtils.isEmpty(zzfboVar.zzab)) {
                this.zzg = zzfboVar.zzab;
                break;
            }
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzt(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziI)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzu(java.lang.String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzv(java.lang.String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzw(com.google.android.gms.internal.ads.zzfhm zzfhmVar) {
        this.zzj = zzfhmVar;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzx(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzy(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziI)).booleanValue()) {
            this.zzl = com.google.android.gms.internal.ads.zzbuh.zzf(th);
            this.zzk = (java.lang.String) com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc('\n')).zzd(com.google.android.gms.internal.ads.zzbuh.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfgy zzz() {
        android.content.res.Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzv.zzr().zzm(this.zza);
        android.content.res.Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
