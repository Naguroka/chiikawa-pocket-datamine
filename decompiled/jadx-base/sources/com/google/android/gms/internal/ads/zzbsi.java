package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzbsi {
    private final com.google.android.gms.internal.ads.zzcex zza;
    private final java.lang.String zzb;

    public zzbsi(com.google.android.gms.internal.ads.zzcex zzcexVar, java.lang.String str) {
        this.zza = zzcexVar;
        this.zzb = str;
    }

    public final void zzg(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onDefaultPositionReceived", new org.json.JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzh(java.lang.String str) {
        try {
            org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, str).put("action", this.zzb);
            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
            if (zzcexVar != null) {
                zzcexVar.zze("onError", jSONObjectPut);
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzi(java.lang.String str) {
        try {
            this.zza.zze("onReadyEventReceived", new org.json.JSONObject().put("js", str));
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zze("onScreenInfoChanged", new org.json.JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(androidx.constraintlayout.motion.widget.Key.ROTATION, i5));
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzk(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onSizeChanged", new org.json.JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzl(java.lang.String str) {
        try {
            this.zza.zze("onStateChanged", new org.json.JSONObject().put("state", str));
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
