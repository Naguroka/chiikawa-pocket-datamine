package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public final class HintRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.HintRequest> CREATOR = new com.google.android.gms.auth.api.credentials.zzj();
    private final java.lang.String[] zzaa;
    private final boolean zzad;
    private final java.lang.String zzae;
    private final java.lang.String zzaf;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzah;
    private final boolean zzai;
    private final boolean zzaj;
    private final int zzu;

    HintRequest(int i, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, java.lang.String[] strArr, boolean z3, java.lang.String str, java.lang.String str2) {
        this.zzu = i;
        this.zzah = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialPickerConfig);
        this.zzai = z;
        this.zzaj = z2;
        this.zzaa = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.zzad = true;
            this.zzae = null;
            this.zzaf = null;
        } else {
            this.zzad = z3;
            this.zzae = str;
            this.zzaf = str2;
        }
    }

    public static final class Builder {
        private java.lang.String[] zzaa;
        private java.lang.String zzae;
        private java.lang.String zzaf;
        private boolean zzai;
        private boolean zzaj;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzah = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        private boolean zzad = false;

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setEmailAddressIdentifierSupported(boolean z) {
            this.zzai = z;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setPhoneNumberIdentifierSupported(boolean z) {
            this.zzaj = z;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setAccountTypes(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.zzaa = strArr;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zzah = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setIdTokenRequested(boolean z) {
            this.zzad = z;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setServerClientId(java.lang.String str) {
            this.zzae = str;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setIdTokenNonce(java.lang.String str) {
            this.zzaf = str;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest build() {
            if (this.zzaa == null) {
                this.zzaa = new java.lang.String[0];
            }
            if (!this.zzai && !this.zzaj && this.zzaa.length == 0) {
                throw new java.lang.IllegalStateException("At least one authentication method must be specified");
            }
            return new com.google.android.gms.auth.api.credentials.HintRequest(this);
        }
    }

    private HintRequest(com.google.android.gms.auth.api.credentials.HintRequest.Builder builder) {
        this(2, builder.zzah, builder.zzai, builder.zzaj, builder.zzaa, builder.zzad, builder.zzae, builder.zzaf);
    }

    public final com.google.android.gms.auth.api.credentials.CredentialPickerConfig getHintPickerConfig() {
        return this.zzah;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzai;
    }

    public final java.lang.String[] getAccountTypes() {
        return this.zzaa;
    }

    public final boolean isIdTokenRequested() {
        return this.zzad;
    }

    public final java.lang.String getServerClientId() {
        return this.zzae;
    }

    public final java.lang.String getIdTokenNonce() {
        return this.zzaf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzaj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
