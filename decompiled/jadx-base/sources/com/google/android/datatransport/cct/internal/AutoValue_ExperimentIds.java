package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ExperimentIds extends com.google.android.datatransport.cct.internal.ExperimentIds {
    private final byte[] clearBlob;
    private final byte[] encryptedBlob;

    private AutoValue_ExperimentIds(byte[] bArr, byte[] bArr2) {
        this.clearBlob = bArr;
        this.encryptedBlob = bArr2;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public byte[] getClearBlob() {
        return this.clearBlob;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public byte[] getEncryptedBlob() {
        return this.encryptedBlob;
    }

    public java.lang.String toString() {
        return "ExperimentIds{clearBlob=" + java.util.Arrays.toString(this.clearBlob) + ", encryptedBlob=" + java.util.Arrays.toString(this.encryptedBlob) + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ExperimentIds)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ExperimentIds experimentIds = (com.google.android.datatransport.cct.internal.ExperimentIds) obj;
        boolean z = experimentIds instanceof com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds;
        if (java.util.Arrays.equals(this.clearBlob, z ? ((com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds) experimentIds).clearBlob : experimentIds.getClearBlob())) {
            if (java.util.Arrays.equals(this.encryptedBlob, z ? ((com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds) experimentIds).encryptedBlob : experimentIds.getEncryptedBlob())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((java.util.Arrays.hashCode(this.clearBlob) ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.encryptedBlob);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ExperimentIds.Builder {
        private byte[] clearBlob;
        private byte[] encryptedBlob;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public com.google.android.datatransport.cct.internal.ExperimentIds.Builder setClearBlob(byte[] bArr) {
            this.clearBlob = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public com.google.android.datatransport.cct.internal.ExperimentIds.Builder setEncryptedBlob(byte[] bArr) {
            this.encryptedBlob = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public com.google.android.datatransport.cct.internal.ExperimentIds build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds(this.clearBlob, this.encryptedBlob);
        }
    }
}
