package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzagz implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagz> CREATOR = new com.google.android.gms.internal.ads.zzagw();
    public final java.util.List zza;

    public zzagz(java.util.List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((com.google.android.gms.internal.ads.zzagy) list.get(0)).zzb;
            for (int i = 1; i < list.size(); i++) {
                if (((com.google.android.gms.internal.ads.zzagy) list.get(i)).zza < j) {
                    z = true;
                    break;
                }
                j = ((com.google.android.gms.internal.ads.zzagy) list.get(i)).zzb;
            }
        }
        com.google.android.gms.internal.ads.zzcw.zzd(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((com.google.android.gms.internal.ads.zzagz) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
    }
}
