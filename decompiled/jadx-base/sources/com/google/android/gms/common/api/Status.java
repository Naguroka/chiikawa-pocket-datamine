package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.ReflectedParcelable {
    private final int zza;
    private final java.lang.String zzb;
    private final android.app.PendingIntent zzc;
    private final com.google.android.gms.common.ConnectionResult zzd;
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS_CACHE = new com.google.android.gms.common.api.Status(-1);
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS = new com.google.android.gms.common.api.Status(0);
    public static final com.google.android.gms.common.api.Status RESULT_INTERRUPTED = new com.google.android.gms.common.api.Status(14);
    public static final com.google.android.gms.common.api.Status RESULT_INTERNAL_ERROR = new com.google.android.gms.common.api.Status(8);
    public static final com.google.android.gms.common.api.Status RESULT_TIMEOUT = new com.google.android.gms.common.api.Status(15);
    public static final com.google.android.gms.common.api.Status RESULT_CANCELED = new com.google.android.gms.common.api.Status(16);
    public static final com.google.android.gms.common.api.Status RESULT_API_NOT_CONNECTED = new com.google.android.gms.common.api.Status(17);
    public static final com.google.android.gms.common.api.Status RESULT_DEAD_CLIENT = new com.google.android.gms.common.api.Status(18);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new com.google.android.gms.common.api.zze();

    public Status(int i) {
        this(i, (java.lang.String) null);
    }

    Status(int i, java.lang.String str, android.app.PendingIntent pendingIntent, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zza = i;
        this.zzb = str;
        this.zzc = pendingIntent;
        this.zzd = connectionResult;
    }

    public Status(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        this(connectionResult, str, 17);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.zza == status.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, status.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, status.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, status.zzd);
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult() {
        return this.zzd;
    }

    public android.app.PendingIntent getResolution() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zza;
    }

    public java.lang.String getStatusMessage() {
        return this.zzb;
    }

    public boolean hasResolution() {
        return this.zzc != null;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    public boolean isCanceled() {
        return this.zza == 16;
    }

    public boolean isInterrupted() {
        return this.zza == 14;
    }

    public boolean isSuccess() {
        return this.zza <= 0;
    }

    public void startResolutionForResult(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        if (hasResolution()) {
            android.os.Bundle bundle = com.google.android.gms.common.util.PlatformVersion.isAtLeastU() ? android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            android.app.PendingIntent pendingIntent = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle);
        }
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add("resolution", this.zzc);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        java.lang.String str = this.zzb;
        return str != null ? str : com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zza);
    }

    public Status(int i, java.lang.String str) {
        this(i, str, (android.app.PendingIntent) null);
    }

    @java.lang.Deprecated
    public Status(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str, int i) {
        this(i, str, connectionResult.getResolution(), connectionResult);
    }

    public Status(int i, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    public void startResolutionForResult(androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> activityResultLauncher) {
        if (hasResolution()) {
            android.app.PendingIntent pendingIntent = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
            activityResultLauncher.launch(new androidx.activity.result.IntentSenderRequest.Builder(pendingIntent.getIntentSender()).build());
        }
    }
}
