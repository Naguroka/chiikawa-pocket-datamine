package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsh extends com.google.android.gms.internal.ads.zzbsi implements com.google.android.gms.internal.ads.zzbjp {
    android.util.DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final com.google.android.gms.internal.ads.zzcex zzh;
    private final android.content.Context zzi;
    private final android.view.WindowManager zzj;
    private final com.google.android.gms.internal.ads.zzbbt zzk;
    private float zzl;
    private int zzm;

    public zzbsh(com.google.android.gms.internal.ads.zzcex zzcexVar, android.content.Context context, com.google.android.gms.internal.ads.zzbbt zzbbtVar) {
        super(zzcexVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcexVar;
        this.zzi = context;
        this.zzk = zzbbtVar;
        this.zzj = (android.view.WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        org.json.JSONObject jSONObjectPut;
        this.zza = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        android.util.DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        android.util.DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzv(displayMetrics2, displayMetrics2.heightPixels);
        android.app.Activity activityZzi = this.zzh.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzv.zzq();
            int[] iArrZzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(activityZzi);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzv(this.zza, iArrZzQ[0]);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzv(this.zza, iArrZzQ[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        com.google.android.gms.internal.ads.zzbsg zzbsgVar = new com.google.android.gms.internal.ads.zzbsg();
        com.google.android.gms.internal.ads.zzbbt zzbbtVar = this.zzk;
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setData(android.net.Uri.parse("tel:"));
        zzbsgVar.zze(zzbbtVar.zza(intent));
        com.google.android.gms.internal.ads.zzbbt zzbbtVar2 = this.zzk;
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
        intent2.setData(android.net.Uri.parse("sms:"));
        zzbsgVar.zzc(zzbbtVar2.zza(intent2));
        zzbsgVar.zza(this.zzk.zzb());
        zzbsgVar.zzd(this.zzk.zzc());
        zzbsgVar.zzb(true);
        boolean z = zzbsgVar.zza;
        boolean z2 = zzbsgVar.zzb;
        boolean z3 = zzbsgVar.zzc;
        boolean z4 = zzbsgVar.zzd;
        boolean z5 = zzbsgVar.zze;
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzh;
        try {
            jSONObjectPut = new org.json.JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzcexVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().afmaVersion);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[PHI: r3
  0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i, int i2) {
        int i3;
        android.content.Context context = this.zzi;
        int i4 = 0;
        if (context instanceof android.app.Activity) {
            com.google.android.gms.ads.internal.zzv.zzq();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzR((android.app.Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzh;
            int width = zzcexVar.getWidth();
            int height = zzcexVar.getHeight();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzad)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (this.zzh.zzO() != null) {
                    i4 = this.zzh.zzO().zza;
                }
            } else {
                i4 = height;
            }
            this.zzf = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, i4);
        }
        zzg(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzN().zzD(i, i2);
    }
}
