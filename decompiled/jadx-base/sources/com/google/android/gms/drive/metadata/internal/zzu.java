package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.drive.UserMetadata> {
    public zzu(java.lang.String str, int i) {
        super(str, java.util.Arrays.asList(zza(str, "permissionId"), zza(str, "displayName"), zza(str, "picture"), zza(str, "isAuthenticatedUser"), zza(str, "emailAddress")), java.util.Collections.emptyList(), com.google.android.gms.common.util.GmsVersion.VERSION_MANCHEGO);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final boolean zzb(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return dataHolder.hasColumn(zzh("permissionId")) && !dataHolder.hasNull(zzh("permissionId"), i, i2);
    }

    private final java.lang.String zzh(java.lang.String str) {
        return zza(getName(), str);
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str2).length()).append(str).append(".").append(str2).toString();
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        java.lang.String string = dataHolder.getString(zzh("permissionId"), i, i2);
        if (string == null) {
            return null;
        }
        java.lang.String string2 = dataHolder.getString(zzh("displayName"), i, i2);
        java.lang.String string3 = dataHolder.getString(zzh("picture"), i, i2);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(dataHolder.getBoolean(zzh("isAuthenticatedUser"), i, i2));
        return new com.google.android.gms.drive.UserMetadata(string, string2, string3, boolValueOf.booleanValue(), dataHolder.getString(zzh("emailAddress"), i, i2));
    }
}
