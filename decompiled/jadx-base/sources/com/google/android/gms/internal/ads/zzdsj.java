package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdsj {
    private final com.google.android.gms.common.util.Clock zza;

    public zzdsj(com.google.android.gms.common.util.Clock clock) {
        this.zza = clock;
    }

    public final void zza(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzben.zza.zze()).booleanValue()) {
            long jCurrentTimeMillis = this.zza.currentTimeMillis();
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(com.ironsource.aa.a.d).value(jCurrentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(androidx.core.app.NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    java.lang.Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (java.io.IOException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("unable to log", e);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AD-DBG ".concat(java.lang.String.valueOf(stringWriter.toString())));
        }
    }
}
