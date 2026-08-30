package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbq {
    private java.lang.String zza;

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    zzfbq(android.util.JsonReader jsonReader) throws java.io.IOException {
        byte b;
        jsonReader.beginObject();
        java.lang.String strNextString = "";
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (strNextName.equals("description")) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                jsonReader.nextInt();
            } else if (b != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = strNextString;
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
