package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public final class CredentialRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.CredentialRequest> CREATOR = new com.google.android.gms.auth.api.credentials.zzg();
    private final java.lang.String[] zzaa;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzab;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzac;
    private final boolean zzad;
    private final java.lang.String zzae;
    private final java.lang.String zzaf;
    private final boolean zzag;
    private final int zzu;
    private final boolean zzz;

    CredentialRequest(int i, boolean z, java.lang.String[] strArr, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig2, boolean z2, java.lang.String str, java.lang.String str2, boolean z3) {
        this.zzu = i;
        this.zzz = z;
        this.zzaa = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        this.zzab = credentialPickerConfig == null ? new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build() : credentialPickerConfig;
        this.zzac = credentialPickerConfig2 == null ? new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build() : credentialPickerConfig2;
        if (i < 3) {
            this.zzad = true;
            this.zzae = null;
            this.zzaf = null;
        } else {
            this.zzad = z2;
            this.zzae = str;
            this.zzaf = str2;
        }
        this.zzag = z3;
    }

    public static final class Builder {
        private java.lang.String[] zzaa;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzab;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzac;
        private java.lang.String zzaf;
        private boolean zzz;
        private boolean zzad = false;
        private boolean zzag = false;
        private java.lang.String zzae = null;

        @java.lang.Deprecated
        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setSupportsPasswordLogin(boolean z) {
            return setPasswordLoginSupported(z);
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setPasswordLoginSupported(boolean z) {
            this.zzz = z;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setAccountTypes(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.zzaa = strArr;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setCredentialPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zzab = credentialPickerConfig;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setCredentialHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zzac = credentialPickerConfig;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setIdTokenRequested(boolean z) {
            this.zzad = z;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setServerClientId(java.lang.String str) {
            this.zzae = str;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setIdTokenNonce(java.lang.String str) {
            this.zzaf = str;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest build() {
            if (this.zzaa == null) {
                this.zzaa = new java.lang.String[0];
            }
            if (!this.zzz && this.zzaa.length == 0) {
                throw new java.lang.IllegalStateException("At least one authentication method must be specified");
            }
            return new com.google.android.gms.auth.api.credentials.CredentialRequest(this);
        }
    }

    private CredentialRequest(com.google.android.gms.auth.api.credentials.CredentialRequest.Builder builder) {
        this(4, builder.zzz, builder.zzaa, builder.zzab, builder.zzac, builder.zzad, builder.zzae, builder.zzaf, false);
    }

    @java.lang.Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzz;
    }

    public final java.lang.String[] getAccountTypes() {
        return this.zzaa;
    }

    public final java.util.Set<java.lang.String> getAccountTypesSet() {
        return new java.util.HashSet(java.util.Arrays.asList(this.zzaa));
    }

    public final com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzab;
    }

    public final com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzac;
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getCredentialPickerConfig(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzag);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
