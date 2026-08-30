package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public class zzkq extends java.io.IOException {
    private com.google.android.gms.internal.drive.zzlq zzsq;

    public zzkq(java.lang.String str) {
        super(str);
        this.zzsq = null;
    }

    public final com.google.android.gms.internal.drive.zzkq zzg(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        this.zzsq = zzlqVar;
        return this;
    }

    static com.google.android.gms.internal.drive.zzkq zzdi() {
        return new com.google.android.gms.internal.drive.zzkq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static com.google.android.gms.internal.drive.zzkq zzdj() {
        return new com.google.android.gms.internal.drive.zzkq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.android.gms.internal.drive.zzkq zzdk() {
        return new com.google.android.gms.internal.drive.zzkq("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.drive.zzkr zzdl() {
        return new com.google.android.gms.internal.drive.zzkr("Protocol message tag had invalid wire type.");
    }

    static com.google.android.gms.internal.drive.zzkq zzdm() {
        return new com.google.android.gms.internal.drive.zzkq("Failed to parse the message.");
    }

    static com.google.android.gms.internal.drive.zzkq zzdn() {
        return new com.google.android.gms.internal.drive.zzkq("Protocol message had invalid UTF-8.");
    }
}
