package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class zzafp implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafp> CREATOR = new com.google.android.gms.internal.ads.zzafo();
    public final java.lang.String zza;
    public final java.lang.String zzb;

    protected zzafp(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) obj;
            if (this.zza.equals(zzafpVar.zza) && this.zzb.equals(zzafpVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        return "VC: " + this.zza + com.ironsource.y8.i.b + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzax
    public final void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
        byte b;
        switch (this.zza) {
            case "ALBUM":
                b = 2;
                break;
            case "TITLE":
                b = 0;
                break;
            case "DESCRIPTION":
                b = 4;
                break;
            case "ALBUMARTIST":
                b = 3;
                break;
            case "ARTIST":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            zzatVar.zzq(this.zzb);
            return;
        }
        if (b == 1) {
            zzatVar.zze(this.zzb);
            return;
        }
        if (b == 2) {
            zzatVar.zzd(this.zzb);
        } else if (b == 3) {
            zzatVar.zzc(this.zzb);
        } else {
            if (b != 4) {
                return;
            }
            zzatVar.zzh(this.zzb);
        }
    }

    public zzafp(java.lang.String str, java.lang.String str2) {
        this.zza = com.google.android.gms.internal.ads.zzftt.zzb(str);
        this.zzb = str2;
    }
}
