package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class SubscribeRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.SubscribeRequest> CREATOR = new com.google.android.gms.nearby.messages.internal.zzcc();
    final int zza;
    public final com.google.android.gms.nearby.messages.internal.zzo zzb;
    public final com.google.android.gms.nearby.messages.Strategy zzc;
    public final com.google.android.gms.nearby.messages.internal.zzr zzd;
    public final com.google.android.gms.nearby.messages.MessageFilter zze;
    public final android.app.PendingIntent zzf;

    @java.lang.Deprecated
    public final int zzg;

    @java.lang.Deprecated
    public final java.lang.String zzh;

    @java.lang.Deprecated
    public final java.lang.String zzi;
    public final byte[] zzj;

    @java.lang.Deprecated
    public final boolean zzk;
    public final com.google.android.gms.nearby.messages.internal.zzab zzl;

    @java.lang.Deprecated
    public final boolean zzm;

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.messages.internal.ClientAppContext zzn;
    public final boolean zzo;
    public final int zzp;
    public final int zzq;

    public SubscribeRequest(int i, android.os.IBinder iBinder, com.google.android.gms.nearby.messages.Strategy strategy, android.os.IBinder iBinder2, com.google.android.gms.nearby.messages.MessageFilter messageFilter, android.app.PendingIntent pendingIntent, int i2, java.lang.String str, java.lang.String str2, byte[] bArr, boolean z, android.os.IBinder iBinder3, boolean z2, com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        com.google.android.gms.nearby.messages.internal.zzo zzmVar;
        com.google.android.gms.nearby.messages.internal.zzr zzpVar;
        this.zza = i;
        com.google.android.gms.nearby.messages.internal.zzab zzzVar = null;
        if (iBinder == null) {
            zzmVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzmVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.nearby.messages.internal.zzo ? (com.google.android.gms.nearby.messages.internal.zzo) iInterfaceQueryLocalInterface : new com.google.android.gms.nearby.messages.internal.zzm(iBinder);
        }
        this.zzb = zzmVar;
        this.zzc = strategy;
        if (iBinder2 == null) {
            zzpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.nearby.messages.internal.zzr ? (com.google.android.gms.nearby.messages.internal.zzr) iInterfaceQueryLocalInterface2 : new com.google.android.gms.nearby.messages.internal.zzp(iBinder2);
        }
        this.zzd = zzpVar;
        this.zze = messageFilter;
        this.zzf = pendingIntent;
        this.zzg = i2;
        this.zzh = str;
        this.zzi = str2;
        this.zzj = bArr;
        this.zzk = z;
        if (iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            zzzVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.nearby.messages.internal.zzab ? (com.google.android.gms.nearby.messages.internal.zzab) iInterfaceQueryLocalInterface3 : new com.google.android.gms.nearby.messages.internal.zzz(iBinder3);
        }
        this.zzl = zzzVar;
        this.zzm = z2;
        this.zzn = com.google.android.gms.nearby.messages.internal.ClientAppContext.zza(clientAppContext, str2, str, z2);
        this.zzo = z3;
        this.zzp = i3;
        this.zzq = i4;
    }

    public final java.lang.String toString() {
        java.lang.String string;
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.zzc);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.zzd);
        java.lang.String strValueOf4 = java.lang.String.valueOf(this.zze);
        java.lang.String strValueOf5 = java.lang.String.valueOf(this.zzf);
        byte[] bArr = this.zzj;
        if (bArr == null) {
            string = null;
        } else {
            int length = bArr.length;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
            sb.append("<");
            sb.append(length);
            sb.append(" bytes>");
            string = sb.toString();
        }
        java.lang.String strValueOf6 = java.lang.String.valueOf(this.zzl);
        boolean z = this.zzm;
        java.lang.String strValueOf7 = java.lang.String.valueOf(this.zzn);
        boolean z2 = this.zzo;
        java.lang.String str = this.zzh;
        java.lang.String str2 = this.zzi;
        boolean z3 = this.zzk;
        int i = this.zzq;
        int length2 = java.lang.String.valueOf(strValueOf).length();
        int length3 = java.lang.String.valueOf(strValueOf2).length();
        int length4 = java.lang.String.valueOf(strValueOf3).length();
        int length5 = java.lang.String.valueOf(strValueOf4).length();
        int length6 = java.lang.String.valueOf(strValueOf5).length();
        int length7 = java.lang.String.valueOf(string).length();
        int length8 = java.lang.String.valueOf(strValueOf6).length();
        int length9 = java.lang.String.valueOf(strValueOf7).length();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length2 + 291 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str2).length());
        sb2.append("SubscribeRequest{messageListener=");
        sb2.append(strValueOf);
        sb2.append(", strategy=");
        sb2.append(strValueOf2);
        sb2.append(", callback=");
        sb2.append(strValueOf3);
        sb2.append(", filter=");
        sb2.append(strValueOf4);
        sb2.append(", pendingIntent=");
        sb2.append(strValueOf5);
        sb2.append(", hint=");
        sb2.append(string);
        sb2.append(", subscribeCallback=");
        sb2.append(strValueOf6);
        sb2.append(", useRealClientApiKey=");
        sb2.append(z);
        sb2.append(", clientAppContext=");
        sb2.append(strValueOf7);
        sb2.append(", isDiscardPendingIntent=");
        sb2.append(z2);
        sb2.append(", zeroPartyPackageName=");
        sb2.append(str);
        sb2.append(", realClientPackageName=");
        sb2.append(str2);
        sb2.append(", isIgnoreNearbyPermission=");
        sb2.append(z3);
        sb2.append(", callingContext=");
        sb2.append(i);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.nearby.messages.internal.zzo zzoVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzoVar == null ? null : zzoVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.nearby.messages.internal.zzr zzrVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzrVar == null ? null : zzrVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 10, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        com.google.android.gms.nearby.messages.internal.zzab zzabVar = this.zzl;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 12, zzabVar != null ? zzabVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 15, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 17, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public SubscribeRequest(android.os.IBinder iBinder, com.google.android.gms.nearby.messages.Strategy strategy, android.os.IBinder iBinder2, com.google.android.gms.nearby.messages.MessageFilter messageFilter, android.app.PendingIntent pendingIntent, byte[] bArr, android.os.IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, null, null, null, false, iBinder3, false, null, false, 0, i2);
    }
}
