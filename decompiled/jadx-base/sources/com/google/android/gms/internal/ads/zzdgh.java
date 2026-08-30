package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdgh implements com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.internal.ads.zzdcx {
    private final com.google.android.gms.internal.ads.zzbye zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzbyi zzc;
    private final android.view.View zzd;
    private java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza zzf;

    public zzdgh(com.google.android.gms.internal.ads.zzbye zzbyeVar, android.content.Context context, com.google.android.gms.internal.ads.zzbyi zzbyiVar, android.view.View view, com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza enumC0177zza) {
        this.zza = zzbyeVar;
        this.zzb = context;
        this.zzc = zzbyiVar;
        this.zzd = view;
        this.zzf = enumC0177zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        android.view.View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    @javax.annotation.ParametersAreNonnullByDefault
    public final void zzdq(com.google.android.gms.internal.ads.zzbvw zzbvwVar, java.lang.String str, java.lang.String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                com.google.android.gms.internal.ads.zzbyi zzbyiVar = this.zzc;
                android.content.Context context = this.zzb;
                zzbyiVar.zzl(context, zzbyiVar.zza(context), this.zza.zza(), zzbvwVar.zzc(), zzbvwVar.zzb());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
        if (this.zzf == com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.APP_OPEN) {
            return;
        }
        java.lang.String strZzc = this.zzc.zzc(this.zzb);
        this.zze = strZzc;
        this.zze = java.lang.String.valueOf(strZzc).concat(this.zzf == com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
