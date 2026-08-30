package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzagq extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagq> CREATOR = new com.google.android.gms.internal.ads.zzagp();
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzfxn zzb;

    public zzagq(java.lang.String str, java.lang.String str2, java.util.List list) {
        super(str);
        com.google.android.gms.internal.ads.zzcw.zzd(!list.isEmpty());
        this.zza = str2;
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzl = com.google.android.gms.internal.ads.zzfxn.zzl(list);
        this.zzb = zzfxnVarZzl;
    }

    private static java.util.List zzb(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzagq zzagqVar = (com.google.android.gms.internal.ads.zzagq) obj;
            if (java.util.Objects.equals(this.zzf, zzagqVar.zzf) && java.util.Objects.equals(this.zza, zzagqVar.zza) && this.zzb.equals(zzagqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        java.lang.String str = this.zza;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final java.lang.String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + java.lang.String.valueOf(this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((java.lang.String[]) this.zzb.toArray(new java.lang.String[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzagh, com.google.android.gms.internal.ads.zzax
    public final void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
        switch (this.zzf) {
            case "TT2":
            case "TIT2":
                zzatVar.zzq((java.lang.CharSequence) this.zzb.get(0));
                break;
            case "TP1":
            case "TPE1":
                zzatVar.zze((java.lang.CharSequence) this.zzb.get(0));
                break;
            case "TP2":
            case "TPE2":
                zzatVar.zzc((java.lang.CharSequence) this.zzb.get(0));
                break;
            case "TAL":
            case "TALB":
                zzatVar.zzd((java.lang.CharSequence) this.zzb.get(0));
                break;
            case "TRK":
            case "TRCK":
                java.lang.String str = (java.lang.String) this.zzb.get(0);
                int i = com.google.android.gms.internal.ads.zzei.zza;
                java.lang.String[] strArrSplit = str.split("/", -1);
                try {
                    int i2 = java.lang.Integer.parseInt(strArrSplit[0]);
                    java.lang.Integer numValueOf = strArrSplit.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])) : null;
                    zzatVar.zzs(java.lang.Integer.valueOf(i2));
                    zzatVar.zzr(numValueOf);
                    break;
                } catch (java.lang.NumberFormatException unused) {
                    return;
                }
                break;
            case "TYE":
            case "TYER":
                try {
                    zzatVar.zzl(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) this.zzb.get(0))));
                    break;
                } catch (java.lang.NumberFormatException unused2) {
                    return;
                }
                break;
            case "TDA":
            case "TDAT":
                try {
                    java.lang.String str2 = (java.lang.String) this.zzb.get(0);
                    int i3 = java.lang.Integer.parseInt(str2.substring(2, 4));
                    int i4 = java.lang.Integer.parseInt(str2.substring(0, 2));
                    zzatVar.zzk(java.lang.Integer.valueOf(i3));
                    zzatVar.zzj(java.lang.Integer.valueOf(i4));
                    break;
                } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused3) {
                    return;
                }
                break;
            case "TDRC":
                java.util.List listZzb = zzb((java.lang.String) this.zzb.get(0));
                int size = listZzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzatVar.zzj((java.lang.Integer) listZzb.get(2));
                        }
                    }
                    zzatVar.zzk((java.lang.Integer) listZzb.get(1));
                }
                zzatVar.zzl((java.lang.Integer) listZzb.get(0));
                break;
            case "TDRL":
                java.util.List listZzb2 = zzb((java.lang.String) this.zzb.get(0));
                int size2 = listZzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzatVar.zzm((java.lang.Integer) listZzb2.get(2));
                        }
                    }
                    zzatVar.zzn((java.lang.Integer) listZzb2.get(1));
                }
                zzatVar.zzo((java.lang.Integer) listZzb2.get(0));
                break;
            case "TCM":
            case "TCOM":
                zzatVar.zzf((java.lang.CharSequence) this.zzb.get(0));
                break;
            case "TP3":
            case "TPE3":
                zzatVar.zzg((java.lang.CharSequence) this.zzb.get(0));
                break;
            case "TXT":
            case "TEXT":
                zzatVar.zzt((java.lang.CharSequence) this.zzb.get(0));
                break;
            case "TCON":
                java.lang.Integer numZzf = com.google.android.gms.internal.ads.zzgaq.zzf((java.lang.String) this.zzb.get(0), 10);
                if (numZzf == null) {
                    zzatVar.zzi((java.lang.CharSequence) this.zzb.get(0));
                    break;
                } else {
                    java.lang.String strZza = com.google.android.gms.internal.ads.zzagi.zza(numZzf.intValue());
                    if (strZza != null) {
                        zzatVar.zzi(strZza);
                    }
                    break;
                }
                break;
        }
    }
}
