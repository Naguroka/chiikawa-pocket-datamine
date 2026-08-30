package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzak extends com.google.android.gms.internal.play_billing.zzap implements com.google.android.gms.internal.play_billing.zzam {
    zzak(android.os.IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int zza(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(3);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        android.os.Parcel parcelZzt = zzt(5, parcelZzs);
        int i2 = parcelZzt.readInt();
        parcelZzt.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int zzc(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(i);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        android.os.Parcel parcelZzt = zzt(10, parcelZzs);
        int i2 = parcelZzt.readInt();
        parcelZzt.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final android.os.Bundle zzd(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(9);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        android.os.Parcel parcelZzt = zzt(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, parcelZzs);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcelZzt, android.os.Bundle.CREATOR);
        parcelZzt.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final android.os.Bundle zze(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(9);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        android.os.Parcel parcelZzt = zzt(12, parcelZzs);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcelZzt, android.os.Bundle.CREATOR);
        parcelZzt.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final android.os.Bundle zzf(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(3);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        parcelZzs.writeString(str3);
        parcelZzs.writeString(null);
        android.os.Parcel parcelZzt = zzt(3, parcelZzs);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcelZzt, android.os.Bundle.CREATOR);
        parcelZzt.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final android.os.Bundle zzg(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(i);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        parcelZzs.writeString(str3);
        parcelZzs.writeString(null);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        android.os.Parcel parcelZzt = zzt(8, parcelZzs);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcelZzt, android.os.Bundle.CREATOR);
        parcelZzt.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final android.os.Bundle zzh(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(3);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        parcelZzs.writeString(str3);
        android.os.Parcel parcelZzt = zzt(4, parcelZzs);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcelZzt, android.os.Bundle.CREATOR);
        parcelZzt.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final android.os.Bundle zzi(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(i);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        parcelZzs.writeString(str3);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        android.os.Parcel parcelZzt = zzt(11, parcelZzs);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcelZzt, android.os.Bundle.CREATOR);
        parcelZzt.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final android.os.Bundle zzj(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(i);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle2);
        android.os.Parcel parcelZzt = zzt(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT, parcelZzs);
        android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcelZzt, android.os.Bundle.CREATOR);
        parcelZzt.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzk(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzx zzxVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(21);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzxVar);
        zzv(1501, parcelZzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzl(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzz zzzVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(22);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzzVar);
        zzv(1801, parcelZzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzm(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzab zzabVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(21);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzabVar);
        zzv(com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, parcelZzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzn(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzad zzadVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(18);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzadVar);
        zzu(1301, parcelZzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzo(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzaf zzafVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(22);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzafVar);
        zzv(1901, parcelZzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzp(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzah zzahVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(21);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzahVar);
        zzv(com.json.mediationsdk.utils.IronSourceConstants.RV_CAP_SESSION, parcelZzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzq(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzaj zzajVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(24);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzajVar);
        zzv(1701, parcelZzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zzr(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzao zzaoVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(12);
        parcelZzs.writeString(str);
        com.google.android.gms.internal.play_billing.zzar.zzc(parcelZzs, bundle);
        parcelZzs.writeStrongBinder(zzaoVar);
        zzu(1201, parcelZzs);
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int zzw(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeInt(i);
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        android.os.Parcel parcelZzt = zzt(1, parcelZzs);
        int i2 = parcelZzt.readInt();
        parcelZzt.recycle();
        return i2;
    }
}
