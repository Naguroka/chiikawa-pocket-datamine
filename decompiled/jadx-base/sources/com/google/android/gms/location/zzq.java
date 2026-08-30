package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzq implements java.util.Comparator<com.google.android.gms.location.DetectedActivity> {
    zzq() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.location.DetectedActivity detectedActivity, com.google.android.gms.location.DetectedActivity detectedActivity2) {
        com.google.android.gms.location.DetectedActivity detectedActivity3 = detectedActivity;
        com.google.android.gms.location.DetectedActivity detectedActivity4 = detectedActivity2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(detectedActivity3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(detectedActivity4);
        int iCompareTo = java.lang.Integer.valueOf(detectedActivity4.getConfidence()).compareTo(java.lang.Integer.valueOf(detectedActivity3.getConfidence()));
        return iCompareTo == 0 ? java.lang.Integer.valueOf(detectedActivity3.getType()).compareTo(java.lang.Integer.valueOf(detectedActivity4.getType())) : iCompareTo;
    }
}
