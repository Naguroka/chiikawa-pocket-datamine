package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdvx extends com.google.android.gms.internal.ads.zzfqz {
    private final android.content.Context zza;

    @javax.annotation.Nullable
    private android.hardware.SensorManager zzb;
    private android.hardware.Sensor zzc;
    private long zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzdvw zzf;
    private boolean zzg;

    zzdvx(android.content.Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfqz
    public final void zza(android.hardware.SensorEvent sensorEvent) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziR)).booleanValue()) {
            float f = sensorEvent.values[0] / 9.80665f;
            float f2 = sensorEvent.values[1] / 9.80665f;
            float f3 = sensorEvent.values[2] / 9.80665f;
            if (((float) java.lang.Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((java.lang.Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziS)).floatValue()) {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                if (this.zzd + ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziT)).intValue()) <= jCurrentTimeMillis) {
                    if (this.zzd + ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziU)).intValue()) < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    com.google.android.gms.internal.ads.zzdvw zzdvwVar = this.zzf;
                    if (zzdvwVar != null) {
                        if (i == ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziV)).intValue()) {
                            com.google.android.gms.internal.ads.zzduv zzduvVar = (com.google.android.gms.internal.ads.zzduv) zzdvwVar;
                            zzduvVar.zzh(new com.google.android.gms.internal.ads.zzdus(zzduvVar), com.google.android.gms.internal.ads.zzduu.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzg) {
                android.hardware.SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzc() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziR)).booleanValue()) {
                if (this.zzb == null) {
                    android.hardware.SensorManager sensorManager2 = (android.hardware.SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziT)).intValue());
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzdvw zzdvwVar) {
        this.zzf = zzdvwVar;
    }
}
