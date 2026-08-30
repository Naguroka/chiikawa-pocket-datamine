package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbrz extends com.google.android.gms.internal.ads.zzbsi {
    private final java.util.Map zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final long zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;

    public zzbrz(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        super(zzcexVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcexVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
    }

    private final long zzd(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(str2);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    private final java.lang.String zze(java.lang.String str) {
        return android.text.TextUtils.isEmpty((java.lang.CharSequence) this.zza.get(str)) ? "" : (java.lang.String) this.zza.get(str);
    }

    final android.content.Intent zzb() {
        android.content.Intent data = new android.content.Intent("android.intent.action.EDIT").setData(android.provider.CalendarContract.Events.CONTENT_URI);
        data.putExtra(com.ironsource.y8.h.D0, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new com.google.android.gms.internal.ads.zzbbt(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zzb);
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        builderZzL.setTitle(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s5) : "Create calendar event");
        builderZzL.setMessage(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s6) : "Allow Ad to create a calendar event?");
        builderZzL.setPositiveButton(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s3) : com.google.common.net.HttpHeaders.ACCEPT, new com.google.android.gms.internal.ads.zzbrx(this));
        builderZzL.setNegativeButton(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s4) : "Decline", new com.google.android.gms.internal.ads.zzbry(this));
        builderZzL.create().show();
    }
}
