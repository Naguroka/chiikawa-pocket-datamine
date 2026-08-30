package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public class Credential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.Credential> CREATOR = new com.google.android.gms.auth.api.credentials.zzc();
    public static final java.lang.String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    @javax.annotation.Nonnull
    private final java.lang.String mId;
    private final java.lang.String mName;
    private final android.net.Uri zzo;

    @javax.annotation.Nonnull
    private final java.util.List<com.google.android.gms.auth.api.credentials.IdToken> zzp;
    private final java.lang.String zzq;
    private final java.lang.String zzr;
    private final java.lang.String zzs;
    private final java.lang.String zzt;

    Credential(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.util.List<com.google.android.gms.auth.api.credentials.IdToken> list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.String strTrim = ((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strTrim, "credential identifier cannot be empty");
        if (str3 != null && android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!android.text.TextUtils.isEmpty(str4)) {
                android.net.Uri uri2 = android.net.Uri.parse(str4);
                if (uri2.isAbsolute() && uri2.isHierarchical() && !android.text.TextUtils.isEmpty(uri2.getScheme()) && !android.text.TextUtils.isEmpty(uri2.getAuthority()) && (androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uri2.getScheme()) || "https".equalsIgnoreCase(uri2.getScheme()))) {
                    z = true;
                }
            }
            if (!java.lang.Boolean.valueOf(z).booleanValue()) {
                throw new java.lang.IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && android.text.TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.mName = str2;
        this.zzo = uri;
        this.zzp = list == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list);
        this.mId = strTrim;
        this.zzq = str3;
        this.zzr = str4;
        this.zzs = str5;
        this.zzt = str6;
    }

    public static class Builder {
        private final java.lang.String mId;
        private java.lang.String mName;
        private android.net.Uri zzo;
        private java.util.List<com.google.android.gms.auth.api.credentials.IdToken> zzp;
        private java.lang.String zzq;
        private java.lang.String zzr;
        private java.lang.String zzs;
        private java.lang.String zzt;

        public Builder(java.lang.String str) {
            this.mId = str;
        }

        public Builder(com.google.android.gms.auth.api.credentials.Credential credential) {
            this.mId = credential.mId;
            this.mName = credential.mName;
            this.zzo = credential.zzo;
            this.zzp = credential.zzp;
            this.zzq = credential.zzq;
            this.zzr = credential.zzr;
            this.zzs = credential.zzs;
            this.zzt = credential.zzt;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setName(java.lang.String str) {
            this.mName = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setProfilePictureUri(android.net.Uri uri) {
            this.zzo = uri;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setPassword(java.lang.String str) {
            this.zzq = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setAccountType(java.lang.String str) {
            this.zzr = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential build() {
            return new com.google.android.gms.auth.api.credentials.Credential(this.mId, this.mName, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt);
        }
    }

    @javax.annotation.Nonnull
    public java.lang.String getId() {
        return this.mId;
    }

    public java.lang.String getName() {
        return this.mName;
    }

    public android.net.Uri getProfilePictureUri() {
        return this.zzo;
    }

    @javax.annotation.Nonnull
    public java.util.List<com.google.android.gms.auth.api.credentials.IdToken> getIdTokens() {
        return this.zzp;
    }

    public java.lang.String getPassword() {
        return this.zzq;
    }

    public java.lang.String getAccountType() {
        return this.zzr;
    }

    public java.lang.String getGivenName() {
        return this.zzs;
    }

    public java.lang.String getFamilyName() {
        return this.zzt;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.credentials.Credential)) {
            return false;
        }
        com.google.android.gms.auth.api.credentials.Credential credential = (com.google.android.gms.auth.api.credentials.Credential) obj;
        return android.text.TextUtils.equals(this.mId, credential.mId) && android.text.TextUtils.equals(this.mName, credential.mName) && com.google.android.gms.common.internal.Objects.equal(this.zzo, credential.zzo) && android.text.TextUtils.equals(this.zzq, credential.zzq) && android.text.TextUtils.equals(this.zzr, credential.zzr);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.mId, this.mName, this.zzo, this.zzq, this.zzr);
    }
}
