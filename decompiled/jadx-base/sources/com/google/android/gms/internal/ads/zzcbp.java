package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcbp extends com.google.android.gms.internal.ads.zzfqz {
    private final android.hardware.SensorManager zza;
    private final java.lang.Object zzb;
    private final android.view.Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private android.os.Handler zzg;
    private com.google.android.gms.internal.ads.zzcbo zzh;

    zzcbp(android.content.Context context) {
        super("OrientationMonitor", "ads");
        this.zza = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.zzc = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzb = new java.lang.Object();
    }

    @Override // com.google.android.gms.internal.ads.zzfqz
    public final void zza(android.hardware.SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzf == null) {
                this.zzf = new float[9];
            }
        }
        android.hardware.SensorManager.getRotationMatrixFromVector(this.zzd, fArr);
        int rotation = this.zzc.getRotation();
        if (rotation == 1) {
            android.hardware.SensorManager.remapCoordinateSystem(this.zzd, 2, 129, this.zze);
        } else if (rotation == 2) {
            android.hardware.SensorManager.remapCoordinateSystem(this.zzd, 129, 130, this.zze);
        } else if (rotation != 3) {
            java.lang.System.arraycopy(this.zzd, 0, this.zze, 0, 9);
        } else {
            android.hardware.SensorManager.remapCoordinateSystem(this.zzd, 130, 1, this.zze);
        }
        float[] fArr2 = this.zze;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.zzb) {
            java.lang.System.arraycopy(this.zze, 0, this.zzf, 0, 9);
        }
        com.google.android.gms.internal.ads.zzcbo zzcboVar = this.zzh;
        if (zzcboVar != null) {
            zzcboVar.zza();
        }
    }

    final void zzb(com.google.android.gms.internal.ads.zzcbo zzcboVar) {
        this.zzh = zzcboVar;
    }

    final void zzc() {
        if (this.zzg != null) {
            return;
        }
        android.hardware.Sensor defaultSensor = this.zza.getDefaultSensor(11);
        if (defaultSensor == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("OrientationMonitor");
        handlerThread.start();
        com.google.android.gms.internal.ads.zzfqw zzfqwVar = new com.google.android.gms.internal.ads.zzfqw(handlerThread.getLooper());
        this.zzg = zzfqwVar;
        if (this.zza.registerListener(this, defaultSensor, 0, zzfqwVar)) {
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzg("SensorManager.registerListener failed.");
        zzd();
    }

    final void zzd() {
        if (this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new com.google.android.gms.internal.ads.zzcbn(this));
        this.zzg = null;
    }

    final boolean zze(float[] fArr) {
        synchronized (this.zzb) {
            float[] fArr2 = this.zzf;
            if (fArr2 == null) {
                return false;
            }
            java.lang.System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }
}
