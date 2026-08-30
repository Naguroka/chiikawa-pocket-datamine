package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbk {
    public final java.lang.String zza;
    public java.lang.String zzb;
    public com.google.android.gms.internal.ads.zzbvk zzd;
    public android.os.Bundle zze;
    private long zzg;
    private long zzh;
    public java.lang.String zzc = null;
    public android.os.Bundle zzf = new android.os.Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public zzbk(android.util.JsonReader jsonReader, com.google.android.gms.internal.ads.zzbvk zzbvkVar) throws java.io.IOException {
        android.os.Bundle bundle;
        byte b;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = zzbvkVar;
        java.util.HashMap map = new java.util.HashMap();
        jsonReader.beginObject();
        java.lang.String strNextString = "";
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b = 2;
                    break;
                case "params":
                    b = 0;
                    break;
                case "signal_dictionary":
                    b = 1;
                    break;
                case "end_time":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                strNextString = jsonReader.nextString();
            } else if (b == 1) {
                map = new java.util.HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b == 2) {
                this.zzg = jsonReader.nextLong();
            } else if (b != 3) {
                jsonReader.skipValue();
            } else {
                this.zzh = jsonReader.nextLong();
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() || zzbvkVar == null || (bundle = zzbvkVar.zzm) == null) {
            return;
        }
        bundle.putLong(com.google.android.gms.internal.ads.zzdre.GET_SIGNALS_SDKCORE_START.zza(), this.zzg);
        zzbvkVar.zzm.putLong(com.google.android.gms.internal.ads.zzdre.GET_SIGNALS_SDKCORE_END.zza(), this.zzh);
    }
}
