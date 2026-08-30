package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class GeofencingEvent {
    private final int zza;
    private final int zzb;
    private final java.util.List<com.google.android.gms.location.Geofence> zzc;
    private final android.location.Location zzd;

    private GeofencingEvent(int i, int i2, java.util.List<com.google.android.gms.location.Geofence> list, android.location.Location location) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = list;
        this.zzd = location;
    }

    public static com.google.android.gms.location.GeofencingEvent fromIntent(android.content.Intent intent) {
        java.util.ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(com.google.android.gms.common.internal.Constants.KEY_GMS_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 == 1 || intExtra2 == 2) {
                i = intExtra2;
            } else if (intExtra2 == 4) {
                i = 4;
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new java.util.ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = (byte[]) arrayList2.get(i2);
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                com.google.android.gms.internal.location.zzbe zzbeVarCreateFromParcel = com.google.android.gms.internal.location.zzbe.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                arrayList.add(zzbeVarCreateFromParcel);
            }
        }
        return new com.google.android.gms.location.GeofencingEvent(intExtra, i, arrayList, (android.location.Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    public int getErrorCode() {
        return this.zza;
    }

    public int getGeofenceTransition() {
        return this.zzb;
    }

    public java.util.List<com.google.android.gms.location.Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    public android.location.Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}
