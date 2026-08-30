package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes4.dex */
public class SignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.SignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.zzd();

    @java.lang.Deprecated
    private java.lang.String zzba;
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount zzbb;

    @java.lang.Deprecated
    private java.lang.String zzbc;

    SignInAccount(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, java.lang.String str2) {
        this.zzbb = googleSignInAccount;
        this.zzba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzbc = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @javax.annotation.Nullable
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzbb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzba, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzbb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzbc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
