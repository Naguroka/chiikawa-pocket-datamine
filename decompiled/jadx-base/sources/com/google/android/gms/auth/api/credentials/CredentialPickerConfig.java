package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public final class CredentialPickerConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.CredentialPickerConfig> CREATOR = new com.google.android.gms.auth.api.credentials.zze();
    private final boolean mShowCancelButton;
    private final int zzu;
    private final boolean zzv;

    @java.lang.Deprecated
    private final boolean zzw;
    private final int zzx;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.zzu = i;
        this.zzv = z;
        this.mShowCancelButton = z2;
        if (i < 2) {
            this.zzw = z3;
            this.zzx = z3 ? 3 : 1;
        } else {
            this.zzw = i2 == 3;
            this.zzx = i2;
        }
    }

    public static class Builder {
        private boolean zzv = false;
        private boolean mShowCancelButton = true;
        private int zzy = 1;

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setShowAddAccountButton(boolean z) {
            this.zzv = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setShowCancelButton(boolean z) {
            this.mShowCancelButton = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setPrompt(int i) {
            this.zzy = i;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setForNewAccount(boolean z) {
            this.zzy = z ? 3 : 1;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig build() {
            return new com.google.android.gms.auth.api.credentials.CredentialPickerConfig(this);
        }
    }

    private CredentialPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder builder) {
        this(2, builder.zzv, builder.mShowCancelButton, false, builder.zzy);
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzv;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    @java.lang.Deprecated
    public final boolean isForNewAccount() {
        return this.zzx == 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
