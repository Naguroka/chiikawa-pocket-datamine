package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdOverlayInfoParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel> CREATOR = new com.google.android.gms.ads.internal.overlay.zzo();
    private static final java.util.concurrent.atomic.AtomicLong zzy = new java.util.concurrent.atomic.AtomicLong(0);
    private static final java.util.concurrent.ConcurrentHashMap zzz = new java.util.concurrent.ConcurrentHashMap();
    public final com.google.android.gms.ads.internal.overlay.zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final com.google.android.gms.ads.internal.overlay.zzr zzc;
    public final com.google.android.gms.internal.ads.zzcex zzd;
    public final com.google.android.gms.internal.ads.zzbih zze;
    public final java.lang.String zzf;
    public final boolean zzg;
    public final java.lang.String zzh;
    public final com.google.android.gms.ads.internal.overlay.zzac zzi;
    public final int zzj;
    public final int zzk;
    public final java.lang.String zzl;
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm;
    public final java.lang.String zzn;
    public final com.google.android.gms.ads.internal.zzl zzo;
    public final com.google.android.gms.internal.ads.zzbif zzp;
    public final java.lang.String zzq;
    public final java.lang.String zzr;
    public final java.lang.String zzs;
    public final com.google.android.gms.internal.ads.zzcwg zzt;
    public final com.google.android.gms.internal.ads.zzdds zzu;
    public final com.google.android.gms.internal.ads.zzbsx zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzbif zzbifVar, com.google.android.gms.internal.ads.zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.internal.ads.zzcex zzcexVar, boolean z, int i, java.lang.String str, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdds zzddsVar, com.google.android.gms.internal.ads.zzbsx zzbsxVar, boolean z2) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = zzbifVar;
        this.zze = zzbihVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = zzbsxVar;
        this.zzw = z2;
        this.zzx = zzy.getAndIncrement();
    }

    public static com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza(android.content.Intent intent) {
        try {
            android.os.Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.class.getClassLoader());
            return (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (java.lang.Exception e) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmL)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final android.os.IBinder zzc(java.lang.Object obj) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmL)).booleanValue()) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzc(this.zzb), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzc(this.zzc), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, zzc(this.zzd), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 6, zzc(this.zze), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 10, zzc(this.zzi), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 18, zzc(this.zzp), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 26, zzc(this.zzt), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 27, zzc(this.zzu), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 28, zzc(this.zzv), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 30, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmL)).booleanValue()) {
            zzz.put(java.lang.Long.valueOf(this.zzx), new com.google.android.gms.ads.internal.overlay.zzp(this.zzb, this.zzc, this.zzd, this.zzp, this.zze, this.zzi, this.zzt, this.zzu, this.zzv, com.google.android.gms.internal.ads.zzbzw.zzd.schedule(new com.google.android.gms.ads.internal.overlay.zzq(this.zzx), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmN)).intValue(), java.util.concurrent.TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzbif zzbifVar, com.google.android.gms.internal.ads.zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.internal.ads.zzcex zzcexVar, boolean z, int i, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdds zzddsVar, com.google.android.gms.internal.ads.zzbsx zzbsxVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = zzbifVar;
        this.zze = zzbihVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.internal.ads.zzcex zzcexVar, int i, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, com.google.android.gms.ads.internal.zzl zzlVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.zzcwg zzcwgVar, com.google.android.gms.internal.ads.zzbsx zzbsxVar, java.lang.String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaT)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcwgVar;
        this.zzu = null;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.internal.ads.zzcex zzcexVar, boolean z, int i, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdds zzddsVar, com.google.android.gms.internal.ads.zzbsx zzbsxVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    AdOverlayInfoParcel(com.google.android.gms.ads.internal.overlay.zzc zzcVar, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.os.IBinder iBinder3, android.os.IBinder iBinder4, java.lang.String str, boolean z, java.lang.String str2, android.os.IBinder iBinder5, int i, int i2, java.lang.String str3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str4, com.google.android.gms.ads.internal.zzl zzlVar, android.os.IBinder iBinder6, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.os.IBinder iBinder7, android.os.IBinder iBinder8, android.os.IBinder iBinder9, boolean z2, long j) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z2;
        this.zzx = j;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmL)).booleanValue()) {
            com.google.android.gms.ads.internal.overlay.zzp zzpVar = (com.google.android.gms.ads.internal.overlay.zzp) zzz.remove(java.lang.Long.valueOf(j));
            if (zzpVar != null) {
                this.zzb = zzpVar.zza;
                this.zzc = zzpVar.zzb;
                this.zzd = zzpVar.zzc;
                this.zzp = zzpVar.zzd;
                this.zze = zzpVar.zze;
                this.zzt = zzpVar.zzg;
                this.zzu = zzpVar.zzh;
                this.zzv = zzpVar.zzi;
                this.zzi = zzpVar.zzf;
                zzpVar.zzj.cancel(false);
                return;
            }
            throw new java.lang.NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (com.google.android.gms.ads.internal.overlay.zzr) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (com.google.android.gms.internal.ads.zzcex) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (com.google.android.gms.internal.ads.zzbif) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (com.google.android.gms.internal.ads.zzbih) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzi = (com.google.android.gms.ads.internal.overlay.zzac) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzt = (com.google.android.gms.internal.ads.zzcwg) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (com.google.android.gms.internal.ads.zzdds) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (com.google.android.gms.internal.ads.zzbsx) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder9));
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.overlay.zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzdds zzddsVar, java.lang.String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzcex zzcexVar, int i, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, java.lang.String str2, int i, com.google.android.gms.internal.ads.zzbsx zzbsxVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
