package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzho {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private final android.os.Bundle zzc;
    private android.os.Bundle zzd;

    public zzho(com.google.android.gms.measurement.internal.zzht zzhtVar, java.lang.String str, android.os.Bundle bundle) {
        this.zza = zzhtVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new android.os.Bundle();
    }

    public final void zzb(android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzht zzhtVar;
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        com.google.android.gms.measurement.internal.zzht zzhtVar2 = this.zza;
        android.content.SharedPreferences.Editor editorEdit = zzhtVar2.zzb().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            java.lang.String str = this.zzb;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str2 : bundle2.keySet()) {
                java.lang.Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.json.zb.q, str2);
                        com.google.android.gms.internal.measurement.zzqr.zzb();
                        com.google.android.gms.measurement.internal.zzio zzioVar = zzhtVar2.zzu;
                        zzhtVar = zzhtVar2;
                        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaW)) {
                            try {
                                if (obj instanceof java.lang.String) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                                } else if (obj instanceof java.lang.Long) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE);
                                } else if (obj instanceof int[]) {
                                    jSONObject.put("v", java.util.Arrays.toString((int[]) obj));
                                    jSONObject.put("t", "ia");
                                } else if (obj instanceof long[]) {
                                    jSONObject.put("v", java.util.Arrays.toString((long[]) obj));
                                    jSONObject.put("t", "la");
                                } else if (obj instanceof java.lang.Double) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", "d");
                                } else {
                                    zzioVar.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                }
                                jSONArray.put(jSONObject);
                            } catch (org.json.JSONException e) {
                                e = e;
                                this.zza.zzu.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences", e);
                            }
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof java.lang.String) {
                                jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                            } else if (obj instanceof java.lang.Long) {
                                jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE);
                            } else if (obj instanceof java.lang.Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzioVar.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (org.json.JSONException e2) {
                        e = e2;
                        zzhtVar = zzhtVar2;
                    }
                    zzhtVar2 = zzhtVar;
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    public final android.os.Bundle zza() {
        byte b;
        if (this.zzd == null) {
            com.google.android.gms.measurement.internal.zzht zzhtVar = this.zza;
            java.lang.String string = zzhtVar.zzb().getString(this.zzb, null);
            if (string != null) {
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                            java.lang.String string2 = jSONObject.getString(com.json.zb.q);
                            java.lang.String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (string3.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                } else if (string3.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE)) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (string3.equals("d")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b == 1) {
                                bundle.putDouble(string2, java.lang.Double.parseDouble(jSONObject.getString("v")));
                            } else if (b == 2) {
                                bundle.putLong(string2, java.lang.Long.parseLong(jSONObject.getString("v")));
                            } else if (b == 3) {
                                com.google.android.gms.internal.measurement.zzqr.zzb();
                                if (zzhtVar.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaW)) {
                                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i2 = 0; i2 < length; i2++) {
                                        iArr[i2] = jSONArray2.optInt(i2);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (b != 4) {
                                zzhtVar.zzu.zzaW().zze().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                com.google.android.gms.internal.measurement.zzqr.zzb();
                                if (zzhtVar.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaW)) {
                                    org.json.JSONArray jSONArray3 = new org.json.JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i3 = 0; i3 < length2; i3++) {
                                        jArr[i3] = jSONArray3.optLong(i3);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (java.lang.NumberFormatException | org.json.JSONException unused) {
                            this.zza.zzu.zzaW().zze().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (org.json.JSONException unused2) {
                    this.zza.zzu.zzaW().zze().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new android.os.Bundle((android.os.Bundle) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd));
    }
}
