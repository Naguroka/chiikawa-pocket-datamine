package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class SignInConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.internal.SignInConfiguration> CREATOR = new com.google.android.gms.auth.api.signin.internal.zzx();
    private final java.lang.String zzbr;
    private com.google.android.gms.auth.api.signin.GoogleSignInOptions zzbs;

    public SignInConfiguration(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        this.zzbr = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzbs = googleSignInOptions;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zzm() {
        return this.zzbs;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzbr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzbs, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.signin.internal.SignInConfiguration)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) obj;
        if (this.zzbr.equals(signInConfiguration.zzbr)) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = this.zzbs;
            if (googleSignInOptions == null) {
                if (signInConfiguration.zzbs == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.zzbs)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new com.google.android.gms.auth.api.signin.internal.HashAccumulator().addObject(this.zzbr).addObject(this.zzbs).hash();
    }
}
