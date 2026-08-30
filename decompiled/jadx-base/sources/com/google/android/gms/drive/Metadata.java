package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Metadata implements com.google.android.gms.common.data.Freezable<com.google.android.gms.drive.Metadata> {
    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;

    public abstract <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> metadataField);

    public java.lang.String getAlternateLink() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzjm);
    }

    public int getContentAvailability() {
        java.lang.Integer num = (java.lang.Integer) zza(com.google.android.gms.internal.drive.zzin.zzlk);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public java.util.Date getCreatedDate() {
        return (java.util.Date) zza(com.google.android.gms.internal.drive.zzif.zzld);
    }

    public java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, java.lang.String> getCustomProperties() {
        com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties appVisibleCustomProperties = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) zza(com.google.android.gms.internal.drive.zzhs.zzjn);
        if (appVisibleCustomProperties == null) {
            return java.util.Collections.emptyMap();
        }
        return appVisibleCustomProperties.zzba();
    }

    public java.lang.String getDescription() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzjo);
    }

    public com.google.android.gms.drive.DriveId getDriveId() {
        return (com.google.android.gms.drive.DriveId) zza(com.google.android.gms.internal.drive.zzhs.zzjl);
    }

    public java.lang.String getEmbedLink() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzjp);
    }

    public java.lang.String getFileExtension() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzjq);
    }

    public long getFileSize() {
        return ((java.lang.Long) zza(com.google.android.gms.internal.drive.zzhs.zzjr)).longValue();
    }

    public java.util.Date getLastViewedByMeDate() {
        return (java.util.Date) zza(com.google.android.gms.internal.drive.zzif.zzle);
    }

    public java.lang.String getMimeType() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzki);
    }

    public java.util.Date getModifiedByMeDate() {
        return (java.util.Date) zza(com.google.android.gms.internal.drive.zzif.zzlg);
    }

    public java.util.Date getModifiedDate() {
        return (java.util.Date) zza(com.google.android.gms.internal.drive.zzif.zzlf);
    }

    public java.lang.String getOriginalFilename() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzkj);
    }

    public boolean isPinnable() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzin.zzll);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isPinned() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzka);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public long getQuotaBytesUsed() {
        return ((java.lang.Long) zza(com.google.android.gms.internal.drive.zzhs.zzko)).longValue();
    }

    public java.util.Date getSharedWithMeDate() {
        return (java.util.Date) zza(com.google.android.gms.internal.drive.zzif.zzlh);
    }

    public java.lang.String getTitle() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzkr);
    }

    public java.lang.String getWebContentLink() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzkt);
    }

    public java.lang.String getWebViewLink() {
        return (java.lang.String) zza(com.google.android.gms.internal.drive.zzhs.zzku);
    }

    public boolean isInAppFolder() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzjv);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isEditable() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzjx);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isFolder() {
        return com.google.android.gms.drive.DriveFolder.MIME_TYPE.equals(getMimeType());
    }

    public boolean isRestricted() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzkc);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isShared() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzkd);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isStarred() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzkp);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isTrashed() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzks);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isTrashable() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzkg);
        return bool == null || bool.booleanValue();
    }

    public boolean isExplicitlyTrashed() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzjy);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isViewed() {
        java.lang.Boolean bool = (java.lang.Boolean) zza(com.google.android.gms.internal.drive.zzhs.zzkh);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
