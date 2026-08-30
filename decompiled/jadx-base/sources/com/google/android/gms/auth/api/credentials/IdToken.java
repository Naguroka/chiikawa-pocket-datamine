package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public final class IdToken extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.IdToken> CREATOR = new com.google.android.gms.auth.api.credentials.zzk();
    private final java.lang.String zzak;
    private final java.lang.String zzr;

    public IdToken(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str), "account type string cannot be null or empty");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.zzr = str;
        this.zzak = str2;
    }

    public final java.lang.String getAccountType() {
        return this.zzr;
    }

    public final java.lang.String getIdToken() {
        return this.zzak;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getAccountType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.credentials.IdToken)) {
            return false;
        }
        com.google.android.gms.auth.api.credentials.IdToken idToken = (com.google.android.gms.auth.api.credentials.IdToken) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzr, idToken.zzr) && com.google.android.gms.common.internal.Objects.equal(this.zzak, idToken.zzak);
    }
}
