package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzduh extends com.google.android.gms.internal.ads.zzfqz {

    @javax.annotation.Nullable
    private final android.hardware.SensorManager zza;

    @javax.annotation.Nullable
    private final android.hardware.Sensor zzb;
    private float zzc;
    private java.lang.Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzdug zzi;
    private boolean zzj;

    zzduh(android.content.Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = java.lang.Float.valueOf(0.0f);
        this.zze = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqz
    public final void zza(android.hardware.SensorEvent sensorEvent) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziW)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (this.zze + ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziY)).intValue()) < jCurrentTimeMillis) {
                this.zzf = 0;
                this.zze = jCurrentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            java.lang.Float fValueOf = java.lang.Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = fValueOf;
            if (fValueOf.floatValue() > this.zzc + ((java.lang.Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziX)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else {
                if (this.zzd.floatValue() < this.zzc - ((java.lang.Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziX)).floatValue()) {
                    this.zzc = this.zzd.floatValue();
                    this.zzg = true;
                }
            }
            if (this.zzd.isInfinite()) {
                this.zzd = java.lang.Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = jCurrentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                com.google.android.gms.internal.ads.zzdug zzdugVar = this.zzi;
                if (zzdugVar != null) {
                    if (i == ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziZ)).intValue()) {
                        com.google.android.gms.internal.ads.zzduv zzduvVar = (com.google.android.gms.internal.ads.zzduv) zzdugVar;
                        zzduvVar.zzh(new com.google.android.gms.internal.ads.zzdut(zzduvVar), com.google.android.gms.internal.ads.zzduu.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzc() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziW)).booleanValue()) {
                if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzj = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zza == null || this.zzb == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzdug zzdugVar) {
        this.zzi = zzdugVar;
    }
}
