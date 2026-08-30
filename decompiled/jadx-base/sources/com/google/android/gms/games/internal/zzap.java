package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzap extends com.google.android.gms.internal.games_v2.zza implements android.os.IInterface {
    zzap(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void zzA(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(6504, parcelZza);
    }

    public final void zzB(com.google.android.gms.games.internal.zzam zzamVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(6503, parcelZza);
    }

    public final void zzC(com.google.android.gms.games.internal.zzam zzamVar, android.os.Bundle bundle, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        zzc(5021, parcelZza);
    }

    public final void zzD(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, int i, int i2, int i3, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(5020, parcelZza);
    }

    public final void zzE(com.google.android.gms.games.internal.zzam zzamVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(17001, parcelZza);
    }

    public final void zzF(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(13006, parcelZza);
    }

    public final void zzG(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, int i, boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z2);
        zzc(9020, parcelZza);
    }

    public final void zzH(com.google.android.gms.games.internal.zzam zzamVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(12002, parcelZza);
    }

    public final void zzI(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, int i, int i2, int i3, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(5019, parcelZza);
    }

    public final void zzJ(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, boolean z, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        parcelZza.writeInt(i);
        zzc(15001, parcelZza);
    }

    public final void zzK(com.google.android.gms.games.internal.zzao zzaoVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzaoVar);
        parcelZza.writeLong(j);
        zzc(15501, parcelZza);
    }

    public final void zzL(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(27003, parcelZza);
    }

    public final void zzM(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, com.google.android.gms.drive.Contents contents) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, contents);
        zzc(12033, parcelZza);
    }

    public final void zzN(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(5023, parcelZza);
    }

    public final void zzO(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, int i, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(7003, parcelZza);
    }

    public final void zzP(android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(com.json.mediationsdk.utils.IronSourceConstants.errorCode_loadException, parcelZza);
    }

    public final void zzQ(com.google.android.gms.games.internal.zzam zzamVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        zzc(5002, parcelZza);
    }

    public final void zzR(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, long j, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        parcelZza.writeString(str2);
        zzc(7002, parcelZza);
    }

    public final void zzS(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(5024, parcelZza);
    }

    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(12036, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    public final int zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(12035, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    public final android.app.PendingIntent zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(25015, zza());
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.app.PendingIntent.CREATOR);
        parcelZzb.recycle();
        return pendingIntent;
    }

    public final android.content.Intent zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(9005, zza());
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.content.Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final android.content.Intent zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(9003, zza());
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.content.Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final android.content.Intent zzi(com.google.android.gms.games.PlayerEntity playerEntity) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, playerEntity);
        android.os.Parcel parcelZzb = zzb(15503, parcelZza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.content.Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final android.content.Intent zzj(java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        android.os.Parcel parcelZzb = zzb(25016, parcelZza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.content.Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final android.content.Intent zzk(java.lang.String str, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        android.os.Parcel parcelZzb = zzb(18001, parcelZza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.content.Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final android.content.Intent zzl() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(9010, zza());
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.content.Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final android.content.Intent zzm(java.lang.String str, boolean z, boolean z2, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z2);
        parcelZza.writeInt(i);
        android.os.Parcel parcelZzb = zzb(12001, parcelZza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, android.content.Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final com.google.android.gms.common.data.DataHolder zzn() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(5013, zza());
        com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, com.google.android.gms.common.data.DataHolder.CREATOR);
        parcelZzb.recycle();
        return dataHolder;
    }

    public final java.lang.String zzo() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(5012, zza());
        java.lang.String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    public final void zzp() throws android.os.RemoteException {
        zzc(com.json.mediationsdk.utils.IronSourceConstants.errorCode_showFailed, zza());
    }

    public final void zzq(long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(5001, parcelZza);
    }

    public final void zzr(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, com.google.android.gms.drive.Contents contents) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, contents);
        zzc(12007, parcelZza);
    }

    public final void zzs(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        zzc(12020, parcelZza);
    }

    public final void zzt(com.google.android.gms.drive.Contents contents) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, contents);
        zzc(12019, parcelZza);
    }

    public final void zzu(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, java.lang.String str2, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        zzc(com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_ALREADY_ADVERTISING, parcelZza);
    }

    public final void zzv(com.google.android.gms.games.internal.zzam zzamVar, java.lang.String str, int i, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(5025, parcelZza);
    }

    public final void zzw(java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        zzc(12017, parcelZza);
    }

    public final void zzx(com.google.android.gms.games.internal.zzam zzamVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(6001, parcelZza);
    }

    public final void zzy(com.google.android.gms.games.internal.zzam zzamVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(12016, parcelZza);
    }

    public final void zzz(com.google.android.gms.games.internal.zzam zzamVar, boolean z, java.lang.String[] strArr) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        parcelZza.writeStringArray(strArr);
        zzc(12031, parcelZza);
    }
}
