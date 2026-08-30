package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class MetadataChangeSet {
    public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
    public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 131072;
    public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
    public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
    public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
    public static final com.google.android.gms.drive.MetadataChangeSet zzax = new com.google.android.gms.drive.MetadataChangeSet(com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbe());
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzay;

    public MetadataChangeSet(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzay = metadataBundle.zzbf();
    }

    public static class Builder {
        private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzay = com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbe();
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzaz;

        private final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzr() {
            if (this.zzaz == null) {
                this.zzaz = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza();
            }
            return this.zzaz;
        }

        private static int zzb(java.lang.String str) {
            if (str == null) {
                return 0;
            }
            return str.getBytes().length;
        }

        private static void zza(java.lang.String str, int i, int i2) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 <= i, java.lang.String.format(java.util.Locale.US, "%s must be no more than %d bytes, but is %d bytes.", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setCustomProperty(com.google.android.gms.drive.metadata.CustomPropertyKey customPropertyKey, java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(customPropertyKey, com.ironsource.y8.h.W);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "value");
            zza("The total size of key string and value string of a custom property", 124, zzb(customPropertyKey.getKey()) + zzb(str));
            zzr().zza(customPropertyKey, str);
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder deleteCustomProperty(com.google.android.gms.drive.metadata.CustomPropertyKey customPropertyKey) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(customPropertyKey, com.ironsource.y8.h.W);
            zzr().zza(customPropertyKey, null);
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setDescription(java.lang.String str) {
            this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzjo, str);
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setIndexableText(java.lang.String str) {
            zza("Indexable text size", 131072, zzb(str));
            this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzju, str);
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setLastViewedByMeDate(java.util.Date date) {
            this.zzay.zzb(com.google.android.gms.internal.drive.zzif.zzle, date);
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setMimeType(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzki, str);
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setPinned(boolean z) {
            this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzka, java.lang.Boolean.valueOf(z));
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setStarred(boolean z) {
            this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzkp, java.lang.Boolean.valueOf(z));
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setTitle(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Title cannot be null.");
            this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzkr, str);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.drive.MetadataChangeSet.Builder setViewed(boolean z) {
            if (z) {
                this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzkh, true);
            } else if (this.zzay.zzd(com.google.android.gms.internal.drive.zzhs.zzkh)) {
                this.zzay.zzc(com.google.android.gms.internal.drive.zzhs.zzkh);
            }
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setViewed() {
            this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzkh, true);
            return this;
        }

        public com.google.android.gms.drive.MetadataChangeSet build() {
            if (this.zzaz != null) {
                this.zzay.zzb(com.google.android.gms.internal.drive.zzhs.zzjn, this.zzaz.zzbb());
            }
            return new com.google.android.gms.drive.MetadataChangeSet(this.zzay);
        }
    }

    public final java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, java.lang.String> getCustomPropertyChangeMap() {
        com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties appVisibleCustomProperties = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzjn);
        if (appVisibleCustomProperties == null) {
            return java.util.Collections.emptyMap();
        }
        return appVisibleCustomProperties.zzba();
    }

    public final java.lang.String getDescription() {
        return (java.lang.String) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzjo);
    }

    public final java.lang.String getIndexableText() {
        return (java.lang.String) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzju);
    }

    public final java.util.Date getLastViewedByMeDate() {
        return (java.util.Date) this.zzay.zza(com.google.android.gms.internal.drive.zzif.zzle);
    }

    public final java.lang.String getMimeType() {
        return (java.lang.String) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzki);
    }

    public final android.graphics.Bitmap getThumbnail() {
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = (com.google.android.gms.common.data.BitmapTeleporter) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzkq);
        if (bitmapTeleporter == null) {
            return null;
        }
        return bitmapTeleporter.get();
    }

    public final java.lang.String getTitle() {
        return (java.lang.String) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzkr);
    }

    public final java.lang.Boolean isPinned() {
        return (java.lang.Boolean) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzka);
    }

    public final java.lang.Boolean isStarred() {
        return (java.lang.Boolean) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzkp);
    }

    public final java.lang.Boolean isViewed() {
        return (java.lang.Boolean) this.zzay.zza(com.google.android.gms.internal.drive.zzhs.zzkh);
    }

    public final com.google.android.gms.drive.metadata.internal.MetadataBundle zzq() {
        return this.zzay;
    }
}
